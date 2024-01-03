package tel.bvm.basketcorrect.service;

import org.springframework.stereotype.Service;
import tel.bvm.basketcorrect.scheme.Basket;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//@Service
//@SessionScope
@Service
public class MarketServiceImpl implements MarketService {
    public Map<Integer, Integer> basketMap;

    public MarketServiceImpl() {
        this.basketMap = new HashMap<>();
    }

    @Override
    public void add(Integer productIdentifier, Integer quantity) {
        Basket basket = new Basket(productIdentifier, quantity);
        basketMap.put(basket.getProductIdentifier(), basket.getQuantity());
//        return basketMap;
    }

    @Override
    public Map<Integer, Integer> getBasket() {
        return Collections.unmodifiableMap(basketMap);
    }
}
