package contracts

import com.thoughtworks.mstorderservice.Repository.ShoppingCartItemRepository
import com.thoughtworks.mstorderservice.entity.ShoppingCartItem
import org.springframework.beans.factory.annotation.Autowired

class ShoppingCartExampleBase extends ContractBase {

    @Autowired
    private ShoppingCartItemRepository shoppingCartItemRepository

    ShoppingCartItem[] shoppingCartItems = [
            new ShoppingCartItem(1L, 1111, 4444, 1),
            new ShoppingCartItem(2L, 2222, 5555, 3),
            new ShoppingCartItem(3L, 3333, 6666, 5),
    ]

    protected void prepareData() {
        for (ShoppingCartItem item : shoppingCartItems) {
            shoppingCartItemRepository.save(item)
        }
    }
}
