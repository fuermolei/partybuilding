package com.pb.partybuilding.service;

import com.pb.partybuilding.domain.TPartymember;
import com.pb.partybuilding.domain.TPartymemberExample;
import com.pb.partybuilding.domain.TSignup;
import com.pb.partybuilding.domain.TSignupExample;
import com.pb.partybuilding.mapping.TPartymemberMapper;
import com.pb.partybuilding.mapping.TSignupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignUpService {

    @Autowired
    private TSignupMapper tSignupMapper;
    @Autowired
    private TPartymemberMapper tPartymemberMapper;

    public int checkUp(String id,String idnumber){
        int count = 0;
        TSignupExample tSignupExample = new TSignupExample();
        tSignupExample.createCriteria().andActivityIdEqualTo(id);
        List<TSignup> list = tSignupMapper.selectByExample(tSignupExample);
        TPartymemberExample tPartymemberExample = new TPartymemberExample();
        tPartymemberExample.createCriteria().andIdnumberEqualTo(idnumber);
        List<TPartymember> list2 = tPartymemberMapper.selectByExample(tPartymemberExample);
        String partymemberId = "";
        String activityId = "";
        for(TPartymember t:list2){
            partymemberId=t.getId();
        }
        for(TSignup t:list){
            if (partymemberId==t.getPartymemberId()||partymemberId.equals(t.getPartymemberId())){
                TSignup tSignup = new TSignup();
                tSignup.setId(t.getId());
                tSignup.setPartymemberId(partymemberId);
                tSignup.setActivityId(t.getActivityId());
                tSignup.setIsSignin("1");
                count=tSignupMapper.updateByPrimaryKey(tSignup);
            }
        }
        return count;
    }

    public int insertSelective(TSignup record){
        return tSignupMapper.insertSelective(record);
    }
}
