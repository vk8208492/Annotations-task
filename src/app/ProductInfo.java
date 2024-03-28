package app;

@Product(name = "orange", quota = 12)

public class ProductInfo {

    @Product(name = "mango", quota = 14 )
    public String getData() {
        return "No data...";
    }
}
