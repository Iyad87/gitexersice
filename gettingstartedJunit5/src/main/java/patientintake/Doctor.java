package patientintake;

public enum  Doctor {
  avery("Ralph Avery"),
  altoubah("Iyad Altoubah"),
  zain("Zain Altoubah");


    private String name;

    Doctor (String name){ this.name = name;}
    public String getName() {return name;}
}
