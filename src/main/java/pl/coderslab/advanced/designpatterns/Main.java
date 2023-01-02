package pl.coderslab.advanced.designpatterns;

public class Main {

    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product advancedProduct = productFactory.create("advanced");
        System.out.println(advancedProduct.getClass().getSimpleName());
        Product simpleProduct = productFactory.create("simple");
        System.out.println(simpleProduct.getClass().getSimpleName());

        AtmApi atmApi = new AtmApi();
        atmApi.deposit();
        atmApi.getLoan();
        atmApi.payOut();
        atmApi.recharge();
        atmApi.transferMoney();

        Post post = new Post();
        post.setTitle("Some title");
        post.setContent("Some content");

        post.attach(new FacebookObserver());
        post.attach(new TweeterObserver());
        post.share();

    }
}
