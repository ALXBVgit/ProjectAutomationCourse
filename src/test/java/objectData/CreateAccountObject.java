package objectData;

import java.util.Map;

public class CreateAccountObject {
    private String nameValue;
    private String emailValue;
    private String passwordValue;
    private String firstNameValue;
    private String lastNameValue;
    private String addressValue;
    private String countryValue;
    private String stateValue;
    private String cityvalue;
    private String zipPValue;
    private String mobileNumber;
    private String dayValue;
    private String monthValue;
    private String yearValue;

    public CreateAccountObject(Map<String, String> testData){
        prepareObject(testData);

    }
    private void prepareObject(Map<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "nameValue":
                    setNameValue(testData.get(key));
                    break;
                case "emailValue":
                    setEmailValue(testData.get(key));
                    break;
                case "passwordValue":
                    setPasswordValue(testData.get(key));
                    break;
                case "firstNameValue":
                    setFirstNameValue(testData.get(key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(key));
                    break;
                case "addressValue":
                    setAddressValue(testData.get(key));
                    break;
                case "countryValue":
                    setCountryValue(testData.get(key));
                    break;
                case "stateValue":
                    setStateValue(testData.get(key));
                    break;
                case "cityvalue":
                    setCityvalue(testData.get(key));
                    break;
                case "zipPValue":
                    setZipPValue(testData.get(key));
                    break;
                case "mobileNumber":
                    setMobileNumber(testData.get(key));
                    break;
                case "dayValue":
                    setDayValue(testData.get(key));
                    break;
                case "monthValue":
                    setMonthValue(testData.get(key));
                    break;
                case "yearValue":
                    setYearValue(testData.get(key));
                    break;
            }
        }
    }

    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getPasswordValue() {
        return passwordValue;
    }

    public void setPasswordValue(String passwordValue) {
        this.passwordValue = passwordValue;
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public String getCountryValue() {
        return countryValue;
    }

    public void setCountryValue(String countryValue) {
        this.countryValue = countryValue;
    }

    public String getStateValue() {
        return stateValue;
    }

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    public String getCityvalue() {
        return cityvalue;
    }

    public void setCityvalue(String cityvalue) {
        this.cityvalue = cityvalue;
    }

    public String getZipPValue() {
        return zipPValue;
    }

    public void setZipPValue(String zipPValue) {
        this.zipPValue = zipPValue;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDayValue() {
        return dayValue;
    }

    public void setDayValue(String dayValue) {
        this.dayValue = dayValue;
    }

    public String getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(String monthValue) {
        this.monthValue = monthValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public void setYearValue(String yearValue) {
        this.yearValue = yearValue;
    }
}