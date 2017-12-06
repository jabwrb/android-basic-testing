package cc.somkiat.basicunittesting.validation.rule;

import java.util.regex.Pattern;

public class EmailFormatRule implements ValidationRule {
    @Override
    public void validate(String input) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if (!validEmailPattern.matcher(input).matches()) {
            throw new IllegalArgumentException("Email format is incorrect");
        }
    }
}
