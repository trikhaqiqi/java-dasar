public class MethodParameter {
  public static void main(String[] args) {


    sayHello("Ilyas", "Tri");
    sayHello("Maman", "Cuprit");
    sayHello("Memen", "Cupcup");

  }

  static void sayHello(String firstName, String lastName){
    System.out.println("Hello " + firstName + " " + lastName);
  }
}
