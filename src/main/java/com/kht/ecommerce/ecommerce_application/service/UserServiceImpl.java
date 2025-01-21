package com.kht.ecommerce.ecommerce_application.service;

import com.kht.ecommerce.ecommerce_application.dto.User;
import com.kht.ecommerce.ecommerce_application.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

@Autowired
UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public void insertUser(User user){
        userMapper.insertUser(user); //DB에서 가져온 값을 return해서 반환할 필요 X
        //DB에 저장을 하는 것이지 데이터베이스에서 꺼내오는 것이 아니기 때문에 return 아닌 void 사용


    }

    @Override
    public boolean existByEmail(String email){
        return userMapper.existByEmail(email)>0; //true일 때 return 의미
    }

    @Override
    public User userDetail(int userId) {
        return userMapper.userDetail(userId);
    }


}
