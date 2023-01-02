package pl.coderslab.advanced.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject {
    private String content;
    private String title;

    List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i <observers.size() ; i++) {
            observers.get(i).update(this.title);
        }

    }

    public void share() {
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();
    }
}
