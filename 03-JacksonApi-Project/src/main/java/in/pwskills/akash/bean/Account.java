package in.pwskills.akash.bean;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	private String accountNumber;
	private String bankName;
	private BigDecimal balance;
}
