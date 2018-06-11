package com.example.domain.repository;

import com.example.domain.model.EmployeeEntity;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface EmployeeRepository  {

    @MapKey("id")
    Map<Integer, EmployeeEntity> findAllByIds(@Param("ids") List<Integer> ids);
}
