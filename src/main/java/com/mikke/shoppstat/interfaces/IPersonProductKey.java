package com.mikke.shoppstat.interfaces;

import sun.rmi.runtime.Log;

public interface IPersonProductKey extends IPrimaryKey{

    public Long getProducId();
    public void setProductId (Long productId);

    public Long getPersonId ();
    public void setPersonId (Long personId);
}
