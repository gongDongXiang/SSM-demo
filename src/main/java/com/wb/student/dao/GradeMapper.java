package com.wb.student.dao;

import com.wb.student.bean.Grade;
import com.wb.student.bean.GradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
    long countByExample(GradeExample example);

    int deleteByExample(GradeExample example);

    int deleteByPrimaryKey(Integer gradeId);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExample(GradeExample example);

    Grade selectByPrimaryKey(Integer gradeId);

    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByExample(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}