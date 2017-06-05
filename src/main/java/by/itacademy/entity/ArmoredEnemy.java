package by.itacademy.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Armored_Enemy")
@ToString(callSuper = true)
@PrimaryKeyJoinColumn(name = "enemy_id")
public class ArmoredEnemy extends Enemy{

    @Column(name = "armorType")
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private ArmorType armorType;

    @Column(name = "armorDurability")
    @Getter
    @Setter
    private int armorDurability;

}
