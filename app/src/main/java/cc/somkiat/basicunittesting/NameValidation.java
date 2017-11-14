package cc.somkiat.basicunittesting;

class NameValidation {

    public boolean isEmpty(String name) {
        return name.isEmpty();
    }

    public boolean isNull(String name) {
        return name == null;
    }

    public boolean isLengthInRange2to20(String name) {
        int length = name.length();
        return (length >= 2 && length <= 20);
    }
}
