package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {


    public void getBook(){
        System.out.println("Get book from UniLibrary");
        System.out.println("----------------------------------");
    }

    public void returnBook(){
        System.out.println("Return books to UniLibrary");
        System.out.println("----------------------------------");

    }

    public void getMagazine(){
        System.out.println("Get magazine from UniLibrary");
        System.out.println("----------------------------------");

    }

    public void returnMagazine(){
        System.out.println("Return magazine to UniLibrary");
        System.out.println("----------------------------------");

    }
    public void addBook(String personName, Book book){
        System.out.println("Add book to UniLibrary");
        System.out.println("----------------------------------");

    }
    public void addMagazine(){
        System.out.println("Add book to UniLibrary");
        System.out.println("----------------------------------");

    }
}
