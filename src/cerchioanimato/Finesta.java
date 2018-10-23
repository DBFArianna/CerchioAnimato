package cerchioanimato;

//importo tutti gli oggetti di awt
import java.awt.*;
//importo tutti gli oggetti di swing
import javax.swing.*;

//classe concreta
//estende JFrame
public class Finesta extends JFrame {
//    varibili e costanti globali

//    misure della Finestra
    public final static int SIZE_FRAME_X = 600;
    public final static int SIZE_FRAME_Y = 500;

//    Costruttore
    public Finesta() {
//        chiamo costruttore di JFrame
        super("Vogliamo vederlo scorrere");
//        setta cosa fare quando chiacci sulla X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        misure Frame
        setPreferredSize(new Dimension(SIZE_FRAME_X, SIZE_FRAME_Y));
//        creo cerchio
        Cerchio c = new Cerchio();
//        aggiungi il cerchio al Frame
        add(c);
//        aggiungiamo le componenti grafiche
        pack();
//        setta visibilità a true
        setVisible(true);
    }

//    metodo statico di test
    public static void test() {
//        creo Finestra
        Finesta f = new Finesta();
    }

}
