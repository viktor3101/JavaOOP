package Vihu.day1;

public class PostRunner {
    public static void main(String[] args) {
        Post p1 = new Post("bsiaka", "hi man", 10);

        for (int i = 0; i < 20; i++) {
            p1.like();
        }
        for (int i = 0; i < 2; i++) {
            p1.disLike();
        }

        String s1 = p1.show();
        System.out.println(s1);
    }
}
