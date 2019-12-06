package resources;

public class URLProvider extends Config{

public void getUrl(){
	
	if(urltype.equalsIgnoreCase("makemytrip")){
		
		url="https://www.makemytrip.com/";
		
	}else if (urltype.equalsIgnoreCase("amazon")){
		
		url="https://www.amazon.com/";
		
	}
}
}

