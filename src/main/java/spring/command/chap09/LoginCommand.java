package spring.command.chap09;

import java.util.List;

public class LoginCommand {

	private String memberId;
	private String password;
	private String loginType;
	private Address address;
	private String jobCode;
	private String[] likeOs;
	private boolean contractAgreement;
	
	
	
	public boolean isContractAgreement() {
		return contractAgreement;
	}
	public void setContractAgreement(boolean contractAgreement) {
		this.contractAgreement = contractAgreement;
	}
	public String[] getLikeOs() {
		return likeOs;
	}
	public void setLikeOs(String[] likeOs) {
		this.likeOs = likeOs;
	}
	public String getJobCode() {
		return jobCode;
	}
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getLoginType() {
		return loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
