import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testValidPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    public void testNullInput() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }

    @Test
    public void testEmptyString() {
        assertFalse(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testOnlySymbols() {
        assertFalse(PalindromeChecker.isPalindrome("!!!"));
    }

    @Test
    public void testSingleChar() {
        assertTrue(PalindromeChecker.isPalindrome("x"));
    }
}
