public class DeathEater extends Monster implements Combatable {
	public DeathEater(Complex mana) {
		super(mana);

	}

	@Override
	public double getCombatScore() {
		return 1.0;
	}
}
