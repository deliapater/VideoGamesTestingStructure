import Staff.HR.Recruiter;
import Staff.Language;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecruiterTest {
    Recruiter recruiter;

    @Before
    public void setUp(){
        recruiter = new Recruiter("Barbara", Language.EnglishUk, 3);
    }

    @Test
    public void hasName(){
        assertEquals("Barbara", recruiter.getName());
    }


    @Test
    public void hasSpokenLanguage(){
        assertEquals(Language.EnglishUk, recruiter.getSpokenLanguage()
        );
    }

    @Test
    public void hasYearsOfExperience(){
        assertEquals(3, recruiter.getExperience());
    }

    @Test
    public void canMakeInterview(){
        assertEquals("Makes interviews", recruiter.makesInterviews());
    }
}
