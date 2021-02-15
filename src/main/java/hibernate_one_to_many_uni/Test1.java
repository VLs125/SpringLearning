package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            Department department = new Department("HR",3000,200);

            Employee employ1 = new Employee("Alena","Alexeeva",200);
            Employee employ2 = new Employee("Elena","Orlova",500);

            department.addEmployeeToDepartment(employ1);
            department.addEmployeeToDepartment(employ2);

            session.beginTransaction();

            session.save(department);

            session.getTransaction().commit();

            System.out.println("Done!");
//            session = factory.getCurrentSession();
//
//
//
//
//
//
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class,1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

        }

        finally {
            session.close();
            factory.close();
        }




    }
}
