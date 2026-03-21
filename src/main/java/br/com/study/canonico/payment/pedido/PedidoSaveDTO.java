package br.com.study.canonico.payment.pedido;

import br.com.study.canonico.payment.pagamento.PagamentoDTO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class PedidoSaveDTO extends PedidoDTO {

    private PagamentoDTO pagamento;

    private List<ItemPedidoDTO> itemPedidos;

    public PedidoSaveDTO(LocalDateTime instante, PagamentoDTO pagamento, Long clienteId, Long enderecoId, Set<ItemPedidoDTO> itemPedidos) {
        super(instante, pagamento, clienteId, enderecoId, itemPedidos);
    }
}
