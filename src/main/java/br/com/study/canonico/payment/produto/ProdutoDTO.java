package br.com.study.canonico.payment.produto;

import br.com.study.canonico.generic.AbstractId;
import br.com.study.canonico.payment.pedido.ItemPedidoDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class ProdutoDTO extends AbstractId<Long> {

    @NotNull(message = "Nome deve pode está null.")
    @NotBlank(message = "Nome deve ser conter apenas caracteres em branco.")
    @NotEmpty(message = "Nome deve ser informado.")
    private String nome;

    private String imageId;

    @Size(min = 1, max = 255)
    private String descricao;

    @NotNull(message = "Preço deve ser informado.")
    private BigDecimal preco;

    private Set<ItemPedidoDTO> itemPedidos = new HashSet<>();

    @NotNull(message = "Categoria deve ser informada.")
    private List<Long> categoriasIds;

}
