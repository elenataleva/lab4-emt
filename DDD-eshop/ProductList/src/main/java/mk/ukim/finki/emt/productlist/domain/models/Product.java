package mk.ukim.finki.emt.productlist.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mk.ukim.finki.emt.productlist.domain.valueobject.Quantity;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

@Entity
@Table(name="product")
public class Product extends AbstractEntity<ProductID>{

    private String productName;
    private String desc;
    private Money price;
    private Quantity quantity;

}
