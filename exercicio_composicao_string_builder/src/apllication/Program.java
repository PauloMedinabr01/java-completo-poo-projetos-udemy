package apllication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Comment;
import entities.Post;

public class Program {
    public static void main(String[] args) throws ParseException {

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post p1 = new Post(sdf.parse(
                "04/01/2023 18:20:00"),
                "Traveling to New Zeland",
                "I'm going to visit this wonderful country!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the Force be with you!");

        Post p2 = new Post(sdf.parse(
                "04/01/2023 18:44:00"),
                "Good night guys",
                "See you tomorrow!",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);
    }
}
