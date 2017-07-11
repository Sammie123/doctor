import org.sql2o.*;
import org.junit.*;
import java.time.LocalDateTime;
import static org.junit.Assert.*;

public class PatientTest {

  @Before
  public void setUp() {
    DB.sql2o = new Sql2o("jdbc:postgresql://localhost:4567/doctor_test", null, null);
  }

  @After
  public void tearDown() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM patients *;";
      con.createQuery(sql).executeUpdate();
    }
  }

//   @Test
//   public void Patient_instanceOfClass_true() {
//     Patient myPatient = new Patient("", "1985-09-01");
//     assertEquals(true, myPatient instanceof Patient);
//   }
//
//   @Test
//   public void Patient_returnName_name() {
//     Patient myPatient = new Patient("John", "1985-09-01");
//     assertEquals("John", myPatient.getName());
//   }
//
//   @Test
//   public void Patient_returnBirthdate_birthdate() {
//     Patient myPatient = new Patient("", "1985-09-01");
//     assertEquals("1985-09-01", myPatient.getBirthdate());
//   }
  @Test
  public void equals_returnsTrue() {
    Patient firstPatient = new Patient("Lincoln", "");
    Patient secondPatient = new Patient("Molly", "");
    assertTrue(firstPatient.equals(secondPatient));
  }

  @Override
  public boolean equals(Object otherPatient) {
    if(!(otherPatient instanceof Patient)) {
      return false;
    } else {
      Patient newPatient = (Patient) otherPatient;
      return this.getName().equals(newPatient.getName());
    }
  }

  @Test
  public void save_returnsTrueSame() {
    Patient myPatient = new Patient("","")
    myPatient.save();
    assertTrue(Patient.all().get(0).equals(myPatient));

  }





}
