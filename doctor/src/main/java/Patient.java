import java.util.List;
import java.util.ArrayList;
import org.sql2o.*;
import java.time.LocalDateTime;

public class Patient {
  private String name;
  private String birthdate;
  private int id;

  public Patient (String name, String birthdate) {
    this.name = name;
    this.birthdate = birthdate;
  }

  public String getName() {
    return name;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public int getId() {
    return id;
  }

  // public static Patient find(int id) {
  // }

  public static List<Patient> all() {
    String sql = "SELECT id, description FROM patients";
    try(Connection con = DB.sql2o.open()) {
      return con.createQuery(sql).executeAndFetch(Patient.class);
    }
  }
}
