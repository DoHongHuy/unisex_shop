package com.og.service;

import com.og.dto.OrderTableDTO;
import com.og.model.OrderTable;

import java.util.List;

public interface OrderTableService extends IGeneralService<OrderTable>{
    List<OrderTableDTO> findAllOrderTableDTO();
}
