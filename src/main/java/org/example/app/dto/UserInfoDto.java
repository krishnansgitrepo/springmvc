package org.example.app.dto;

import javax.validation.Valid;
import javax.validation.constraints.*;


public class UserInfoDto {
    @Size(min = 3, max = 10, message = "* Username should be between 3 and 10 characters.")
    private String userName;
    @NotBlank(message = "CrushName cannot be null.")
    private String crushName;
    @AssertTrue(message = "Please accept terms and conditions to proceed.")
    private boolean termsAndConditionsAccepted;

    public UserInfoDto() {
        System.out.println("Dto's constructor fired...");
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getCrushName() {
        return crushName;
    }
    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    public boolean isTermsAndConditionsAccepted() {
        return termsAndConditionsAccepted;
    }

    public void setTermsAndConditionsAccepted(boolean termsAndConditionsAccepted) {
        this.termsAndConditionsAccepted = termsAndConditionsAccepted;
    }
}
