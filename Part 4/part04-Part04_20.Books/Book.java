public class Book {
    private String title;
    private int pages;
    private int year;

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + year;
    }
}
