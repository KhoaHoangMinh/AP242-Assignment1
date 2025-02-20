public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

	@Override
	public double getCombatScore() {
		double combatScore;
		boolean condition = Utility.isFibo(getBaseHp()) && Utility.findFiboIndex(getBaseHp()) > 2;
		if(condition) {
			combatScore = 1000 + Utility.findFiboIndex(getBaseHp());
		} else {
			combatScore = getBaseHp() * 3;
		}
		return combatScore;
	}
}
