package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NameValidationTest {

    @Test
    public void nameIsEmpty() {
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isEmpty("");
        assertTrue(result);
    }
    
    @Test
    public void nameIsNull() {
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isNull(null);
        assertTrue(result);
    }

    @Test
    public void nameLengthInRange2to20() {
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isLengthInRange2to20("Jaab");
        assertTrue(result);
    }
}
