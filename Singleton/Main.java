public class Main {

    public static void main(String[] args) {
        IndexPage indexPage = new IndexPage();
        LoginPage loginPage = new LoginPage();

        System.out.println(indexPage.settingsToString());
        indexPage.setSettings();
        System.out.println(indexPage.settingsToString());

        System.out.println(loginPage.settingsToString());
        loginPage.setSettings();
        System.out.println(loginPage.settingsToString());

        System.out.println(indexPage.settingsToString());

        boolean result = indexPage.getSettingsInstance() == loginPage.getSettingsInstance();
        System.out.println("** indexPage.settings == loginPage.settings => " + result);
    }

}
