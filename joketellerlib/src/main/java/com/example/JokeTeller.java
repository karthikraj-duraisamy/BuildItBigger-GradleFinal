package com.example;

import java.util.Locale;
import java.util.Random;

public class JokeTeller {

    /**
     * String array containing some jokes specifically for backend google app engine.
     */
    private static final String[] BACKEND_JOKES = {
            "The skeleton decided to bone up on the facts for the big exam",
            "The skeleton canceled the gallery showing of his skull-ptures because his heart wasn’t in it.",
            "The skeleton knew what would happen next—he could just feel it in his bones",
            "The skeleton literally didn’t mind that everyone called him a bonehead.",
            "The skeleton ordered a cabernet wine with a full body because he didn’t have one.",
            "Did you hear about the skeleton that dropped out of medical school? He just didn’t have the stomach for it.",
            "The skeleton cried his eyes out because he didn’t have any body to love.",
            "I wanted to tell a skeleton pun, but I don’t have the guts for it.",
            "That skeleton sure brought his appetite to the picnic—and also some spare ribs.",
            "A lot of people cry when they cut onions. The trick is not to form an emotional bond.",
            "I wrote a song about a tortilla. Well actually, it’s more of a wrap.",
            "Some people just have a way with words, and other people … oh … not have way.",
            "The four most beautiful words in our common language:  I told you so.",
            "All pro athletes are  bilingual. They speak English and profanity.",
            "I don’t want to brag, but I do speak pig Latin; I mean, I’m not fluent, but I’m sure  if I ever went there, I could get by.",
            "When I was growing up, my mother’s best dish was store-bought Entenmann’s chocolate chip cookies.",
            "Next time I send a damn fool,  I go myself.",
            "Probably the worst thing you can hear when you’re wearing a bikini is “Good for you!”",
            "When I lost my rifle, the Army charged me $85. That’s why in the Navy, the captain goes down with the ship.",
            "A conference call is the best way for a dozen people to say “bye” 300 times"
    };


    /**
     * Get a random joke for google app engine module
     *
     * @return random joke in string format
     */
    public static String getBackendJoke() {
        int random = new Random(System.currentTimeMillis()).nextInt(BACKEND_JOKES.length);
        return String.format(Locale.getDefault(), "%s", BACKEND_JOKES[random]);
    }

}
