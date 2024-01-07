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
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void testReversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("}{"));
    }

    @Test
    public void testMultipleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{{}}"));
    }

    @Test
    public void testBalancedBracketsWithTextInside() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{LaunchCode}"));
    }

    @Test
    public void testUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("{{}"));
    }

    @Test
    public void testOnlyOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("{"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testBalancedBracketsWithCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch{Code}"));
    }

    @Test
    public void testBalancedBracketsNextToCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}LaunchCode"));
    }

    @Test
    public void testReversedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}LaunchCode"));
    }

    @Test
    public void testOpenBracketOnlyWithText() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("{LaunchCode"));
    }

    @Test
    public void testUnbalancedBracketsWithText() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch}Code{"));
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
    public void testBalancedMultipleTypeBracketsWithText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch{Code]}"));
    }

    @Test
    public void curlyLeftSquareRightReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{]"));
    }
}

