package com.bluetech.protech.dto;

public class ResponseDTO
{

    private String status;
    private Object payload;
    private String description;

    public ResponseDTO()
    {

    }

    public ResponseDTO(String status, Object payload)
    {

        this.status = status;
        this.payload = payload;
    }

    /**
     * @param status
     * @param description
     */
    public ResponseDTO(String status, String description)
    {

        super();
        this.status = status;
        this.description = description;
    }

    public ResponseDTO(String status, Object payload, String description)
    {

        this.status = status;
        this.payload = payload;
        this.description = description;
    }

    public String getStatus()
    {

        return status;
    }

    public void setStatus(String status)
    {

        this.status = status;
    }

    public Object getPayload()
    {

        return payload;
    }

    public void setPayload(Object payload)
    {

        this.payload = payload;
    }

    public String getDescription()
    {

        return description;
    }

    public void setDescription(String description)
    {

        this.description = description;
    }

}
