package com.benchmark.mappers.mapstruct;

import com.benchmark.mappers.EmpMapper;
import com.benchmark.mappers.model.Contract;
import com.benchmark.mappers.model.dto.ContractDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper for the entity Contract and its DTO ContractDTO.
 * @author James Dunnam
 */
@Mapper
public interface ContractMapper extends EmpMapper {

    ContractMapper MAPPER = Mappers.getMapper(ContractMapper.class);

    ContractDto map(Contract contract);

    Contract contractDTOToContract(ContractDto contractDTO);
}
