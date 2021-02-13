package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);

        university.addStudents();

        university.getStudents();


//        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        Book book = context.getBean("book",Book.class);
//        uniLibrary.getBook();
//
//        uniLibrary.addBook("Vladislav",book);
//
//        uniLibrary.getMagazine();
//        uniLibrary.returnBook();
//        uniLibrary.returnMagazine();






//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",SchoolLibrary.class);
//
//        schoolLibrary.getBook();
//



        context.close();

    }
}
