
public class BookInformation {
    String title;
    private String pages;
    private String year;

    public BookInformation(String title, String pages, String year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
