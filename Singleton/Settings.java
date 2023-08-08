public class Settings {
    private Settings() {};

    private static class InstanceHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private boolean isDarkMode = false;
    private int fontSize = 10;

    public boolean isDarkMode() {
        return isDarkMode;
    }

    public void setDarkMode(boolean darkMode) {
        isDarkMode = darkMode;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}