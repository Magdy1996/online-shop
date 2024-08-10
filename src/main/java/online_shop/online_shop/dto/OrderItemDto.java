package online_shop.online_shop.dto;

public class OrderItemDto {
    private int quantity;
    private double price;
    private ProductResponseDto productDto;
    private OrderDto orderDto;

    public OrderItemDto() {
    }

    public OrderItemDto(int quantity, double price, ProductResponseDto productDto, OrderDto orderDto) {
        this.quantity = quantity;
        this.price = price;
        this.productDto = productDto;
        this.orderDto = orderDto;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductResponseDto getProductDto() {
        return productDto;
    }

    public void setProductDto(ProductResponseDto productDto) {
        this.productDto = productDto;
    }

    public OrderDto getOrderDto() {
        return orderDto;
    }

    public void setOrderDto(OrderDto orderDto) {
        this.orderDto = orderDto;
    }
}
