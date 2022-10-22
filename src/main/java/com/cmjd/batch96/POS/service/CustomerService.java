package com.cmjd.batch96.POS.service;

import com.cmjd.batch96.POS.dto.CustomerDto;
import com.cmjd.batch96.POS.dto.paginated.PaginatedCustomerResponseDTO;

import java.util.ArrayList;

public interface CustomerService {
    String saveCustomer(CustomerDto dto);
    String updateCustomer(CustomerDto dto);
    String deleteCustomer(String id);
    CustomerDto getCustomer(String id);
    PaginatedCustomerResponseDTO getAllCustomers(
            int size, int page, String searchText
    );
}
