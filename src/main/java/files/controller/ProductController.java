package files.controller;

import files.product.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String returnProductJson(){
        Product product = new Product(1,"Product-1",100);
        return product.toString();
    }

    @GetMapping(value = "/xml",produces = "applicaton/xml")
    public String returnProductXml(){
        Product product = new Product(5,"Product-2",1000);
        return product.toString();
    }

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(){
        return "test";
    }
}
