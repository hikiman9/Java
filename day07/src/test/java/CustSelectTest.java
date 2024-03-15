import com.hana.data.CustDto;
import com.hana.service.CustService;

import java.util.List;

public class CustSelectTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        try{
            CustDto result = service.get("id01");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
