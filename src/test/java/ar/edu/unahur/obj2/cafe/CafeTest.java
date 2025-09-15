package ar.edu.unahur.obj2.cafe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CafeTest {

    @Test
    public void testCostoCafe(){
        Double valorCafe = 100.0;
        ICafe cafe = new Cafe(valorCafe);

        assertEquals(valorCafe, cafe.costo());

    }

    @Test
    public void testCostoCafeConLeche(){
        Double valorCafe = 100.0;
        ICafe cafe = new Cafe(valorCafe);

        Double valorLeche = 15.0;
        ICafe cafeConLeche = new Leche(cafe, valorLeche);

        assertEquals(valorCafe + valorLeche, cafeConLeche.costo());

    }

    @Test
    public void testCostoCafeConLecheConAzucar(){
        Double valorCafe = 100.0;
        ICafe cafe = new Cafe(valorCafe);

        Double valorLeche = 15.0;
        ICafe cafeConLeche = new Leche(cafe, valorLeche);

        Double valorAzucar = 5.0;
        ICafe cafeConLecheConAzucar = new Azucar(cafeConLeche, valorAzucar);

        assertEquals(valorCafe + valorLeche + valorAzucar, cafeConLecheConAzucar.costo());

    }

    @Test
    public void testNombrePosDecorado(){

        ICafe cafe = new Cafe(100.0);

        ICafe cafeConLeche = new Leche(cafe, 15.0);

        ICafe cafeConLecheConAzucar = new Azucar(cafeConLeche, 5.0);

        assertEquals("Café Leche Azúcar", cafeConLecheConAzucar.nombrePosDecorado());

    }

    @Test
    public void testNombrePreDecorado(){

        //es igual al test anterior pero sin crear variables intermedias
        ICafe cafeConLecheConAzucar = new Azucar(new Leche(new Cafe(100.0), 15.0), 5.0);

        assertEquals("Azúcar Leche Café", cafeConLecheConAzucar.nombrePreDecorado());

    }

}
