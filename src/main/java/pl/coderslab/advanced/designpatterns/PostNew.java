package pl.coderslab.advanced.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class PostNew implements SubjectNew {

    private String content;
    private String title;
    private List<ObserverNew> observerNewList;

    public PostNew() {
        observerNewList = new ArrayList<>();
    }


    @Override
    public void attach(ObserverNew observerNew) {
        observerNewList.add(observerNew);
    }

    @Override
    public void detach(ObserverNew observerNew) {
        observerNewList.remove(observerNew);
    }

    @Override
    public void notifyObservers() {
        for(ObserverNew observerNew:observerNewList){
            observerNew.update(getTitle(), getContent());
        }
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

    public void share(){
        System.out.println("Update ObserversNew");
        notifyObservers();
    }
}

