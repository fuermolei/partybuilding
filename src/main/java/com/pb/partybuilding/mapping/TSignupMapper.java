package com.pb.partybuilding.mapping;

import com.pb.partybuilding.domain.TSignup;
import com.pb.partybuilding.domain.TSignupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSignupMapper {
    int countByExample(TSignupExample example);

    int deleteByExample(TSignupExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSignup record);

    int insertSelective(TSignup record);

    List<TSignup> selectByExample(TSignupExample example);

    TSignup selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSignup record, @Param("example") TSignupExample example);

    int updateByExample(@Param("record") TSignup record, @Param("example") TSignupExample example);

    int updateByPrimaryKeySelective(TSignup record);

    int updateByPrimaryKey(TSignup record);
}