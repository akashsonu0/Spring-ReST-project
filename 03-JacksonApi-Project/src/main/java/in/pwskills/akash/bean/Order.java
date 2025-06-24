package in.pwskills.akash.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private Integer oid;
	
	private String name;
	
	private Boolean delivered;
	private String desc;
}
