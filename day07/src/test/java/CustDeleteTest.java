import com.hana.data.CustDto;
import com.hana.service.CustService;

public class CustDeleteTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        try{
            service.remove("id10");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
