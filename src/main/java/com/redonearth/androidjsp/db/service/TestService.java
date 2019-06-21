package com.redonearth.androidjsp.db.service;

import com.redonearth.androidjsp.db.dto.Test;
import com.redonearth.androidjsp.db.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    TestMapper testMapper;

    public List<Test> getAll() throws Exception {
        return testMapper.getAll();
    }
}
