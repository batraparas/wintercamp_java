package AssignmentTwo;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
    int id;
    int count;
    String name;
    ArrayList<Scholar> rentHistory;
    String category;
    Book(int id, String name, int count, String category){
        this.id = id;
        this.name = name;
        this.category = category;
        this.count = count;
        this.rentHistory = new ArrayList<>();
    }

    int getCount(){
        return this.count;
    }
    void rentOut(Scholar student){
        rentHistory.add(student);
        count--;
    }
    void returnBook(){
        count++;
    }
}


class Scholar{
    int id=1;
    String name, course;
    Scholar(int id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }

}



class Library{
    ArrayList<Book> bookList=new ArrayList<>();
    Library(ArrayList<Book> bookList){
        this.bookList = bookList;
    }

    void rentOut(int bookId, Scholar student){
        for(Book book : bookList){
            if(book.id==bookId){
                book.rentOut(student);
                return;
            }
        }
        System.out.println("AssignmentTwo.Book not found!");
    }

    void returnBook(int bookId, Scholar student){
        for(Book book : bookList){
            if(book.id==bookId){
                book.returnBook();
                return;
            }
        }
        System.out.println("AssignmentTwo.Book not found!");
    }

    void displayRecords(){
        for(Book book : bookList){
            System.out.println("name: "+book.name+", Category :"+book.category+",Currently Available: "+book.count);
            System.out.println("********************\nRental Records:");
            for(Scholar stud : book.rentHistory){
                System.out.println("Name: "+stud.name+",Course: "+stud.course);
            }
            System.out.println();
        }
    }



}
public class LMS {

    static Scholar checkStudent(ArrayList<Scholar> list, int id){
        for(Scholar scholar : list){
            if(scholar.id==id){return scholar;}
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Book> bookList = new ArrayList<>();
        System.out.println("nEnter Name, number of books and category: ");
        for(int i=0; i<n; i++){
            bookList.add(new Book(i+1, scanner.next(), scanner.nextInt(), scanner.next()));
        }
        System.out.println("Enter number of students: ");
        n = scanner.nextInt();
        ArrayList<Scholar> scholarList = new ArrayList<>();
        System.out.println("Enter Name and Course: ");
        for(int i=0; i<n;i++){
            scholarList.add(new Scholar(i+1, scanner.next(), scanner.next()));
        }
        System.out.println("Student List : ");
        for(Scholar scholar : scholarList){
            System.out.println(scholar.id + "\t" + scholar.name+"\t"+scholar.course);
        }
        Library library = new Library(bookList);
        System.out.println("Enter number of rentals : ");
        int x = scanner.nextInt();
        for(int i=0; i<x; i++){
            System.out.println("Enter book id and student id : ");
            int bookId = scanner.nextInt();
            int studentId = scanner.nextInt();

            for(Scholar stud : scholarList){
                if(stud.id==studentId){
                    library.rentOut(bookId,stud );
                    break;
                }
            }
        }
        System.out.println("DISPLAY RECORDS!");
        library.displayRecords();
    }
}
