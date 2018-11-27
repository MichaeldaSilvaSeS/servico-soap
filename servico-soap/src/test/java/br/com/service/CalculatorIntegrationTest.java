package br.com.service;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.net.MalformedURLException;

import org.junit.Before;
import org.junit.Test;

import com.skjolberg.mockito.soap.SoapServiceRule;

public class CalculatorIntegrationTest {
	
	public SoapServiceRule soap;
	public CalculatorSoap serviceMock;
	
	@Before
	public void setUp() {
		soap = SoapServiceRule.newInstance();
		serviceMock = soap.mock(CalculatorSoap.class, "http://localhost:27020/selfservice/shop");
	}
	
	@Test
	public void add() throws MalformedURLException {
		//when(serviceMock);
		doReturn(3).when(serviceMock).add(1, 1);
		
		int result = serviceMock.add(1, 1);
		assertEquals(3, result);
	}

}
