import Staff.HR.AssitantHR;
import Staff.Language;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AssistantHRTest {
    AssitantHR assitantHR;

    @Before
    public void setUp(){
        assitantHR = new AssitantHR("Jessica", Language.EnglishUk, 1);
    }

    @Test
    public void hasName(){
        assertEquals("Jessica", assitantHR.getName());
    }


    @Test
    public void hasSpokenLanguage(){
        assertEquals(Language.EnglishUk, assitantHR.getSpokenLanguage()
        );
    }

    @Test
    public void hasYearsOfExperience(){
        assertEquals(1, assitantHR.getExperience());
    }

}
