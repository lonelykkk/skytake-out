package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {


    void insertBatch(List<DishFlavor> flavors);

    @Delete("delete from dish_flavor where id = #{id}")
    void delete(Long id);

    @Select("select * from dish_flavor where id = #{id}")
    List<DishFlavor> getByDishId(Long id);
}
