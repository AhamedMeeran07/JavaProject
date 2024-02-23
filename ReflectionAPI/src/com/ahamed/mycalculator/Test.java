package com.ahamed.mycalculator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		try {
			Class<?> myClass = Class.forName(Calculator.class.getName());
			System.out.println(myClass.getName());
			Constructor<?>[] constructors = myClass.getConstructors();
			System.out.println(Arrays.toString(constructors));
			System.out.println(Arrays.toString(myClass.getMethods()));

			Constructor<?> constructor = myClass.getConstructor(double.class, double.class);
			Object myObj = constructor.newInstance(5, 8);

			Method setNum1 = myClass.getMethod("setNum1", double.class);
			setNum1.invoke(myObj, 7);
			Method setNum2 = myClass.getMethod("setNum2", double.class);
			setNum2.invoke(myObj, 9);

			Method getNum1 = myClass.getMethod("getNum1", null);
			System.out.println(getNum1.invoke(myObj, null));
			Method getNum2 = myClass.getMethod("getNum2", null);
			System.out.println(getNum2.invoke(myObj, null));

			Method method1 = myClass.getMethod("setAdd", double.class, double.class);
			method1.invoke(myObj, 10, 5);
			Method method2 = myClass.getMethod("getAdd", null);
			System.out.println(method2.invoke(myObj, null));

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
