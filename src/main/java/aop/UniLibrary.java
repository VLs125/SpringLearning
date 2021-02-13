package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {


    public void getBook(){
        System.out.println("Get book from UniLibrary");
    }

    public void returnBook(){
        System.out.println("Return books to UniLibrary");
    }

    public void getMagazine(){
        System.out.println("Get magazine from UniLibrary");
    }

    public void returnMagazine(){
        System.out.println("Return magazine to UniLibrary");
    }
    public void addBook(){
        System.out.println("Add book to UniLibrary");
    }
    public void addMagazine(){
        System.out.println("Add book to UniLibrary");
    }
}
