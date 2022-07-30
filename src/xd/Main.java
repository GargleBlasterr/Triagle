package xd;

import java.util.ArrayList;

public class Main {

    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Employee> employees = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();

    public static void main(String[] args) {
        initData();
        System.out.println("total number of books sold " + getCountOfSoldBooks() + " in cash " + getAllPriceOfSoldBooks());





    }

    public static void initData() {
        employees.add(new Employee(1, "Ivan", 30));
        employees.add(new Employee(2, "Petr", 45));


        customers.add(new Customer(1, "Olya", 23));
        customers.add(new Customer(2, "Stas", 25));
        customers.add(new Customer(3, "Eva", 31));


        books.add(new Book(1, "Rtainw", "Tatiana Rak", 200, BookGenre.Romance));
        books.add(new Book(2, "Adamas", "Trivi Rein", 300, BookGenre.Romance));


        books.add(new Book(3, "Secret State", "Adam Skot", 500, BookGenre.History));
        books.add(new Book(4, "Sense & Sensibility", "Yong Chain", 700, BookGenre.History));

        books.add(new Book(5, "Horror Express", "Evgen Richers", 720, BookGenre.Horror));

        orders.add(new Order(1, 1, 1, new long[]{1, 3, 4}));
        orders.add(new Order(2, 2, 2, new long[]{1, 4, 5}));
        orders.add(new Order(3, 3, 2, new long[]{5, 4}));
    }

    public static Book getBookById(long id) {
        Book current = null;
        for (Book book : books) {
            if (book.getId() == id) {
                current = book;
                break;
            }
        }
        return current;
    }

    public static int getCountOfSoldBooks() {
        int count = 0;
        for (Order ordre : orders) {
            count += ordre.getBooks().length;
        }
        return count;
    }

    public static double getPriceOfSoulBooksInOrder(Order order) {
        double price = 0;
        for (long bookId : order.getBooks()) {
            Book book = getBookById(bookId);
            price += book.getPrice();
        }
        return price;
    }

    public static double getAllPriceOfSoldBooks() {
        double price = 0;
        for (Order order : orders) {
            price += getPriceOfSoulBooksInOrder(order);
        }
        return price;
    }


}
