package _07gestaoacademica;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class CustomizacaoBotao extends JButton {

    private boolean saiu;
    private Color cor, corSaiu, corClicou, corBorda;
    private int raio = 0;

    public CustomizacaoBotao() {

        //inicializa cor
        cor = cor.WHITE;
        corSaiu = new Color(36, 53, 61, 255);
        corClicou = new Color(76, 95, 99, 255);
        corBorda = new Color(36, 53, 61, 255);
        setContentAreaFilled(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setCor(corSaiu);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (saiu) {
                    setBackground(corSaiu);
                } else {
                    setBackground(cor);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCor(corClicou);
                saiu = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(corSaiu);
                saiu = false;
            }
        });

    }

    //GETTERS
    public Boolean isSaiu() {
        return saiu;
    }

    public Color getCor() {
        return cor;
    }

    public Color getCorSaiu() {
        return corSaiu;
    }

    public Color getCorClicou() {
        return corClicou;
    }

    public Color getCorBorda() {
        return corBorda;
    }

    public int getRaio() {
        return raio;
    }

    //SETTERS
    public void setSaiu(boolean saiu) {
        this.saiu = saiu;
    }

    public void setCor(Color cor) {
        this.cor = cor;
        setBackground(cor);
    }

    public void setCorSaiu(Color corSaiu) {
        this.corSaiu = corSaiu;
    }

    public void setCorClicou(Color corClicou) {
        this.corClicou = corClicou;
    }

    public void setCorBorda(Color corBorda) {
        this.corBorda = corBorda;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    //GERAL
    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Pintar borda
        g2.setColor(corBorda);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), raio, raio);
        g2.setColor(getBackground());
        //Definir 2 pixeis, borda
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, raio, raio);
        super.paintComponent(g);

    }

}
