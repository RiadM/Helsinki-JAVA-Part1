import java.util.ArrayList;

public class Library {
    private ArrayList<Book> booksInLibrary;

    public Library(){
        this.booksInLibrary = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        this.booksInLibrary.add(newBook);
    }

    public void printBooks(){

        for(int i = 0; i < this.booksInLibrary.size(); i++){
            System.out.println(this.booksInLibrary.get(i));
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book bookSearch : this.booksInLibrary) {
            if (StringUtils.included(bookSearch.toString(),title)) {
                found.add(bookSearch);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book bookSearch : this.booksInLibrary) {
            if (StringUtils.included(bookSearch.toString(),publisher)) {
                found.add(bookSearch);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book bookSearch : this.booksInLibrary) {
            if (StringUtils.included(bookSearch.toString(),"" + year)) {
                found.add(bookSearch);
            }
        }
        return found;
    }


}
