package com.craftinginterpreters.lox;

public abstract class Aa {
    static class Binary extends Aa {
        Binary(Aa left){
            this.left = left;

        }
        final Aa left;
    }
}
