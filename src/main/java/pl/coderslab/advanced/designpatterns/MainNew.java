package pl.coderslab.advanced.designpatterns;

public class MainNew {

    public static void main(String[] args) {
        //Fasada
        AtmApiNew atmApiNew = new AtmApiNew();
        atmApiNew.deposit(100.99);
        atmApiNew.getLoan(999.99);
        atmApiNew.transfer(100.00, "0123456789");
        atmApiNew.payOut(78.99);

        //Obserwator
        PostNew postNew = new PostNew();
        ObserverNew facebookNew = new FacebookObserverNew();
        ObserverNew tweeterNew = new TweeterObserverNew();
        postNew.setTitle("Nowy tytuł postu");
        postNew.setContent("Nowa treść postu");
        postNew.attach(facebookNew);
        postNew.attach(tweeterNew);
        postNew.share();
        postNew.detach(tweeterNew);
        postNew.share();

        //Fabryka
        OperatingProductCreator operatingProductCreator = new OperatingProductCreator();
        ProductNew divider=operatingProductCreator.createProduct(Operation.DIVIDING);
        System.out.println(divider.operate(10, 5));
        ProductNew multiply=operatingProductCreator.createProduct(Operation.MULTIPLYING);
        System.out.println(multiply.operate(10, 5));

    }
}
