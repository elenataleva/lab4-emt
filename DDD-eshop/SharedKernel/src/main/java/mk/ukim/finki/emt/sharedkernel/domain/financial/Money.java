package mk.ukim.finki.emt.sharedkernel.domain.financial;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueOject;

@Embeddable
@Getter
public class Money implements ValueOject {

    private final double amount;
    protected Money() {
        this.amount=0.0;
    }
    public Money(@NonNull double amount){
        this.amount=amount;
    }
}
