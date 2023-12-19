package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testMultipleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void testBracketsWithTextInside() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void testUnequalBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void testOnlyOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testAssortedEqualBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][[[][][[][[]]]"));
    }

    @Test
    public void testBalancedBracketsWithCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testBalancedBracketsNextToCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testReversedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testOpenBracketOnlyWithText() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testUnbalancedBracketsWithText() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testBalancedCurlyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void testUnbalancedCurlyBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("}{"));
    }

    @Test
    public void testBalancedSquareAndCurlyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{}]"));
    }

    @Test
    public void testUnbalancedSquareBracketsWithBalancedCurlyBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]{}["));
    }

    @Test
    public void testBalancedMultipleBracketsWithText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch{Code]}"));
    }
}

