package org.example.app.formatter;

import org.example.app.dto.AmountDto;
import org.springframework.format.Formatter;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class AmountFormatter implements Formatter<AmountDto> {

    @Override
    public AmountDto parse(String text, Locale locale) throws ParseException {
        final AmountDto amountDto = new AmountDto();
        locale = Locale.US;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        if (text != null && text.contains(" ")) {
            String[] amountText = text.split(" ");
            amountDto.setPaymentAmount(BigDecimal.valueOf(Double.valueOf(amountText[0])));
            amountDto.setLocaleDefinition(amountText[1]);
        }
        return amountDto;
    }

    @Override
    public String print(AmountDto object, Locale locale) {
        return null;
    }
}
