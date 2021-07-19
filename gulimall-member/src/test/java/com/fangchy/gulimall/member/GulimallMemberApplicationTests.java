package com.fangchy.gulimall.member;

import com.fangchy.gulimall.member.entity.MemberEntity;
import com.fangchy.gulimall.member.service.MemberService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

    @Autowired
    MemberService memberService;

    @Test
    public void contextLoads() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("fangchy");
        memberService.save(memberEntity);
        System.out.println("执行成功...");
    }

}
