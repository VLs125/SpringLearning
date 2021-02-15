package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
            //*****************************************************
//            session = factory.getCurrentSession();
//            Department department = new Department("IT",5000,500);
//
//            Employee employ1 = new Employee("Vladislav","Stalmakhovich",1200);
//            Employee employ2 = new Employee("Alexey","Ozov",1500);
//            Employee employ3 = new Employee("Alexey","Ozov",1500);
//
//            department.addEmployeeToDepartment(employ1);
//            department.addEmployeeToDepartment(employ2);
//            department.addEmployeeToDepartment(employ3);
//
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            //******************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class,1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            ///////////////////////////
            session = factory.getCurrentSession();

            session.beginTransaction();
            System.out.println("Get department");
            Department department = session.get(Department.class,1);

            System.out.println("show department");
            System.out.println(department);

            System.out.println("Show employees");

            System.out.println(department.getEmps());

            session.getTransaction().commit();

            System.out.println("Done!");
//
        } finally {
            session.close();
            factory.close();


        }


    }
}