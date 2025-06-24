package in.pwskills.akash.bean;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import in.pwskills.akash.serialize.CustomBalanceSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	private String accountNumber;
	private String bankName;
	
	@JsonSerialize(using = CustomBalanceSerializer.class)
	private BigDecimal balance;
}
