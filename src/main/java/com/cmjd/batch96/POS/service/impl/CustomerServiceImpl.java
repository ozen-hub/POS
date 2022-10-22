package com.cmjd.batch96.POS.service.impl;

import com.cmjd.batch96.POS.dto.CustomerDto;
import com.cmjd.batch96.POS.entity.Customer;
import com.cmjd.batch96.POS.repo.CustomerRepo;
import com.cmjd.batch96.POS.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CustomerServiceImpl implements CustomerService {

    //@Autowired
    private final CustomerRepo repo;

    public CustomerServiceImpl(CustomerRepo repo) {
        this.repo = repo;
    }

    @Override
    public String saveCustomer(CustomerDto dto) {
        return
                repo.save(new Customer(dto.getId(),dto.getName(),dto.getAddress(),dto.getSalary()))
                        .getName(); // save ==> return saved Customer name
    }

    @Override
    public String updateCustomer(CustomerDto dto) {
        return null;
    }

    @Override
    public String deleteCustomer(String id) {
        return null;
    }

    @Override
    public CustomerDto getCustomer(String id) {
        return null;
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomers(int size, int page, String searchText) {
        return null;
    }
}
