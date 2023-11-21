package com.online_cake_order.online_cake_order.dto;

import lombok.*;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private Integer itemId;
    @NotNull
    private String name;
    @NotNull
    private String image;
    @NotNull
    private double price;
    @NotNull
    private int quantity;
    @NotNull
    private String description;
}
