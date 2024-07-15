package br.com.erudio;

public class Greeting { //  ---------> End Point <----------
	
	private final long id;
	private final String content; 
	
	Greeting(long id, String content) {
		this.id = id;
		this.content = content;
		
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	
	
	
	
	

	
	
	

}
