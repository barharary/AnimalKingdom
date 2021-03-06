import java.awt.Color;

public class WhiteTiger extends Panther {

	private boolean metCritter;

	public boolean isMetCritter() {
		return metCritter;
	}

	public void setMetCritter(boolean metCritter) {
		this.metCritter = metCritter;
	}

	@Override
	public Critter.Action getMove(CritterInfo info) {
		if (info.getFront() == Neighbor.SAME || info.getFront() == Neighbor.OTHER) {
			this.metCritter = true;
		}
		return pantherMoves(info);
	}
//		if (info.frontThreat()) {
//			return Action.INFECT;
//		} else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
//			return Action.LEFT;
//		} else if (info.getFront() == Neighbor.SAME) {
//			return Action.RIGHT;
//		} else {
//			return Action.HOP;
//		}
//	}

	@Override
	public Color getColor() {
		return Color.WHITE;
	}

	@Override
	public String toString() {
		if (this.metCritter) {
			return "TGR";
		} else {
			return "tgr";
		}
	}

}
