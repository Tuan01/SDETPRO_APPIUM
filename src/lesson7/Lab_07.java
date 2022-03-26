package lesson7;

import java.util.*;

public class Lab_07 {
    public static void main(String[] args) {

        List<Book>  listBook = new ArrayList<>();
        boolean isContinuing = true;
        while (isContinuing) {

            System.out.println("============Menu==========");
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
            System.out.println("3. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Option number, please: ");
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println("Book Title:");
                String nameBook = scanner.next();
                System.out.println("Isbn ID: ");
                String idISBN = scanner.next();
                System.out.println("Author Name: ");
                String nameAuthor = scanner.next();
                System.out.println("Year: ");
                int year = scanner.nextInt();
                Book book = new Book(idISBN, nameBook,nameAuthor, year);
                listBook.add(book);
            } else if(userInput == 2){
                System.out.println("Please enter ISBN to find the book you want:");
                System.out.println("Isbn ID: ");
                String idISBN = scanner.next();
                for (Book b : listBook) {
                    if(b.getISBN().equals(idISBN)){
                        System.out.println(b);
                    }else{
                        System.out.println("Book not found");
                        break;
                    }
                }
            } else if (userInput == 3){
                isContinuing = false;
            }
        }
    }
}
