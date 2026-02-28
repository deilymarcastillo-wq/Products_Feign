package pe.castillo.order.model;

import java.time.LocalDate;

public class Order {
    private int order_id;
    private int product_id;
    private int user_id;
    private String description;
    private LocalDate createDate;

    public Order() {
    }

    public Order(int order_id, int product_id, int user_id, String description, LocalDate createDate) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.user_id = user_id;
        this.description = description;
        this.createDate = createDate;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Order{");
        sb.append("order_id=").append(order_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", description='").append(description).append('\'');
        sb.append(", createDate=").append(createDate);
        sb.append('}');
        return sb.toString();
    }
}
