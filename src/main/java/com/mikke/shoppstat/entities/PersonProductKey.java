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
        this.productId = productId;
    }

    @Override
    public Long getPersonId() {
        return null;
    }

    @Override
    public void setPersonId(Long personId) {
        this.personId = personId;
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

    @Override
    public boolean equals(Object o) {

        if (o != null && o instanceof PersonProductKey) {
            PersonProductKey that = (PersonProductKey) o;
            return this.personId.equals(that.personId) && this.productId.equals(that.productId);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return personId.hashCode() + productId.hashCode();
    }

    public PersonProductKey ()
    {

    }

    public PersonProductKey (Long archiveid, Long tagtypeid)
    {
        this.personId = new Long (personId);
        this.productId = new Long (productId);
    }
}
