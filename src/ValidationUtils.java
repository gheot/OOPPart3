public class ValidationUtils {
    public static String validOrDefault (String value, String defaultValue) {
        if (value == null || value.isBlank() || value.isEmpty()) {
            return defaultValue;}
        return value;
    }
}
