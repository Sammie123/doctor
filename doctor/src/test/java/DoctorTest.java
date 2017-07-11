import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class DoctorTest {


  @Test
  public void Doctor_instanceOfDoctorClass_true() {
    Doctor myDoctor = new Doctor("","");
    assertEquals(true, myDoctor instanceof Doctor);
  }
 
  @Test
  public void Doctor_returnDoctorsName_name() {
    Doctor myDoctor = new Doctor("James","");
    assertEquals("James", myDoctor.getName());
  }

  @Test
  public void Docotr_returnSpecialty_specialty() {
    Doctor myDoctor = new Doctor("James", "Oncology");
    assertEquals("Oncology", myDoctor.getSpecialty());
  }
}
