package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.validator.NameValidator;

import static org.junit.Assert.assertTrue;

public class NameValidationPassTest {
    @Test
    public void lowercaseName() {
        NameValidator nameValidator = new NameValidator();
        boolean result = nameValidator.validate("jaab");
        assertTrue(result);
    }

    @Test
    public void uppercaseName() {
        NameValidator nameValidator = new NameValidator();
        boolean result = nameValidator.validate("JAAB");
        assertTrue(result);
    }

    @Test
    public void fullName() {
        NameValidator nameValidator = new NameValidator();
        boolean result = nameValidator.validate("Weerabhat Meelarp");
        assertTrue(result);
    }
}
