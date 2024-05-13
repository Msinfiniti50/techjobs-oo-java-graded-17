package org.launchcode.techjobs.oo;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class JobTest {
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job();
         char firstChar = job.toString().charAt(0);
         char lastChar = job.toString().charAt(job.toString().length() - 1);
        String result = job.toString();
        assertTrue(result.startsWith("\n"));
        assertTrue(result.endsWith("\n"));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
//        Job job = new Job();
    }
@Test
    public void testToStringHandlesEmptyField(){
       String name = "Web Developer"; Employer employer = new Employer(""); Location location = new Location("St. Louis"); PositionType positionType = new PositionType("Back-end developer"); CoreCompetency coreCompetency = new CoreCompetency("Java");
 Job job = new Job(name, employer, location, positionType, coreCompetency);
}
@Test
    public void testSettingJobId(){
        int expectedId = 1;
        Job.resetNextId();
        Job job = new Job();
        int actualId = job.getId();
        assertEquals(expectedId, actualId);


}
@Test
    public void testJobsForEquality() {
        Job job1 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        assertFalse(job1.equals(job2));
    }
@Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        assertTrue(job instanceof Job);
        assertTrue(job.getName() instanceof String);
assertEquals("Web Developer", job.getName());
assertTrue(job.getEmployer()instanceof Employer);
assertEquals("LaunchCode", job.getEmployer().getValue());
    assertTrue(job.getLocation() instanceof Location);
    assertEquals("St. Louis", job.getLocation().getValue());
    assertTrue(job.getPositionType() instanceof PositionType);
    assertEquals("Back-end developer", job.getPositionType().getValue());
    assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    assertEquals("Java", job.getCoreCompetency().getValue());
}
    //TODO: Create your unit tests here
}
