package currencyExchange;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class CurrencyExchange {

	
	@Id
	private long id;
	
	@Column (name = "currency_from")
	private String from;
	@Column (name = "currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	
	@Transient
	private String enviroment;

	public CurrencyExchange(long id, String from, String to, BigDecimal conversionMultiple, String enviroment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.enviroment = enviroment;
	}

	
	public CurrencyExchange() {
		super();
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public String getEnviroment() {
		return enviroment;
	}

	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}
	
	
	
}
