import java.awt.Color;


public class Bear extends Animal {

	private boolean polar;	

	public Bear(boolean polar) {
		this.polar = polar;
	}

	public boolean isPolar() {
		return polar;
	}

	public void setPolar(boolean polar) {
		this.polar = polar;
	}


	@Override
	public Action getMove(CritterInfo info) {
		setSteps(getSteps()+1);
		if (info.frontThreat()) {
			return Action.INFECT;
		}
		if (info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		} else {
			return super.getMove(info);
		}
	}

	@Override
	public Color getColor() {
		if (this.polar) {
			return Color.WHITE;
		}
		return super.getColor();
	}

	@Override
	public String toString() {
		if (getSteps() % 2 == 1) {
			return "/";
		} else {
			return "\\";
		}
	}
}
