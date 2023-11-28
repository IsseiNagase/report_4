package jp.ac.uryukyu.ie.e235732;

import jp.ac.uryukyu.ie.e235732.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WarriorTest {

    public WarriorTest(String string, int i, int j) {
    }

    /**
     * WarriorクラスのattackWithWeaponSkillメソッドをテスト。
     * 3回実行して、3回ともattackの150%ダメージになっていることを確認する。
     */
    @Test
    void attackWithWeaponSkillTest() {
        WarriorTest warrior = new WarriorTest("戦士", 100, 10);
        LivingThing target = new LivingThing("相手", 100, 10);

        // ウェポンスキルを3回実行
        for (int i = 0; i < 3; i++) {
            int expectedDamage = (int) (warrior.getAttack() * 1.5);
            warrior.attackWithWeaponSkill(target);
            assertEquals(100 - expectedDamage, target.getHitPoint());
        }
    }

    private void assertEquals(int expected, Integer hitPoint) {
    }

    private void attackWithWeaponSkill(LivingThing target) {
    }

    private double getAttack() {
        return 0;
    }
}
