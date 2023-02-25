package librarycatalogue;

public class Book {
    
    //Properties, Fields, Global variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;


    //constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN){
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }

    //Getters  ---> Instance Variables
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean getIsCheckedOut(){
        return isCheckedOut;
    }

    public int getDateCheckOut(){
        return this.dayCheckedOut;
    }

    //Setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut){
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    public void setDayCheckedOut(int day){
        this.dayCheckedOut = day;
    }

}
