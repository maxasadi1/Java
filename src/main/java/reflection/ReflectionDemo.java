package reflection;

import java.lang.reflect.*;

public class ReflectionDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Object personObject = new Person("Tomas", "Anderson", 30);

        //Create class from object
        Class<?> personClass = personObject.getClass();
        System.out.println("Class personClass: " + personClass.getName());

        //Create class from name of Object
        Class<?> personClassFromName = Class.forName("reflection.Person");
        System.out.println("Class personClassFromName: " + personClassFromName.getName());

        //Get class constructor from the class
        Constructor<?> constructor = personClassFromName.getConstructor();
        //Create person object with constructor of the person class
        Object personObjectFromCons = constructor.newInstance();
        if (personObjectFromCons instanceof Person){
            System.out.println("personObjectFromCons object is  instance of Person Class ");
        }

        //Get Person constructors
        Constructor<?>[] personConstructors = personClassFromName.getDeclaredConstructors();
        System.out.println("Person Constructors :");
        for (Constructor<?> personConstructor : personConstructors) {
            System.out.println(personConstructor);
        }

        //Get class Person fields
        Field[] personFields = personClassFromName.getDeclaredFields();
        System.out.println("Person Fields :");
        for (Field personField: personFields) {
            System.out.println(personField);
        }

        //Get class Person methods
        Method[] personMethods = personClassFromName.getDeclaredMethods();
        System.out.println("Person Methods :");
        for (Method personMethod: personMethods) {
            System.out.println(personMethod);
        }

        //Using parameterized constructor to create an object of the Person class
        Constructor<?> personParameterizedConstructor = personClassFromName.getDeclaredConstructor(String.class, String.class, int.class);
        Object person = personParameterizedConstructor.newInstance("David", "Wills", 20);
        if(person instanceof Person){
            System.out.println("An object of the Person class is created by using parameterized constructor");
        }

        //Get access to a private method of Person class
        Method getFullNameMethod = personClassFromName.getDeclaredMethod("getFullName");
        if(Modifier.isPrivate(getFullNameMethod.getModifiers())){
            getFullNameMethod.setAccessible(true);
        }
        System.out.println("Person full name is: " + getFullNameMethod.invoke(person));

    }

}
