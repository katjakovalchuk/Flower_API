package ua.edu.ucu.apps.lab.flower;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab.delivery.Delivery;
import ua.edu.ucu.apps.lab.delivery.PostDeliveryStrategy;
import ua.edu.ucu.apps.lab.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab.payment.PayPalCreditStrategy;
import ua.edu.ucu.apps.lab.payment.Payment;

@RestController
@RequestMapping("/api/flowers/")
public class FlowerController {

    public final FlowerService flowerService;
    public Payment payment;
    public List orderList;
    public Delivery delivery;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("list/")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping("addFlower/")
    public void addFlower(@RequestBody Map<String, Object> jsonMap) {
        flowerService.addFlower(Flower.jsonToFlower(jsonMap));
    }

    @PostMapping("removeFlower/")
    public void removeFlower(@RequestBody Map<String, Object> jsonMap) {
        flowerService.removeFlower(Flower.jsonToFlower(jsonMap));
    }

    @PostMapping("addFlowerPack/")
    public void addFlowerPack(@RequestBody Map<String, Object> jsonMap) {
        flowerService.addFlowerPack(FlowerPack.jsonToFlowerpack(jsonMap));
    }

    @PostMapping("removeFlowerPack/")
    public void removeFlowerPack(@RequestBody Map<String, Object> jsonMap) {
        flowerService.removeFlowerPack(FlowerPack.jsonToFlowerpack(jsonMap));
    }

    @PostMapping("addFlowerBucket/")
    public void addFlowerBucket(@RequestBody Map<String, Object> jsonMap) {
        flowerService.addFlowerBucket(FlowerBucket.jsonToFlowerBucket(jsonMap));
    }

    @PostMapping("removeFlowerBucket/")
    public void removeFlowerBucket(@RequestBody Map<String, Object> jsonMap) {
        flowerService.removeFlowerBucket(FlowerBucket.jsonToFlowerBucket(jsonMap));
    }

    @PostMapping("setPaymentSystem/")
    public void setPaymentSystem(@RequestBody Map<String, Object> jsonMap) {
        if (jsonMap.get("paymentSystem") == "paypal") {
            payment = new PayPalCreditStrategy();
        }
        if (jsonMap.get("paymentSystem") == "creditCard") {
            payment = new CreditCardPaymentStrategy();
        }
    }

    @PostMapping("setDeliveryStrategy/")
    public void setDeliveryStrategy(@RequestBody Map<String, Object> jsonMap) {
        if (jsonMap.get("deliveryStrategy") == "DHL") {
            delivery = new DHLDeliveryStrategy();
        }
        if (jsonMap.get("deliveryStrategy") == "Post") {
            delivery = new PostDeliveryStrategy();
        }
    }

    @PostMapping("addOrder/")
    public void addOrder(@RequestBody Map<String, Object> jsonMap) {
        orderList.add(jsonMap.get("order"));
    }

    @PostMapping("removeOrder/")
    public void removeOrder(@RequestBody Map<String, Object> jsonMap) {
        orderList.remove(jsonMap.get("order"));
    }

}