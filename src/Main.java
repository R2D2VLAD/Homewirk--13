public class Main {
    public static void main(String[] args) {
        //Домашняя работа
        System.out.println("Домашняя работа");
        System.out.println();

        Book grokAlgorithms = new Book("GrokAlgorithms", 2017, "Aditya Bhargava");
        System.out.println("grokAlgorithms.name = " + grokAlgorithms.getName());
        System.out.println("grokAlgorithms.yearOfPublication = " + grokAlgorithms.getYearOfPublication());
        System.out.println("grokAlgorithms.author = " + grokAlgorithms.getAuthor());
        grokAlgorithms.setYearOfPublication(2019);
        System.out.println("grokAlgorithms.getYearOfPublication() = " + grokAlgorithms.getYearOfPublication());
        Author aditya = new Author("Аditya", "Bhargava");
        System.out.println("aditya.name = " + aditya.getName());
        Author bhargava = new Author("Аditya", "Bhargava");
        System.out.println("bhargava.surname = " + bhargava.getSurname());
        System.out.println();

        Book ivanhoe = new Book("Ivanhoe", 1817, "Walter Scott");
        System.out.println("ivanhoe.name = " + ivanhoe.getName());
        System.out.println("ivanhoe.yearOfPublication = " + ivanhoe.getYearOfPublication());
        System.out.println("ivanhoe.author = " + ivanhoe.getAuthor());
        ivanhoe.setYearOfPublication(1825);
        System.out.println("ivanhoe.getYearOfPublication() = " + ivanhoe.getYearOfPublication());
        Author walter = new Author("Walter", "Scott");
        System.out.println("walter.name = " + walter.getName());
        Author scott = new Author("Walter", "Scott");
        System.out.println("scott.surname = " + scott.getSurname());
        System.out.println();
        
        Book threeMusketeers = new Book("ThreeMusketeers", 1844, "Alexander Dumas");
        System.out.println("threeMusketeers.name = " + threeMusketeers.getName());
        System.out.println("threeMusketeers.yearOfPublication = " + threeMusketeers.getYearOfPublication());
        System.out.println("threeMusketeers.author = " + threeMusketeers.getAuthor());
        Author alexander = new Author("Alexander", "Dumas");
        System.out.println("alexander.name = " + alexander.getName());
        Author dumas = new Author("Alexander", "Dumas");
        System.out.println("dumas.surname = " + dumas.getSurname());
    }
}