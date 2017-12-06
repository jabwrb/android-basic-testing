package cc.somkiat.basicunittesting.validation.rule;

public class NameEmptyRule implements ValidationRule {
    @Override
    public void validate(String input) {
        if (input == null || input.trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        }
    }
}
