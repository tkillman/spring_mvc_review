package spring.service.chap07;

public class fileInfo {

	private String fileOriginalName;
	private String filePath;
	private long fileSize;
	
	
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileOriginalName() {
		return fileOriginalName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFileOriginalName(String fileOriginalName) {
		this.fileOriginalName = fileOriginalName;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
	
	
	
}
