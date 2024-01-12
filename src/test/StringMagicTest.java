import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMagicTest {

    @Test
    void areAnagrams() {

        //Given
        String str1 = "Madam";
        String str2 = "aadmm";

        String str3 = null;
        String str4 = "Ram";

        String str5 = "David";
        String str6 = "Dileep";



        //When
        StringMagic sm = new StringMagic();
        boolean isAnagram1 = sm.areAnagrams(str1, str2);
        boolean isAnagram2 = sm.areAnagrams(str3, str4);
        boolean isAnagram3 = sm.areAnagrams(str5, str6);

        //Then
        assertTrue(isAnagram1);
        assertFalse(isAnagram2);
        assertFalse(isAnagram3);

    }
}