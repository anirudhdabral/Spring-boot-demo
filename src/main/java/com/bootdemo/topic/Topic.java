package com.bootdemo.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String descr;
	
	public Topic(String topicId, String name, String descr) {
		this.id=topicId;
		this.name=name;
		this.descr=descr;
	}

}
