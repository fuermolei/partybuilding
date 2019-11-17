package com.pb.partybuilding.mapping;

import com.pb.partybuilding.domain.TActivity;
import com.pb.partybuilding.domain.TActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TActivityMapper {
    int countByExample(TActivityExample example);

    int deleteByExample(TActivityExample example);

    int deleteByPrimaryKey(String id);

    int insert(TActivity record);

    int insertSelective(TActivity record);

    List<TActivity> selectByExample(TActivityExample example);

    TActivity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TActivity record, @Param("example") TActivityExample example);

    int updateByExample(@Param("record") TActivity record, @Param("example") TActivityExample example);

    int updateByPrimaryKeySelective(TActivity record);

    int updateByPrimaryKey(TActivity record);
}