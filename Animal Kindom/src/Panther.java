import java.awt.*;

public abstract class  Panther extends Animal { //A.K.A Animal Utils / interfaces??

	public static Color generateColorOfTiger() {
		Color[] ColorsOfTiger = { Color.red, Color.green, Color.blue};
		int i = (int) (Math.random() * ColorsOfTiger.length);
		return ColorsOfTiger[i];
	}
	
	public static Critter.Action pantherMoves(CritterInfo info) {
		if (info.frontThreat()) {
			return Critter.Action.INFECT;
		} else if (info.getFront() == Critter.Neighbor.WALL || info.getRight() == Critter.Neighbor.WALL) {
			return Critter.Action.LEFT;
		} else if (info.getFront() == Critter.Neighbor.SAME) {
			return Critter.Action.RIGHT;
		} else {
			return Critter.Action.HOP;
		}
		
	}

	
	public String toString() {
		return "TGR";
	}
	
	
	
//public Critter.Action ifEnemyInfrontGetInfected(CritterInfo info) {
//	if (info.frontThreat()) {
//		return Critter.Action.INFECT;
//	}
//	return null;
//}
//
//public Critter.Action hopIfEmpty (CritterInfo info) {
//	if (info.getFront() == Critter.Neighbor.EMPTY) {
//		return Critter.Action.HOP; }
//	return null;
//	
//}
//
//public static Color tigerColors() {
//	
//	Color[] ColorsOfTigers = new Color[3];
//	ColorsOfTigers[0] = Color.RED;
//	ColorsOfTigers[1] = Color.GREEN;
//	ColorsOfTigers[2] = Color.BLUE;
//	
//	
//	
//	return super.getColor();
//}
//
//@Override
//public String toString() {
//	// TODO Auto-generated method stub
//	return super.toString();
//}
//
//
//	
//	
}
