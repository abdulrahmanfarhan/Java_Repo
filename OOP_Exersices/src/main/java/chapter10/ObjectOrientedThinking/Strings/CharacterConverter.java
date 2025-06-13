package chapter10.ObjectOrientedThinking.Strings;

import java.util.ArrayList;

public class CharacterConverter {

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> charactersList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            charactersList.add(s.charAt(i));
        }

        return charactersList;
    }

}
