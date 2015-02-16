package com.johngodoi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Usuario user1 = new Usuario("Paulo",150);
        Usuario user2 = new Usuario("Rodrigo",120);
        Usuario user3 = new Usuario("Guilherme",190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        //Old Way
        for(Usuario u : usuarios){
            System.out.println(u.getNome());
        }

        //With foreach
        Mostrador mostrador = new Mostrador();
        usuarios.forEach(mostrador);

        //anounymous class
        Consumer<Usuario> mostrador2 = new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        };
        usuarios.forEach(mostrador2);

        //anounymous class short
        usuarios.forEach(new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        });

        //lambda version 1
        Consumer<Usuario> mostradorLamba1 = (Usuario u) -> {System.out.println(u.getNome());};

        usuarios.forEach(mostradorLamba1);

        //lambda version 2
        Consumer<Usuario> mostradorLamba2 =  u -> {System.out.println(u.getNome());};

        usuarios.forEach(mostradorLamba2);

        //lambda version 3
        Consumer<Usuario> mostradorLamba3 = u -> System.out.println(u.getNome());

        usuarios.forEach(mostradorLamba3);

        //lambda vesion final
        usuarios.forEach(u -> System.out.println(u.getNome()));

    }
}
