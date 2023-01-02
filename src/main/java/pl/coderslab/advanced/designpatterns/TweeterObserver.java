package pl.coderslab.advanced.designpatterns;

public class TweeterObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("Tweeter " + title);
    }
}
