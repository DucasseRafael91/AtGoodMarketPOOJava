package aTGoodMarketPOOJava;

import java.util.List;
import java.time.LocalDate;

public class Order {
    
    private String status;
    private Customer customer;
    private String uid;
    private LocalDate date;
    private List<Product> line_orders;

    public String getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getUid() {
        return uid;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Product> getLine_orders() {
        return line_orders;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setLine_orders(List<Product> line_orders) {
        this.line_orders = line_orders;
    }
}
