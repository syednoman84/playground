package com.example.playground;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product{

    private Integer id;

    @NotBlank(message = "Product cannot be blank")
    @Size(min = 3, max = 30, message = "Product name must be greater than 2 and less than 11 letters")
    private String product_name;

}
