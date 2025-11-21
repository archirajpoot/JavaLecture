package lect12;
import java.util.Scanner;
class Utube {
    private String channelName;
    private int subscribers;
    private int likes;
    private int dislikes;
    private int membership;
    private int pin;

    public Utube(String channelName, int pin) {
        this.channelName = channelName;
        this.subscribers = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.membership = 0;
        this.pin = pin;
    }


    private int authenticate(int password) {
        if(password == pin)
            return 1;
        return 0 ;
    }

    // Show channel information
    public void showDetails(int password) {
        if (authenticate(password)==0) {
            System.out.println("Wrong PIN!");
            return;
        }
        else {
            System.out.println("Channel: " + channelName);
            System.out.println("Subscribers: " + subscribers);
            System.out.println("Likes: " + likes);
            System.out.println("Dislikes: " + dislikes);
            System.out.println("Memberships: " + membership);
        }
    }

    public void subscribe() {
        subscribers++;
        System.out.println("Subscriber added! Total: " + subscribers);
    }

    public void unsubscribe() {
        if (subscribers > 0) subscribers--;
        System.out.println("Subscriber removed! Total: " + subscribers);
    }

    public void like() {
        likes++;
        System.out.println("Like added! Total Likes: " + likes);
    }

    public void dislike() {
        dislikes++;
        System.out.println("Dislike added! Total Dislikes: " + dislikes);
    }

    public void buyMembership() {
        membership++;
        System.out.println("New member joined! Total Members: " + membership);
    }

    @Override
    public String toString() {
        return "Channel Name: " + channelName + "\nSubscribers: " + subscribers +
                "\nLikes: " + likes + "\nDislikes: " + dislikes +
                "\nMemberships: " + membership;
    }
}

public class yt {
    public static void main(String[] args) {

        Utube y1 = new Utube("clumsyarchi", 1234);

        y1.subscribe();
        y1.like();
        y1.buyMembership();

        System.out.println("\nShowing details with wrong PIN:");
        y1.showDetails(1111);  

        System.out.println("\nShowing details with correct PIN:");
        y1.showDetails(1234);  // ✔ correct

        System.out.println("\nUsing toString():");
        System.out.println(y1);


    }
}

