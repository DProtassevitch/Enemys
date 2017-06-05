package by.itacademy.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Table(name = "enemy")
@ToString(callSuper = true)
public class Enemy extends BaseEntity {

    @Column(name = "name")
    @Getter
    @Setter
    private String name;
}
