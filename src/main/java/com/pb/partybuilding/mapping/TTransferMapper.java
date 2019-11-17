package com.pb.partybuilding.mapping;

import com.pb.partybuilding.domain.TTransfer;
import com.pb.partybuilding.domain.TTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTransferMapper {
    int countByExample(TTransferExample example);

    int deleteByExample(TTransferExample example);

    int deleteByPrimaryKey(String id);

    int insert(TTransfer record);

    int insertSelective(TTransfer record);

    List<TTransfer> selectByExample(TTransferExample example);

    TTransfer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TTransfer record, @Param("example") TTransferExample example);

    int updateByExample(@Param("record") TTransfer record, @Param("example") TTransferExample example);

    int updateByPrimaryKeySelective(TTransfer record);

    int updateByPrimaryKey(TTransfer record);
}