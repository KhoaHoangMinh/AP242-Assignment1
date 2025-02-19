public class Knight extends Fighter {
    public Knight(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        // TODO: Find the way to get GROUND
        int GROUND = Battle.GROUND;
        int combatScore;
        if(Utility.isSquare(GROUND)) {
            combatScore = super.getBaseHp() * 2;
        } else {
            if(super.getWp() == 1) {
                combatScore = super.getBaseHp();
            } else {
                combatScore = super.getBaseHp() / 10;
            }
        }
        return combatScore;
//        return 1.0;
    }
}
