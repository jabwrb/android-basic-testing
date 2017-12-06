package cc.somkiat.basicunittesting.validation.validator;

import cc.somkiat.basicunittesting.validation.factory.RuleFactory;
import cc.somkiat.basicunittesting.validation.rule.ValidationRule;

public class EmailValidator {
    private RuleFactory ruleFactory;

    public EmailValidator() {
        ruleFactory = new RuleFactory();
    }

    public boolean validate(String email) {
        for (ValidationRule validationRules : ruleFactory.getEmailRules()) {
            validationRules.validate(email);
        }
        return true;
    }
}
