public class Book {
    private String name;
    private int yearOfPublication;
    private String author;

    public Book(String name, int yearOfPublication, String author) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
