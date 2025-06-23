package in.pwskills.akash.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private int oid;
	private String name;
	private boolean delivered;
	private String desc;
}
