public class IndexPage {

    private Settings settings = Settings.getInstance();

    public void setSettings() {
        settings.setDarkMode(true);
        settings.setFontSize(15);
    }

    public Settings getSettingsInstance() {
        return settings;
    }

    public String settingsToString() {
        return "IndexPage{" +
                "darkMode: " + settings.isDarkMode() + ", " +
                "fontSize: " + settings.getFontSize() +
                "}";
    }

}
