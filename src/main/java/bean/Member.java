package bean;

public class Member {

	private int sampleMemberDataId;
	private String policyNumber;
	private String applicantName;
	private  String doorNumber;
	private String street;
	private  String city;
	private  String stateCode;
	private String  countryCode;
	private  int zipCode;
	private String cellPhoneNumber;
	private  String dateOfBirth;
	private String gender;
	private String ssn;
	private	int benefitCoverageAmount;
	private	String  datePolicyApplied;
	private  String studentOfIndia;
	private String hazardousOccupation;
	private  String heartDiseasePresent;
	private String involvedInAviationActivities;
	private String drinkingSmokingHabits;
	private int premiumFrequency;
	private String  agentCode;
	private String policyEffectiveDate;
	private int  premiumAmount;
	private int specialistVisitsAllowed;
	private String  processDate;
	private String policyStatus;
	public int getSampleMemberDataId() {
		return sampleMemberDataId;
	}
	public void setSampleMemberDataId(int sampleMemberDataId) {
		this.sampleMemberDataId = sampleMemberDataId;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}
	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getBenefitCoverageAmount() {
		return benefitCoverageAmount;
	}
	public void setBenefitCoverageAmount(int benefitCoverageAmount) {
		this.benefitCoverageAmount = benefitCoverageAmount;
	}
	public String getDatePolicyApplied() {
		return datePolicyApplied;
	}
	public void setDatePolicyApplied(String datePolicyApplied) {
		this.datePolicyApplied = datePolicyApplied;
	}
	public String getStudentOfIndia() {
		return studentOfIndia;
	}
	public void setStudentOfIndia(String studentOfIndia) {
		this.studentOfIndia = studentOfIndia;
	}
	public String getHazardousOccupation() {
		return hazardousOccupation;
	}
	public void setHazardousOccupation(String hazardousOccupation) {
		this.hazardousOccupation = hazardousOccupation;
	}
	public String getHeartDiseasePresent() {
		return heartDiseasePresent;
	}
	public void setHeartDiseasePresent(String heartDiseasePresent) {
		this.heartDiseasePresent = heartDiseasePresent;
	}
	public String getInvolvedInAviationActivities() {
		return involvedInAviationActivities;
	}
	public void setInvolvedInAviationActivities(String involvedInAviationActivities) {
		this.involvedInAviationActivities = involvedInAviationActivities;
	}
	public String getDrinkingSmokingHabits() {
		return drinkingSmokingHabits;
	}
	public void setDrinkingSmokingHabits(String drinkingSmokingHabits) {
		this.drinkingSmokingHabits = drinkingSmokingHabits;
	}
	public int getPremiumFrequency() {
		return premiumFrequency;
	}
	public void setPremiumFrequency(int premiumFrequency) {
		this.premiumFrequency = premiumFrequency;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}
	public void setPolicyEffectiveDate(String policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public int getSpecialistVisitsAllowed() {
		return specialistVisitsAllowed;
	}
	public void setSpecialistVisitsAllowed(int specialistVisitsAllowed) {
		this.specialistVisitsAllowed = specialistVisitsAllowed;
	}
	public String getProcessDate() {
		return processDate;
	}
	public void setProcessDate(String processDate) {
		this.processDate = processDate;
	}
	public String getPolicyStatus() {
		return policyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public Member(int sampleMemberDataId, String policyNumber, String applicantName, String doorNumber, String street,
			String city, String stateCode, String countryCode, int zipCode, String cellPhoneNumber, String dateOfBirth,
			String gender, String ssn, int benefitCoverageAmount, String datePolicyApplied, String studentOfIndia,
			String hazardousOccupation, String heartDiseasePresent, String involvedInAviationActivities,
			String drinkingSmokingHabits, int premiumFrequency, String agentCode, String policyEffectiveDate,
			int premiumAmount, int specialistVisitsAllowed, String processDate, String policyStatus) {
		super();
		this.sampleMemberDataId = sampleMemberDataId;
		this.policyNumber = policyNumber;
		this.applicantName = applicantName;
		this.doorNumber = doorNumber;
		this.street = street;
		this.city = city;
		this.stateCode = stateCode;
		this.countryCode = countryCode;
		this.zipCode = zipCode;
		this.cellPhoneNumber = cellPhoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.ssn = ssn;
		this.benefitCoverageAmount = benefitCoverageAmount;
		this.datePolicyApplied = datePolicyApplied;
		this.studentOfIndia = studentOfIndia;
		this.hazardousOccupation = hazardousOccupation;
		this.heartDiseasePresent = heartDiseasePresent;
		this.involvedInAviationActivities = involvedInAviationActivities;
		this.drinkingSmokingHabits = drinkingSmokingHabits;
		this.premiumFrequency = premiumFrequency;
		this.agentCode = agentCode;
		this.policyEffectiveDate = policyEffectiveDate;
		this.premiumAmount = premiumAmount;
		this.specialistVisitsAllowed = specialistVisitsAllowed;
		this.processDate = processDate;
		this.policyStatus = policyStatus;
	}
	public Member() {
		super();
	}
	
	
	
	
	
	
	
	
}
