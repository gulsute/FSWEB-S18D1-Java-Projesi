package com.workintech.s18d1JpaProject.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="burger", schema="be")
public class Burger {
    @Id
    private long id;
    private String name;
    private double price;
    @Enumerated(EnumType.STRING)
    private BreadType breadType;
    private String contents;
}
