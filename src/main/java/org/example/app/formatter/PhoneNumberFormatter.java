package org.example.app.formatter;

import org.example.app.dto.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneNumberFormatter implements Formatter<Phone> {
    @Override
    public Phone parse(String text, Locale locale) throws ParseException {
        System.out.println("in formatter parse");
        final String[] phoneArray = text.split("-");
        final Phone phone = new Phone();
        phone.setCountryCode(phoneArray[0]);
        phone.setPhoneNumber(phoneArray[1]);
        return phone;
    }

    @Override
    public String print(Phone object, Locale locale) {
        System.out.println("in formatter print");
        return null;
    }
}
