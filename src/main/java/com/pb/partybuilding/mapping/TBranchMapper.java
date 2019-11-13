package com.pb.partybuilding.mapping;

import com.pb.partybuilding.domain.TBranch;
import com.pb.partybuilding.domain.TBranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBranchMapper {
    int countByExample(TBranchExample example);

    int deleteByExample(TBranchExample example);

    int deleteByPrimaryKey(String id);

    int insert(TBranch record);

    int insertSelective(TBranch record);

    List<TBranch> selectByExample(TBranchExample example);

    TBranch selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TBranch record, @Param("example") TBranchExample example);

    int updateByExample(@Param("record") TBranch record, @Param("example") TBranchExample example);

    int updateByPrimaryKeySelective(TBranch record);

    int updateByPrimaryKey(TBranch record);
}