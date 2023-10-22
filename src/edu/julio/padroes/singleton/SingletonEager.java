package edu.julio.padroes.singleton;

/**
 * Singleton "apressado"
 *
 * @author julioreigen
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
