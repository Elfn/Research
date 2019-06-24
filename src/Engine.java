public class Engine {

    public static  String researcher(String keyword)
    {
        String kw = String.valueOf(keyword);
        String res = (Wrapper.TypeConstants.NAME_PATTERN.matches(kw)) ? "name" : (Wrapper.TypeConstants.EMAIL_PATTERN.matches(kw)) ? "email" : (Wrapper.TypeConstants.PHONE_NUMBER.matches(kw)) ? "phone": "unknown";
        switch(res) {
            case "name":
                // Statements
                break; // optional

            case "email" :
                // Statements
                break; // optional

            case "phone" :
                // Statements
                break; // optional

            // You can have any number of case statements.
            default : // Optional
                // Statements
        }

        return "";
    }
}
