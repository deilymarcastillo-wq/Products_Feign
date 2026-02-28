package pe.castillo.order.model;

public class OrderResponseDTO {

    private int order_id;
    ProductDTO product;
    UserDTO user;

    public OrderResponseDTO(int order_id, ProductDTO product, UserDTO user) {
        this.order_id = order_id;
        this.product = product;
        this.user = user;
    }

    public OrderResponseDTO() {
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }



}
