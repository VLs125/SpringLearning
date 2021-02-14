package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: " +
                "логируем получение списка студентов перед методом getStudents");
    }
//    @AfterReturning(pointcut = "execution(* getStudents())",returning ="students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students){
//        for (Student student:students) {
//
//            student.setNameSurname(student.getNameSurname() + " Test");
//        }
//
//        System.out.println("afterGetStudentsLoggingAdvice: " +
//                "логируем получение списка студентов после метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",throwing = "exception")
//    public void afterThrowGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowGetStudentsLoggingAdvice: Логируем выброс исключения "+ exception);
//    }
    @After( "execution(* get*())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice");
    }
}
