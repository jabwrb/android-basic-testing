package cc.somkiat.basicunittesting;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import cc.somkiat.basicunittesting.validation.validator.EmailValidator;

public class EmailValidationFailTest {
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void emailIsEmpty() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Email should not empty");

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate("");
    }

    @Test
    public void emailIsEmptySpace() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Email should not empty");

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate("    ");
    }

    @Test
    public void emailIsNull() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Email should not empty");

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate(null);
    }

    @Test
    public void emailIsText() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Email format is incorrect");

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate("jaab");
    }

    @Test
    public void emailHasSymbol() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Email format is incorrect");

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate("jaab$@gma&il.com[]");
    }

    @Test
    public void emailHasMultipleAt() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Email format is incorrect");

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate("jaab@@gmail.com");
    }

    @Test
    public void emailHasNoAt() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Email format is incorrect");

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate("jaabgmail.com");
    }

    @Test
    public void emailHasNoName() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Email format is incorrect");

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate("@gmail.com");
    }

    @Test
    public void emailHasNoDotAtDomain() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Email format is incorrect");

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate("jaab@gmail");
    }

    @Test
    public void emailDomainIsTooShort() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Email format is incorrect");

        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate("jaab@gmail.c");
    }
}
