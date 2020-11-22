package com.asir.mybatis_plus.mapper;

import com.asir.mybatis_plus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author asir
 * @date 2020/10/26 - 9:29
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
   /* @Update("update user set ")
    public  int updateByName(String name);*/
}
