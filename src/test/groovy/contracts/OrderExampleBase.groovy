package contracts

import com.thoughtworks.mstorderservice.Repository.OrderRepository
import com.thoughtworks.mstorderservice.entity.Order
import org.springframework.beans.factory.annotation.Autowired

class OrderExampleBase extends ContractBase {

    @Autowired
    private OrderRepository orderRepository

    Order[] orders = [
            new Order(1L, 1111, "Beijing", "NotPaid"),
            new Order(2L, 2222, "Shanghai", "Paid"),
            new Order(3L, 3333, "Shenzhen", "Delivered"),
    ]

    protected void prepareData() {
        for (Order item : orders) {
             orderRepository.save(item)
        }
    }
}
