package com.care.root;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.care.root.member.controller.MemberController;
import com.care.root.member.service.MemberService;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:testMember.xml"}) //특정 위치에있는 파일을 가져온다
public class TeatMember {
	@Autowired MemberController mc;
	@Test
	public void testMc() {
		System.out.println("----mc : +mc");
		assertNotNull(mc);// null이 아니면 성공
	}
	@Autowired MemberService ms;
	@Test
	public void testMs() {
		assertNotNull(ms);
	}
}





