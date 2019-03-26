package Staff.Management;

import Staff.Employee;
import Staff.IGoToStandUps;
import Staff.Language;

public class QAManager extends Employee implements IGoToStandUps {

    public QAManager(String name, Language spokenLanguage, int experience) {
        super(name, spokenLanguage, experience);
    }


    public String goToStandUps(String data) {
            return data + " goes to stand ups";
        }
    }

