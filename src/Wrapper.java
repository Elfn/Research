public enum Wrapper {

    //  \d{10} matches 1234567890
    //  (?:\d{3}-){2}\d{4} matches 123-456-7890
    //  \(\d{3}\)\d{3}-?\d{4} matches (123)456-7890 or (123)4567890

    JSON(TypeConstants.EMAIL_PATTERN),
    CSV(TypeConstants.PHONE_NUMBER),
    XML(TypeConstants.NAME_PATTERN);
    private final String patternName;

    Wrapper(String namePattern) {
        this.patternName = namePattern;

    }

    @Override
    public String toString() {
        return this.patternName;
    }
    public  interface TypeConstants {

        public static final String EMAIL_PATTERN= "^[a-zA-Z0-9_]+@[a-z]+\\.[a-z]{2,}$";
        public static final String PHONE_NUMBER= "^\\(\\d{3}\\)\\d{8}$";//"|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
        public static final String NAME_PATTERN= "^[a-zA-Z0-9_]+@[a-z]+\\.[a-z]{2,}$";
    }

}
