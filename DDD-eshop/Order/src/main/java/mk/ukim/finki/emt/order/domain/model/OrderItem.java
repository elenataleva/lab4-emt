package mk.ukim.finki.emt.order.domain.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import mk.ukim.finki.emt.order.domain.valueObjects.ProductId;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

@Entity
@Table(name = "order_item")
public class OrderItem extends AbstractEntity<OrderItemId> {

    private Money item_price;
   private int quantity;

   private ProductId productId;
   private String status;
}
