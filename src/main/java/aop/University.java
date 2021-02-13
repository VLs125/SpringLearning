package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st0 = new Student("Vladislav Stalmakhovich", 3,4.3);
        Student st1 = new Student("Andrew Orn", 2,5.0);
        Student st2 = new Student("Olga Orlova", 4,4.7);
        students.add(st0);
        students.add(st1);
        students.add(st2);


    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
//        try {
            System.out.println(students.get(3));
//        }
//        catch (IndexOutOfBoundsException error){
//            System.out.println("Sorry for exception");
//        }
        System.out.println("Information from method getStudents:");
        System.out.println(students);

        return students;
    }
}
