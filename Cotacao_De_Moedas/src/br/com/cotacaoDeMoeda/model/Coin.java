package br.com.cotacaoDeMoeda.model;

public enum Coin {
	   USD("Dólar Americano"),
	    EUR("Euro"),
	    GBP("Libra Esterlina"),
	    JPY("Iene Japonês"),
	    AUD("Dólar Australiano"),
	    CAD("Dólar Canadense"),
	    CHF("Franco Suíço"),
	    CNY("Yuan Chinês"),
	    SEK("Coroa Sueca"),
	    NZD("Dólar Neozelandês"),
	    MXN("Peso Mexicano"),
	    SGD("Dólar de Singapura"),
	    HKD("Dólar de Hong Kong"),
	    NOK("Coroa Norueguesa"),
	    TRY("Lira Turca"),
	    RUB("Rublo Russo"),
	    INR("Rupia Indiana"),
	    ZAR("Rand Sul-africano"),
	    DKK("Coroa Dinamarquesa"),
	    PLN("Zloty Polonês"),
	    TWD("Novo Dólar Taiwanês"),
	    THB("Baht Tailandês"),
	    HUF("Florim Húngaro"),
	    ILS("Novo Shekel Israelense"),
	    CLP("Peso Chileno"),
	    PHP("Peso Filipino"),
	    AED("Dirham dos Emirados Árabes Unidos"),
	    COP("Peso Colombiano"),
	    SAR("Rial Saudita"),
	    MYR("Ringgit Malaio"),
	    PEN("Sol Peruano");

	private final String coinName;
	
	Coin(String coinName) {
		this.coinName = coinName;
	}
	
	public String getCoinSigla() {
		return this.name();
	}
	
	@Override
	public String toString() {
		return this.coinName;
		
	}


}
