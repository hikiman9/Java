import com.hana.data.CustDto;
import com.hana.service.CustService;

import java.util.List;

public class CustSelectAllTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        try{
            List<CustDto> result = service.get();
            System.out.println(result.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
