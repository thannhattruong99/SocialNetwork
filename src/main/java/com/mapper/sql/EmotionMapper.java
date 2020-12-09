package com.mapper.sql;

import com.example.pojo.Emotion;
import com.example.pojo.EmotionExample;
import com.example.pojo.EmotionKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmotionMapper {
    int countByExample(EmotionExample example);

    int deleteByExample(EmotionExample example);

    int deleteByPrimaryKey(EmotionKey key);

    int insert(Emotion record);

    int insertSelective(Emotion record);

    List<Emotion> selectByExample(EmotionExample example);

    Emotion selectByPrimaryKey(EmotionKey key);

    int updateByExampleSelective(@Param("record") Emotion record, @Param("example") EmotionExample example);

    int updateByExample(@Param("record") Emotion record, @Param("example") EmotionExample example);

    int updateByPrimaryKeySelective(Emotion record);

    int updateByPrimaryKey(Emotion record);
}