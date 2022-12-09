package com.compilador.model.compiler;

public interface ParserConstants {

    int START_SYMBOL = 49;

    int FIRST_NON_TERMINAL = 49;
    int FIRST_SEMANTIC_ACTION = 84;

    int[][] PARSER_TABLE
            = {
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 19, -1, -1, -1, -1, -1, -1, -1, 19, -1, 19, -1, -1, -1, -1, -1, 19, -1, -1, 19, 19, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 1, -1, -1, -1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, -1, 1, -1, -1, 1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 27, 27, 27, 27, 27, -1, -1, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, 27, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, -1, 27, 27, -1, -1, -1, -1, -1},
                {-1, 13, -1, -1, -1, -1, -1, -1, -1, 18, -1, 17, -1, -1, -1, -1, -1, 16, -1, -1, 15, 15, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, 39, 40, 41, 42, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 38, -1, 36, -1, -1, -1, -1, 35, -1, -1, 34, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 49, 49, 49, 49, 49, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, 49, 49, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, 50, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, 51, 52},
                {-1, 53, 53, 53, 53, 53, -1, -1, -1, -1, -1, -1, -1, -1, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, 53, -1, -1, -1, -1, -1, 53, 53, -1, -1, -1, -1, -1},
                {-1, 57, 57, 57, 57, 57, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 57, -1, -1, -1, -1, -1, 57, 57, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, 59, -1, 58, 58, -1, 58, -1, -1, 59, 59, -1, -1, -1, -1, -1, 58, 58},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 60, -1, 61, -1, -1, -1, -1, -1, -1, -1, 62, 63, -1, -1, -1, -1, -1, -1, -1},
                {-1, 64, 64, 64, 64, 64, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1, 64, 64, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, -1, 65, -1, 65, 65, -1, 65, -1, -1, 65, 65, 66, 67, -1, -1, -1, 65, 65},
                {-1, 68, 68, 68, 68, 68, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, -1, -1, -1, -1, -1, 68, 68, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 69, -1, 69, -1, 69, 69, -1, 69, -1, -1, 69, 69, 69, 69, 70, 71, 72, 69, 69},
                {-1, 73, 74, 75, 76, 77, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 78, -1, -1, -1, -1, -1, 79, 80, -1, -1, -1, -1, -1},
                {-1, 24, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 8, -1, 7, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 9, -1, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, -1, 47, 48, -1, -1, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 20, -1, -1, -1, -1, -1, -1, -1, 20, -1, 20, 21, 21, -1, -1, -1, 20, -1, -1, 20, 20, 20, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 28, -1, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 2, -1, -1, -1, -1, -1, -1, -1, 2, -1, 2, -1, -1, -1, -1, -1, 2, -1, -1, 2, 2, 2, -1, -1, 2, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 6, -1, -1, -1, -1, -1, -1, -1, 6, -1, 6, -1, -1, -1, -1, -1, 6, -1, -1, 6, 6, 6, -1, -1, 4, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
            };

    int[][] PRODUCTIONS
            = {
                {99, 17, 20, 38, 52, 39, 100},
                {83, 82},
                {52},
                {0},
                {61},
                {62},
                {54},
                {33, 64, 114, 115, 78},
                {31, 63, 35},
                {31, 63, 35},
                {35},
                {26, 51, 77},
                {27, 51, 77},
                {55},
                {56},
                {58},
                {59},
                {57},
                {10, 35},
                {54, 80},
                {50},
                {0},
                {23, 36, 76, 51, 119, 37, 35},
                {6, 106, 98, 34},
                {0},
                {21, 36, 53, 37, 35},
                {22, 36, 53, 37, 101, 35},
                {65, 98, 81},
                {34, 53},
                {0},
                {18, 36, 65, 37, 108, 50, 60, 14, 110, 35},
                {13, 109, 50},
                {0},
                {111, 12, 50, 28, 36, 65, 37, 112, 14, 35},
                {19},
                {16},
                {11},
                {24},
                {9},
                {3},
                {4},
                {5},
                {6},
                {25},
                {15},
                {2, 116, 31, 65, 118, 35},
                {2, 116, 79},
                {0},
                {34, 51},
                {67, 66},
                {0},
                {47, 67, 102, 66},
                {48, 67, 103, 66},
                {68},
                {25, 95},
                {15, 96},
                {29, 67, 97},
                {71, 69},
                {0},
                {70, 93, 71, 94},
                {30},
                {32},
                {40},
                {41},
                {73, 72},
                {0},
                {42, 73, 85, 72},
                {43, 73, 86, 72},
                {75, 74},
                {0},
                {44, 75, 87, 74},
                {45, 75, 88, 74},
                {46, 75, 104, 74},
                {2, 117},
                {3, 89},
                {4, 90},
                {5, 105},
                {6, 106},
                {36, 65, 37},
                {42, 75, 91},
                {43, 75, 92}
            };

    String[] PARSER_ERROR
            = {
                "",
                "esperado EOF",
                "esperado identificador",
                "esperado constante_int",
                "esperado constante_float",
                "esperado constante_char",
                "esperado constante_string",
                "esperado linha",
                "esperado bloco",
                "esperado boolean",
                "esperado break",
                "esperado char",
                "esperado do",
                "esperado else",
                "esperado end",
                "esperado false",
                "esperado float",
                "esperado fun",
                "esperado if",
                "esperado int",
                "esperado main",
                "esperado print",
                "esperado println",
                "esperado readln",
                "esperado string",
                "esperado true",
                "esperado val",
                "esperado var",
                "esperado while",
                "esperado !",
                "esperado ==",
                "esperado =",
                "esperado !=",
                "esperado :",
                "esperado ,",
                "esperado ;",
                "esperado (",
                "esperado )",
                "esperado {",
                "esperado }",
                "esperado <",
                "esperado >",
                "esperado +",
                "esperado -",
                "esperado *",
                "esperado /",
                "esperado %",
                "esperado &&",
                "esperado ||",
                "esperado fun", //"<programa> inválido",
                "esperado identificador break do if print println readln", //  "<lista_comando> inválido",
                "esperado identificador", //  "<lista_de_identificadores> inválido",
                "esperado identificador break do if print println readln val var", //  "<lista_de_instrucoes> inválido",
                "esperado expressão", //  "<lista_expressao> inválido",
                "esperado identificador break do if print println readln", //  "<comando> inválido",
                "esperado identificador", //  "<comando_atribuicao> inválido",
                "esperado readln", //  "<comando_entrada> inválido",
                "esperado do", //  "<comando_repeticao> inválido",
                "esperado print println", //  "<comando_saida> inválido",
                "esperado if", //  "<comando_selecao> inválido",
                "esperado else end", //  "<selecao_opcional> inválido",
                "esperado val", //  "<declaracao_constantes> inválido",
                "esperado var", //  "<declaracao_variaveis> inválido",
                "esperado constante_int constante_float constante_char constante_string false true", //  "<valor> inválido",
                "esperado boolean char float int string", //  "<tipo> inválido",
                "esperado expressão", //  "<expressao> inválido",
                "esperado expressão", //  "<expressao_> inválido",
                "esperado expressão", //  "<elemento> inválido",
                "esperado expressão", //  "<relacional> inválido",
                "esperado expressão", //  "<relacional_> inválido",
                "esperado == != < >", //  "<operador_relacional> inválido",
                "esperado expressão", //  "<aritmetica> inválido",
                "esperado expressão", //  "<aritmetica_> inválido",
                "esperado expressão", //  "<termo> inválido",
                "esperado expressão", //  "<termo_> inválido",
                "esperado expressão", //  "<fator> inválido",
                "esperado identificador constante_string", //  "<entrada_opcional> inválido",
                "esperado = :", //  "<lista_de_identificadores1> inválido",
                "esperado = ;", //  "<lista_de_identificadores2> inválido",
                "esperado = : , )", //  "<lista_de_identificadores3> inválido",
                "esperado identificador break do else end if print println readln while", //  "<lista_comando1> inválido",
                "esperado , )", //  "<lista_expressao1> inválido",
                "esperado identificador break do if print println readln val var", //  "<lista_de_instrucoes1> inválido",
                "esperado identificador break do if print println readln val var", //  "<lista_de_instrucoes2> inválido"
            };
}
