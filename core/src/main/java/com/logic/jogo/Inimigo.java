package com.logic.jogo;
import com.badlogic.gdx.math.Rectangle;
import java.util.ArrayList;

public class Inimigo {
    // Inicializar inimigos

       public static ArrayList<Rectangle> criarInimigos() {
        ArrayList<Rectangle> inimigos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Rectangle inimigo = new Rectangle();
            inimigo.x = 200 + i * 100;
            inimigo.y = 200 + i * 50;
            inimigo.width = 32;
            inimigo.height = 32;
            inimigos.add(inimigo);
        }
        return inimigos;
    }
}

