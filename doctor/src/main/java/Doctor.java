import java.util.List;
import java.util.ArrayList;
import org.sql2o.*;

public class Doctor {
  private String name;
  private String specialty;
  private static List<Doctor> instances = new ArrayList<Doctor>();
  private List<Patient> mPatients;

  public Doctor(String name, String specialty) {
    this.name = name;
    this.specialty = specialty;
    instances.add(this);
    mPatients = new ArrayList<Patient>();
  }

  public String getName() {
    return name;
  }

  public String getSpecialty() {
    return specialty;
  }

  public static List<Doctor> all() {
    return instances;
  }

  public List<Patient> getPatients() {
    return mPatients;
  }

  public void addPatient(Patient patient) {
    mPatients.add(patient);
  }
}
