package br.com.study.canonico.payment.pagamento;

import br.com.study.canonico.generic.AbstractId;
import br.com.study.canonico.payment.pedido.PedidoDTO;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PagamentoDTO extends AbstractId<Long> {

    private String enumEstadoPagamento;

    @Valid
    private PedidoDTO pedido;

}
