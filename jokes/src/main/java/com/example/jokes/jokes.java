package com.example.jokes;

import java.util.*;

public class jokes {
    public String getJokes() {
        ArrayList<String> jokes = new ArrayList<String>(Arrays.asList(
                "The roundest knight at King Arthur's round table was Sir Cumference. He acquired his size from too much pi.",

                "I thought I saw an eye doctor on an Alaskan island, but it turned out to be an optical Aleutian.",

                "She was only a whisky maker, but he loved her still.",

                "A rubber band pistol was confiscated from algebra class because it was a weapon of math disruption.",

                "My wife told me I had to stop acting like a flamingo. So I had to put my foot down.",
                "I couldn't figure out why the baseball kept getting larger. Then it hit me.",

                "Why did the old man fall in the well? Because he couldn't see that well.",

                " I ate a clock yesterday, it was very time consuming.",

                "Whatdya call a frenchman wearing sandals? Phillipe Phillope.",

                "A blind man walks into a bar.And a table.And a chair.",

                "What 's orange and sounds like a parrot? A carrot.",

                "Did you hear about the italian chef that died ? He pasta way.",

                "Why couldn 't the bicycle stand up? Because it was two tired!",

                "Parallel lines have so much in common.It’s a shame they’ll never meet.",
                "My wife accused me of being immature.I told her to get out of my fort.",

                "Where do you find a cow with no legs ? Right where you left it.",

                "When a deaf person sees someone yawn do they think it’s a scream ?",

                "As I suspected, someone has been adding soil to my garden.The plot thickens.",

                "How do crazy people go through the forest?They take the physco path.",

                "-Anton, do you think I’m a bad mother?\n-My name is Paul.",

                "Patient: Oh doctor, I’m just so nervous. This is my first operation.\nDoctor: Don't worry. Mine too.",

                "I can’t believe I forgot to go to the gym today. That’s 7 years in a row now.",

                "I thought I’d tell you a good time travel joke – but you didn't like it."
                ));

        Random rand = new Random();
        int index = rand.nextInt(jokes.size());

        return jokes.get(index);
    }
}
