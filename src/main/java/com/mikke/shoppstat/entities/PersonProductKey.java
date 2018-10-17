package com.mikke.shoppstat.entities;

import com.mikke.shoppstat.interfaces.IPersonProductKey;
import com.mikke.shoppstat.interfaces.IPrimaryKey;

import java.io.Serializable;

public class PersonProductKey implements IPersonProductKey {

    private Long personId;
    private Long productId;


    @Override
    public Long getProducId() {
        return null;
    }

    @Override
    public void setProductId(Long productId) {

    }

    @Override
    public Long getPersonId() {
        return null;
    }

    @Override
    public void setPersonId(Long personId) {

    }

    @Override
    public int compareTo(Object arg0) {
        long result = personId.longValue() - ((IPersonProductKey) arg0).getPersonId().longValue();
        if (result != 0) {
            return (result > 0) ? 1 : -1;
        }

        result = productId.longValue() - ((IPersonProductKey) arg0).getProducId().longValue();
        if (result != 0) {
            return (result > 0) ? 1 : -1;
        }
        return 0;
    }
}
