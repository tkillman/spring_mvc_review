package spring.command.chap02;

public class Dto {

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
