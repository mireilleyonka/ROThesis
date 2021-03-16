 public class HelloWord {

     public static void main(String[] args) {

         System.out.println("hello word , bonjour le monde ");

         Rectangle rec = new Rectangle("Rectangle", 20.0, 15.0);

         System.out.println(rec.perimetre() + ";" + rec.surface());
       //  rec.PrintRectangle();
         System.out.println("voici de nouvelle modifications que j'apporte a votre projet");
         Triangle tri = new Triangle("triangle", 20.0, 15.5, 35.5);
         System.out.println("Perimetre du triangle est : " + tri.perimetre());
     }
 }