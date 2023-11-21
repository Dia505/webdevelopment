package com.online_cake_order.online_cake_order.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    @NotNull
    private Integer item_id;
    @NotNull
    private Integer user_id;
    @NotNull
    private Integer quantity;
}
