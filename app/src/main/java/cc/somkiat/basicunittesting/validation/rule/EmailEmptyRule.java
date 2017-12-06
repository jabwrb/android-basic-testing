package cc.somkiat.basicunittesting.validation.rule;

public class EmailEmptyRule implements ValidationRule {
    @Override
    public void validate(String input) {
        if (input == null || input.trim().equals("")) {
            throw new IllegalArgumentException("Email should not empty");
        }
    }
}
