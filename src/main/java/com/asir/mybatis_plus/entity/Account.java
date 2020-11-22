package com.asir.mybatis_plus.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author asir
 * @date 2020/10/26 - 15:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @TableId(type = IdType.AUTO)//设置自动增长
    private  int id;
    private  String account;
    private  double balance;

    @TableField(fill = FieldFill.INSERT) //在插入时候更新该时间
    private  Date gmtCreate;
    @TableField(fill = FieldFill.INSERT_UPDATE)//在插入和修改的时候改变该时间
    private  Date  gmtModified;

}
