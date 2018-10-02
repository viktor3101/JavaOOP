package Vihu.day1;

public class Post {

    private String author;
    private String content;
    private long likes;

    public Post(String author, String content, long likes) {
        this.author = author;
        this.content = content;
        if (likes < 0) {
            throw new IllegalArgumentException("negative value of likes : " + likes);
        }
        this.likes = likes;
    }

    public Post(String author, String content) {
        this(author, content, 0);
    }

    public String show() {
        return "\"" + this.content + "\" by " + this.author + ", " + this.likes + " likes";
    }

    /**
     * Like\DisLike
     **/
    public void like() {
        likes++;
    }

    public void disLike() {
        checkLikes();
        likes--;
    }

    private void checkLikes() {
        if (likes == 0) {
            throw new IllegalStateException("zero like");
        }
    }

    /**
     * Getters
     **/
    public long getLikes() {
        return likes;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    /**
     * Setters
     **/
    public void setContent(String content) {
        this.content = content;
    }
}
