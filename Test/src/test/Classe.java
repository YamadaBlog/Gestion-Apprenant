package test;

import java.util.ArrayList;
import java.util.List;


class Classe {
    public List<Etudiant> etudiants;

    public Classe() {
        this.etudiants = new ArrayList<>();
    }

    public void addEtudiant(Etudiant etudiant) {
            etudiants.add(etudiant);
    }
    
    public void editAbsences(String mail, int absences) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getMail().equals(mail)) {
                etudiant.setAbsences(absences);
                break;
            }
        }
    }

    public void del(String mail) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getMail().equals(mail)) {
                etudiants.remove(etudiant);
                break;
            }
        }
    }

	public void orderAbsences() {
	    int n = etudiants.size();
	    for (int i=0; i<n-1; i++) {
	        for (int j=0; j<n-i-1; j++) {
	            if (etudiants.get(j).getAbsences() > etudiants.get(j + 1).getAbsences()) {
	                Etudiant temp = etudiants.get(j);
	                etudiants.set(j, etudiants.get(j + 1));
	                etudiants.set(j + 1, temp);}
	        }
	    }
	    for (Etudiant etudiant : etudiants) {
	        System.out.println(etudiant);
	    }
	}
	
    public int taux() {
        int totalAbsences = 0;
        for (Etudiant etudiant : etudiants) {
            totalAbsences += etudiant.getAbsences();
        }
        return totalAbsences / etudiants.size();
    }
    
    public void orderPrenom() {
    int n = etudiants.size();
    for (int i=0; i<n-1; i++) {
        for (int j=0; j<n-i-1; j++) {
            if (etudiants.get(j).getPrenom().compareTo(etudiants.get(j + 1).getPrenom()) > 0) {
                Etudiant temp = etudiants.get(j);
                etudiants.set(j, etudiants.get(j + 1));
                etudiants.set(j + 1, temp);}
        }
    }
    for (Etudiant etudiant : etudiants) {
        System.out.println(etudiant);
    }
}
}