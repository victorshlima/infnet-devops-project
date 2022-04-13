package com.victorshlima.infnet.br.utils;

import com.victorshlima.infnet.br.exception.OutFormatValueException;
import com.victorshlima.infnet.br.util.FormatUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.*;

public class FormatUtilsTest {

    @Test
    @DisplayName("whenValidateZipCodeWithValidZipCodeReturnTrue")
    void when_FormatZipCode_With_ValidValue_Return_ZipCodeFormated(){
        assertEquals("12345-678", FormatUtils.formatZipCode("12345678"));
        assertEquals("12345-678", FormatUtils.formatZipCode("12345-678"));
    }

    @Test
    @DisplayName("whenValidateZipCodeWithValidZipCodeReturnTrue")
    void when_FormatZipCode_With_InvalidValue_ReturnException(){
        assertThrows(OutFormatValueException.class, () -> { FormatUtils.formatZipCode("123ab-");});
    }

    @Test
    @DisplayName("whenValidateZipCodeWithValidZipCodeReturnTrue")
    void when_ValidateZipCode_With_ValidZipCode_Return_True(){
        assertEquals(true, FormatUtils.validateZipCode("12345-123"));
    }

    @Test
    @DisplayName("whenValidateZipCodeWithValidZipCodeReturnFalse")
    void when_ValidateZipCode_With_ValidZipCode_Return_False(){
        assertEquals(false, FormatUtils.validateZipCode("12345--123"));
        assertEquals(false, FormatUtils.validateZipCode("1234512"));
    }

}
