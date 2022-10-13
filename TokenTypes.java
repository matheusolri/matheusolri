package main;

public enum TokenTypes {
    MAIN_ID(1),
    IF_ID(2),
    ELSE_ID(3),
    WHILE_ID(4),
    DO_ID(5),
    FOR_ID(6),
    INT_ID(7),
    FLOAT_ID(8),
    CHAR_ID(9),
    IDENTIFICADOR(10),
    DIFERENTE(11),
    MENOR_IGUAL(12),
    MENOR(13),
    MAIOR_IGUAL(14),
    MAIOR(15),
    ABRE_PARENTESES(16),
    FECHA_PARENTESES(17),
    ABRE_CHAVE(18),
    FECHA_CHAVE(19),
    VIRGULA(20),
    PONTO_VIRGULA(21),
    SOMA(22),
    SUBTRACAO(23),
    MULTIPLICACAO(24),
    IGUAL(25),
    ATRIBUICAO(26),
    DIVISAO(27),
    EOF(28),
    INT(29),
    FLOAT(30),
    PRINT(31),
    CHAR(32),
    ASPAS(33),
    ABRE_COLCHETE(34),
    FECHA_COLCHETE(35),
    AND(36),
    OR(37),
    STRLEN(38);

    public final int valor;

    TokenTypes(int valor) {
        this.valor = valor;
    }

    public int getNumber() {
        return this.valor;
    }

}
