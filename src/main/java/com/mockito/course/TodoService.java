package com.mockito.course;

import java.util.List;

public interface TodoService {

	// External Service - Lets say this comes from WunderList

	public List<String> retrieveTodos(String user);

	public void deleteTodo(String todo);
}
