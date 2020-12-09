package com.mapper.sql;

import com.example.pojo.NoticeType;
import com.example.pojo.NoticeTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticeTypeMapper {
    int countByExample(NoticeTypeExample example);

    int deleteByExample(NoticeTypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(NoticeType record);

    int insertSelective(NoticeType record);

    List<NoticeType> selectByExample(NoticeTypeExample example);

    NoticeType selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") NoticeType record, @Param("example") NoticeTypeExample example);

    int updateByExample(@Param("record") NoticeType record, @Param("example") NoticeTypeExample example);

    int updateByPrimaryKeySelective(NoticeType record);

    int updateByPrimaryKey(NoticeType record);
}