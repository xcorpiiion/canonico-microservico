package br.com.study.canonico.payment.produto;

import br.com.study.canonico.generic.AbstractId;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CategoriaDTO extends AbstractId<Long> {

    @NotEmpty(message = "Nome não pode estar vazia.")
    @NotBlank(message = "Nome não pode ter apenas espaços em branco.")
    @Length(min = 5, max = 80, message = "O tamanho deve ser entre 5 e 80 caracteres.")
    @NotNull(message = "Nome não pode ser null.")
    private String nome;

    @Size(min = 1, max = 255)
    private String descricao;

    private String imageId;

    private Set<ProdutoDTO> produtos = new HashSet<>();

}
