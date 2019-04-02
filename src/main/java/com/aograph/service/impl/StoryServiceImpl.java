package com.aograph.service.impl;

import javax.transaction.Transactional;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aograph.dao.IStoryDao;
import com.aograph.entity.Story;
import com.aograph.service.IStoryService;

@Service("storyService")
@Transactional(rollbackOn = Exception.class)
public class StoryServiceImpl implements IStoryService {

	 private static final Log LOG = LogFactory.getLog(StoryServiceImpl.class);
	 
	 @Autowired
	 private IStoryDao storyDao;
	 
	 public void save(Story story) {
		 storyDao.save(story);
	 }
}
