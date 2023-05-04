package com.bootdemo.topic;


import org.springframework.data.repository.CrudRepository;

//@Repository
public interface TopicRepository extends CrudRepository<Topic, String>  {

}
