package app;

@Products(name = "orange", quota = 12)

public class ProductInfo {

    @Products(name = "mango", quota = 14 )
    public String getData() {
        return "No data...";
    }
}
