package com.pb.partybuilding.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pb.partybuilding.common.support.Convert;
import com.pb.partybuilding.domain.*;
import com.pb.partybuilding.mapping.TActivityMapper;
import com.pb.partybuilding.mapping.TSignupMapper;
import com.pb.partybuilding.utils.FileUtils;
import com.pb.partybuilding.utils.MatrixToImageWriter;
import com.pb.partybuilding.utils.SnowflakeIdWorker;
import com.pb.partybuilding.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class ActivityService {

    @Autowired
    private TActivityMapper tActivityMapper;
    @Autowired
    private TSignupMapper tSignupMapper;

    public PageInfo<TActivity> selectByExample(Tablepar tablepar, String title){
        TActivityExample tActivityExample = new TActivityExample();
        if (StringUtils.isNotEmpty(title)) {
            tActivityExample.createCriteria().andTitleLike("%" + title + "%");
        }
        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
        List<TActivity> list = tActivityMapper.selectByExample(tActivityExample);
        PageInfo<TActivity> pageInfo = new PageInfo<TActivity>(list);
        return pageInfo;
    }

    @Transactional
    public int insertSelective(TActivity record){
        String[] strArr= record.getOobject().split(",");
        for(String a:strArr){
            TSignup tSignup = new TSignup();
            tSignup.setId(SnowflakeIdWorker.getUUID());
            tSignup.setActivityId(record.getId());
            tSignup.setPartymemberId(a);
            tSignup.setIsSignin("0");
            tSignupMapper.insertSelective(tSignup);
        }
        String text = "http://xhl.free.idcfengye.com/ActivityController/signup?id="+record.getId();
        int width = 300;    //二维码图片的宽
        int height = 300;   //二维码图片的高
        String format = "jpg";  //二维码图片的格式
        try {
            String fileName =FileUtils.generateQRCode(text, width, height, format,record.getId());
            System.out.println(fileName+">>>fileName");
            record.setCode(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tActivityMapper.insertSelective(record);
    }

    public TActivity selectByPrimaryKey(String id){
        return tActivityMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TActivity record){
        return tActivityMapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey(String id){
        List<String> lista= Convert.toListStrArray(id);
        TActivityExample tActivityExample = new TActivityExample();
        tActivityExample.createCriteria().andIdIn(lista);
        return tActivityMapper.deleteByExample(tActivityExample);
    }


}
