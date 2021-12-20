public class Program{

        public static void main(String[] args) {

Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
b1.print();
}
    }
    interface Printable{

        void print();
    }
    class Book implements Printable{

       String name;
       String author;

        Book(String name, String author){

          this.name = name;
          this.author = author;
}

        public void print() {

System.out.printf("%s (%s) \n", name, author);
}
    }

// Або так
class Journal implements Printable {

    private String name;

    String getName(){
        return name;
    }

    Journal(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}