package br.com.study.canonico.payment.pedido;

import br.com.study.canonico.generic.AbstractId;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class ItemPedidoDTO extends AbstractId<Long> {

    private Integer quantidade;

}
