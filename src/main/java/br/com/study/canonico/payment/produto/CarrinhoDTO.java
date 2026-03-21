package br.com.study.canonico.payment.produto;

import br.com.study.canonico.generic.AbstractId;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CarrinhoDTO  extends AbstractId<Long> {

    private ProdutoDTO produtoDTO;

    private Long quantidade;

    private Long userId;

}
