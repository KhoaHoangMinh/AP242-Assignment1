public class Warrior extends Fighter {
    public Warrior(int baseHp, int wp) {
        super(baseHp, wp);

    }

    @Override
    public double getCombatScore() {
        double combatScore;
        if(Utility.isPrime(Battle.GROUND)) {
            combatScore = super.getBaseHp() * 2;
        } else {
            if(super.getWp() == 1) {
                combatScore = super.getBaseHp();
            } else {
                combatScore = super.getBaseHp() / 10.0;
            }
        }
        return Utility.checkCombatScore(combatScore);
    }
}
