import org.junit.Test;
public class Acrescimo10Test {
    

    @Test 
    public  void testeAcrescimo10(){
         Acrescimo10 tAcrescimo10 = new Acrescimo10();
         Double produto = tAcrescimo10.produto(50);
         Double produto10 = tAcrescimo10.produto10(5);
         Double np = tAcrescimo10.np(55);
         System.out.println(produto + "" + produto10 + "" + ""+np);
    }
}
