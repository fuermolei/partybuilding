package com.pb.partybuilding.mapping;

import com.pb.partybuilding.domain.TIntegral;
import com.pb.partybuilding.domain.TIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TIntegralMapper {
    int countByExample(TIntegralExample example);

    int deleteByExample(TIntegralExample example);

    int deleteByPrimaryKey(String id);

    int insert(TIntegral record);

    int insertSelective(TIntegral record);

    List<TIntegral> selectByExample(TIntegralExample example);

    TIntegral selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TIntegral record, @Param("example") TIntegralExample example);

    int updateByExample(@Param("record") TIntegral record, @Param("example") TIntegralExample example);

    int updateByPrimaryKeySelective(TIntegral record);

    int updateByPrimaryKey(TIntegral record);
}