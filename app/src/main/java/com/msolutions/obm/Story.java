package com.msolutions.obm;

import java.util.ArrayList;
import java.util.List;

public class Story {

    private static Story story;

    private String question;
    private String answer;

    private List<Story> stories;

    private Story() {
    }

    public void neverDoThisButIAmTooLazy() {
        String allDataAsString = "Every weekday a man takes the elevator down from his apartment to go to work. When he returns, he sometimes takes the elevator all the way up, but usually takes the elevator to the 12th floor and then takes the stairs from there. Why?\n" +
                "He's really short so he can't push a button any higher than 12. Except when it's raining. Then he carries his umbrella and can use that to push his floor.\n" +
                "A man gets into an elevator, and seconds later, he knows his wife is dead. How?\n" +
                "She's on life support and the power in the building just went out and he's stuck in the elevator.\n" +
                "A man is dead in a desert, completely naked except he is holding something in his hand. What happened?\n" +
                "He and two friends were in a hot air balloon that was going down too soon. To stay up long enough to escape the desert, they had thrown everything overboard, even all their clothes. When that still wasn't enough, they drew straws taken from the balloon basket. He drew the longest straw, which he still had in his hand.";

        String allData[] = allDataAsString.split("\n");
        stories = new ArrayList<>();
        for (int i = 0; i < allData.length; i += 2) {
            Story story = new Story();
            story.setQuestion(allData[i]);
            story.setAnswer(allData[i + 1]);
            stories.add(story);
        }
    }

//    public void loadData() {
//        try {
//            File config = new File("G:\\MSolutions\\DarkStories\\app\\src\\main\\java\\com\\msolutions\\obm\\stories.txt");
//            if (config.exists()) {
//                stories = new HashMap<>();
//                FileReader fReader = new FileReader(config);
//                BufferedReader bReader = new BufferedReader(fReader);
//                String line = bReader.readLine();
//                while (line != null) {
//                    stories.put(line, bReader.readLine());
//                    line = bReader.readLine();
//                }
//            }
//
//        } catch (IOException e) {
//            Log.e("Error:", e.toString());
//        }
//    }

    public static Story getInstance() {
        if (story == null) {
            story = new Story();
        }
        return story;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }
}
