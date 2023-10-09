package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job job1 =new Job();
        Job job2 =new Job();

        assertNotEquals(job1.getId(),
                job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
      Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence",  job3.getCoreCompetency().getValue());

        assertTrue(job3.getName().equals("Product tester"));
        assertTrue(job3.getEmployer().getValue().equals("ACME"));
        assertTrue(job3.getLocation().getValue().equals("Desert"));
        assertTrue(job3.getPositionType().getValue().equals("Quality control"));
        assertTrue(job3.getCoreCompetency().getValue().equals("Persistence"));
    }

    @Test
    public void testJobsForEquality(){
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job4.getId(), job5.getId());

    }

}
