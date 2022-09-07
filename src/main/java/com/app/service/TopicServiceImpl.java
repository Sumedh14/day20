package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Topic;
@Service
@Transactional
public class TopicServiceImpl implements ITopicsService {
	@Autowired
	private ITopicsService topicDao;
	@Override
	public List<Topic> getAllTopics() {
		
		return null;
	}

}
