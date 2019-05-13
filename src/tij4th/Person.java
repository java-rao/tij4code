package tij4th;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.InterfaceAddress;
import java.util.regex.Pattern;
/*import java.util.LinkedHashMap;
import java.util.Map;
import net.mindview.util.*;
public class Test {
	static class Petcounter extends LinkedHashMap<Class<? extends Pet>,Integer>{
		public Petcounter() {
			super(MapData.map(LiteralPetCreator.allTypes,0));
		}
		public void count(Pet pet) {
			for(Map.Entry<Class<? extends Pet>,Integer> pair:entrySet())
				if(pair.getKey().isInstance(pet))
					put(pair.getKey(),pair.getValue()+1);
		}
		public String toString() {
			StringBuilder result=new StringBuilder("{");
			for(Map.Entry<Class<? extends Pet>,Integer> pair:entrySet()) {
				result.append(pair.getKey().getSimpleName());
				result.append("=");
				result.append(pair.getValue());
				result.append(", ");
			}
			result.delete(result.length()-2,result.length());
			result.append("}");
			return result.toString();
		}
	}
	public static void main(String[] args) {
		Petcounter petCount=new Petcounter();
		for(Pet pet:Pets.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName()+" ");
			petCount.count(pet);
		}
		System.out.println();
		System.out.println(petCount);
	}
}*/
/*import java.util.HashMap;
import java.util.Map;
public class Test extends HashMap<Class<?>,Integer>{
	private Class<?> baseType;
	public Test(Class<?> baseType) {
		this.baseType=baseType;
	}
	public void count(Object obj) {
		Class<?> type=obj.getClass();
		if(!baseType.isAssignableFrom(type))
			throw new RuntimeException(obj+" incorrect type:"+type+
				",should be type or subtype of "+baseType);
		countClass(type);
	}
	private void countClass(Class<?> type) {
		Integer quantity=get(type);
		put(type,quantity==null?1:quantity+1);
		Class<?> superClass=type.getSuperclass();
		if(superClass!=null&&baseType.isAssignableFrom(superClass))
			countClass(superClass);
	}
	public String toString() {
		StringBuilder result=new StringBuilder("{");
		for(Map.Entry<Class<?>,Integer> pair:entrySet()) {
			result.append(pair.getKey().getSimpleName());
			result.append("=");
			result.append(pair.getValue());
			result.append(", ");
		}
		result.delete(result.length()-2,result.length());
		result.append("}");
		return result.toString();
	}
}*/
class Person{
	public final String first;
	public final String last;
	public final String address;
	public Person(String first,String last,String address) {
		this.first=first;
		this.last=last;
		this.address=address;
	}
	public String toString() {
		return "Person:"+first+" "+last+" "+address;
	}
	public static class NullPerson extends Person implements Null{
		private NullPerson() {super("None","None","None");}
		public String toString() {return "NullPerson";}
	}
	public static final Person NULL=new NullPerson();
}