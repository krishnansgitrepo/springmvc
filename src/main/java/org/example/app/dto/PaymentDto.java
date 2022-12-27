package org.example.app.dto;

public class PaymentDto {

    private CreditCardDto creditCardDto;
    private AmountDto amountDto;

    public CreditCardDto getCreditCardDto() {
        return creditCardDto;
    }

    public void setCreditCardDto(CreditCardDto creditCardDto) {
        this.creditCardDto = creditCardDto;
    }

    public AmountDto getAmountDto() {
        return amountDto;
    }

    public void setAmountDto(AmountDto amountDto) {
        this.amountDto = amountDto;
    }
}
