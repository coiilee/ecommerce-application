package com.kht.ecommerce.ecommerce_application.service;

import com.kht.ecommerce.ecommerce_application.dto.KHTBook;
import com.kht.ecommerce.ecommerce_application.mapper.KhtBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class KHTBookServiceImpl implements KHTBookService {

    @Autowired private KhtBookMapper khtBookMapper;

    @Override
    public List<KHTBook> getAllBooks() {
        return khtBookMapper.getAllBooks();
    }

    @Override
    public KHTBook bookDetail(int bookId) {
        return khtBookMapper.bookDetail(bookId);
    }

    @Override
    public void bookUpdate(KHTBook book) {
        khtBookMapper.bookUpdate(book);

    }
}
