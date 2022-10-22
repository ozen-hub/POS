package com.cmjd.batch96.POS.api;

import com.cmjd.batch96.POS.dto.CustomerDto;
import com.cmjd.batch96.POS.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public String saveCustomer(@RequestBody CustomerDto dto) {
        return customerService.saveCustomer(dto)+" saved!";
    }
    @PutMapping
    public String updateCustomer(@RequestBody CustomerDto dto) {
        return customerService.updateCustomer(dto)+" Updated!";
    }

    @DeleteMapping
    public String deleteCustomer(@RequestParam String id) {
        return customerService.deleteCustomer(id);
    }

    @GetMapping("/{id}")
    public String getCustomer(@PathVariable String id) {
        return "get customer : "+id;
    }

    @GetMapping("/list")
    public String getAllCustomers(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String searchText) {
        return "get All Customers Page : "+page+" : size = "+size+" Search Text : "+searchText;
    }
}
