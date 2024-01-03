package tel.bvm.basketcorrect.service;

import java.util.Map;

public interface MarketService {
//    Map<Integer, Integer> add(Integer productIdentifier, Integer quantity);

    void add(Integer productIdentifier, Integer quantity);

    Map<Integer, Integer> getBasket();
}
