package com.kht.ecommerce.ecommerce_application.mapper;

import com.kht.ecommerce.ecommerce_application.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    // 사용자 조회
    List<User> getAllUsers();

    //사용자 저장
    void insertUser(User user);

    //이메일 존재 유무 확인
    int existByEmail(String email);

    //유저 상세보기
    User userDetail(int userId);

    //유저 정보 수정(업데이트)
    void updateUser(User user);




}
