package Staff.Management;
import Staff.Employee;
import Staff.IGoToStandUps;
import Staff.Language;

import java.util.ArrayList;

public class ProjectCoordinator extends Employee implements IGoToStandUps {

    Project project;

    public ProjectCoordinator(String name, Language spokenLanguage, int experience) {
        super(name, spokenLanguage, experience);
    }

    public Project getProject() {
        return project;
    }

    public String goToStandUps(String data) {
        return data + " goes to stand ups";
    }
}
