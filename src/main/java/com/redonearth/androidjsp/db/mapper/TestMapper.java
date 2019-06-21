package com.redonearth.androidjsp.db.mapper;

import com.redonearth.androidjsp.db.dto.Test;

import java.util.List;

public interface TestMapper {
    public List<Test> getAll() throws Exception;
}
