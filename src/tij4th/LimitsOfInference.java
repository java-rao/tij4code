package tij4th;
import java.util.List;
import java.util.Map;
import typeinfo.pets.Pet;
public class LimitsOfInference{
	static void f(Map<Person,List<? extends Pet>> petPeople) {}
	public static void main(String[] args) {
		f(New.map());
	}
}