
public class URLSplitting {
	
	public String protocol(String url) {
		String[] protocol =  url.split("://");
		return protocol[0];
	}
}
