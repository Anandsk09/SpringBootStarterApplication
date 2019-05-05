package io.springboot.springboot.starter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService service;
	
	@RequestMapping(value="/topics")
	public List getAlltopics()
	{
		
		return service.getAllTopics();
		
	}
	
	@RequestMapping(value="/topics/{ids}")
	public Topic getopic(@PathVariable("ids") String id)
	{
		return service.getTopic(id);
		//return Arrays.asList(new Topic("a","b","c"),new Topic("c","d","e"),new Topic("f","g","h"));
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public Topic addtopic(@RequestBody Topic topic)
	{
		return service.addTopic(topic);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		 service.updateTopic(topic,id);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		 service.deleteTopic(id);
	}
	
	public TopicService getService() {
		return service;
	}
	
	public void setService(TopicService service) {
		this.service = service;
	}
	

}
