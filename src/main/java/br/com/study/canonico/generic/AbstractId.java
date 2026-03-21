package br.com.study.canonico.generic;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractId<ID> {

    protected ID id;

    // Formato de hora corrigido (HH) e uso do ZonedDateTime nativo do Java
    @NotNull(message = "Create date can not be null")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private ZonedDateTime createDate;
}
