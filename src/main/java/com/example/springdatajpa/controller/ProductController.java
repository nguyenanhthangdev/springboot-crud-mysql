package com.example.springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springdatajpa.model.Product;
import com.example.springdatajpa.repository.ProductRepository;



@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired ProductRepository productRepository;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "product-list-page";
    }

    @GetMapping("/add")
    public String addProduct(Model model) {
        model.addAttribute("product", new Product());
        return "add-product-page";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute Product product, Model model) {
        productRepository.save(product);
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("product", productRepository.findById(id).get());
        return "edit-product-page";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "redirect:/products";
    }
}
