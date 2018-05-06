package se.torgammelgard;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReaderTest {

    @Test
    public void testThatThereIsAHeaderTag() throws Exception {
        URL myUrl = new URL("http://127.0.0.1:8080");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(myUrl.openStream())
        );
        String inputLine;
        boolean headerTagPresent = false;
        while ((inputLine = in.readLine()) != null && !headerTagPresent) {
            inputLine = inputLine.trim();
            headerTagPresent = inputLine.matches("^(<h1>).*(<\\/h1>)$");
        }
        in.close();
        assert headerTagPresent;
    }
}
