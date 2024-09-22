package com.bluetech.protech.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.math.BigDecimal;
import java.util.Date;

@JsonInclude(Include.NON_NULL)
public class TravelExpenseDetailsDTO
{

    private Integer id;
    private CoordinatesDTO coordinatesDTOByAp1id;
    private CoordinatesDTO coordinatesDTOByAp2id;
    private CoordinatesDTO coordinatesDTOByAp3id;
    private FxRatesDTO fxRatesDTO;
    private Integer staffId;
    private String name;
    private String ticketNo;
    private Integer noOfTickets;
    private String route;
    private String returnStatus;
    private String systemType;
    private String airline;
    private Date flown;
    private String issued;
    private String currency;
    private Double mileage;
    private String entitlement;
    private BigDecimal base;
    private BigDecimal taxes;
    private BigDecimal total;
    private BigDecimal totalLc;
    private Integer zone;
    private BigDecimal fareY;
    private BigDecimal fareFj;
    private BigDecimal fare;
    private BigDecimal value;
    private BigDecimal hypDiscount;
    private BigDecimal discount;
    private BigDecimal taxableWage;
    private String comments;
    private boolean enable;

    public Integer getId()
    {

        return id;
    }

    public void setId(Integer id)
    {

        this.id = id;
    }

    public CoordinatesDTO getCoordinatesDTOByAp1id()
    {

        return coordinatesDTOByAp1id;
    }

    public void setCoordinatesDTOByAp1id(CoordinatesDTO coordinatesDTOByAp1id)
    {

        this.coordinatesDTOByAp1id = coordinatesDTOByAp1id;
    }

    public CoordinatesDTO getCoordinatesDTOByAp2id()
    {

        return coordinatesDTOByAp2id;
    }

    public void setCoordinatesDTOByAp2id(CoordinatesDTO coordinatesDTOByAp2id)
    {

        this.coordinatesDTOByAp2id = coordinatesDTOByAp2id;
    }

    public CoordinatesDTO getCoordinatesDTOByAp3id()
    {

        return coordinatesDTOByAp3id;
    }

    public void setCoordinatesDTOByAp3id(CoordinatesDTO coordinatesDTOByAp3id)
    {

        this.coordinatesDTOByAp3id = coordinatesDTOByAp3id;
    }

    public FxRatesDTO getFxRatesDTO()
    {

        return fxRatesDTO;
    }

    public void setFxRatesDTO(FxRatesDTO fxRatesDTO)
    {

        this.fxRatesDTO = fxRatesDTO;
    }

    public Integer getStaffId()
    {

        return staffId;
    }

    public void setStaffId(Integer staffId)
    {

        this.staffId = staffId;
    }

    public String getName()
    {

        return name;
    }

    public void setName(String name)
    {

        this.name = name;
    }

    public String getTicketNo()
    {

        return ticketNo;
    }

    public void setTicketNo(String ticketNo)
    {

        this.ticketNo = ticketNo;
    }

    public Integer getNoOfTickets()
    {

        return noOfTickets;
    }

    public void setNoOfTickets(Integer noOfTickets)
    {

        this.noOfTickets = noOfTickets;
    }

    public String getRoute()
    {

        return route;
    }

    public void setRoute(String route)
    {

        this.route = route;
    }

    public String getReturnStatus()
    {

        return returnStatus;
    }

    public void setReturnStatus(String returnStatus)
    {

        this.returnStatus = returnStatus;
    }

   
    public String getSystemType()
    {

        return systemType;
    }

    public void setSystemType(String systemType)
    {

        this.systemType = systemType;
    }

    public String getAirline()
    {

        return airline;
    }

    public void setAirline(String airline)
    {

        this.airline = airline;
    }

    public Date getFlown()
    {

        return flown;
    }

    public void setFlown(Date flown)
    {

        this.flown = flown;
    }

    public String getIssued()
    {

        return issued;
    }

    public void setIssued(String issued)
    {

        this.issued = issued;
    }

    public String getCurrency()
    {

        return currency;
    }

    public void setCurrency(String currency)
    {

        this.currency = currency;
    }

    public Double getMileage()
    {

        return mileage;
    }

    public void setMileage(Double mileage)
    {

        this.mileage = mileage;
    }

    public String getEntitlement()
    {

        return entitlement;
    }

    public void setEntitlement(String entitlement)
    {

        this.entitlement = entitlement;
    }

    public BigDecimal getBase()
    {

        return base;
    }

    public void setBase(BigDecimal base)
    {

        this.base = base;
    }

    public BigDecimal getTaxes()
    {

        return taxes;
    }

    public void setTaxes(BigDecimal taxes)
    {

        this.taxes = taxes;
    }

    public BigDecimal getTotal()
    {

        return total;
    }

    public void setTotal(BigDecimal total)
    {

        this.total = total;
    }

    public BigDecimal getTotalLc()
    {

        return totalLc;
    }

    public void setTotalLc(BigDecimal totalLc)
    {

        this.totalLc = totalLc;
    }

    public Integer getZone()
    {

        return zone;
    }

    public void setZone(Integer zone)
    {

        this.zone = zone;
    }

    public BigDecimal getFareY()
    {

        return fareY;
    }

    public void setFareY(BigDecimal fareY)
    {

        this.fareY = fareY;
    }

    public BigDecimal getFareFj()
    {

        return fareFj;
    }

    public void setFareFj(BigDecimal fareFj)
    {

        this.fareFj = fareFj;
    }

    public BigDecimal getFare()
    {

        return fare;
    }

    public void setFare(BigDecimal fare)
    {

        this.fare = fare;
    }

    public BigDecimal getValue()
    {

        return value;
    }

    public void setValue(BigDecimal value)
    {

        this.value = value;
    }

    public BigDecimal getHypDiscount()
    {

        return hypDiscount;
    }

    public void setHypDiscount(BigDecimal hypDiscount)
    {

        this.hypDiscount = hypDiscount;
    }

    public BigDecimal getDiscount()
    {

        return discount;
    }

    public void setDiscount(BigDecimal discount)
    {

        this.discount = discount;
    }

    public BigDecimal getTaxableWage()
    {

        return taxableWage;
    }

    public void setTaxableWage(BigDecimal taxableWage)
    {

        this.taxableWage = taxableWage;
    }

    public String getComments()
    {

        return comments;
    }

    public void setComments(String comments)
    {

        this.comments = comments;
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
