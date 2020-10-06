package com.learn.learn.Dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    @Select("select id from department")
    public List<Integer> getId();
}
