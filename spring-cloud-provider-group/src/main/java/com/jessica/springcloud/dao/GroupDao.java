package com.jessica.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jessica.springcloud.pojo.Group;

@Mapper
@Repository
public interface GroupDao {

    List<Group> queryAll();

    Group queryById(@Param("gNo") Long gNo);

    boolean addGroup(Group group);

}
