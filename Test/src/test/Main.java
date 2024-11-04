package test;

public class Main {
    public static void main(String[] args) {
    	
        Classe classe = new Classe();

        Etudiant studentn1e = new Etudiant("pat","yu@testuseset.com");
        Etudiant studentn = new Etudiant("fac","uy@testuseset.com");
        Etudiant studentnn = new Etudiant("nuiitt", "fr@");

        classe.addEtudiant(studentn1e);
        classe.addEtudiant(studentn);
        classe.addEtudiant(studentnn);
        
        for(Etudiant etudiant : classe.etudiants) {
        	System.out.println( "List :" + etudiant);
        }
        
        classe.editAbsences("yu@testuseset.com", 2);
        classe.editAbsences("uy@testuseset.com", 3);
        classe.editAbsences("fr@", 1);
        
        System.out.println("Trie absences :");
        classe.orderAbsences();

        System.out.println("Trie par prenom :");
        classe.orderPrenom();

        System.out.println("Taux d'absence : " + classe.taux());
        
        System.out.println("Delelte : ");
        classe.del(studentn.getMail());
        
        for(Etudiant etudiant : classe.etudiants) {
        	System.out.println(etudiant);
        }
        
    }
}