package com.pb.partybuilding.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pb.partybuilding.domain.*;
import com.pb.partybuilding.mapping.TTransferMapper;
import com.pb.partybuilding.utils.DateUtils;
import com.pb.partybuilding.utils.FileUtils;
import com.pb.partybuilding.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class TransferService {

    @Autowired
    private TTransferMapper tTransferMapper;
    @Autowired
    private PartymemberService partymemberService;

    public PageInfo<TTransfer> selectByExample(Tablepar tablepar, String name){
        TTransferExample tTransferExample = new TTransferExample();
        if (StringUtils.isNotEmpty(name)){
            tTransferExample.createCriteria().andNameLike("%"+name+"%");
        }
        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
        List<TTransfer> list=tTransferMapper.selectByExample(tTransferExample);
        PageInfo<TTransfer> pageInfo = new PageInfo<TTransfer>(list);
        return pageInfo;
    }

    @Transactional
    public int insertSelective(TTransfer tTransfer){
        TPartymemberExample tPartymemberExample = new TPartymemberExample();
        tPartymemberExample.createCriteria().andBranchIdEqualTo(tTransfer.getId());
        int count=partymemberService.countByExample(tPartymemberExample,null);
        if(count>0){
            partymemberService.deleteByPrimaryKey(tTransfer.getId());
        }
        tTransfer.setOperationtime(DateUtils.getDate());
        tTransfer.setOperator("操作人");
        return tTransferMapper.insertSelective(tTransfer);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TTransfer record){
        return tTransferMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey(String id){
        return tTransferMapper.deleteByPrimaryKey(id);
    }
}
