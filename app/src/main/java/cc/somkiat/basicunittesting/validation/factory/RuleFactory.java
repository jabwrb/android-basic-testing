package cc.somkiat.basicunittesting.validation.factory;

import java.util.ArrayList;
import java.util.List;

import cc.somkiat.basicunittesting.validation.rule.EmailEmptyRule;
import cc.somkiat.basicunittesting.validation.rule.EmailFormatRule;
import cc.somkiat.basicunittesting.validation.rule.NameEmptyRule;
import cc.somkiat.basicunittesting.validation.rule.NameFormatRule;
import cc.somkiat.basicunittesting.validation.rule.NameLengthRule;
import cc.somkiat.basicunittesting.validation.rule.ValidationRule;

public class RuleFactory {
    private RuleFactory() {
    }

    public static List<ValidationRule> getNameRules() {
        List<ValidationRule> validationRules = new ArrayList<>();
        validationRules.add(new NameEmptyRule());
        validationRules.add(new NameLengthRule());
        validationRules.add(new NameFormatRule());
        return validationRules;
    }

    public static List<ValidationRule> getEmailRules() {
        List<ValidationRule> validationRules = new ArrayList<>();
        validationRules.add(new EmailEmptyRule());
        validationRules.add(new EmailFormatRule());
        return validationRules;
    }
}
