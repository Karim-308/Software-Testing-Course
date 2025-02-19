package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sheet1Test {

    @Test
    public void testIntMax_AllPositiveNumbers() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Act
        int result = classToTest.intMax(1, 5, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testIntMax_OneNegativeNumber() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Act
        int result = classToTest.intMax(-1, 4, 2);

        // Assert
        assertEquals(4, result);
    }

    @Test
    public void testIntMax_AllNegativeNumbers() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Act
        int result = classToTest.intMax(-3, -8, -1);

        // Assert
        assertEquals(-1, result);
    }

    @Test
    public void testIntMax_AllEqualNumbers() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Act
        int result = classToTest.intMax(5, 5, 5);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testIntMax_LargestNumberAtTheEnd() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Act
        int result = classToTest.intMax(2, 3, 7);

        // Assert
        assertEquals(7, result);
    }

    @Test
    public void testIntMax_LargestNumberAtTheBeginning() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Act
        int result = classToTest.intMax(10, 3, 8);

        // Assert
        assertEquals(10, result);
    }

    @Test
    public void testIntMax_LargestNumberInTheMiddle() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Act
        int result = classToTest.intMax(1, 9, 4);

        // Assert
        assertEquals(9, result);
    }

    @Test
    public void testArrayCount9_NoOccurrences() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Act
        int result = classToTest.arrayCount9(new int[]{1, 2, 3, 4, 5});

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testArrayCount9_SingleOccurrence() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Act
        int result = classToTest.arrayCount9(new int[]{1, 9, 3, 4, 5});

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void testArrayCount9_MultipleOccurrences() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Act
        int result = classToTest.arrayCount9(new int[]{9, 2, 9, 4, 9});

        // Assert
        assertEquals(3, result);
    }

    @Test
    public void testArrayCount9_NullArray() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Assert
        try {
            classToTest.arrayCount9(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Input array cannot be null", e.getMessage());
        }
    }

    @Test
    public void testArrayCount9_EmptyArray() {
        // Arrange
        ClassToTest classToTest = new ClassToTest();

        // Act
        int result = classToTest.arrayCount9(new int[]{});

        // Assert
        assertEquals(0, result);
    }
}
