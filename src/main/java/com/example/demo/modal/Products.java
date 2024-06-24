package com.example.demo.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class Products {
        private int id;
        private String name;
        private String description;
        private BigDecimal price;
        private Object jsonData;

        // Getters and setters
    }
