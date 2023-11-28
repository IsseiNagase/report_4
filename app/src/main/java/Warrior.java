

/**
 * 戦士クラス。
 */
public class Warrior extends LivingThing {

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 戦士名
     * @param maximumHP 戦士のHP
     * @param attack 戦士の攻撃力
     */
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * ウェポンスキルを使用して相手を攻撃するメソッド。
     * @param opponent 攻撃対象
     */
    public void attackWithWeaponSkill(LivingThing opponent) {
        int damage = (int) (getAttack() * 1.5); // attackの150%を計算
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
        opponent.wounded(damage);
    }

    public Object getName() {
        return null;
    }

    double getAttack() {
        return 0;
    }
}
