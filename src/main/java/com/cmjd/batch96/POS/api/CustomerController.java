package com.cmjd.batch96.POS.api;

import com.cmjd.batch96.POS.dto.CustomerDto;
import com.cmjd.batch96.POS.dto.paginated.PaginatedCustomerResponseDTO;
import com.cmjd.batch96.POS.service.CustomerService;
import com.cmjd.batch96.POS.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<StandardResponse> saveCustomer(@RequestBody CustomerDto dto) {
        return new ResponseEntity<>(new StandardResponse(
                201,customerService.saveCustomer(dto)+" saved!",
                customerService.saveCustomer(dto)), HttpStatus.CREATED
        );
    }
    @PutMapping
    public ResponseEntity<StandardResponse> updateCustomer(@RequestBody CustomerDto dto) {
        return new ResponseEntity<>(new StandardResponse(
                201,customerService.updateCustomer(dto)+" Updated!",
                customerService.updateCustomer(dto)), HttpStatus.CREATED
        );
    }

    @DeleteMapping
    public String deleteCustomer(@RequestParam String id) {
        return customerService.deleteCustomer(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StandardResponse> getCustomer(@PathVariable String id) {
        return new ResponseEntity<>(new StandardResponse(
                200,"Customer Data",
                customerService.getCustomer(id)), HttpStatus.OK
        );
    }

    @GetMapping("/list")
    public PaginatedCustomerResponseDTO getAllCustomers(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String searchText) {
        return customerService.getAllCustomers(page, size, searchText);
    }
}
