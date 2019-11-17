package com.pb.partybuilding.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pb.partybuilding.domain.*;
import com.pb.partybuilding.mapping.TVanguardMapper;
import com.pb.partybuilding.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VanguardService {

    @Autowired
    private TVanguardMapper tVanguardMapper;

    public PageInfo<TVanguard> selectByExample(Tablepar tablepar, String name){
        TVanguardExample tVanguardExample = new TVanguardExample();
        if (StringUtils.isNotEmpty(name)){
            tVanguardExample.createCriteria().andNameLike("%"+name+"%");
        }
        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
        List<TVanguard> list=tVanguardMapper.selectByExample(tVanguardExample);
        PageInfo<TVanguard> pageInfo = new PageInfo<TVanguard>(list);
        return pageInfo;
    }

    public List<TVanguard> getAll(){
        TVanguardExample tVanguardExample = new TVanguardExample();
        List<TVanguard> list=tVanguardMapper.selectByExample(tVanguardExample);
        return list;
    }

    @Transactional
    public int insertSelective(TVanguard record){
        return tVanguardMapper.insertSelective(record);
    }

    public TVanguard selectByPrimaryKey(String id){
        return tVanguardMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public int updateByPrimaryKey(TVanguard record){
        return tVanguardMapper.updateByPrimaryKey(record);
    }

    @Transactional
    public int deleteByPrimaryKey(String id){
        return tVanguardMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TVanguard record){
        return tVanguardMapper.updateByPrimaryKeySelective(record);
    }
}
