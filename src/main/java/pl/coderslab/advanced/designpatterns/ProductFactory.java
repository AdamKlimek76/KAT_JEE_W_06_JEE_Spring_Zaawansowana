package pl.coderslab.advanced.designpatterns;

public class ProductFactory {

    public Product create(String type) {
        if (type.equals("virtual")) {
            return new VirtualProduct();
        } else if (type.equals("simple")) {
            return new SimpleProduct();
        } else if (type.equals("advanced")) {
            return new AdvancedProduct();
        } else {
            return null;
        }
    }
}
