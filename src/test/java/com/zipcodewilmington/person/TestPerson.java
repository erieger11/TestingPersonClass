package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedHairColor = "";
        Double expectedWingSpan = Double.MAX_VALUE;
        Integer expectedWeight = Integer.MAX_VALUE;
        String expectedBloodType = "";
        String expectedEyeColor = "";

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualHairColor = person.getHairColor();
        Double actualWingSpan = person.getWingSpan();
        Integer actualWeight = person.getWeight();
        String actualBloodType = person.getBloodType();
        String actualEyeColor = person.getEyeColor();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedWingSpan, actualWingSpan);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedBloodType, actualBloodType);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);

    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithHairColor() {
        // Given
        String expected = "Blonde";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWingSpan() {
        // Given
        double expected = 1.7;

        // When
        Person person = new Person(String.valueOf(expected));

        // Then
        double actual = person.getWingSpan();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWeight() {
        // Given
        Integer expected = 150;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWithBloodType() {
        // Given
        String expected = "A negative";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getBloodType();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConstructorWithEyeColor() {
        // Given
        String expected = "Blue";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }





    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }














    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHairColor() {
        // Given
        Person person = new Person();
        String expected = "Blonde";

        // When
        person.setHairColor(expected);

        // Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetWingSpan() {
        // Given
        Person person = new Person();
        double expected = 1.7;

        // When
        person.setWingSpan(expected);

        // Then
        double actual = person.getWingSpan();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Integer expected = 150;

        // When
        person.setWeight(expected);

        // Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetBloodType() {
        // Given
        Person person = new Person();
        String expected = "A Negative";

        // When
        person.setBloodType(expected);

        // Then
        String actual = person.getBloodType();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "Blue";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }
}
