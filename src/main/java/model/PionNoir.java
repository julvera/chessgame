package model;

public class PionNoir extends Pion {

	public PionNoir(Couleur couleur_de_piece, Coord coord) {
		super(couleur_de_piece, coord,new ComportementPionNoir());
	}
	
//	public boolean isMoveOk(int xFinal, int yFinal, boolean isCatchOk,
//			boolean isCastlingPossible) {
//
//		boolean ret = false;
//
//		// Déplacement vertical
//		if (!isCatchOk && !isCastlingPossible){
//
//			if ((xFinal == this.getX())
//					&& (Math.abs(yFinal - this.getY()) <= 1 || 
//					(Math.abs(yFinal - this.getY()) <= 2 && this.premierCoup==true))) {
//
//				if ((Couleur.NOIR.equals(this.getCouleur()) && (yFinal - this.getY() > 0))) {
//					ret = true;
//				}
//			}
//		}
//		// Déplacement diagonal
//		else {
//			if (Couleur.NOIR.equals(this.getCouleur())) {
//				if ((yFinal == this.getY()+1 && xFinal == this.getX()+1) 
//						|| (yFinal == this.getY()+1 && xFinal == this.getX()-1)) {
//					ret = true;
//				}
//			}
//
//		}
//
//		return ret;
//	}

}
