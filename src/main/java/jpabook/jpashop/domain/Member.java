package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded //내장타입
    private Address address;

    @OneToMany(mappedBy = "member") //누구에 의해 연관관계 매핑이 됐는지 명시
    //order table에 있는 member필드에 의해 나는 매핑된거야!
    //여기 값을 변경한다고 해서 foreign key 값이 변경되지 x
    private List<Order> orders = new ArrayList<>();
}
