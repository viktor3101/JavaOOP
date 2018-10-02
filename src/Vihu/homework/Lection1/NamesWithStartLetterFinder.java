package Vihu.homework.Lection1;

import java.util.ArrayList;
import java.util.Arrays;

public class NamesWithStartLetterFinder {

    public static String namesWithStartLetter(ArrayList<String> arrayList, char letter) {
        ArrayList<String> retStr= new ArrayList<>();
        for (String name : arrayList) {
            if (letter == name.charAt(0)){
                retStr.add(name);
            }
        }

        return retStr.toString();
    }

    public static void main(String[] args) {
        char a = 'A';
        char c = 'C';
        ArrayList<String> ar1 = new ArrayList<>(Arrays.asList("Betty","Aaron","Ann"));//A  [Aaron, Ann]
        ArrayList<String> ar2 = new ArrayList<>(Arrays.asList("Betty","Aaron","Kenny"));//A [Aaron]
        ArrayList<String> ar3 = new ArrayList<>(Arrays.asList("Betty","Aaron","Ann"));//C []
        ArrayList<String> ar4 = new ArrayList<>(Arrays.asList());//C []

        System.out.println(namesWithStartLetter(ar1,a));
        System.out.println(namesWithStartLetter(ar2,a));
        System.out.println(namesWithStartLetter(ar3,c));
        System.out.println(namesWithStartLetter(ar4,c));
    }
}
