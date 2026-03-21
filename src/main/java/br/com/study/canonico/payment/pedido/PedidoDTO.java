package br.com.study.canonico.payment.pedido;

import br.com.study.canonico.generic.AbstractId;
import br.com.study.canonico.payment.pagamento.PagamentoDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class PedidoDTO extends AbstractId<Long> {

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime instante;

    private PagamentoDTO pagamento;

    private Long clienteId;

    private Long enderecoId;

    private Set<ItemPedidoDTO> itemPedidos;

}
