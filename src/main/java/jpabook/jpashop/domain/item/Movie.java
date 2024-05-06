package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("M") //SINGLE_TABLE일 때 테이블 구분
@Getter @Setter
public class Movie extends Item{
    private String director;
    private String actor;
}
