package com.example.testswagger.controllers;

import com.example.testswagger.dtos.TeamResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name="Controller-command", description = "HELLO WORLD")
@RestController
@RequestMapping(path = "/teams")
public class TeamsController {
    @Operation(method = "Get", summary = "Get All")
    @GetMapping("/get-all")
    public List<TeamResponseDto> getAll() {
        return List.of(
                new TeamResponseDto(1, "aaa", 2.5),
                new TeamResponseDto(2, "bbb", 4.3)
        );
    }

    @PostMapping(value = "/set-dto")
    public void addDto(@RequestBody TeamResponseDto teamResponseDto) {
        teamResponseDto.setId(3);
        teamResponseDto.setName("jopa");
        teamResponseDto.setRating(4.5);
    }
    @PutMapping(value = "/new")
    public void addNew(@RequestBody TeamResponseDto teamResponseDto){
        teamResponseDto.setId(4);
        teamResponseDto.setName("OLEG");
        teamResponseDto.setRating(5);
    }
}
