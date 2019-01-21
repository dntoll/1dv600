package Greetings;

import java.io.IOException;

import static org.junit.Assert.*;

public class NameDALTest {
    NameDAL sut = new NameDAL();

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void setNameShouldThrowExceptionOnEmptyName() throws IOException {
        String input = "";

        sut.setName(input); //this should throw an IllegalArgumentException 
    }

    @org.junit.Test
    public void setNameShouldNotThrowExceptionProperName() throws IOException {
        String input = "an ok name";

        sut.setName(input);

        //NOTE: Complimentary test to setNameShouldThrowExceptionOnEmptyName
        //we expect an exception NOT to be thrown, thus this test has no assert,
        // and should only be run together with "setNameShouldThrowExceptionOnEmptyName"
    }

    @org.junit.Test
    public void hasNameShouldReturnFalseIfNoFileIsThere() throws IOException {
        sut.reset(); //setup sut

        assertFalse(sut.hasName());
    }

    @org.junit.Test
    public void hasNameShouldReturnTrueIfSet() throws IOException {
        sut.setName("name"); //setup sut

        assertTrue(sut.hasName());
    }

    @org.junit.Test
    public void getNameShouldReturnNameSet1() throws IOException {
        String input = "nameToBeReturned";
        String expected = input; //The set name should be returned when get
        sut.setName(input); //setup sut

        assertEquals(expected, sut.getName());
    }

    @org.junit.Test
    public void getNameShouldReturnNameSet2() throws IOException {
        String input = "otherName";
        String expected = input; //The set name should be returned when get
        sut.setName(input); //setup sut

        assertEquals(expected, sut.getName());
    }
}
