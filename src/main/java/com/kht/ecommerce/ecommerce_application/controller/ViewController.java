package com.kht.ecommerce.ecommerce_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewController {

    // 사용자 목록 페이지
    @GetMapping("/")
    public String usersPage() {
        return "index";
    }

    // 상품 목록 페이지
    @GetMapping("/products")
    public String productsPage() {
        return "products";
    }

    // 장바구니 페이지
    @GetMapping("/cart")
    public String cartPage() {
        return "cart";
    }

    //유저 장바구니 페이지
    @GetMapping("/cart{userId}")
    public String getCartByUserId(@PathVariable("userId")int id){
        return "cart";
    }

    //회원가입 페이지 볼 수 있게 회원가입.html 불러오기
    @GetMapping("/join")
    public String joinPage() {
        return "join";
    }

    //제품 추가 기능 구현
    @GetMapping("/product/insert")
    public String getProduct() {
        return "insertProduct";
    }

    //유저 상세보기 페이지
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id")int userId) {
        return "user_detail";
    }

    //상품 상세보기 페이지
    @GetMapping("/product/{id}")
    public String getProductById(@PathVariable("id")int productId) {
        return "product_detail";
    }
}

