public class LoginPage {

    private Settings settings = Settings.getInstance();

    public void setSettings() {
        settings.setDarkMode(false);
        settings.setFontSize(8);
    }

    public Settings getSettingsInstance() {
        return settings;
    }

    public String settingsToString() {
        return "LoginPage{" +
                "darkMode: " + settings.isDarkMode() + ", " +
                "fontSize: " + settings.getFontSize() +
                "}";
    }

}
