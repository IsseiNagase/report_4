package jp.ac.uryukyu.ie.e235732;

/**
 * 生き物クラス。
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 名前
     * @param maximumHP 最大HP
     * @param attack 攻撃力
     */
    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * 生死状態を取得するメソッド。
     * @return 生死状態。true=死亡。
     */
    public boolean isDead() {
        return dead;
    }

    /**
     * 名前を取得するメソッド。
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * 攻撃メソッド。相手を攻撃する。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent) {
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.name, damage);
        opponent.wounded(damage);
    }

    /**
     * ダメージ処理メソッド。指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
