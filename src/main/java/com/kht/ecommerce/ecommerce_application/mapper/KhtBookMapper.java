package com.kht.ecommerce.ecommerce_application.mapper;

import com.kht.ecommerce.ecommerce_application.dto.KHTBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KhtBookMapper {
    List<KHTBook> getAllBooks();

    KHTBook bookDetail(int bookId);

    void bookUpdate(KHTBook book);
}
