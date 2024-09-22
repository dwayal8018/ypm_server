
package com.bluetech.protech.dto;

import java.math.BigDecimal;

public class BarinRatesDTO
{

    private Integer id;
    private String country;
    private Integer year;
    private Integer mileage;
    private Integer zone;
    private BigDecimal value;
    private String stbyDiscount;
    private BigDecimal zew;
    private boolean enable;

    public Integer getId()
    {

        return id;
    }

    public void setId(Integer id)
    {

        this.id = id;
    }

    public String getCountry()
    {

        return country;
    }

    public void setCountry(String country)
    {

        this.country = country;
    }

    public Integer getYear()
    {

        return year;
    }

    public void setYear(Integer year)
    {

        this.year = year;
    }

    public Integer getMileage()
    {

        return mileage;
    }

    public void setMileage(Integer mileage)
    {

        this.mileage = mileage;
    }

    public Integer getZone()
    {

        return zone;
    }

    public void setZone(Integer zone)
    {

        this.zone = zone;
    }

    public BigDecimal getValue()
    {

        return value;
    }

    public void setValue(BigDecimal value)
    {

        this.value = value;
    }

    public String getStbyDiscount()
    {

        return stbyDiscount;
    }

    public void setStbyDiscount(String stbyDiscount)
    {

        this.stbyDiscount = stbyDiscount;
    }

    public BigDecimal getZew()
    {

        return zew;
    }

    public void setZew(BigDecimal zew)
    {

        this.zew = zew;
    }

    public boolean isEnable()
    {

        return enable;
    }

    public void setEnable(boolean enable)
    {

        this.enable = enable;
    }

}
