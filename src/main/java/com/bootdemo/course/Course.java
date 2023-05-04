package com.bootdemo.course;

import com.bootdemo.topic.Topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	@Id
	private String id;
	private String name;
	private String descr;

	@ManyToOne
	private Topic topic;

	public void setTopic(Topic topic) {
		this.topic = topic;
		
	}

}
