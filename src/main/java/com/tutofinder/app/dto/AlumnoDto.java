package com.tutofinder.app.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AlumnoDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String gradoEstudio;
    private Long padreId;
    private String dni;
    private String correo;
    private byte[] foto;
    private List<TutoriaDto> tutorias;
    private Date createAt;
}
