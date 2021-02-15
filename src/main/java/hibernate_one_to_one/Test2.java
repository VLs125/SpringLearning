package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
//Bi-directional one to one Detail and Employee
        try {
//            session = factory.getCurrentSession();
//
//            Employee emp = new Employee("Zina", "Zotova","HR",2500);
//            Detail detail = new Detail("Irkutsk","9123762634","test4@email.ru");
//
//            detail.setEmployee(emp);
//            emp.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            // Получение информации о работнике
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class,1);
//
//            System.out.println(detail.getEmployee());
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            session = factory.getCurrentSession();

            session.beginTransaction();

            Detail detail = session.get(Detail.class,1);

            session.delete(detail);

            session.getTransaction().commit();

            System.out.println("Done!");



        }

        finally {
            session.close();
            factory.close();
        }




    }
}
