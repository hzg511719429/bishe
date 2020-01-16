package com.guang.bishe.mapper;

import com.guang.bishe.domain.Productimg;
import com.guang.bishe.domain.ProductimgExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductimgMapper {
    int countByExample(ProductimgExample example);

    int deleteByExample(ProductimgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Productimg record);

    int insertSelective(Productimg record);

    List<Productimg> selectByExample(ProductimgExample example);

    Productimg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Productimg record, @Param("example") ProductimgExample example);

    int updateByExample(@Param("record") Productimg record, @Param("example") ProductimgExample example);

    int updateByPrimaryKeySelective(Productimg record);

    int updateByPrimaryKey(Productimg record);
}