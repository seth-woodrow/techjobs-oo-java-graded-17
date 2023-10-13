package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job job1 =new Job();
        Job job2 =new Job();

        Assert.assertNotEquals(job1.getId(),
                job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
      Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals("Product tester", job3.getName());
        Assert.assertEquals("ACME", job3.getEmployer().getValue());
        Assert.assertEquals("Desert", job3.getLocation().getValue());
        Assert.assertEquals("Quality control", job3.getPositionType().getValue());
        Assert.assertEquals("Persistence",  job3.getCoreCompetency().getValue());

        Assert.assertTrue(job3.getName().equals("Product tester"));
        Assert.assertTrue(job3.getEmployer().getValue().equals("ACME"));
        Assert.assertTrue(job3.getLocation().getValue().equals("Desert"));
        Assert.assertTrue(job3.getPositionType().getValue().equals("Quality control"));
        Assert.assertTrue(job3.getCoreCompetency().getValue().equals("Persistence"));
    }

    @Test
    public void testJobsForEquality(){
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertNotEquals(job4.getId(), job5.getId());

    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job6 = new Job("Software Engineer", new Employer("Google"), new Location("Mountain View"), new PositionType("Full-Time"), new CoreCompetency("Java Developer"));

        String actualString = System.lineSeparator()+"ID: _______" + System.lineSeparator() +
                "Name: _______" + System.lineSeparator() +
                "Employer: _______" + System.lineSeparator() +
                "Location: _______" + System.lineSeparator() +
                "Position Type: _______" + System.lineSeparator() +
                "Core Competency: _______" + System.lineSeparator();


        String expectedString = System.lineSeparator() +
                "ID: _______" + System.lineSeparator() +
                "Name: _______" + System.lineSeparator() +
                "Employer: _______" + System.lineSeparator() +
                "Location: _______" + System.lineSeparator() +
                "Position Type: _______" + System.lineSeparator() +
                "Core Competency: _______" + System.lineSeparator();


        Assert.assertEquals(expectedString, actualString);
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job7 = new Job("Software Engineer", new Employer("LaunchCode"), new Location("St. Louis"),
                new PositionType("Full Stack Developer"), new CoreCompetency("Java"));

        String expectedOutput = System.lineSeparator() + "Id:4" + System.lineSeparator() +
                "Name:Software Engineer" + System.lineSeparator() +
                "Employer:LaunchCode" + System.lineSeparator() +
                "Location:St. Louis" + System.lineSeparator() +
                "Position Type:Full Stack Developer" + System.lineSeparator() +
                "Core Competency:Java" + System.lineSeparator();

       Assert.assertEquals(expectedOutput, job7.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job8 = new Job("", new Employer(""), new Location(""),
                new PositionType(""), new CoreCompetency(""));

        String expectedOutput = System.lineSeparator() + "Id:0" + System.lineSeparator() +
                "Name:Data not available" + System.lineSeparator() +
                "Employer:Data not available" + System.lineSeparator() +
                "Location:Data not available" + System.lineSeparator() +
                "Position Type:Data not available" + System.lineSeparator() +
                "Core Competency:Data not available" + System.lineSeparator();

        Assert.assertEquals(expectedOutput, job8.toString());
    }
}
