package com.stephen.canal;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description //TODO
 * @Author GaoX
 * @Date 2020/6/28 14:44
 */
@Data
//@Table(name = "test")
public class Users implements Serializable {

    private Integer id;
    private String name;

}