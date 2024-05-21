package mk.ukim.finki.emt.productlist.domain.valueobject;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueOject;

@Embeddable
@Getter
public class Quantity implements ValueOject {
    private final int quantity;
    protected Quantity(){
        this.quantity=0;
    }
}
