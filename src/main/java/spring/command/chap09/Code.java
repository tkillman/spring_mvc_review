package spring.command.chap09;

public class Code {

	private String labelString;
	private String valueString;
	
	
	
	public Code(String valueString,String labelString) {
	
		this.labelString = labelString;
		this.valueString = valueString;
	}
	
	public String getLabelString() {
		return labelString;
	}
	public void setLabelString(String labelString) {
		this.labelString = labelString;
	}
	public String getValueString() {
		return valueString;
	}
	public void setValueString(String valueString) {
		this.valueString = valueString;
	}
	
	
	
	
}
