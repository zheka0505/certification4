import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;

public class GettingConfData {

    public static String BASE_URL = Objects.requireNonNull(getProperties()).getProperty("url");
    public static String STANDARD_USER_NAME = Objects.requireNonNull(getProperties()).getProperty("standardUser");
    public static String BLOCKED_USER_NAME = Objects.requireNonNull(getProperties()).getProperty("blockedUser");
    public static String PERFORMANCE_GLITCH_USER_NAME = Objects.requireNonNull(getProperties()).getProperty("performanceGlitchUser");
    public static String PASSWORD = Objects.requireNonNull(getProperties()).getProperty("password");
    public static String FIRST_NAME = Objects.requireNonNull(getProperties()).getProperty("firstName");
    public static String LAST_NAME = Objects.requireNonNull(getProperties()).getProperty("lastName");
    public static String POSTAL_CODE = Objects.requireNonNull(getProperties()).getProperty("postalCode");

    public static Properties getProperties() {

        try {
            String appConfigPath = "src/test/resources/conf";
            Properties properties = new Properties();
            properties.load(new FileInputStream(appConfigPath));

            return properties;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }
}
