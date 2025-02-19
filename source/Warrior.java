public class Warrior extends Fighter {
    public Warrior(int baseHp, int wp) {
        super(baseHp, wp);

    }

    @Override
    public double getCombatScore() {
        int GROUND = Battle.GROUND;
        double combatScore;
        if(Utility.isPrime(GROUND)) {
            combatScore = super.getBaseHp() * 2;
        } else {
            if(super.getWp() == 1) {
                combatScore = super.getBaseHp();
            } else {
                combatScore = (double) super.getBaseHp() / 10;
            }
        }
        return combatScore;
    }
}
