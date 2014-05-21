import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class URLSplittingTest {
	
	private URLSplitting urlSplitting;
	private String url;

	@Before
	public void setUp() throws Exception {
		urlSplitting = new URLSplitting();
		url = "http://www.google.se/images";
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Teste com sucesso");
	}

	@Test
	public void testProtocol() {
		assertEquals("http", urlSplitting.protocol(url));
	}
	
	@Test
	public void testDomain() {
		assertEquals("www.google.se", urlSplitting.domain(url));
	}
	
	@Test
	public void testPath() {
		assertEquals("images", urlSplitting.path(url));
	}

}
