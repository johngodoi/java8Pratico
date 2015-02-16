package com.johngodoi;

import java.util.function.Consumer;

/**
 * Created by john on 12/02/15.
 */
class Mostrador implements Consumer<Usuario> {
    @Override
    public void accept(Usuario usuario) {
        System.out.println(usuario.getNome());
    }
}
