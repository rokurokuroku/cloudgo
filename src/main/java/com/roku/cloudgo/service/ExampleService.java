package com.roku.cloudgo.service;

import com.roku.cloudgo.mapper.ExampleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ExampleService {
    @Resource
    private ExampleMapper exampleMapper;

    public int getAge(String name)
    {
        return exampleMapper.getPojo(name).getAge();
    }
}
