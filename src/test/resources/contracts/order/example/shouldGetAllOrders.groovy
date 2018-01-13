package order.example

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/order/all'
    }
    response {
        status 200
        headers {
            contentType('application/json')
        }
        body([
                [
                        userId: 1111,
                        address: "Beijing",
                        status: "NotPaid",
                ],
                [
                        userId: 2222,
                        address: "Shanghai",
                        status: "Paid",
                ],
                [
                        userId: 3333,
                        address: "Shenzhen",
                        status: "Delivered",
                ]
        ])
    }
}