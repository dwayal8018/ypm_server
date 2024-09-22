package com.bluetech.protech.dto;

public class CountryDTO
{

    private Integer id;
    private String countryCode;
    private String countryName;

    public CountryDTO(String countryCode, String countryName)
    {

        super();
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public CountryDTO()
    {

        super();

    }

    public Integer getId()
    {

        return id;
    }

    public void setId(Integer id)
    {

        this.id = id;
    }

    public String getCountryCode()
    {

        return countryCode;
    }

    public void setCountryCode(String countryCode)
    {

        this.countryCode = countryCode;
    }

    public String getCountryName()
    {

        return countryName;
    }

    public void setCountryName(String countryName)
    {

        this.countryName = countryName;
    }

}
