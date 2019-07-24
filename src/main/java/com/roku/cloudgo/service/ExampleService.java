package com.roku.cloudgo.service;


import com.roku.cloudgo.DAO.mapper.ExamplePojoMapper;
import com.roku.cloudgo.pojo.ExamplePojoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ExampleService {
    @Resource
    private ExamplePojoMapper examplePojoMapper;

    public int getAgeByName(String name)
    {
        ExamplePojoExample example = new ExamplePojoExample();
        example.createCriteria().andNameEqualTo(name);
        return examplePojoMapper.selectByExample(example).get(0).getAge();
    }
}
