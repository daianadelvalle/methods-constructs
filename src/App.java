import ar.com.ada.oop.instantiation.Person;
import ar.com.ada.oop.overloading.Arithmetic;

public class App {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Daiana");
        Person person3 = new Person("Maria", "Ledesma");
        Person person4 = new Person("Laura", "Lopez", 35);

        person1.setName("Mora");
        person1.setLastName("Fernandez");
        person1.setAge(33);
        person2.setLastName("Delvalle");
        person2.setAge(25);
        person3.setAge(45);

        System.out.println("El nombre, apellido y edad de la persona 1 es: " + person1.getName() +", " + person1.getLastName() + ", " + person1.getAge());
        System.out.println("El nombre, apellido y edad de la persona 2 es: " + person2.getName() +", " + person2.getLastName() + ", " + person2.getAge());
        System.out.println("El nombre, apellido y edad de la persona 3 es: " + person3.getName() +", " + person3.getLastName() + ", " + person3.getAge());
        System.out.println("El nombre, apellido y edad de la persona 4 es: " + person4.getName() +", " + person4.getLastName() + ", " + person4.getAge());

        //SUMAS

        Arithmetic sum = new Arithmetic();

        //suma1
        int a = 6;
        int b = 5;
        int result1 = sum.sum(a, b);

        //suma2
        Integer a1 = 8;
        int b2 = 9;
        Integer result2 = sum.sum(a1,b2);

        //suma3
        double a3 = 0.5;
        double b3 = 2.3;
        double result3 = sum.sum(a3, b3);

        //suma4
        Double a4 = 0.8;
        double b4 = 6.8;
        Double result4 = sum.sum(0.8, 6.8);

        //Impresión de sumas
        System.out.println("La suma 1 da: " + result1);
        System.out.println("La suma 2 da: " + result2);
        System.out.println("La suma 3 da: " + result3);
        System.out.println("La suma 4 da: " + result4);








    }
}
