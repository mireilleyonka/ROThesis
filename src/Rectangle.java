public class Rectangle {
    public double longueur;
    public double largeur;
    public String Nom;

    public Rectangle(String Nom, double longueur, double largeur) {

        this.Nom = Nom;
        this.longueur = longueur;
        this.largeur = largeur;

    }

    public double perimetre()
    {
        return 2 * (longueur + largeur);
    }
    public double surface () {
        return  longueur * largeur;
    }
}
