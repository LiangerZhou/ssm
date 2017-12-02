package com.liang.mapper;

import java.util.List;

import com.liang.entity.Task;


public interface TaskMapper {
	
	Task getTask(long id);
	
	int addTask(Task task);
	
	int deleteTask(long id);
	
	int updateTask(Task task);
	
	List<Task> getTasks();
}
