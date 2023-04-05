import com.temmytechie.interfaceImpl.IsbnNumberGenerator;
import com.temmytechie.interfaceImpl.IssnGenerator;
import com.temmytechie.service.BookService;

/**
 * @author TemmyTechie
 */

public class BookApplication {

    public static void main(String[] args) {

        BookService service = new BookService(new IsbnNumberGenerator());
        BookService service1 = new BookService(new IssnGenerator());


        System.out.println("# " + service.createBook("Get Rich or die Trying"));
        System.out.println("# " + service1.createBook("Rich dad, poor dad"));


    }
}
