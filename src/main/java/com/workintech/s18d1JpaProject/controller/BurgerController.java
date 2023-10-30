package com.workintech.s18d1JpaProject.controller;

import com.workintech.s18d1JpaProject.dao.BurgerDao;
import com.workintech.s18d1JpaProject.entity.BreadType;
import com.workintech.s18d1JpaProject.entity.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/burger")
public class BurgerController {
    private BurgerDao burgerDao;

    @Autowired
    public BurgerController(BurgerDao burgerDao) {
        this.burgerDao = burgerDao;
    }

    @PostMapping("/")
    public Burger save (Burger burger){
        return burgerDao.save(burger);
    }

    @GetMapping("/")
    public List<Burger> findAll(){
        return burgerDao.findAll();
    }

    @GetMapping("/{id}")
    public Burger find(@PathVariable long id){
        return burgerDao.findById(id);
    }

    @PutMapping
    public Burger update(@RequestBody Burger burger){
        return burgerDao.update(burger);
    }

    @DeleteMapping("/{id}")
    public Burger remove(@PathVariable long id){
        return burgerDao.remove(id);
    }

    @GetMapping("/findByPrice/{price}")
    public List<Burger> findByPrice(@PathVariable double price){
        return burgerDao.findByPrice(price);
    }

    @GetMapping("/findByBread/{breadType}")
    public List<Burger> findByBreadType(@PathVariable String breadType){
        BreadType breadTypeEnum = BreadType.valueOf(breadType);
        return burgerDao.findByBreadType(breadTypeEnum);
    }

    @GetMapping("/findByContent/{content}")
    public List<Burger> findByContent(@PathVariable String content){
        return burgerDao.findByContent(content);
    }
}
