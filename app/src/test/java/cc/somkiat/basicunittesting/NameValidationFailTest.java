package cc.somkiat.basicunittesting;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import cc.somkiat.basicunittesting.validation.validator.NameValidator;

public class NameValidationFailTest {
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void nameIsEmpty() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Name should not empty");

        NameValidator nameValidator = new NameValidator();
        nameValidator.validate("");
    }

    @Test
    public void nameIsEmptySpace() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Name should not empty");

        NameValidator nameValidator = new NameValidator();
        nameValidator.validate("    ");
    }

    @Test
    public void nameIsNull() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Name should not empty");

        NameValidator nameValidator = new NameValidator();
        nameValidator.validate(null);
    }

    @Test
    public void nameIsTooShort() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Name is too short");

        NameValidator nameValidator = new NameValidator();
        nameValidator.validate("J");
    }

    @Test
    public void nameIsTooLong() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Name is too long");

        NameValidator nameValidator = new NameValidator();
        nameValidator.validate("Jaaaaaaaaaaaaaaaaaaab");
    }

    @Test
    public void nameContainsNonAlphabet() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Name format is incorrect");

        NameValidator nameValidator = new NameValidator();
        nameValidator.validate("J@@b(58070128)");
    }
}
