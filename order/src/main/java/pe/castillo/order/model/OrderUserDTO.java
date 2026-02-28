package pe.castillo.order.model;

import java.time.LocalDate;

public class OrderUserDTO {
    private int order_id;
    private String description;
    private LocalDate createDate;
    private UserDTO user;

    public OrderUserDTO() {
    }

    public OrderUserDTO(int order_id, String description, LocalDate createDate, UserDTO user) {
        this.order_id = order_id;

        this.description = description;
        this.createDate = createDate;
        this.user = user;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
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

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderUserDTO{");
        sb.append("order_id=").append(order_id);
        sb.append(", description='").append(description).append('\'');
        sb.append(", createDate=").append(createDate);
        sb.append(", user=").append(user);
        sb.append('}');
        return sb.toString();
    }
}
