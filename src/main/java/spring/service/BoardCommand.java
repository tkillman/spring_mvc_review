package spring.service;

public class BoardCommand{
 // command 는 파라미터를 받아오는 객체를 말한다.
	
	
	private String parentId;
	private String title;
	private String context;
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	@Override
	public String toString() {
		return "Dto [parentId=" + parentId + ", title=" + title + ", context=" + context + "]";
	}
	
	
}
