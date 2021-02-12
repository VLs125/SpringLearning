package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook(){
        System.out.println("Get book from : University library");
    }


    private void returnBook(){
        System.out.println("Return books");
    }

    public void getMagazine(){
        System.out.println("get magazine from University library");
    }
}
