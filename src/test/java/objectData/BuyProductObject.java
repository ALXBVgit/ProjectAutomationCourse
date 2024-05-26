package objectData;

import java.util.Map;

public class BuyProductObject {
    private String userEmalValue;
    private String userPasswordValue;
    private String cardNameValue;
    private String cardNumberValue;
    private String cvcValue;
    private String expirationMonthValue;
    private String expirationYearValue;

    public BuyProductObject (Map<String, String> testData){
        prepareObject(testData);
    }

    private void prepareObject(Map<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "userEmalValue":
                    setUserEmalValue(testData.get(key));
                    break;
                case "userPasswordValue":
                    setUserPasswordValue(testData.get(key));
                    break;
                case "cardNameValue":
                    setCardNameValue(testData.get(key));
                    break;
                case "cardNumberValue":
                    setCardNumberValue(testData.get(key));
                    break;
                case "cvcValue":
                    setCvcValue(testData.get(key));
                    break;
                case "expirationMonthValue":
                    setExpirationMonthValue(testData.get(key));
                    break;
                case "expirationYearValue":
                    setExpirationYearValue(testData.get(key));
                    break;
            }
        }
    }

    public String getUserEmalValue() {
        return userEmalValue;
    }

    public void setUserEmalValue(String userEmalValue) {
        this.userEmalValue = userEmalValue;
    }

    public String getUserPasswordValue() {
        return userPasswordValue;
    }

    public void setUserPasswordValue(String userPasswordValue) {
        this.userPasswordValue = userPasswordValue;
    }

    public String getCardNameValue() {
        return cardNameValue;
    }

    public void setCardNameValue(String cardNameValue) {
        this.cardNameValue = cardNameValue;
    }

    public String getCardNumberValue() {
        return cardNumberValue;
    }

    public void setCardNumberValue(String cardNumberValue) {
        this.cardNumberValue = cardNumberValue;
    }

    public String getCvcValue() {
        return cvcValue;
    }

    public void setCvcValue(String cvcValue) {
        this.cvcValue = cvcValue;
    }

    public String getExpirationMonthValue() {
        return expirationMonthValue;
    }

    public void setExpirationMonthValue(String expirationMonthValue) {
        this.expirationMonthValue = expirationMonthValue;
    }

    public String getExpirationYearValue() {
        return expirationYearValue;
    }

    public void setExpirationYearValue(String expirationYearValue) {
        this.expirationYearValue = expirationYearValue;
    }
}
