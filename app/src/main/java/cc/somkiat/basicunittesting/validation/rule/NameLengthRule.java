package cc.somkiat.basicunittesting.validation.rule;

public class NameLengthRule implements ValidationRule {
    @Override
    public void validate(String input) {
        int length = input.length();
        if (length < 2) {
            throw new IllegalArgumentException("Name is too short");
        } else if (length > 20) {
            throw new IllegalArgumentException("Name is too long");
        }
    }
}
