package com.pb.partybuilding.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pb.partybuilding.common.support.Convert;
import com.pb.partybuilding.domain.*;
import com.pb.partybuilding.mapping.TBranchMapper;
import com.pb.partybuilding.mapping.TPartymemberMapper;
import com.pb.partybuilding.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartymemberService {

    @Autowired
    private TPartymemberMapper tPartymemberMapper;
    @Autowired
    private BranchService branchService;

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

    /**
     * 获取通知对象的tree数据
     * @return
     */
    public String getAll(){
        List<PartymenberTree> treeList = new ArrayList<PartymenberTree>();
        PartymenberTree tree = new PartymenberTree();
        tree.setId("0");
        tree.setpId("0");
        tree.setName("党员列表");
        tree.setOpen("true");
        tree.setNodes("1");
        treeList.add(tree);
        List<TBranch> list=branchService.getAll();
        for(TBranch t : list){
            PartymenberTree tree2 = new PartymenberTree();
            tree2.setId(t.getId());
            tree2.setpId("0");
            tree2.setName(t.getName());
            tree2.setNodes("2");
            treeList.add(tree2);
        }
        TPartymemberExample tPartymemberExample = new TPartymemberExample();
        List<TPartymember> list2=tPartymemberMapper.selectByExample2(tPartymemberExample);
        for(TPartymember t : list2){
            PartymenberTree tree3 = new PartymenberTree();
            tree3.setId(t.getId());
            tree3.setpId(t.getBranchId());
            tree3.setName(t.getName());
            tree3.setNodes("3");
            treeList.add(tree3);
        }
        return JSONObject.toJSONString(treeList);
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
        //转成集合
        List<String> lista= Convert.toListStrArray(id);
        TPartymemberExample tPartymemberExample = new TPartymemberExample();
        tPartymemberExample.createCriteria().andIdIn(lista);
        return tPartymemberMapper.deleteByExample(tPartymemberExample);
    }
}
