package com.bluetech.protech.dto;

public class PicklistDTO
{

    private String fieldTypeCode;
    private String appCode;
    private String clientCode;
    private String countryCode;
    private String exactMatch;

    public String getFieldTypeCode()
    {

        return fieldTypeCode;
    }

    public void setFieldTypeCode(String fieldTypeCode)
    {

        this.fieldTypeCode = fieldTypeCode;
    }

    public String getAppCode()
    {

        return appCode;
    }

    public void setAppCode(String appCode)
    {

        this.appCode = appCode;
    }

    public String getClientCode()
    {

        return clientCode;
    }

    public void setClientCode(String clientCode)
    {

        this.clientCode = clientCode;
    }

    public String getCountryCode()
    {

        return countryCode;
    }

    public void setCountryCode(String countryCode)
    {

        this.countryCode = countryCode;
    }

    public String getExactMatch()
    {

        return exactMatch;
    }

    public void setExactMatch(String exactMatch)
    {

        this.exactMatch = exactMatch;
    }

}
