package com.compilador.model.compiler;

public interface ParserConstants {

    int START_SYMBOL = 49;

    int FIRST_NON_TERMINAL = 49;
    int FIRST_SEMANTIC_ACTION = 74;

    int[][] PARSER_TABLE
            = {
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 19, -1, -1, -1, -1, -1, -1, -1, 19, -1, 19, -1, -1, -1, -1, -1, 19, -1, -1, 19, 19, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 1, -1, -1, -1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, -1, 1, -1, -1, 1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 27, -1, -1, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
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
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, 49, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
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
                {17, 20, 38, 52, 39},
                {73, 72},
                {52},
                {0},
                {61},
                {62},
                {54},
                {33, 64, 68},
                {31, 63, 35},
                {31, 63, 35},
                {35},
                {26, 51, 67},
                {27, 51, 67},
                {55},
                {56},
                {58},
                {59},
                {57},
                {10, 35},
                {54, 70},
                {50},
                {0},
                {23, 36, 66, 51, 37, 35},
                {6, 34},
                {0},
                {21, 36, 53, 37, 35},
                {22, 36, 53, 37, 35},
                {65, 71},
                {34, 53},
                {0},
                {18, 36, 65, 37, 50, 60, 14, 35},
                {13, 50},
                {0},
                {12, 50, 28, 36, 65, 37, 14, 35},
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
                {2, 31, 65, 35},
                {2, 69},
                {0},
                {34, 51},
                {0}
            };

    String[] PARSER_ERROR
            = {
                "",
                "esperado EOF",
                "esperado identificador",
                "esperado int",
                "esperado float",
                "esperado char",
                "esperado string",
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
                "esperado fun", //     "<programa> inválido",
                "esperado identificador break do if print println readln ",//     "<lista_comando> inválido",
                "esperado identificador", //     "<lista_de_identificadores> inválido",
                "esperado identificador break do if print println readln val var  ", //     "<lista_de_instrucoes> inválido",
                "esperado , )", //     "<lista_expressao> inválido",
                "esperado identificador break do if print println readln ", //     "<comando> inválido",
                "esperado identificador ", //     "<comando_atribuicao> inválido",
                "esperado readln", //     "<comando_entrada> inválido",
                "esperado do ", //     "<comando_repeticao> inválido",
                "esperado print println", //     "<comando_saida> inválido",
                "esperado if", //     "<comando_selecao> inválido",
                "esperado else end", //     "<selecao_opcional> inválido",
                "esperado val", //     "<declaracao_constantes> inválido",
                "esperado var", //     "<declaracao_variaveis> inválido",
                "esperado int float char string false true", //     "<valor> inválido",
                "esperado boolean char float int", //     "<tipo> inválido",
                "esperado , ; )", //     "<expressao> inválido",
                "esperado identificador string ", //     "<entrada_opcional> inválido",
                "esperado = :", //     "<lista_de_identificadores1> inválido",
                "esperado = ;", //     "<lista_de_identificadores2> inválido",
                "esperado = : , )", //     "<lista_de_identificadores3> inválido",
                "esperado identificador break do else end if print println readln while", //     "<lista_comando1> inválido",
                "esperado , )", //     "<lista_expressao1> inválido",
                "esperado identificador break do if print println readln val var }", //     "<lista_de_instrucoes1> inválido",
                "esperado identificador break do if print println readln val var",//     "<lista_de_instrucoes2> inválido"
            };
}
