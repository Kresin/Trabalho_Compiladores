package com.compilador.model.compiler;

import java.util.ArrayList;
import java.util.Stack;

public class Semantico implements Constants {

    private String operador;
    private ArrayList<String> codigos;
    private Stack<String> pilhaTipos;
    private String tipoVar;
    private ArrayList<String> listaId;
    private Stack<String> pilhaRotulos;
    private String tabelaSimbolos;

    public void executeAction(int action, Token token) throws SemanticError {
        switch (action) {
            case 1:
                acao01();
                break;
            case 2:
                acao02();
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                acao05(token.getLexeme());
                break;
            case 6:
                acao06(token.getLexeme());
                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            case 13:

                break;
            case 14:
                acao14();
                break;
            case 15:
                acao15();
                break;
            case 16:
                acao16();
                break;
            case 17:
                acao17();
                break;
            case 18:

                break;
            case 19:

                break;
            case 20:

                break;
            case 21:

                break;
            case 22:

                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            case 30:
                break;
            case 31:
                break;
            case 32:
                break;
            case 33:
                break;
            case 34:
                break;
            case 35:
                break;
        }

        System.out.println("Ação #" + action + ", Token: " + token);
    }

    private void acao01() throws SemanticError {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        // verifica se ambos os tipos são int64 ou float64
        if ((tipo1.equals("int64") || tipo1.equals("float64")) && (tipo2.equals("int64") || tipo2.equals("float64"))) {
            // verificar se ambos os tipos são int64 ou float64
            if (tipo1.equals("float64") || tipo2.equals("float64")) {
                pilhaTipos.push("float64");
            } else {
                pilhaTipos.push("int64");
            }
        } else {
            // em caso negativo, gerar exceção e mensagem de erro: tipo(s) incompatível(is) em expressão aritmética
            throw new SemanticError("tipo(s) incompatível(is) em expressão aritmética");
        }

        codigos.add("add");
    }

    private void acao02() throws SemanticError {
        //tipo1:= pilha_tipos.desempilha
        //  tipo2:= pilha_tipos.desempilha
        //  se (tipo1=float64) ou (tipo2=float64) 
        //  então pilha_tipos.empilha (float64) 
        //  senão pilha_tipos.empilha (int64)
        //  fimse
        //  código.adiciona (sub)
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if ((tipo1.equals("int64") || tipo1.equals("float64")) && (tipo2.equals("int64") || tipo2.equals("float64"))) {
            if (tipo1.equals("float64") || tipo2.equals("float64")) {
                pilhaTipos.push("float64");
            } else {
                pilhaTipos.push("int64");
            }
        } else {
            // em caso negativo, gerar exceção e mensagem de erro: tipo(s) incompatível(is) em expressão aritmética
            throw new SemanticError("tipo(s) incompatível(is) em expressão aritmética");
        }

        codigos.add("sub");
    }

    private void acao03() throws SemanticError {
        /**
         * tipo1:= pilha_tipos.desempilha tipo2:= pilha_tipos.desempilha se
         * (tipo1=float64) ou (tipo2=float64) então pilha_tipos.empilha
         * (float64) senão pilha_tipos.empilha (int64) fimse código.adiciona
         * (mul)
         */
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if ((tipo1.equals("int64") || tipo1.equals("float64")) && (tipo2.equals("int64") || tipo2.equals("float64"))) {
            if (tipo1.equals("float64") || tipo2.equals("float64")) {
                pilhaTipos.push("float64");
            } else {
                pilhaTipos.push("int64");
            }
        } else {
            // em caso negativo, gerar exceção e mensagem de erro: tipo(s) incompatível(is) em expressão aritmética
            throw new SemanticError("tipo(s) incompatível(is) em expressão aritmética");
        }

        codigos.add("mul");
    }

    private void acao04() throws SemanticError {
        /**
         * tipo1:= pilha_tipos.desempilha tipo2:= pilha_tipos.desempilha se
         * (tipo1=tipo2) então pilha_tipos.empilha (tipo1) senão erro semântico,
         * parar fimse código.adiciona (div)
         */
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if (tipo1.equals(tipo2)) {
            pilhaTipos.push(tipo1);
        } else {
            // em caso negativo, gerar exceção e mensagem de erro: tipo(s) incompatível(is) em expressão aritmética
            throw new SemanticError("tipo(s) incompatível(is) em expressão aritmética");
        }

        codigos.add("div");
    }

    private void acao05(String lexeme) {
        /**
         * pilha_tipos.empilha (int64) código.adiciona (ldc.i8 token.getLexeme)
         * código.adiciona (conv.r8)
         */
        pilhaTipos.push("int64");
        codigos.add("ldc.i8 " + convertLongFromString(lexeme));
        codigos.add("conv.r8");
    }

    private void acao06(String lexeme) {
        /**
         * pilha_tipos.empilha (float64) código.adiciona (ldc.r8
         * token.getLexeme)
         *
         */
        pilhaTipos.push("float64");
        codigos.add("ldc.r8 " + convertFloatFromString(lexeme));
    }

    private void acao07() throws SemanticError {
        /**
         * tipo:= pilha_tipos.desempilha se (tipo=float64) ou (tipo=int64) então
         * pilha_tipos.empilha (tipo) senão erro semântico, parar fimse
         *
         */

        String tipo1 = pilhaTipos.pop();
        if (tipo1.equals("int64") || tipo1.equals("float64")) {
            pilhaTipos.push(tipo1);
        } else {
            // em caso negativo, gerar exceção e mensagem de erro: tipo(s) incompatível(is) em expressão aritmética
            throw new SemanticError("tipo(s) incompatível(is) em expressão aritmética");
        }
    }

    private void acao08() throws SemanticError {
        /**
         * tipo:= pilha_tipos.desempilha se (tipo=float64) ou (tipo=int64) então
         * pilha_tipos.empilha (tipo) senão erro semântico, parar fimse
         * código.adiciona (ldc.i8 -1) código.adiciona (conv.r8) código.adiciona
         * (mul)
         *
         */

        String tipo1 = pilhaTipos.pop();
        if (tipo1.equals("int64") || tipo1.equals("float64")) {
            pilhaTipos.push(tipo1);
        } else {
            // em caso negativo, gerar exceção e mensagem de erro: tipo(s) incompatível(is) em expressão aritmética
            throw new SemanticError("tipo(s) incompatível(is) em expressão aritmética");
        }

        codigos.add("ldc.i8 -1");
        codigos.add("conv.r8");
        codigos.add("mul");
    }

    private void acao09(String lexeme) {
        operador = lexeme;
    }

    private void acao10() throws SemanticError {
        /**
         * tipo1:= pilha_tipos.desempilha tipo2:= pilha_tipos.desempilha se
         * (tipo1=tipo2) então pilha_tipos.empilha (bool) senão erro semântico,
         * parar fimse caso operador > código.adiciona (cgt) < código.adiciona
         * (clt) == código.adiciona (ceq) fimcaso
         */

        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if (tipo1.equals(tipo2)) {
            pilhaTipos.push("bool");
        } else {
            // em caso negativo, gerar exceção e mensagem de erro: tipo(s) incompatível(is) em expressão aritmética
            throw new SemanticError("tipo(s) incompatível(is) em expressão aritmética");
        }

        switch (operador) {
            case ">":
                codigos.add("cgt");
                break;
            case "<":
                codigos.add("clt");
                break;
            case "==":
                if (tipo1.equals("string")) {
                    codigos.add("call int32 [mscorlib]System.String::Compare(string, string)");
                } else {
                    codigos.add("ceq");
                }
                break;
            case "!=":
                codigos.add("ceq");
                codigos.add("ldc.i4 0");
                codigos.add("ceq");
        }
    }

    private void acao11() {
        /**
         * pilha_tipos.empilha (bool) código.adiciona (ldc.i4.1)
         *
         */

        pilhaTipos.push("bool");
        codigos.add("ldc.i4.1");
    }

    private void acao12() {
        /**
         * pilha_tipos.empilha (bool) código.adiciona (ldc.i4.0)
         *
         */

        pilhaTipos.push("bool");
        codigos.add("ldc.i4.0");
    }

    private void acao13() throws SemanticError {
        /**
         * tipo:= pilha_tipos.desempilha se (tipo=bool) então
         * pilha_tipos.empilha (bool) senão erro semântico, parar fimse
         * código.adiciona (ldc.i4.1) código.adiciona (xor)
         *
         */

        String tipo1 = pilhaTipos.pop();
        if (tipo1.equals("bool")) {
            pilhaTipos.push("bool");
        } else {
            // em caso negativo, gerar exceção e mensagem de erro: tipo(s) incompatível(is) em expressão aritmética
            throw new SemanticError("tipo(s) incompatível(is) em expressão aritmética");
        }

        codigos.add("ldc.i4.1");
        codigos.add("xor");
    }

    private void acao14() {
        /**
         * tipo:= pilha_tipos.desempilha se (tipo=int64) então código.adiciona
         * (conv.i8) fimse código.adiciona ("call void
         * [mscorlib]System.Console::Write(" + tipo + ")")
         */
        String tipo = pilhaTipos.pop();

        // (b) valores do tipo int64 são tratados como float64, portanto devem ser primeiramente convertidos para int64 (conv.i8)
        if (tipo.equals("int64")) {
            codigos.add("conv.i8");
        }
        //(a) constante_char deve ser escrita como do tipo string em IL;
        if (tipo.equals("char")) {
            tipo = "string";
        }
        codigos.add("call void [mscorlib]System.Console::Write(\"" + tipo + "\")\"");
    }

    private void acao15() {
        /**
         * .assembly extern mscorlib {} .assembly _codigo_objeto{} .module
         * _codigo_objeto.exe
         *
         * .class public _UNICA{ .method static public void _principal() {
         * .entrypoint *
         */
        codigos.add(".assembly extern mscorlib {}\n"
                + ".assembly _codigo_objeto{}\n"
                + ".module   _codigo_objeto.exe\n"
                + ".class public _UNICA{\n"
                + ".method static public void _principal() {\n"
                + "   .entrypoint");
    }

    private void acao16() {
        /**
         * ret } }
         */
        codigos.add("   ret\n"
                + "  }\n"
                + "}");
    }

    private void acao17() {
//        String breakLine = "\n";
        codigos.add("ldstr \"\n\"");
        codigos.add("call void [mscorlib]System.Console::Write(string)"); //TODO Validar a quebra d elinha com a professora
    }

    private void acao18() throws SemanticError {
        /**
         * tipo1:= pilha_tipos.desempilha tipo2:= pilha_tipos.desempilha //
         * verificar se ambos os tipos são bool // em caso negativo, gerar
         * exceção e mensagem de erro: tipo(s) incompatível(is) em expressão
         * lógica // (apresentar a linha) // caso contrário: pilha_tipos.empilha
         * (bool) código.adiciona (and)
         */

        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if (tipo1.equals("bool") && tipo2.equals("bool")) {
            pilhaTipos.push("bool");
        } else {
            // em caso negativo, gerar exceção e mensagem de erro: tipo(s) incompatível(is) em expressão aritmética
            throw new SemanticError("tipo(s) incompatível(is) em expressão lógica");
        }

        codigos.add("and");
    }

    private void acao19() throws SemanticError {
        /**
         * tipo1:= pilha_tipos.desempilha tipo2:= pilha_tipos.desempilha //
         * verificar se ambos os tipos são bool // em caso negativo, gerar
         * exceção e mensagem de erro: tipo(s) incompatível(is) em expressão
         * lógica // (apresentar a linha) // caso contrário: pilha_tipos.empilha
         * (bool) código.adiciona (and)
         */

        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if (tipo1.equals("bool") && tipo2.equals("bool")) {
            pilhaTipos.push("bool");
        } else {
            // em caso negativo, gerar exceção e mensagem de erro: tipo(s) incompatível(is) em expressão aritmética
            throw new SemanticError("tipo(s) incompatível(is) em expressão lógica");
        }

        codigos.add("or");
    }

    private void acao20() throws SemanticError {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if (tipo1.equals("int64") && tipo2.equals("int64")) {
            pilhaTipos.push("int64");
        } else {
            // em caso negativo, gerar exceção e mensagem de erro: tipo(s) incompatível(is) em expressão aritmética
            throw new SemanticError("tipo(s) incompatível(is) em expressão aritmética");
        }

        codigos.add("div");
    }

    private void acao21(String lexeme) {
        /**
         * pilhaTipos.push("int64"); codigos.add("ldc.i8 " +
         * convertLongFromString(lexeme)); codigos.add("conv.r8");
         */
        pilhaTipos.push("char");
        switch (lexeme) {
            case "\n":
                codigos.add("ldstr \"\n\"");
                break;
            case "\\s":
                codigos.add("ldstr \" \"");
                break;
            case "\t":
                codigos.add("ldstr \"t\"");
                break;
            default:
                codigos.add("ldstr " + lexeme);
                break;
        }
        
    }

    private void acao22(String lexeme) {
        pilhaTipos.push("string");
        codigos.add("ldstr " + lexeme);
    }

    private long convertLongFromString(String number) {
        if (number.contains("d")) {
            int index = number.indexOf("d");
            int n1 = Integer.parseInt(number.substring(0, index));
            int potenciador = Integer.parseInt(number.substring(index + 1, number.length()));
            Double n2 = Math.pow(10, potenciador);
            System.out.println(n2.intValue());
            return n1 * n2.longValue();
        }
        return 0;
    }

    private double convertFloatFromString(String number) {
        if (number.contains(".") && number.contains("d")) {
            Integer indexPonto = number.indexOf(".");
            Integer indexD = number.indexOf("d");
            Integer n1 = 0;
            if (indexPonto != 0) {
                n1 = Integer.parseInt(number.substring(0, indexPonto));
            }
            Integer n2 = Integer.parseInt(number.substring(indexPonto + 1, indexD));
            Integer potenciador = Integer.parseInt(number.substring(indexD + 1, number.length()));

            String real = "";
            if (n1 == 0) {
                real = "0." + n2;
            } else {
                real = n1 + "." + n2;
            }

            Double parseFloat = Double.parseDouble(real);
            return parseFloat * Math.pow(10, potenciador);
        }
        return 0;
    }

}
