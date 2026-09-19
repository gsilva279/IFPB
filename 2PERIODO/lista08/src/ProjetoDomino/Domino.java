package ProjetoDomino;

public class Domino {
	  private int ladoA;
	   private int ladoB;
	   
	  public int getLadoA(){
	      return ladoA;
	   }
	  public int getLadoB(){
	     return ladoB;
	  }

	  public void setLadoA(int ladoA){
	    if(ladoA >= 0 && ladoA <= 6){
	         this.ladoA = ladoA;
	     }
	  }
	  public void setLadoB(int ladoB){
	    if(ladoB >= 0 && ladoB <= 6){
	         this.ladoB = ladoB;
	     }
	  }

	public Domino(int ladoA, int ladoB){
	    setLadoA(ladoA);
	    setLadoB(ladoB);
	 }

	 public boolean validarJuncao(Domino domino){
		 return getLadoA() == domino.getLadoA() || getLadoA() == domino.getLadoB() || getLadoB() == domino.getLadoB() || getLadoB() == domino.getLadoA();
	   }

	 @Override
	public String toString(){
	  return "[ " + ladoA + " ," + ladoB + " ]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Domino)) {
			return false;
		}
		Domino outro = (Domino) obj;
		return (getLadoA() == outro.getLadoA() && getLadoB() == outro.getLadoB()) || (getLadoA() == outro.getLadoB() && getLadoB() == outro.getLadoA());
	}


}
