package hibernate_many_to_many;


import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Footbal");
//            Section section2 = new Section("BasketBall");
//            Section section3 = new Section("Tenis");
//
//            Child child1 = new Child("Masha", 5);
//            Child child2 = new Child("Zina", 6);
//            Child child3 = new Child("Ksusha", 8);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//
//            section2.addChildToSection(child3);
//
//            section3.addChildToSection(child2);
//            section3.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.save(section2);
//            session.save(section3);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");

            session = factory.getCurrentSession();

            session.beginTransaction();
            Section section = session.get(Section.class,1);
            System.out.println(section);
            for (Child child:section.getChildList()) {
                System.out.println(child.toString());

            }


            session.getTransaction().commit();



            System.out.println("Done");





        }
        finally {
            factory.close();
            session.close();
        }
    }
}
