package Vihu.homework.Lection1;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestNameFinder {

    public static String searchLongestName(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Empty array");
        }

        String maxName = arrayList.get(0);
        for (String name : arrayList) {
            if (maxName.length() < name.length()) {
                maxName = name;
            }
        }

        return maxName;
    }

    public static void main(String[] args) {
        ArrayList<String> stArList1 = new ArrayList<>(Arrays.asList("Philip", "Johnathan", "Eva", "Susi"));//Johnathan
        ArrayList<String> stArList2 = new ArrayList<>(Arrays.asList("Johnathan")); //Johnathan
        ArrayList<String> stArList3 = new ArrayList<>(Arrays.asList("")); //
        ArrayList<String> stArList4 = new ArrayList<>(); //exception
        System.out.println(searchLongestName(stArList1));
        System.out.println(searchLongestName(stArList2));
        System.out.println(searchLongestName(stArList3));
        System.out.println(searchLongestName(stArList4));

    }
}
