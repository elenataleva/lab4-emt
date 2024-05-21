package mk.ukim.finki.emt.sharedkernel.domain.base;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.io.Serializable;

@MappedSuperclass
@Entity
@Embeddable
@Getter
public class DomainObjectId implements Serializable {
    private String id;
}
