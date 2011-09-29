import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;

import junit.framework.TestCase;

public class PacManTest extends TestCase {
	
	PacMan pm;
	
    public PacManTest() {
    }
    
    @Override
    protected void setUp() throws Exception {
    	pm = new PacMan();
    }
        
    public void test_deve_retornar_o_campo() {
    	assertEquals(true, pm.getCampo());
    }
    
    public void test_deve_mudar_a_direcao_do_pacman_para_a_direita() {
    	pm.direita();
    	assertEquals("<", pm.getDirecao());
    }
    
    public void test_deve_mudar_a_direcao_do_pacman_para_a_esquerda() {
    	pm.esquerda();
    	assertEquals(">", pm.getDirecao());
    }
    
    public void test_deve_mudar_a_direcao_do_pacman_pra_baixo_e_pra_cima() {
    	pm.cima();
    	assertEquals("V", pm.getDirecao());
    	pm.baixo();
    	assertEquals("^", pm.getDirecao());
    }
    
    public void test_deve_andar_para_cima() {
    	pm.cima();
    	pm.tick();
    	assertEquals(true, Arrays.equals(new Integer[]{0,1}, pm.getPosicao()));
    }
    
   
    public static void main(String[] args) {
        junit.textui.TestRunner.run(PacManTest.class);
    }
}