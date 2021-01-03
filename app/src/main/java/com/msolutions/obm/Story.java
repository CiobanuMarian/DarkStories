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
                "He and two friends were in a hot air balloon that was going down too soon. To stay up long enough to escape the desert, they had thrown everything overboard, even all their clothes. When that still wasn't enough, they drew straws taken from the balloon basket. He drew the longest straw, which he still had in his hand.\n" +
                "A man commits suicide by hanging himself; The only thing in the room with him is a puddle of water. How did he hang himself?\n" +
                "Jumped off a block of ice.\n" +
                "A woman buys a pair of red shoes and goes to work. While she was working, she dies.\n" +
                "The woman works in a circus as an assistant to a knife thrower. Her new shoes were a little taller than what she used to wear and her co-worker - who used to throw the knives always at the same height - wounded her mortally.\n" +
                "Anthony couldn't have imagine his cold would be the cause of his death.\n" +
                "There was a gas leak at Anthony's house but since he had a cold, he could not smell it. He died when he started a fire, as he was cooking his dinner.\n" +
                "A woman goes to the library, takes a book and cries out.\n" +
                "The woman was a writer and she had donated one of her books to the library. She had included a 50$ bill among the pages as a gift for the first person borrowing the book. After a year, she came back to the library, took the book and saw that the bill was still there. Realizing that no one had read her book she burst into tears.\n" +
                "An avid birdwatcher sees an unexpected bird. Soon he’s dead. What happened?\n" +
                "The birdwatcher was flying in a plane. The bird got stuck in the plane’s engine and made the plane crash.\n" +
                "A man is lying in his bed, trying to sleep. He picks up the phone and makes a call. He waits for a while and hangs up before anyone could answer the phone. Then he sleeps peacefully.\n" +
                "His neighbour was snoring heavily and he decided to wake him up by calling him over the phone. Before the neighbour answered, when the snoring had stopped, he hung up and went to sleep.\n" +
                "Helen never thought that her decision to travel by plane would save her life.\n" +
                "A few days earlier Helen had been operated on. Before boarding the plane, she had to go through the metal detector, which kept going off, despite the fact that she had removed everything metal she had on. After an X-ray examination, it was discovered that the doctors had left a scalpel inside her body. If Helen had not discovered it in time, she would died for sure.\n" +
                "Tony ran out of the building, carrying two bags. Another man ran after him, shouting and waving knives.\n" +
                "Tony was shopping in the store, he spent a lot of money, so the shop workers decided to give him a gift: a set of kitchen knives. Tony was in a hurry so he ran to his car, forgetting about it. The worker noticed this and ran after Tony to give him the gift.\n" +
                "After George tries to hug a person, he dies by drowning.\n" +
                "George was under the influence of alcohol and saw his reflection on a river. As he was intoxicated, he thought that it would be a good idea to give a hug to the \"stranger\". However this caused him to fall into the river and drown.\n" +
                "A woman asks questions to her friend - a policeman - about a strange death. After 5 minutes the policeman is surprised to see that the woman finds out the cause of the death.\n" +
                "The woman and the policeman were friends and they were playing \"Dark Stories\". The policeman read a story and thought that his friend could not solve it. He was very surprised when the woman, after a few questions, found out the solution.\n" +
                "When the priest stopped talking, Bobby died.\n" +
                "Bobby was a little hamster who had come to the church along with Tom, his 9-year-old owner. When the priest was speaking in front of the believers, the little hamster escaped from the child's lap and went to the altar. When the priest finished speaking and headed towards his chair, he did not see Bobby and crushed him with his foot.\n" +
                "He died because he mixed up the colors.\n" +
                "In Thailand if some snake bites you, doctor has to identify the snake's species in order to choose the right antidote. The tourist usually can not identify it, so doctor asks him/her what color the snake was, and using this information specialist defines snake's species. The man was colorblind, therefore he received a wrong antidote.\n" +
                "Oscar was sitting reading his newspaper, when he heard a noise. When he realized what had happened, he bitterly regretted not having caught the taxi in time. Shortly afterwards, he committed suicide.\n" +
                "ar was broke. He was a miniature car models collector and, to solve his economic problems, he was going to sell his most valuable car. He had been cleaning it and did not put it down on the table properly when he finished. When he sat down and began to read his newspaper, he heard how it fell off the table. He could not catch it in time before it crashed into the floor.\n" +
                "A guy goes into a drugstore and leaves shortly after with the money from the cash register. The drugstore owner calls the Police Station and, some time later, a police officer recovers the money and takes the guy away. That evening the three people go to the police station to report a theft.\n" +
                "The guy was the drugstore owner's son. His car had been stolen and he had an important exam. He had been to the drugstore to ask his mother for some money so he could take a taxi. In addition to this, the mother called her husband - who was a police officer - and asked him to bring their son to the exam. He did, and since the son did not need the money any more, he gave it back to his father, who returned it to the mother. At the end of the day, the whole family reported the car theft.\n" +
                "Why did a healthy young girl put a gypsum on her arm, which was not damaged?\n" +
                "A young girl put a gypsum on the healthy arm before an oral french exam. She thought that the examiner would ask about her arm. And she came to the exam, having prepared for this particular question.\n" +
                "A man designed a device into which you can insert colored paper, and then get the ideal 100$. Experts can not distinguish them from the real ones. How does he do that, and why does he sell this device?\n" +
                "The man sells this device to the thief, convincing him that it prints counterfeit dollars that are indistinguishable from the real ones. He demonstrates the machine by inserting green paper into it. But green paper - this is actually real 100$, but richly painted in green. The machine simply removes green paint from them.\n" +
                "A hospital director recently confirmed that many that many of people admitted to his hospital were not ill at all. They were perfectly healthy, yet were given hospital care and treatment.\n" +
                "The hospital was a maternity hospital and all those admitted were pregnant women.\n" +
                "A woman jumps from a windowshell, on a 6th floor. However, she is not injured in any way.\n" +
                "The woman was about to commit suicide but she changed her mind in the last minute and decided to jump back into her apartment.\n" +
                "Roger sees the light and he becomes paralyzed. Soon after that he dies.\n" +
                "Roger was a rabbit that escaped from the house where he lived. He was crossing the road at night when the lights of a car blinded him. The driver did not see him and ran him over.\n" +
                "Cindy is amongst a crowd of people when she is murdered. However, nobody notices her cries.\n" +
                "Cindy was in a movie theater, watching a horror movie. A very scary scene started. While everybody was screaming the murderer - who was behind her - was killing her.\n" +
                "Peter wins the raffle and commits suicide.\n" +
                "A group of people were snowed in. They decided to do a raffle to decide who should die so the others could eat his/her corpse to stay alive. Peter's name was selected so he had to take his own life.\n" +
                "Michael manages to get shot; in doing so he saves his own life.\n" +
                "Michael was a soldier on the battlefront. The day of a big attack was approaching. When none of the other soldiers were looking, he put out an arm, so that the enemy would shoot at it. He was then taken to the hospital, and his life was no longer in danger.\n" +
                "A man kills his brother in front of a crowd of people. However, no one reports him.\n" +
                "The man worked as executioner and his brother had been sentenced to death.\n" +
                "Francis dies of a heart attack at work. His colleagues are there when it happens. However, they do not call for help until Francis dies.\n" +
                "Francis was a theather actor and suffered a heart attack in the middle of a performance. However, he was playing someone who was having a heart attack. Therefore, both his colleagues and the audience simply thought that he was giving a really impressive performance.\n";

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
