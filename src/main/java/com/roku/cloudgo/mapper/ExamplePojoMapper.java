package com.roku.cloudgo.mapper;

import com.roku.cloudgo.pojo.ExamplePojo;
import com.roku.cloudgo.pojo.ExamplePojoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamplePojoMapper {
    int countByExample(ExamplePojoExample example);

    int deleteByExample(ExamplePojoExample example);

    int insert(ExamplePojo record);

    int insertSelective(ExamplePojo record);

    List<ExamplePojo> selectByExample(ExamplePojoExample example);

    int updateByExampleSelective(@Param("record") ExamplePojo record, @Param("example") ExamplePojoExample example);

    int updateByExample(@Param("record") ExamplePojo record, @Param("example") ExamplePojoExample example);
}