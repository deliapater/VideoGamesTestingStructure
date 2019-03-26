package Staff;

import Staff.Testing.Platform;

public abstract class Employee {
        private String name;
        private Language spokenLanguage;
        private int experience;

        public Employee(String name, Language spokenLanguage, int experience){
            this.name = name;
            this.spokenLanguage = spokenLanguage;
            this.experience = experience;
        }

        public String getName() {
            return name;
        }

        public Language getSpokenLanguage() {
            return spokenLanguage;
        }

        public int getExperience() {
            return experience;
        }

}

