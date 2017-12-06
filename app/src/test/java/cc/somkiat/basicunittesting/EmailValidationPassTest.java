package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.validator.EmailValidator;

import static org.junit.Assert.assertTrue;

public class EmailValidationPassTest {
    @Test
    public void normalEmailFormat() {
        String email = "jaab@gmail.com";
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.validate(email));
    }

    @Test
    public void emailNameHasDotUnderscoreDash() {
        String email = "jaab._-wrb@gmail.com";
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.validate(email));
    }

    @Test
    public void emailHasMultipleDot() {
        String email = "jaab@kmitl.ac.th";
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.validate(email));
    }
}
