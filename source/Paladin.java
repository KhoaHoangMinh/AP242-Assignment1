public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

	@Override
	public double getCombatScore() {
		double combatScore;
		int fiboIndex = Utility.findFiboIndex(getBaseHp());
		boolean condition = Utility.isFibo(getBaseHp()) && fiboIndex > 2;
		if(condition) {
			combatScore = 1000 + fiboIndex;
		} else {
			combatScore = getBaseHp() * 3;
		}
		return combatScore;
	}
}
