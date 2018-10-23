package cerchioanimato;

//importo tutti gli oggetti di awt
import java.awt.*;
//importo tutti gli oggetti di awt.event
import java.awt.event.*;
//importo tutti gli oggetti di swing
import javax.swing.*;

//classe concreta
//estende JPanel
//implementa ActionListener
public class Cerchio extends JPanel implements ActionListener {
//    variabili e costanti globali

//    creo il timer
//    vuole un ascoltatore implementato sa ActionListener
//    tra parentesi quanti millisecondi
    Timer timer = new Timer(20, this);
//    misura del pannello
    final int SIZE_PANEL = 50;

//    coordinate posizione: x, y
//    coordinate spostamento: dx, dy
//    maggiori sono dx e dy più velocemente si sposta
    int x = 2, y = 2, dx = 2, dy = 2;

//    Costruttore
    public Cerchio() {
//        setta colore sfondo
        setBackground(Color.LIGHT_GRAY);
//        setta dimensioni Panel
//        se non c'è altro nella finestra prende le stesse misure
        setPreferredSize(new Dimension(SIZE_PANEL, SIZE_PANEL));
//        avviamo il timer
        timer.start();

    }

//    metodo che sovrascrive paintComonent
//    parametri: componente grafica
    public void paintComponent(Graphics g) {
//        chiamo paintComponent già esistente
        super.paintComponent(g);
//        disegno ovale
//        posizione x e y
//        misure = a pannello
        g.drawOval(x, y, SIZE_PANEL, SIZE_PANEL);
    }

//    metodo sposta
    public void sposta() {

        if (y + dy + SIZE_PANEL + 42 > Finesta.SIZE_FRAME_Y) {
            dy = -dy;
        }
        if (y + dy < 0) {
            dy = -dy;
        }

        if (x + dx + SIZE_PANEL + 13 > Finesta.SIZE_FRAME_X) {
            dx = -dx;
        }
        
        if (x + dx < 0) {
            dx = -dx;
        }

//        modifico le coordinate
//        aggiungo al valore di x e y 
//        il valore di dx e dy
        x += dx;
        y += dy;

    }

//    metodo sovrascritto da ActionListener 
    @Override
    public void actionPerformed(ActionEvent e) {
//        chiamiamo il metodo soposta
        sposta();
//        chimiamo metodo repaint
        repaint();
    }

}
