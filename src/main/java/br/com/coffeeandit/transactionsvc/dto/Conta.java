package br.com.coffeeandit.transactionsvc.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Conta {
private static final long serialVersionUID = 2806412403585360625L;

    @NotNull(message = "Informar o código da Agência.")
    private Long codigoAgencia;
    
    @NotNull(message = "Informar o código da Conta.")
    private Long codigoConta;

}
