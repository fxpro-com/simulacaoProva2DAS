
public class URLSplitting {
	
	public String protocol(String url) {
		String[] protocol =  url.split("://");
		return protocol[0];
	}

	public Object domain(String url) {
		String[] domain = url.split("://");
		domain =  url.split("/images");
		domain =  url.split("");
		return domain[1];
	}
}
