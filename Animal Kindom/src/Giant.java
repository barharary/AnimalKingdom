import java.awt.Color;

public class Giant extends Animal {
	private int GaintTalk = 0;

	@Override
	public Critter.Action getMove(CritterInfo info) {
		setSteps(getSteps());
		if (info.frontThreat()) {
			return Action.INFECT;
		} else if (info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		} else {
			return Action.RIGHT;
		}
	}

	@Override
	public Color getColor() {
		return Color.gray;
	}

	@Override
	public String toString() {

		if (getSteps() % 6 == 0) {
			this.GaintTalk++;
			if (GaintTalk == 5) {
				GaintTalk = 1;
			}
		}
		switch (GaintTalk) {
		case 1:

			return "fee";
		case 2:

			return "fie";
		case 3:

			return "foe";
		case 4:

			return "fum";
		default:
			return "ERROR";
		}
	}

}
