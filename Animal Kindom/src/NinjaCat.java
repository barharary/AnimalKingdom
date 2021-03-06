import java.awt.Color;

public class NinjaCat extends Animal {
	private Color c = Color.BLACK;

	@Override
	public Critter.Action getMove(CritterInfo info) {
		this.setSteps(getSteps() + 1);
		if (info.getFront() == Neighbor.EMPTY) {

			return Action.HOP;
		}
		if (info.backThreat() || info.frontThreat()) {
			return Action.RIGHT;
		} else if (info.getRight() == Neighbor.SAME || info.getLeft() == Neighbor.SAME) {

			return Action.INFECT;
		}
		return super.getMove(info);

	}

	@Override
	public Color getColor() {

		if (getSteps() % 5 == 1) {
			c = new Color((int) (Math.random() * 0x1000000));
		}
		return c;

	}

	@Override
	public String toString() {
		return super.toString();
	}

}
