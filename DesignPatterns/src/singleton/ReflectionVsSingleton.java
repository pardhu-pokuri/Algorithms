package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionVsSingleton {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		EagerSingleton firstInstance = EagerSingleton.getInstance();
		EagerSingleton secondInstance = null;
		
		Constructor<?>[] declaredConstructors = EagerSingleton.class.getDeclaredConstructors();
		for (Constructor<?> constructor : declaredConstructors) {
			constructor.setAccessible(true);
			secondInstance = (EagerSingleton) constructor.newInstance();
		}
		
		System.out.println(firstInstance == secondInstance);
		System.out.println(firstInstance);
		System.out.println(secondInstance);
	}
	
}
