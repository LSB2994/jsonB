package com.example.demo.modal;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMap {

    @Insert("""
            INSERT INTO product (name, description, price, json_data) VALUES (#{req.name}, #{req.description}, #{req.price}::numeric, #{req.jsonData, typeHandler=com.example.demo.config.JsonHandler}::jsonb)
            """)
//    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(@Param("req") ProductRequest productRequest);


    @Select("SELECT * FROM product WHERE id = #{id}")
//    @ResultMap("productResultMap")
    Products selectById(int id);

    @Select("SELECT * FROM product")
//    @ResultMap("productResultMap")
    List<Products> selectAll();

    @Update("UPDATE product SET name = #{name}, description = #{description}, price = #{price}, json_data = #{jsonData, typeHandler=com.example.demo.config.JsonHandler} WHERE id = #{id}")
    void update(Products product);

    @Delete("DELETE FROM product WHERE id = #{id}")
    void delete(int id);
}