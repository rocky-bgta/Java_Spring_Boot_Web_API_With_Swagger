package com.nybsys.tillboxweb.models.security;
import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class AccessRightModel extends BaseModel {

    private Integer accessRightID;
    private String name;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccessRightModel)) return false;
        if (!super.equals(o)) return false;
        AccessRightModel that = (AccessRightModel) o;
        return Objects.equals(accessRightID, that.accessRightID) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), accessRightID, name, description);
    }

    public Integer getAccessRightID() {
        return accessRightID;
    }

    public void setAccessRightID(Integer accessRightID) {
        this.accessRightID = accessRightID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
