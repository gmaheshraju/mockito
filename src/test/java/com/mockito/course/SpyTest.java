package com.mockito.course;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class SpyTest {

	@Test
	public void creatingASpyOnArrayList() {
		List<String> list = new ArrayList<String>();
		List<String> listSpy = Mockito.spy(list);
		listSpy.add("rajesh");
		listSpy.add("mahesh");

		verify(listSpy).add("rajesh");
		verify(listSpy).add("mahesh");

		//verify(listSpy).add("m");
		
		assertEquals(2, listSpy.size());
		assertEquals("rajesh", listSpy.get(0));
	}

	@Test
	public void creatingASpyOnArrayList_overridingSpecificMethods() {
		List<String> list = new ArrayList<String>();
		List<String> listSpy = Mockito.spy(list);
		listSpy.add("Ranga");
		listSpy.add("in28Minutes");

		stub(listSpy.size()).toReturn(-1);

		assertEquals(2, listSpy.size());
		assertEquals("Ranga", listSpy.get(0));
		

		// @Spy Annotation
	}
}