package curso.java.exercicios.enumerator2.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(Date moment, String status, Client client) {
        this.moment = moment;
        this.status = OrderStatus.valueOf(status);
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem (OrderItem item) {
        items.add(item);
    }
    public void removeItem (OrderItem item) {
        items.remove(item);
    }
    double sum = 0;
    public Double total () {
        for (OrderItem i: items) {
            sum += i.subTotal(i.getQuantity(), i.getPrice());
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: " + sdf1.format(getMoment()) + "\n");
        sb.append("Order status: " + getStatus() + "\n");
        sb.append("Client: " + getClient().getName() + " (" +
                sdf.format(getClient().getBirthDate()) + ") - " + getClient().getEmail() + "\n");
        sb.append("Order items:\n");
        for (OrderItem item: items){
            sb.append(item.getProduct().getName() + ", $"
            + item.getPrice() + ", Quantity: " + item.getQuantity()
            + ", Subtotal: $" + item.subTotal(item.getQuantity(), item.getPrice())
            + "\n");
        }
        sb.append("Total price: $" + total());
        return sb.toString();
    }
}
