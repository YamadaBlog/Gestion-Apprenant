package test;

class Etudiant {
    private String prenom;
    private String mail;
    private int absence;

    public Etudiant(String prenom, String mail) {
        this.prenom = prenom;
        this.mail = mail;
        this.absence = 0;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public int getAbsences() {
        return absence;
    }

    public void setAbsences(int absence) {
        this.absence = absence;
    }
}