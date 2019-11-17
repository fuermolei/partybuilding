package com.pb.partybuilding.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pb.partybuilding.domain.*;
import com.pb.partybuilding.mapping.TBranchMapper;
import com.pb.partybuilding.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BranchService {

    @Autowired
    private TBranchMapper tBranchMapper;

    public PageInfo<TBranch> selectByExample(Tablepar tablepar, String name){
        TBranchExample tPartymemberExample = new TBranchExample();
        if (StringUtils.isNotEmpty(name)){
            tPartymemberExample.createCriteria().andNameLike("%"+name+"%");
        }
        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
        List<TBranch> list=tBranchMapper.selectByExample(tPartymemberExample);
        PageInfo<TBranch> pageInfo = new PageInfo<TBranch>(list);
        return pageInfo;
    }

    public List<TBranch> getAll(){
        TBranchExample tPartymemberExample = new TBranchExample();
        TBranchExample tBranchExampler = new TBranchExample();
        List<TBranch> list=tBranchMapper.selectByExample(tBranchExampler);
        return list;
    }

    public TBranch selectByPrimaryKey(String id){
        return tBranchMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public int insertSelective(TBranch record){
        return tBranchMapper.insertSelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey(String id){
        return tBranchMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TBranch record){
       return tBranchMapper.updateByPrimaryKeySelective(record);
    }


}
