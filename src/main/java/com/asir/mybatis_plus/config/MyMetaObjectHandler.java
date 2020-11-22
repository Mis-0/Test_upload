package com.asir.mybatis_plus.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author asir
 * @date 2020/10/26 - 14:49
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    //插入时的填充策略
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ~");
        //default MetaObjectHandler setFieldValByName(String fieldName, Object fieldVal, MetaObject metaObject)
        this.setFieldValByName("gmtCreate",new Date(),metaObject);
        this.setFieldValByName("gmtModified",new Date(),metaObject);
    }

    //更新时的填充策略
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ~");
        this.setFieldValByName("gmtModified",new Date(),metaObject);
    }
}
