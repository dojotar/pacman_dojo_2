public class PacMan {

	/*String campo[][] = new String[3][3];*/
	private static final String cima = "V";
	private static final String baixo = "^";
	private static final String esq = ">";
	private static final String dir = "<";
	
	private static final Integer alt = 3;
	private static final Integer larg = 3;
	
	String campo[][] = {{".", ".", "."}, {".", cima, "."}, {".", ".","."}};
	String direcao = "V";
	Integer l = 1;
	Integer c = 1;
	
	public PacMan() {
		//new Reminder(1, this);
	}
	
	public boolean getCampo() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		for (int i=0; i<larg; i++) {
			for (int j=0; j<larg; j++) {
				System.out.print(campo[i][j]+" ");
			}
			System.out.println();
		}
		
		
		return true;
	}
	
	public void direita(){
		direcao = "<";
	}
		
	public void esquerda(){
		direcao = ">";
	}
	
	public void cima(){
		direcao = "V";
	}
	
	public void baixo(){
		direcao = "^";
	}
	
	public String getDirecao() {
		return direcao;
	}
	
	public Integer[] getPosicao() {
		return new Integer[]{l, c};
	}
	
	public void tick() {
		campo[l][c] = " ";
		if(direcao.equals(cima)) {
			if (l>0) l--;
		}else if (direcao.equals(baixo)) {
			if (l<alt-1) l++;
		}else if (direcao.equals(esq)) {
			if (c>0) c--;
		}else if (direcao.equals(dir)) {
			if (c<larg-1) c++;
		}
		campo[l][c] = direcao;
	}
	
	public static void main(String[] args) {
		new PacMan();
	}

}