package Ex10Ate12;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circulo {
    double raio;

    double PI = Math.PI;

    public double calcularAreaCirculo() {
        double area = PI * (raio * raio);
        BigDecimal bd = new BigDecimal(area).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Area: " + bd.doubleValue());
        return area;
    }
}
