package com.redonearth.androidjsp.db.mapper;

import com.redonearth.androidjsp.db.dto.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestMapper {
    List<Test> getAll() throws Exception;
}
