
package com.cpm.Tcl.getterSetter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MappingMenu {

    @SerializedName("user_Type")
    @Expose
    private String userType;
    @SerializedName("Menu_Id")
    @Expose
    private Integer menuId;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
