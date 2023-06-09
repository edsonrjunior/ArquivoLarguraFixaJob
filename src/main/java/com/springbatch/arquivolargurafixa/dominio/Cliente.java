package com.springbatch.arquivolargurafixa.dominio;

import lombok.Data;
import org.springframework.batch.item.file.transform.Range;

@Data
public class Cliente {
    private String nome;
    private String sobrenome;
    private String idade;
    private String email;

    public static Range[] getClienteRangeLayout() {
        Range ranges[] = {new Range(1, 10), new Range(11, 20), new Range(21, 23), new Range(24, 43)};
        return ranges;
    }

    public static String[] getClienteColumnsLayout() {
        String columns[] = {"nome", "sobrenome", "idade", "email"};
        return columns;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + "'" +
                ", sobrenome ='" + sobrenome + "'" +
                ", idade='" + idade + "'" +
                ", email='" + email + "'" +
                '}';
    }
}