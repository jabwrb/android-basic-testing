package cc.somkiat.basicunittesting.validation.validator;

import cc.somkiat.basicunittesting.validation.factory.RuleFactory;
import cc.somkiat.basicunittesting.validation.rule.ValidationRule;

public class EmailValidator {
    public boolean validate(String email) {
        for (ValidationRule validationRules : RuleFactory.getEmailRules()) {
            validationRules.validate(email);
        }
        return true;
    }
}
