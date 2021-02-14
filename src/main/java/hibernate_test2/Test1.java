package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
//        try {
//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Violetta", "Kucher","Sales",3000);
//            Detail detail = new Detail("Vladivostok","91431251064","test2@email.ru");
//            session.beginTransaction();
//
//            emp.setEmpDetail(detail);
//
//            session.save(emp);
//
//            session.getTransaction().commit();
//
//
//
//
//
//            System.out.println("Done!");
//
//        }
        try {
            Session session = factory.getCurrentSession();

            session.beginTransaction();

            Employee emp = session.get(Employee.class,3);

            System.out.println(emp);
            System.out.println();



            session.getTransaction().commit();





            System.out.println("Done!");

        }

        finally {
            factory.close();
        }




    }
}
