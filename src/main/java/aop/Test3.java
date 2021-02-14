package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
         UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

         String bookName = uniLibrary.returnBook();

        System.out.println(bookName);


        context.close();
    }
}