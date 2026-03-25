class book {
    String name;
    int id;

    book(String name, int id){
        this.name = name;
        this.id = id;
    }
}

public class librarySystem {

    static book books[] = new book[5];
    static int count = 0;

    public static void addBook(String name, int id){
        if(count > 5){   // ❌ mistake (should be >=)
            System.out.println("Library full");
        } else {
            books[count] = new book(name,id);
            count++;
        }
    }

    public static void showBooks(){
        for(int i=0; i<=count; i++){   // ❌ mistake (Array index issue)
            System.out.println(books[i].name + " " + books[i].id);
        }
    }

    public static void searchBook(int id){
        for(int i=0; i<count; i++){
            if(books[i].id = id){   // ❌ mistake (= instead of ==)
                System.out.println("Book Found");
            }
        }
    }

    public static void main(String[] args){
        addBook("Java",1);
        addBook("C++",2);
        showBooks();
        searchBook(1);
    }
}
