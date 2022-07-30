package com.my_learnings.exercises;

class Library{
    private String [] books = new String[50];
    private int numberOfBooks;

    Library(){
        numberOfBooks = 0;
    }

    void addBook(String book){  
        books[numberOfBooks] = book;
        numberOfBooks++;
        System.out.println(book+ " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("The following books are available:");
        for(String book : books){
            if (book == null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String bookToBeIssued){
        for (int i = 0; i < books.length; i++){
            if (books[i] == bookToBeIssued){
                System.out.printf("%s has been issued!\n", bookToBeIssued);
                books[i] = null;
                return;
            }
        }
        System.out.println("Book not found!");
        
    }

    void returnBook(String bookToBeReturned){
        for (int i = 0; i < books.length; i++){
            if (books[i] == null){
                books[i] = bookToBeReturned;
                System.out.printf("%s has been returned!", bookToBeReturned);
                break;
            }
        }
    }
}

public class OnlineLibrary {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library library = new Library();
        library.addBook("How to grow rich");
        library.addBook("Gangsta's Paradise");
        library.addBook("Cheap Thrills");
        library.addBook("Designer");

        library.showAvailableBooks();

        library.issueBook("Cheap Thrills");
        library.showAvailableBooks();

        library.returnBook("Cheap Thrills");
        library.showAvailableBooks();
    }
}
