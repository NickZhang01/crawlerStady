package com.aograph.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aograph.dao.IStoryDao;
import com.aograph.entity.Story;


@Repository("storyDao")
public class StoryDaoImpl implements IStoryDao {

	@Autowired
    private HibernateTemplate hibernateTemplate;
 
    @Override
    public void save(Story story) {
        hibernateTemplate.save(story);
    }
}
