package cc.somkiat.basicunittesting.validation.validator;

import cc.somkiat.basicunittesting.validation.factory.RuleFactory;
import cc.somkiat.basicunittesting.validation.rule.ValidationRule;

public class NameValidator {
    private RuleFactory ruleFactory;

    public NameValidator() {
        ruleFactory = new RuleFactory();
    }

    public boolean validate(String name) {
        for (ValidationRule validationRules : ruleFactory.getNameRules()) {
            validationRules.validate(name);
        }
        return true;
    }
}
