package com.victorshlima.infnet.br.util;

import com.victorshlima.infnet.br.exception.OutFormatValueException;
import lombok.NonNull;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatUtils {

    public static String formatZipCode(@NonNull String zipcode) {
        if (validateZipCode(zipcode)) return zipcode;
        else {
            if (zipcode.replaceAll("\\D", "").length() != 8 ){
                 throw new OutFormatValueException("Zipcode invalid: " + zipcode);
            }else return zipcode.substring(0,5)+"-"+zipcode.substring(5);
        }

    }

    public static boolean validateZipCode(String zipcode){
        String regex = "^[0-9]{5}(?:-[0-9]{3})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(zipcode);
        if (matcher.matches() )
        return true;
        else return false;
    }

}
