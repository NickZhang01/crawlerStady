package com.aograph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aograph.entity.Story;
import com.aograph.service.IStoryService;

@RestController
@RequestMapping("/crawler")
public class CrawlerController {

	@Autowired
	private IStoryService storyService;

	@RequestMapping("/1")
	public String index() {
		Story s = new Story();
		s.setTitle("333");
		s.setContent("66666");
		s.setIsSend("1");
		storyService.save(s);
		return "ffff";
	}
}
