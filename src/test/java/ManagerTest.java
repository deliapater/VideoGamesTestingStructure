import Staff.HR.Manager;
import Staff.Language;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("David", Language.EnglishUk, 5);
    }

    @Test
    public void hasName(){
        assertEquals("David", manager.getName());
    }


    @Test
    public void hasSpokenLanguage(){
        assertEquals(Language.EnglishUk, manager.getSpokenLanguage()
        );
    }

    @Test
    public void hasYearsOfExperience(){
        assertEquals(5,  manager.getExperience());
    }
}
