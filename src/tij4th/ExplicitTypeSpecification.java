package tij4th;
import java.util.List;
import java.util.Map;
import typeinfo.pets.Pet;
public class ExplicitTypeSpecification{
	static void f(Map<Person,List<Pet>> petPeople) {}
	public static void main(String[] args) {
		f(New.<Person,List<Pet>>map());
	}
}