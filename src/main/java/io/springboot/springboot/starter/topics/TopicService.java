package io.springboot.springboot.starter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;
@Service
public class TopicService {
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic("spring","Spring Framework","Spring Desc"),new Topic("Java 1.8","core Java","Java Description"),new Topic("js","Java Script","Js Framework")));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		ListIterator<Topic> iter=topics.listIterator();
		
		while(iter.hasNext())
		{
			Topic topic=(Topic) iter.next();
			if(topic.getId().equals(id))
			{
				return topic;
			}
			
		}
		return null;
		
		 //topics.get(Integer.valueOf(id));//stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	
	public Topic addTopic(Topic topic)
	{
		
		topics.add(topic);
		
		return topic;
		
	}
	
	public void updateTopic(Topic topic,String id)
	{
		
		ListIterator<Topic> iter=topics.listIterator();
		
		while(iter.hasNext())
		{
			Topic topicex=(Topic) iter.next();
			if(topicex.getId().equals(id))
			{
				iter.remove();
				topics.add(topic);
				//return topic;
			}
			
		}
		
	}
	
	public void deleteTopic(String id)
	{
		
		ListIterator<Topic> iter=topics.listIterator();
		
		while(iter.hasNext())
		{
			Topic topicex=(Topic) iter.next();
			if(topicex.getId().equals(id))
			{
				iter.remove();
				//return topic;
			}
			
		}
		
	}

}
