package pl.coderslab.advanced.designpatterns;

public class FacebookObserverNew implements ObserverNew{


    @Override
    public void update(String title, String content) {
        System.out.println("Facebook post tytuł: " + title + " facebook tekst: " + content);
    }
}
