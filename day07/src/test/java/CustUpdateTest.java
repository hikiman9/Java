import com.hana.data.CustDto;
import com.hana.service.CustService;

public class CustUpdateTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        CustDto obj = CustDto.builder().id("id10").pwd("pwd33").name("Aden").build();
        try{
            service.modify(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
