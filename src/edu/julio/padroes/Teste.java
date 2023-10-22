package edu.julio.padroes;

import edu.julio.padroes.facade.Facade;
import edu.julio.padroes.singleton.SingletonEager;
import edu.julio.padroes.singleton.SingletonLazy;
import edu.julio.padroes.singleton.SingletonLazyHolder;
import edu.julio.padroes.strategy.*;

public class Teste {
    public static void main(String[] args) {
        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        System.out.println("\n");

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        System.out.println("\n");


        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Pedro", "48967000");

    }
}
