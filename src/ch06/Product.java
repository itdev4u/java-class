package ch06;

public class Product {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public Product() { }

    @Override
    public String toString() {
        return "Product{" +
                "serialNo=" + serialNo +
                '}';
    }
}
