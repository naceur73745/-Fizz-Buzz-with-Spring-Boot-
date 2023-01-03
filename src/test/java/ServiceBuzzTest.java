import com.example.fizzbuzz.ServiceBuzz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;

public class ServiceBuzzTest {
    @ExtendWith(SpringExtension.class)
    @SpringBootTest
    public class BuzzServiceTest {
        //creation of fake mock object
        @MockBean
        private ServiceBuzz buzzService;

        @Test
        void itShouldReturnJSONObject() {
            int randomParameter = (int) Math.random();
            ArrayList<String> result = buzzService.fizzBuzz(randomParameter);
            assert(!result.isEmpty());
            assert(result.size() == randomParameter);

        }
    }
}
