public class Rectangle{
    longueur=saisir.nextFloat();
    System.out.println("Donner la longueur:");
    largeur=saisir.nextFloat();
    System.out.println("Donner la largeur:");

    
    float demi_perimetre=longeur+largeur;
    float perimetre=(longeur+largeur)*2;
    float surface=longeur*largeur;
    if ((longueur>largeur)&& (longeur>0 && largeur>0)){
        System.out.println("Le demi_perimetre est: "+demi_perimetre);
        System.out.println("Le perimetre est: " +perimetre);
        System.out.println("La surface est: " +surface);
    }
    else{
        System.out.println("erreur recommencer");
    }
   
}
