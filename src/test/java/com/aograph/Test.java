package com.aograph;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.aograph.entity.Story;
import com.aograph.service.IStoryService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Test.class)
@ComponentScan(basePackages={"com.aograph"})
public class Test {

	@Autowired
	private IStoryService storyService;
	
	@org.junit.Test
	public void test() {
		Story s = new Story();
		s.setTitle("333");
		s.setContent("66666");
		s.setIsSend("1");
		storyService.save(s);
	}
}
