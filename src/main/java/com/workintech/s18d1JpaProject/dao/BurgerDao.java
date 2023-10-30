package com.workintech.s18d1JpaProject.dao;

import com.workintech.s18d1JpaProject.entity.BreadType;
import com.workintech.s18d1JpaProject.entity.Burger;

import java.util.List;

public interface BurgerDao {
    Burger save(Burger burger);
    List<Burger> findAll();
    Burger findById(long id);
    Burger update(Burger burger);
    Burger remove(long id);
    List<Burger> findByPrice(double price);
    List<Burger> findByBreadType(BreadType breadType);
    List<Burger> findByContent(String contents);
}
