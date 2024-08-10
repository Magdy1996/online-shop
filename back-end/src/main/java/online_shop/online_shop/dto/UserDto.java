package online_shop.online_shop.dto;

import java.util.ArrayList;
import java.util.List;

import online_shop.online_shop.domain.Role;

public class UserDto {
    private String name;
    private String email;
    private String password;
    private List<OrderRequestDto> orderDtos = new ArrayList<OrderRequestDto>();
    private Role role;

    public UserDto() {
    }

    public UserDto(String name, String email, String password, Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public void addOrderDto(OrderRequestDto orderDto) {
        orderDtos.add(orderDto);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<OrderRequestDto> getOrderDtos() {
        return orderDtos;
    }

    public void setOrderDtos(List<OrderRequestDto> orderDtos) {
        this.orderDtos = orderDtos;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
