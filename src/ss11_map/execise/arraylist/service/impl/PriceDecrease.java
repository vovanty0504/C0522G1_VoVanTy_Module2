package ss11_map.execise.arraylist.service.impl;

import ss11_map.execise.arraylist.modle.Product;

import java.util.Comparator;

public class PriceDecrease implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
