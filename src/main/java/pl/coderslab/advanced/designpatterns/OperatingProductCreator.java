package pl.coderslab.advanced.designpatterns;

public class OperatingProductCreator implements CreatorNew {
    @Override
    public ProductNew createProduct(Operation mathOperation) {
        ProductNew operatingProduct;
        if (mathOperation.equals(Operation.MULTIPLYING)) {
            operatingProduct = new MultiplyProduct();
        } else if (mathOperation.equals(Operation.DIVIDING)) {
            operatingProduct = new DivideProduct();
        } else if (mathOperation.equals(Operation.SUM)) {
            operatingProduct = new AddProduct();
        } else {
            operatingProduct = new SubtractProduct();
        }

        return operatingProduct;

    }

}
