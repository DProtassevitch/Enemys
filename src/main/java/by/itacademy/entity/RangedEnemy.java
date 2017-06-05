package by.itacademy.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Ranged_Enemy")
@ToString(callSuper = true)
@PrimaryKeyJoinColumn(name = "enemy_id")
public class RangedEnemy extends Enemy{

    @Column(name = "weaponType")
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private WeaponType weaponType;

    @Column(name = "rangeOfFire")
    @Getter
    @Setter
    private Long rangeOfFire;

}