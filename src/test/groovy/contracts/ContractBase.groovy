package contracts

import com.thoughtworks.mstorderservice.MstOrderServiceApplication
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.Before
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.context.WebApplicationContext

@RunWith(SpringRunner.class)
@SpringBootTest(classes = [MstOrderServiceApplication.class])
@AutoConfigureStubRunner
abstract class ContractBase {

    @Autowired
    private WebApplicationContext wac

    @Before
    void setup() {
        RestAssuredMockMvc.webAppContextSetup(wac)
        prepareData()
    }

    protected void prepareData() {
    }
}
