package com.tutofinder.app.controller;

import com.tutofinder.app.dto.CursoDto;
import com.tutofinder.app.dto.create.CreateCursoDto;
import com.tutofinder.app.exception.BookingException;
import com.tutofinder.app.response.BookingResponse;
import com.tutofinder.app.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/tutofinder")
public class CursoController {
    @Autowired
    CursoService cursoService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/curso/{cursoId}")
    public BookingResponse<CursoDto> getCursoById(@PathVariable Long cursoId)throws BookingException{
        return new BookingResponse<>("Success",String.valueOf(HttpStatus.OK),"OK",
                cursoService.getCursoById(cursoId));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/cursos")
    public BookingResponse<List<CursoDto>> getCursos() throws BookingException{
        return new BookingResponse<>("Success",String.valueOf(HttpStatus.OK),"OK",
                cursoService.getCursos());
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/curso")
    public BookingResponse<CursoDto> createCurso(@RequestBody @Valid CreateCursoDto createCursoDto)throws BookingException{
        return new BookingResponse<>("Success",String.valueOf(HttpStatus.OK),"OK",
                cursoService.createCurso(createCursoDto));
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/curso/{cursoId}")
    public BookingResponse<CursoDto> updateCurso(@PathVariable Long cursoId,@RequestBody @Valid CreateCursoDto createCursoDto)throws BookingException{
        return new BookingResponse<>("Success",String.valueOf(HttpStatus.OK),"OK",
                cursoService.updateCurso(createCursoDto,cursoId));
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/curso/{cursoId}")
    public BookingResponse<String> deleteCurso(@PathVariable Long cursoId)throws BookingException {
        return new BookingResponse<>("Success",String.valueOf(HttpStatus.OK),"OK",
                cursoService.deleteCurso(cursoId));
    }
}
