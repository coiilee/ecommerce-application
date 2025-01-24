package com.kht.ecommerce.ecommerce_application.controller;

import com.kht.ecommerce.ecommerce_application.dto.KHTBook;
import com.kht.ecommerce.ecommerce_application.service.KHTBookService;
import com.kht.ecommerce.ecommerce_application.service.KHTBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookApiController {

    @Autowired private KHTBookServiceImpl khtBookService;

    @GetMapping("/books")
    public List<KHTBook> getBooks() {
        return khtBookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public KHTBook bookDetail(@PathVariable int id) {
        return khtBookService.bookDetail(id);
    }

    @PutMapping("/books/{id}/update")
    public void bookUpdate(@PathVariable("id") int id, @RequestBody KHTBook book) {
        book.setId(id);
        khtBookService.bookUpdate(book);
    }




}
