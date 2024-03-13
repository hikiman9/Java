import com.hana.data.CustDto;
import com.hana.exception.IdNotFoundException;
import com.hana.frame.Service;
import com.hana.service.CustService;

public class UpdateCustTest {
    public static void main(String[] args) {
        Service<String, CustDto> service = new CustService();

        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").name("James").build();
        System.out.println(custDto);
        try {
            service.modify(custDto);
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Error ... Contact us ...");
        }
    }
}
