package application.models;

import java.util.Date;

public class Order {
    private int id;
    private Date date;
    private double amount;
    private int customerId;
    private String status;

    public Order(int id, Date date, double amount, int customerId, String status) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.customerId = customerId;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                ", customerId=" + customerId +
                ", status='" + status + '\'' +
                '}';
    }
}
