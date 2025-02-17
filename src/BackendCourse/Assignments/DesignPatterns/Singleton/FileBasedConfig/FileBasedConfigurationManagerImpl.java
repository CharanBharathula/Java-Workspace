package BackendCourse.Assignments.DesignPatterns.Singleton.FileBasedConfig;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManagerImpl instance;

    // Private constructor to prevent instantiation
    private FileBasedConfigurationManagerImpl() {
        super();
    }

    // Singleton getInstance method
    public static synchronized FileBasedConfigurationManagerImpl getInstance() {
        if (instance == null) {
            instance = new FileBasedConfigurationManagerImpl();
        }
        return instance;
    }

    // Reset singleton instance
    public static void resetInstance() {
        instance = null;
    }

    @Override
    public String getConfiguration(String key) {
        return getProperties().getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value = getProperties().getProperty(key);
        if (value != null) {
            return convert(value, type);
        }
        return null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        getProperties().setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        if (value != null) {
            setConfiguration(key, value.toString());
        }
    }

    @Override
    public void removeConfiguration(String key) {
        getProperties().remove(key);
    }

    @Override
    public void clear() {
        getProperties().clear();
    }
}