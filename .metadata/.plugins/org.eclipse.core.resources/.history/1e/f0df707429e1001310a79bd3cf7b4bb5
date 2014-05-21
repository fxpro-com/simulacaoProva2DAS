
public class URLSplitting {
	
	public String protocol(String url) {
		String[] protocol =  url.split("://");
		return protocol[0];
	}

	public String domain(String url) {
		String[] domain = url.split("://"); //ww.google/lala
		domain =  domain[1].split("/");//www.google     lala
		return domain[0];
	}
}
