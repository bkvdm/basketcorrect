package tel.bvm.basketcorrect.scheme;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Basket {

    private Integer productIdentifier;
    private Integer quantity;

    public Basket(Integer productIdentifier, Integer quantity) {
        this.productIdentifier = productIdentifier;
        this.quantity = quantity;
    }

    public Integer getProductIdentifier() {
        return productIdentifier;
    }

    public void setProductIdentifier(Integer productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
