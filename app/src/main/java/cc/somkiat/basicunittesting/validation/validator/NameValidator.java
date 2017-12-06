package cc.somkiat.basicunittesting.validation.validator;

import cc.somkiat.basicunittesting.validation.factory.RuleFactory;
import cc.somkiat.basicunittesting.validation.rule.ValidationRule;

public class NameValidator {
    public boolean validate(String name) {
        for (ValidationRule validationRules : RuleFactory.getNameRules()) {
            validationRules.validate(name);
        }
        return true;
    }
}
