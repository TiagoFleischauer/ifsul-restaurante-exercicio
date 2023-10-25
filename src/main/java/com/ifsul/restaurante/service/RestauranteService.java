package com.ifsul.restaurante.service;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifsul.restaurante.model.Restaurante;
import com.ifsul.restaurante.repository.RestauranteRepository;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class RestauranteService {
    @Autowired
    private RestauranteRepository restauranteRepository;


    @Operation(summary = "Retorna uma lista de restaurantes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorna um array com os restaurantes encontrados",
                    content = { @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Restaurante.class))) })
    })
    @GetMapping
    public List<Restaurante> listarRestaurantes() {
        return this.listarRestaurantes();
    }

    @Operation(summary = "Cria um restaurante")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Cria um novo restaurante",
                    content = { @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Restaurante.class))) })
    })
    @GetMapping
    public Restaurante criarRestaurante(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    @Operation(summary = "Busca um restaurante por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorna o restaurante com o ID fornecido",
                    content = { @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Restaurante.class))) })
    })
    @GetMapping
    public Restaurante buscarRestaurantePorId(Long id) {
        return restauranteRepository.findById(id).orElse(null);
    }

    @Operation(summary = "Deleta um resturante")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Deleta um restaurante com o ID fornecido",
                    content = { @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Restaurante.class))) })
    })
    @GetMapping
    public void deletarRestaurante(Long id) {
        restauranteRepository.deleteById(id);
    }

    @Operation(summary = "Busca um restaurante por nome")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorna o restaurante com o nome fornecido",
                    content = { @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Restaurante.class))) })
    })
    @GetMapping
    public List<Restaurante> buscarRestaurantesPorNome(String nome) {
        return restauranteRepository.findByNomeContaining(nome);
    }

    @Operation(summary = "Busca um restaurante por endereço")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorna o restaurante com o endereço fornecido",
                    content = { @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Restaurante.class))) })
    })
    @GetMapping
    public List<Restaurante> buscarRestaurantesPorEndereco(String endereco) {
        return restauranteRepository.findByEnderecoContaining(endereco);
    }

    @Operation(summary = "Busca um restaurante por tipo de cozinha")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorna o restaurante com o tipo de cozinha fornecido",
                    content = { @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Restaurante.class))) })
    })
    @GetMapping
    public List<Restaurante> buscarRestaurantesPorTipoCozinha(String tipoCozinha) {
        return restauranteRepository.findByTipoCozinhaContaining(tipoCozinha);
    }
    
    
}
