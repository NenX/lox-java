package com.craftinginterpreters.lox;

import java.util.List;

interface LoxCallable {
    // 新增部分开始
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}