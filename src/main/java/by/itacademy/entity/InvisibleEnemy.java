package by.itacademy.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Invisible_Enemy")
@ToString(callSuper = true)
@PrimaryKeyJoinColumn(name = "enemy_id")
public class InvisibleEnemy extends Enemy {

    @Column(name = "invisibilityDuration")
    @Getter
    @Setter
    private int invisibilityDuration;
}
