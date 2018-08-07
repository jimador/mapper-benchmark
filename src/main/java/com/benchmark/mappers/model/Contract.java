package com.benchmark.mappers.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Contract.
 * @author James Dunnam
 */
public class Contract implements Serializable {

    private String contractName;
    private String contractNumber;
    private String contractLaborCategory;

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return Objects.equals(contractName, contract.contractName) &&
                Objects.equals(contractNumber, contract.contractNumber) &&
                Objects.equals(contractLaborCategory, contract.contractLaborCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractName, contractNumber, contractLaborCategory);
    }
}
