package in.amitashukla.grpcDemo.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class InnerObject {
	String var1;
	String var2;
	int var3;
	List<String> stringVars;
	Map<String, InnerObject2> inners;
}
