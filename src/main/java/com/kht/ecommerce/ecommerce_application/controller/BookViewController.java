package com.kht.ecommerce.ecommerce_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class BookViewController {

    @GetMapping("/book")
    public String book() {
        return "books";
    }

    @GetMapping("/book/detail")
    public String detail() {
        return "book-detail";
    }

    @GetMapping("/book/edit")
    public String edit() {
        return "book-edit";
    }
}
