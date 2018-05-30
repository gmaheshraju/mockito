package com.mockito.course;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TodoBusinessImplStubTest {

	@Test
	public void usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("mahesh");
		assertEquals(2, todos.size());
	}
}