package pl.maxaz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AlphabetCipherTest {

    @Test
    public void shouldEncodeMessage() {
        //given
        String givenKeyword = "snitch";
        String givenMessage = "thepackagehasbeendelivered";
        AlphabetCipher alphabetCipher = new AlphabetCipher(givenKeyword, givenMessage);
        //when
        String encodedMessage = alphabetCipher.encode();
        //then
        assertEquals("lumicjcnoxjhkomxpkwyqogywq", encodedMessage);
    }

}