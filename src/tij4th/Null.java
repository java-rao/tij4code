package tij4th;
/*public class Text {
	public static void main(String[] args) {
		Test counter=new Test(Pet.class);
		for(Pet pet:Pets.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName()+" ");
			counter.count(pet);
		}
		System.out.println();
		System.out.println(counter);
	}
}*/
/*class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	public DynamicProxyHandler(Object proxied) {
		this.proxied=proxied;
	}
	public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
		System.out.println("**** proxy: "+proxy.getClass()+", method: "+method+", args: "+args);
		if(args!=null)
			for(Object arg:args)
				System.out.println(" "+arg);
		return method.invoke(proxied,args);
	}
}
class Text{
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		RealObject real=new RealObject();
		consumer(real);
		Interface proxy=(Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(),new Class[]{Interface.class},new DynamicProxyHandler(real));
		consumer(proxy);
	}
}*/
public interface Null{}