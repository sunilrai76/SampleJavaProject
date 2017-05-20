package com.ultra.domain;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SampleDomainTest {

	@Test
	public void testDisplay() {
		SampleDomain domain = new SampleDomain();
		domain.getDomainNae();
	}

}
