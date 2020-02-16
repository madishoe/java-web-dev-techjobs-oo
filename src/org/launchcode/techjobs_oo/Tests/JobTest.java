package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;

    @Before
    public void testJobObjects(){
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(test_job1.getId(), test_job2.getId()-1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(test_job3.getName(), "Product tester");
        assertEquals(test_job3.getEmployer().getValue(), "ACME");
        assertEquals(test_job3.getLocation().getValue(), "Desert");
        assertEquals(test_job3.getPositionType().getValue(), "Quality control");
        assertEquals(test_job3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job3.equals(test_job4));
        assertEquals(test_job3.getName(), test_job4.getName());
        assertEquals(test_job3.getEmployer().getValue(), test_job4.getEmployer().getValue());
        assertEquals(test_job3.getLocation().getValue(), test_job4.getLocation().getValue());
        assertEquals(test_job3.getPositionType().getValue(), test_job4.getPositionType().getValue());
        assertEquals(test_job3.getCoreCompetency().getValue(), test_job4.getCoreCompetency().getValue());
        }

    @Test
    public void toString1() {
        assertTrue(test_job3.toString().startsWith("\n") && test_job3.toString().endsWith("\n"));
    }

    @Test
    public void toString2() {
        assertEquals(test_job3.toString(), "\n" + "ID: " + 19 + "\n" + "Name: " + "Product tester" + "\n" + "Employer: " + "ACME" + "\n" + "Location: " + "Desert" + "\n" + "Position Type: " + "Quality control" + "\n" + "Core Competency: " + "Persistence" + "\n");
    }

    @Test
    public void toSting3() {
        assertEquals(test_job1.toString(),"\n" + "ID: " + 1 + "\n" + "Name: " + "Data not available" + "\n" + "Employer: " + "Data not available" + "\n" + "Location: " + "Data not available" + "\n" + "Position Type: " + "Data not available" + "\n" + "Core Competency: " + "Data not available" + "\n");
    }
}
