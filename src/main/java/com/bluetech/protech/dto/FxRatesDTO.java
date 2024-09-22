package com.bluetech.protech.dto;

import java.util.Date;

public class FxRatesDTO
{

    private Integer id;
    private Date updatedOn;
    private String sourceCurrency;
    private String currency;
    private Double fxRate;
    private boolean enable;

    public Integer getId()
    {

        return id;
    }

    public void setId(Integer id)
    {

        this.id = id;
    }

    public Date getUpdatedOn()
    {

        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn)
    {

        this.updatedOn = updatedOn;
    }

    public String getSourceCurrency()
    {

        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency)
    {

        this.sourceCurrency = sourceCurrency;
    }

    public String getCurrency()
    {

        return currency;
    }

    public void setCurrency(String currency)
    {

        this.currency = currency;
    }

    public Double getFxRate()
    {

        return fxRate;
    }

    public void setFxRate(Double fxRate)
    {

        this.fxRate = fxRate;
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
