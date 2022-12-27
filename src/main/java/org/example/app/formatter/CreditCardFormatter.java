package org.example.app.formatter;

import org.example.app.dto.CreditCardDto;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CreditCardFormatter implements Formatter<CreditCardDto> {
    @Override
    public CreditCardDto parse(String text, Locale locale) throws ParseException {
        CreditCardDto creditCardDto = new CreditCardDto();
        if (text != null && text.contains("-")) {
            String[] ccArray = text.split("-");
            creditCardDto.setFirstFour(Integer.parseInt(ccArray[0]));
            creditCardDto.setSecondFour(Integer.parseInt(ccArray[1]));
            creditCardDto.setThirdFour(Integer.parseInt(ccArray[2]));
            creditCardDto.setLastFour(Integer.parseInt(ccArray[3]));

        }
        return creditCardDto;
    }

    @Override
    public String print(CreditCardDto object, Locale locale) {
        return null;
    }
}
