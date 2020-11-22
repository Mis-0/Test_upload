package com.asir.mybatis_plus;

import com.asir.mybatis_plus.entity.Account;
import com.asir.mybatis_plus.entity.User;
import com.asir.mybatis_plus.mapper.AccountMapper;
import com.asir.mybatis_plus.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import net.minidev.json.writer.UpdaterMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    AccountMapper accountMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    void testInsert(){
       /* User user=new User();
        user.setAge(18);
        user.setEmail("1403658328@qq.com");
        user.setName("azx");

        int i = userMapper.insert(user);*/
        Account account = new Account();
        account.setAccount("azx");
        account.setBalance(1000);

        int insert = accountMapper.insert(account);
        System.out.println(insert);
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(6);
        user.setName("azx");
        user.setAge(18);
        userMapper.updateById(user);

      /*  Account account = new Account();
        account.setId(1);
        account.setBalance(2000);
        accountMapper.updateById(account);*/
    }

    @Test
    void testUpdateWrapper(){
        User user = new User();
        user.setName("xiaoqian2");
        user.setAge(22);

        UpdateWrapper wrapper=new UpdateWrapper();
        wrapper.eq("name","azx");
        int update = userMapper.update(user, wrapper);
        System.out.println(update);
    }
}
