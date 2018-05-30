package com.mockito.course;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;


import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListMockTest {

	@Test
	public void testListMock() {

      List listMock = mock(List.class);
      
     Mockito.when(listMock.size()).thenReturn(10);
     
     assertEquals(10, listMock.size());
     
		
	}
	
	
	@Test
	public void testListMockget() {

      List listMock = mock(List.class);
      
     Mockito.when(listMock.get(Mockito.anyInt())).thenReturn("mahesh");
     
     assertEquals("mahesh", listMock.get(0));
     assertEquals("mahesh", listMock.get(5));
     
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testListTestException() {

      List listMock = mock(List.class);
      
     Mockito.when(listMock.get(0)).thenThrow(NullPointerException.class);
     
     listMock.get(0);
		
	}
	
	@Test
	public void letsMockListGetWithAny() {
		List<String> list = mock(List.class);
		Mockito.when(list.get(Mockito.anyInt())).thenReturn("in28Minutes");
		// If you are using argument matchers, all arguments
		// have to be provided by matchers.
		assertEquals("in28Minutes", list.get(0));
		assertEquals("in28Minutes", list.get(1));
	}

	@Test
	public void bddAliases_UsingGivenWillReturn() {
		List<String> list = mock(List.class);

		//given
		given(list.get(Mockito.anyInt())).willReturn("in28Minutes");

		//then
		assertThat("in28Minutes", is(list.get(0)));
		assertThat("in28Minutes", is(list.get(0)));
	}
	
	
	

}
