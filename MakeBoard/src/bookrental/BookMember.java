package bookrental;

public class BookMember {
	
	private String memberId;
	private String memberPassword;
	private String phoneNumber;
	
	public BookMember() {}
	
	public BookMember(String memberId,String memberPassword) {
		this.memberId=memberId;
		this.memberPassword=memberPassword;
	}
	
	public BookMember(String memberId, String memberPassword, String phoneNumber) {
		super();
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.phoneNumber = phoneNumber;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "BookMember [memberId=" + memberId + ", memberPassword=" + memberPassword + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	 public boolean equals(Object obj) {
	 if (obj instanceof BookMember) {
					 
		 return memberId == (((BookMember)obj).memberId) 
		 && memberPassword == (((BookMember)obj).memberPassword);
	 
	    }return false;
}
	
	
	

}
