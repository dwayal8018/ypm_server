package com.bluetech.protech.dto;

import java.math.BigDecimal;

public class DiscountRequestDTO
{

    private String name;
    private BigDecimal discount;
    private BigDecimal previousRowDiscount;

    public DiscountRequestDTO(String name, BigDecimal discount)
    {

        super();
        this.name = name;
        this.discount = discount;
    }

    public String getName()
    {

        return name;
    }

    public void setName(String name)
    {

        this.name = name;
    }

    public BigDecimal getDiscount()
    {

        return discount;
    }

    public void setDiscount(BigDecimal discount)
    {

        this.discount = discount;
    }

    public BigDecimal getPreviousRowDiscount()
    {

        return previousRowDiscount;
    }

    public void setPreviousRowDiscount(BigDecimal previousRowDiscount)
    {

        this.previousRowDiscount = previousRowDiscount;
    }

}
