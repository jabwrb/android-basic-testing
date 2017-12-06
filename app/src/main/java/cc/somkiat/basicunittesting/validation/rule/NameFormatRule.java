package cc.somkiat.basicunittesting.validation.rule;

public class NameFormatRule implements ValidationRule {
    @Override
    public void validate(String input) {
        if(!input.matches("^[a-zA-Z\\s]+$")){
            throw new IllegalArgumentException("Name format is incorrect");
        }
    }
}
