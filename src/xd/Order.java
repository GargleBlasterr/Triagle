package xd;

public class Order {
    private long id;
    private long customerId;
    private long employeeId;
    private long[] books;

    public Order(long id, long customerId, long employeeId, long[] books) {
        this.books = books;
        this.customerId = customerId;
        this.id = id;
        this.employeeId = employeeId;
    }

    public long[] getBooks() {
        return books;
    }

    public void setBooks(long[] books) {
        this.books = books;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
