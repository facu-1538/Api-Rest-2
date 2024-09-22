package dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class AutorDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String bibliografia;
}
