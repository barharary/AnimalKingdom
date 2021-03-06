import java.awt.Color;

public class Tiger extends Panther {
	private Color randomColorTiger; // TODO color to gneralize

	
	
	@Override
	public Action getMove(CritterInfo info) {
		setSteps(getSteps() + 1);
		return pantherMoves(info);
	}

	@Override
	public Color getColor() {
		if (getSteps() % 3 == 0) {
			this.randomColorTiger = Panther.generateColorOfTiger();
		}
		return this.randomColorTiger;
	}
	
	// Inherit ToString from Panther.

}
