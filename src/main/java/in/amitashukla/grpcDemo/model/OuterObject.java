package in.amitashukla.grpcDemo.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class OuterObject {
	String var1;
	String var2;
	List<InnerObject> innerObjectVars;
	Map<String, InnerObject> inners;
}
