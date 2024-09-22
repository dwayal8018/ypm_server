
package com.bluetech.protech.pojo;
// Generated Aug 19, 2024, 4:31:59 PM by Hibernate Tools 4.3.6.Final


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * TbAirlineCoordinates generated by hbm2java
 */
@Entity
@Table(name = "tb_airline_coordinates", catalog = "airline")
public class TbAirlineCoordinates implements java.io.Serializable
{

    private Integer id;
    private String airport;
    private Double latitude;
    private Double longitude;
    private boolean enabled;
    private Set<TbAirlineTravelexpensedetails> tbAirlineTravelexpensedetailsesForAp3id =
            new HashSet<TbAirlineTravelexpensedetails>(0);
    private Set<TbAirlineTravelexpensedetails> tbAirlineTravelexpensedetailsesForAp1id =
            new HashSet<TbAirlineTravelexpensedetails>(0);
    private Set<TbAirlineTravelexpensedetails> tbAirlineTravelexpensedetailsesForAp2id =
            new HashSet<TbAirlineTravelexpensedetails>(0);

  

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId()
    {

        return this.id;
    }

    public void setId(Integer id)
    {

        this.id = id;
    }

    @Column(name = "Airport", nullable = false)
    public String getAirport()
    {

        return this.airport;
    }

    public void setAirport(String airport)
    {

        this.airport = airport;
    }

    @Column(name = "Latitude")
    public Double getLatitude()
    {

        return this.latitude;
    }

    public void setLatitude(Double latitude)
    {

        this.latitude = latitude;
    }

    @Column(name = "Longitude")
    public Double getLongitude()
    {

        return this.longitude;
    }

    public void setLongitude(Double longitude)
    {

        this.longitude = longitude;
    }

    @Column(name = "enabled", nullable = false)
    public boolean isEnabled()
    {

        return this.enabled;
    }

    public void setEnabled(boolean enabled)
    {

        this.enabled = enabled;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tbAirlineCoordinatesByAp3id")
    public Set<TbAirlineTravelexpensedetails> getTbAirlineTravelexpensedetailsesForAp3id()
    {

        return this.tbAirlineTravelexpensedetailsesForAp3id;
    }

    public void setTbAirlineTravelexpensedetailsesForAp3id(
            Set<TbAirlineTravelexpensedetails> tbAirlineTravelexpensedetailsesForAp3id)
    {

        this.tbAirlineTravelexpensedetailsesForAp3id = tbAirlineTravelexpensedetailsesForAp3id;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tbAirlineCoordinatesByAp1id")
    public Set<TbAirlineTravelexpensedetails> getTbAirlineTravelexpensedetailsesForAp1id()
    {

        return this.tbAirlineTravelexpensedetailsesForAp1id;
    }

    public void setTbAirlineTravelexpensedetailsesForAp1id(
            Set<TbAirlineTravelexpensedetails> tbAirlineTravelexpensedetailsesForAp1id)
    {

        this.tbAirlineTravelexpensedetailsesForAp1id = tbAirlineTravelexpensedetailsesForAp1id;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tbAirlineCoordinatesByAp2id")
    public Set<TbAirlineTravelexpensedetails> getTbAirlineTravelexpensedetailsesForAp2id()
    {

        return this.tbAirlineTravelexpensedetailsesForAp2id;
    }

    public void setTbAirlineTravelexpensedetailsesForAp2id(
            Set<TbAirlineTravelexpensedetails> tbAirlineTravelexpensedetailsesForAp2id)
    {

        this.tbAirlineTravelexpensedetailsesForAp2id = tbAirlineTravelexpensedetailsesForAp2id;
    }

}
