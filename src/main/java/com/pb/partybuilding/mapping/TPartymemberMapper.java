package com.pb.partybuilding.mapping;

import com.pb.partybuilding.domain.TPartymember;
import com.pb.partybuilding.domain.TPartymemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPartymemberMapper {
    int countByExample(TPartymemberExample example);

    int deleteByExample(TPartymemberExample example);

    int deleteByPrimaryKey(String id);

    int insert(TPartymember record);

    int insertSelective(TPartymember record);

    List<TPartymember> selectByExample(TPartymemberExample example);

    List<TPartymember> selectByExample2(TPartymemberExample example);

    TPartymember selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TPartymember record, @Param("example") TPartymemberExample example);

    int updateByExample(@Param("record") TPartymember record, @Param("example") TPartymemberExample example);

    int updateByPrimaryKeySelective(TPartymember record);

    int updateByPrimaryKey(TPartymember record);
}