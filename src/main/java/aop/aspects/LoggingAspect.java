package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){
//    }
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice:writing Log #1 ");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice:writing Log #2 ");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("allGetAndReturnMethodsFromUniLibrary:writing Log #3");
//    }


    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature= " + methodSignature);
        System.out.println("methodSignature.getMethod()= " + methodSignature.getMethod());
        System.out.println(joinPoint.getSignature());
        System.out.println("some advice before get book or magazine:логирование получения книги или журнала");

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments) {
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге:\nНазвание - "+ myBook.getName()+
                            "\nАвтор - "+myBook.getAuthor()+"\nГод публикации - "+myBook.getYearOfPublication());
                }
                else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет "+obj);
                }
            }
        }

    }



//    @Before("execution(public private * return*())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("some Aspects before return book");
//    }


}
