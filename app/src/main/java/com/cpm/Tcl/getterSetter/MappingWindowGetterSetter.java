
package com.cpm.Tcl.getterSetter;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MappingWindowGetterSetter {

    @SerializedName("Mapping_Window")
    @Expose
    private List<MappingWindow> mappingWindow = null;

    public List<MappingWindow> getMappingWindow() {
        return mappingWindow;
    }

    public void setMappingWindow(List<MappingWindow> mappingWindow) {
        this.mappingWindow = mappingWindow;
    }
    @SerializedName("Mapping_Window_Storewise")
    @Expose
    private List<MappingWindow> mappingWindowStorewise = null;

    public List<MappingWindow> getMappingWindowStorewise() {
        return mappingWindowStorewise;
    }

    public void setMappingWindowStorewise(List<MappingWindow> mappingWindowStorewise) {
        this.mappingWindowStorewise = mappingWindowStorewise;
    }

}
