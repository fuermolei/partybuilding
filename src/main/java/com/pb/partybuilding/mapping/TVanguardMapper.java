package com.pb.partybuilding.mapping;

import com.pb.partybuilding.domain.TVanguard;
import com.pb.partybuilding.domain.TVanguardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVanguardMapper {
    int countByExample(TVanguardExample example);

    int deleteByExample(TVanguardExample example);

    int deleteByPrimaryKey(String id);

    int insert(TVanguard record);

    int insertSelective(TVanguard record);

    List<TVanguard> selectByExample(TVanguardExample example);

    TVanguard selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TVanguard record, @Param("example") TVanguardExample example);

    int updateByExample(@Param("record") TVanguard record, @Param("example") TVanguardExample example);

    int updateByPrimaryKeySelective(TVanguard record);

    int updateByPrimaryKey(TVanguard record);
}