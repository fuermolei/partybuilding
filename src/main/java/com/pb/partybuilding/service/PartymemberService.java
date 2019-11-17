package com.pb.partybuilding.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pb.partybuilding.domain.TPartymember;
import com.pb.partybuilding.domain.TPartymemberExample;
import com.pb.partybuilding.domain.Tablepar;
import com.pb.partybuilding.mapping.TPartymemberMapper;
import com.pb.partybuilding.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PartymemberService {

    @Autowired
    private TPartymemberMapper tPartymemberMapper;

    public PageInfo<TPartymember> selectByExample(Tablepar tablepar, String name){
        TPartymemberExample tPartymemberExample = new TPartymemberExample();
        if (StringUtils.isNotEmpty(name)){
            tPartymemberExample.createCriteria().andNameLike("%"+name+"%");
        }
        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
        List<TPartymember> list=tPartymemberMapper.selectByExample(tPartymemberExample);
        PageInfo<TPartymember> pageInfo = new PageInfo<TPartymember>(list);
        return pageInfo;
    }

    public int countByExample(TPartymemberExample tPartymemberExample,String name){
        if (StringUtils.isNotEmpty(name)){
            tPartymemberExample.createCriteria().andNameLike(name);
        }
        return tPartymemberMapper.countByExample(tPartymemberExample);
    }

    @Transactional
    public int insertSelective(TPartymember record){
        return tPartymemberMapper.insertSelective(record);
    }

    public TPartymember selectByPrimaryKey(String id){
        return tPartymemberMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TPartymember record){
        return tPartymemberMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey(String id){
        return tPartymemberMapper.deleteByPrimaryKey(id);
    }
}
