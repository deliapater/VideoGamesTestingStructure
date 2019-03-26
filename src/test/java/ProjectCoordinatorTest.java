import Staff.Language;
import Staff.Management.Project;
import org.junit.Before;
import Staff.Management.ProjectCoordinator;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ProjectCoordinatorTest {

    ProjectCoordinator projectCoordinator;
    Project project;

    @Before
    public void setUp(){
        projectCoordinator = new ProjectCoordinator("Sam", Language.EnglishUk, 4);
        project = new Project("Beta");
    }

    @Test
    public void hasName(){
        assertEquals("Sam", projectCoordinator.getName());
    }

    @Test
    public void hasSpokenLanguage(){
        assertEquals(Language.EnglishUk, projectCoordinator.getSpokenLanguage());
    }

    @Test
    public void hasYearsOfExperience(){
        assertEquals(4, projectCoordinator.getExperience());
    }

    @Test
    public void hasProject(){
        assertEquals("Beta", project.getName());
    }

    @Test
    public void goToStandUps(){
        projectCoordinator.goToStandUps("Sam");
        assertEquals("Sam goes to stand ups", projectCoordinator.goToStandUps("Sam"));
    }
}
