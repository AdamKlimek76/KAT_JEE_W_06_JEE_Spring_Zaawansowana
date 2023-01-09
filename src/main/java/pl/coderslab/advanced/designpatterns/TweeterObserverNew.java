package pl.coderslab.advanced.designpatterns;

public class TweeterObserverNew implements ObserverNew{

    @Override
    public void update(String title, String content) {
        System.out.println("Tweetern tytuł: " + title  + " tweeter post " + content);
    }
}
