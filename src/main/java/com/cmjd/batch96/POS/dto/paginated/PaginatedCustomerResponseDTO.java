package com.cmjd.batch96.POS.dto.paginated;

import com.cmjd.batch96.POS.dto.CustomerDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginatedCustomerResponseDTO {
    private List<CustomerDto> list;
    private long dataCount;
}
