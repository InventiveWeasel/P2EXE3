package exe03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ControllerFactory {
	public static Controller buildController(ControllerType type, User model, UserView view){
		Controller controller = null;
		try{
			String firstLetter = type.toString().substring(0,1);
			String rest = type.toString().substring(1).toLowerCase();
			Class<?> contClass = Class.forName("exe03."+firstLetter+rest+"Controller");
			Constructor<?> ctor = contClass.getDeclaredConstructor(User.class, UserView.class);
			ctor.setAccessible(true);
			controller=(Controller) ctor.newInstance(model,view);
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch(InstantiationException e){
			e.printStackTrace();
		} catch(IllegalAccessException e){
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return controller;
	}
}
