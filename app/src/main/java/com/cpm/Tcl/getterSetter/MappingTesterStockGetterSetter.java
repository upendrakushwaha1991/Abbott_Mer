package com.cpm.Tcl.getterSetter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MappingTesterStockGetterSetter {
    @SerializedName("Mapping_Tester_Stock")
    @Expose
    private List<MappingTesterStock> mappingTesterStock = null;

    public List<MappingTesterStock> getMappingTesterStock() {
        return mappingTesterStock;
    }

    public void setMappingTesterStock(List<MappingTesterStock> mappingTesterStock) {
        this.mappingTesterStock = mappingTesterStock;
    }
}
