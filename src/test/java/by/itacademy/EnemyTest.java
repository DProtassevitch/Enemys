package by.itacademy;

import by.itacademy.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class EnemyTest {
    private static SessionFactory SESSION_FACTORY;

    @BeforeClass
    public static void init() {
        SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
    }

    @Test
    public void testSaveEnemy() {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        ArmoredEnemy armoredEnemy = new ArmoredEnemy();
        armoredEnemy.setName("ArmoredEnemyFirst");
        armoredEnemy.setArmorType(ArmorType.FIRST_TYPE);
        armoredEnemy.setArmorDurability(100);
        session.save(armoredEnemy);

        RangedEnemy rangedEnemy = new RangedEnemy();
        rangedEnemy.setName("RangedEnemyFirst");
        rangedEnemy.setWeaponType(WeaponType.SECOND_TYPE);
        session.save(rangedEnemy);

        InvisibleEnemy invisibleEnemy = new InvisibleEnemy();
        invisibleEnemy.setName("InvisibleEnemyFirst");
        invisibleEnemy.setInvisibilityDuration(67);
        session.save(invisibleEnemy);

        transaction.commit();
        session.close();
    }

    @Test
    public void testGetEmployees() {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        List<Enemy> enemies = session
                .createQuery("from Enemy ", Enemy.class)
                .getResultList();

        enemies.forEach(System.out::println);

        List<InvisibleEnemy> invisibleEnemies = session
                .createQuery("from InvisibleEnemy", InvisibleEnemy.class)
                .getResultList();

        invisibleEnemies.forEach(System.out::println);

        transaction.commit();
        session.close();
    }

    @AfterClass
    public static void finish() {
        SESSION_FACTORY.close();
    }
}
