package br.com.study.canonico.heroservice;

import br.com.study.canonico.generic.AbstractId;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HeroDTO extends AbstractId<Long> { // Herda seu CRUD genérico

    @NotBlank(message = "O nome do herói é obrigatório")
    @Size(min = 3, max = 20, message = "O nome deve ter entre 3 e 20 caracteres")
    private String name;

    @NotNull(message = "A classe é obrigatória")
    private String heroClass;

    @Min(1)
    private Integer level = 1;

    @PositiveOrZero
    private Integer experience = 0;

    // Atributos de Status
    @NotNull
    private Integer currentHp;

    @NotNull
    private Integer maxHp;

    @NotNull
    private Integer strength;

    @NotNull
    private Integer intelligence;

    @NotNull
    private Integer dexterity;

    private boolean alive = true;

}