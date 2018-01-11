package shoppingCart.example

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/shopping-cart', {
            queryParameters {
                parameter userId: 1111
            }
        }
    }
    response {
        status 200
        headers {
            contentType('application/json')
        }
        body([
                [
                        userId: 1111,
                        goodsId: 4444,
                        count: 1,
                ],
        ])
    }
}