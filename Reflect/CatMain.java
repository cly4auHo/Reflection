package less08;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CatMain {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Cat cat=new Cat();
		Cat cat2=new Cat();
		Class clazz = less08.Cat.class;
		//Class clazz = cat.getClass();
		try {
			System.out.println(clazz.getField("name").get(cat).toString());
			clazz.getField("name").set(cat, "Bobr");
			System.out.println(cat);
			Field field=clazz.getDeclaredField("bread");
			field.setAccessible(true);
			System.out.println(field.get(cat).toString());
			field.set(cat, "Hello, Private");
			System.out.println(cat);
			
			try {
				Method method=clazz.getMethod("methodPublicVoid");
				method.invoke(cat);
				System.out.println(method);
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Field[] fields=clazz.getFields();
//		System.out.println(fields[0].getType().getSimpleName());
//		System.out.println(Arrays.toString(clazz.getMethods()));
//		s(clazz);
		//clazz.geta
	}
	static void s(Class clazz) {
		Field[] fields=clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println("Name: "+field.getName());
			System.out.println("\tType: "+field.getType().getSimpleName());
//			System.out.println(field.isAnnotationPresent(MyAnno2.class));
//			System.out.println(field.getAnnotation(MyAnno2.class).val());
//			for(Annotation a : field.getAnnotations()) {
//				
//				//System.out.println(a.annotationType().getMethods()[1].);
//			}
		}
	}

}
