package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("A") //SINGLE_TABLE일 때 테이블 구분
@Getter @Setter
public class Album extends Item{
    private String artist;
    private String etc;
}
