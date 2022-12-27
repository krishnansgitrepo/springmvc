package org.example.app.dto;

import java.math.BigDecimal;

public class AmountDto {

    private BigDecimal paymentAmount;
    private String localeDefinition;

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getLocaleDefinition() {
        return localeDefinition;
    }

    public void setLocaleDefinition(String localeDefinition) {
        this.localeDefinition = localeDefinition;
    }

    public String toString() {
        return paymentAmount.toString()+getLocaleDefinition();
    }
}
