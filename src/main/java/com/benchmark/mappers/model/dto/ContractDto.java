package com.benchmark.mappers.model.dto;

import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the Contract entity.
 * @author James Dunnam
 */
public class ContractDto implements Serializable {
    private String contractNumber;
    private String contractLaborCategory;
    private String contractName;

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractLaborCategory() {
        return contractLaborCategory;
    }

    public void setContractLaborCategory(String contractLaborCategory) {
        this.contractLaborCategory = contractLaborCategory;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContractDto dto = (ContractDto) o;
        return Objects.equals(contractNumber, dto.contractNumber) &&
                Objects.equals(contractLaborCategory, dto.contractLaborCategory) &&
                Objects.equals(contractName, dto.contractName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractNumber, contractLaborCategory, contractName);
    }
}
