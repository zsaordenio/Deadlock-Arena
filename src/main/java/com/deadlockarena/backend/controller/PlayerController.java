package com.deadlockarena.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deadlockarena.backend.dto.PlayerDto;
import com.deadlockarena.backend.entity.Player;
import com.deadlockarena.backend.service.Microservice;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Provides REST-API information for Player model show in SwaggerUI.
 *
 * @author zsaordenio
 *
 */
@RestController
@RequestMapping("/rest")
public class PlayerController {

	@Autowired
	private Microservice microservice;

	@ApiOperation(value = "Retrieve login info.", response = Player.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully logged in.") ,
			@ApiResponse(code = 404, message = "Username and Password are not found.") })
	@GetMapping("/login")
	public PlayerDto getPlayerForLogin(final String username, final String password) {
		return this.microservice.getPlayerForLogin(username, password);
	}

	@ApiOperation(value = "Get all Players.", response = Player.class, responseContainer = "List")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved all Players.") ,
			@ApiResponse(code = 404, message = "No players are present.") })
	@GetMapping("/allPlayers")
	public List<PlayerDto> getAllPlayers() {
		return this.microservice.getAllPlayers();
	}

	@ApiOperation(value = "Create a new Player.", response = Player.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created Player.") ,
			@ApiResponse(code = 400, message = "Username already exsits.") })
	@PostMapping("/player")
	public PlayerDto newPlayer(@RequestBody final PlayerDto playerDto) {
		return this.microservice.newPlayer(playerDto);
	}
}
