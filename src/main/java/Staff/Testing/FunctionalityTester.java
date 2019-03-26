package Staff.Testing;

import Staff.Employee;
import Staff.IGoToStandUps;
import Staff.Language;
import Staff.Management.Project;

public class FunctionalityTester extends Employee implements ITest, IGoToStandUps, ITestPlan {
    private final Platform platform;
    Project project;

    public FunctionalityTester(String name, Language spokenLanguage, int experience, Platform platform) {
        super(name, spokenLanguage, experience);
        this.platform = platform;
    }

    public String test(String data) {
        return "Is testing project: Alpha" ;
    }


    public String goToStandUps(String data) {
        return data + " goes to stand ups";
    }

    public Project getProject() {
        return project;
    }

    public Platform getPlatform() {
        return platform;
    }

    public String testPlan(String data) {
        return "Is testplanning " + data;
    }


}
