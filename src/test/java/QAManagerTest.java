import Staff.Management.QAManager;
import Staff.Language;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QAManagerTest {
    QAManager qaManager;


    @Before
    public void setUp(){
        qaManager = new QAManager("Monica", Language.EnglishUk, 6);
    }

    @Test
    public void hasName(){
        assertEquals("Monica", qaManager.getName());
    }


    @Test
    public void hasSpokenLanguage(){
        assertEquals(Language.EnglishUk, qaManager.getSpokenLanguage()
        );
    }

    @Test
    public void hasYearsOfExperience(){
        assertEquals(6, qaManager.getExperience());
    }

    @Test
    public void canGoToStandUps(){
        qaManager.goToStandUps("Monica");
        assertEquals("Monica goes to stand ups", qaManager.goToStandUps("Monica"));
    }

}

