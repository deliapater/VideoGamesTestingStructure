import Staff.Language;
import Staff.Management.Project;
import Staff.Testing.FunctionalityTester;
import Staff.Testing.Platform;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionalityTesterTest {
    FunctionalityTester functionalityTester;
    Project project;

    @Before
    public void setUp(){
       functionalityTester = new FunctionalityTester("Hanna", Language.Polish, 3, Platform.PS4);
       project = new Project("Alpha");
    }

    @Test
    public void hasName(){
        assertEquals("Hanna", functionalityTester.getName());
    }

    @Test
    public void hasSpokenLanguage(){
        assertEquals(Language.Polish, functionalityTester.getSpokenLanguage());
    }

    @Test
    public void hasYearsOfExperience(){
        assertEquals(3, functionalityTester.getExperience());
    }

    @Test
    public void canTest(){
        functionalityTester.test("Is testing project: Alpha");
        assertEquals("Is testing project: Alpha", functionalityTester.test("Is testing project: Alpha"));
    }

    @Test
    public void canGoToStandUps(){
        functionalityTester.goToStandUps("Hanna");
        assertEquals("Hanna goes to stand ups", functionalityTester.goToStandUps("Hanna"));
    }

    @Test
    public void hasPlatform(){
        assertEquals(Platform.PS4, functionalityTester.getPlatform());
    }

    @Test
    public void hasProject(){
        assertEquals("Alpha", project.getName());
    }
}
