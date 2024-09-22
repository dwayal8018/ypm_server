package com.bluetech.protech.dto;

import java.util.Date;
import java.util.List;

public class CurrencyFxRateResponseDTO
{

    private String terms;
    private String privacy;
    private String from;//source currency
    private double amount;
    private Date timestamp; //updated on
    private List<CurrencyRateDTO> to;//currency &fx rate

    public String getTerms()
    {

        return terms;
    }

    public void setTerms(String terms)
    {

        this.terms = terms;
    }

    public String getPrivacy()
    {

        return privacy;
    }

    public void setPrivacy(String privacy)
    {

        this.privacy = privacy;
    }

    public String getFrom()
    {

        return from;
    }

    public void setFrom(String from)
    {

        this.from = from;
    }

    public double getAmount()
    {

        return amount;
    }

    public void setAmount(double amount)
    {

        this.amount = amount;
    }

    public Date getTimestamp()
    {

        return timestamp;
    }

    public void setTimestamp(Date timestamp)
    {

        this.timestamp = timestamp;
    }

    public List<CurrencyRateDTO> getTo()
    {

        return to;
    }

    public void setTo(List<CurrencyRateDTO> to)
    {

        this.to = to;
    }

}
