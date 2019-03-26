import Staff.Language;
import Staff.Management.Project;
import Staff.Testing.LocalisationTester;
import Staff.Testing.Platform;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LocalisationTesterTest {
    LocalisationTester localisationTester;
    Project project;

    @Before
    public void setUp(){
        localisationTester = new LocalisationTester("Delia", Language.LatamSpanish, 1, Platform.Steam);
        project = new Project("TRES");
    }

    @Test
    public void hasName(){
        assertEquals("Delia", localisationTester.getName());
    }

    @Test
    public void hasSpokenLanguage(){
        assertEquals(Language.LatamSpanish, localisationTester.getSpokenLanguage());
    }

    @Test
    public void hasYearsOfExperience(){
        assertEquals(1, localisationTester.getExperience());
    }

    @Test
    public void canTest(){
        localisationTester.test("TRES");
        assertEquals("Is testing project: TRES", localisationTester.test("TRES"));
    }

    @Test
    public void canGoToStandUps(){
        localisationTester.goToStandUps("Delia");
        assertEquals("Delia goes to stand ups", localisationTester.goToStandUps("Delia"));
    }

    @Test
    public void hasPlatform(){
        assertEquals(Platform.Steam, localisationTester.getPlatform());
    }

    @Test
    public void hasProject(){
        assertEquals("TRES", project.getName());
    }


}
