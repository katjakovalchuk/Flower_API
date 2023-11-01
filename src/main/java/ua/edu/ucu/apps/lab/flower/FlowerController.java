package ua.edu.ucu.apps.lab.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.lab.delivery.Delivery;
import ua.edu.ucu.apps.lab.payment.Payment;

@Getter
@Setter
@RestController
@RequestMapping("/api/flowers/")
public class FlowerController {

    private final FlowerService flowerService;
    private Payment payment;
    private List orderList;
    private Delivery delivery;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("list/")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }}

//     @PostMapping("addFlower/")
//     public void addFlower(@RequestBody Map<String, Object> jsonMap) {
//         flowerService.addFlower(Flower.jsonToFlower(jsonMap));
//     }

//     @PostMapping("removeFlower/")
//     public void removeFlower(@RequestBody Map<String, Object> jsonMap) {
//         flowerService.removeFlower(Flower.jsonToFlower(jsonMap));
//     }

//     @PostMapping("addFlowerPack/")
//     public void addFlowerPack(@RequestBody Map<String, Object> jsonMap) {
//         flowerService.addFlowerPack(FlowerPack.jsonToFlowerpack(jsonMap));
//     }

//     @PostMapping("removeFlowerPack/")
//     public void removeFlowerPack(@RequestBody Map<String, Object> jsonMap) {
//         flowerService.removeFlowerPack(FlowerPack.jsonToFlowerpack(jsonMap));
//     }

//     @PostMapping("addFlowerBucket/")
//     public void addFlowerBucket(@RequestBody Map<String, Object> jsonMap) {
//         flowerService.addFlowerBucket(
//                 FlowerBucket.jsonToFlowerBucket(jsonMap));
//     }

//     @PostMapping("removeFlowerBucket/")
//     public void removeFlowerBucket(@RequestBody Map<String, Object> jsonMap) {
//         flowerService.removeFlowerBucket(
//                 FlowerBucket.jsonToFlowerBucket(jsonMap));
//     }

//     @PostMapping("setPaymentSystem/")
//     public void setPaymentSystem(@RequestBody Map<String, Object> jsonMap) {
//         if (jsonMap.get("paymentSystem").equals("paypal")) {
//             payment = new PayPalCreditStrategy();
//         }
//         if (jsonMap.get("paymentSystem").equals("creditCard")) {
//             payment = new CreditCardPaymentStrategy();
//         }
//     }

//     @PostMapping("setDeliveryStrategy/")
//     public void setDeliveryStrategy(@RequestBody Map<String, Object> jsonMap) {
//         if (jsonMap.get("deliveryStrategy").equals("DHL")) {
//             delivery = new DHLDeliveryStrategy();
//         }
//         if (jsonMap.get("deliveryStrategy").equals("Post")) {
//             delivery = new PostDeliveryStrategy();
//         }
//     }

//     @PostMapping("addOrder/")
//     public void addOrder(@RequestBody Map<String, Object> jsonMap) {
//         orderList.add(jsonMap.get("order"));
//     }

//     @PostMapping("removeOrder/")
//     public void removeOrder(@RequestBody Map<String, Object> jsonMap) {
//         orderList.remove(jsonMap.get("order"));
//     }

// }