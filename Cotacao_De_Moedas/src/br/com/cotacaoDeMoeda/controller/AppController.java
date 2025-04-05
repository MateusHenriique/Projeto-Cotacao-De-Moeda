package br.com.cotacaoDeMoeda.controller;

import br.com.cotacaoDeMoeda.connection.ConnectionAPI;

public class AppController {
	
	public static void cotationAction(String requestCoin, String responseCoin) {
		String json = ConnectionAPI.requestAPI(requestCoin, responseCoin);
		System.out.println(json);
	};
}
