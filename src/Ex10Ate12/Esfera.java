package Ex10Ate12;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Esfera {
    double raio;

    public double calcularVolumeEsfera() {
        double PI = Math.PI;
        double volume = (4 / 3.0) * PI * Math.pow(raio, 3);
        BigDecimal bd = new BigDecimal(volume).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Volume: " + bd);
        return volume;
    }
}
