package tel.bvm.basketcorrect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tel.bvm.basketcorrect.service.MarketService;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class Market {

    private final MarketService marketService;

    public Market(MarketService marketService) {
        this.marketService = marketService;
    }

    @GetMapping("/add")
    public void basket (@RequestParam(value = "id", required = false) Integer productIdentifier, @RequestParam(value = "count", required = false) Integer quantity) {
        marketService.add(productIdentifier, quantity);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> getBasket() {
        return marketService.getBasket();
    }
}
// /store/order/add
// /store/order/get
