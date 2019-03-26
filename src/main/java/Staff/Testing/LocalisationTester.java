package Staff.Testing;

import Staff.Employee;
import Staff.IGoToStandUps;
import Staff.Language;


public class LocalisationTester extends Employee implements ITest, IGoToStandUps {

    private final Platform platform;

    public LocalisationTester(String name, Language spokenLanguage, int experience, Platform platform) {
        super(name, spokenLanguage, experience);
        this.platform = platform;
    }

    public String goToStandUps(String data) {
        return data + " goes to stand ups";
    }

    public String test(String data) {
        return "Is testing project: " + data;
    }


    public Platform getPlatform() {
        return platform;
    }
}
