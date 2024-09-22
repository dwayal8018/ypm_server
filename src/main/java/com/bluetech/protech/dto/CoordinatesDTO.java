
package com.bluetech.protech.dto;

import java.math.BigDecimal;

public class CoordinatesDTO
{

    private Integer id;
    private String airport;
    private Double latitude;
    private Double longitude;
    private boolean enabled;

    public Integer getId()
    {

        return id;
    }

    public void setId(Integer id)
    {

        this.id = id;
    }

    public String getAirport()
    {

        return airport;
    }

    public void setAirport(String airport)
    {

        this.airport = airport;
    }

    public Double getLatitude()
    {

        return latitude;
    }

    public void setLatitude(Double latitude)
    {

        this.latitude = latitude;
    }

    public Double getLongitude()
    {

        return longitude;
    }

    public void setLongitude(Double longitude)
    {

        this.longitude = longitude;
    }

    public boolean isEnabled()
    {

        return enabled;
    }

    public void setEnabled(boolean enabled)
    {

        this.enabled = enabled;
    }

}
