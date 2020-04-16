package com.zhonghuan.domain;


import com.zhonghuan.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Apply implements Serializable {
    private int id;
    private String address;//出发地
    private String destination;//目的地
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    private Date departure_time;//出发时间
    private String departure_timeStr;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    private Date return_time;//返回时间
    private String return_timeStr;
    private Double traffic_price;//交通费
    private Double hotel_price;//住宿费
    private Double meal_fee;//餐饮费
    private Double else_price;//其他费用
    private String else_price_desc;//其他费用说明
    private Double travel_price;//合计差旅费
    private String task;//出差说明
    private Integer approval_status;//审批状态
    private String approval_statusStr;
    private Integer completion_status;//完成状态
    private String completion_statusStr;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Date departure_time) {
        this.departure_time = departure_time;
    }

    public String getDeparture_timeStr() {
        if (departure_time!=null){
            departure_timeStr= DateUtils.date2String(departure_time,"yyyy-MM-dd");
        }
        return departure_timeStr;
    }

    public String setDeparture_timeStr(String departure_timeStr) {

        return departure_timeStr;
    }

    public Date getReturn_time() {
        return return_time;
    }

    public void setReturn_time(Date return_time) {
        this.return_time = return_time;
    }

    public String getReturn_timeStr() {
        if (return_time!=null){
            return_timeStr=DateUtils.date2String(return_time,"yyyy-MM-dd");
        }
        return return_timeStr;
    }

    public String setReturn_timeStr(String return_timeStr) {

        return return_timeStr;
    }

    public Double getTraffic_price() {
        return traffic_price;
    }

    public void setTraffic_price(Double traffic_price) {
        this.traffic_price = traffic_price;
    }

    public Double getHotel_price() {
        return hotel_price;
    }

    public void setHotel_price(Double hotel_price) {
        this.hotel_price = hotel_price;
    }

    public Double getMeal_fee() {
        return meal_fee;
    }

    public void setMeal_fee(Double meal_fee) {
        this.meal_fee = meal_fee;
    }

    public Double getElse_price() {
        return else_price;
    }

    public void setElse_price(Double else_price) {
        this.else_price = else_price;
    }

    public Double getTravel_price() {
        return travel_price;
    }

    public void setTravel_price(Double travel_price) {
        this.travel_price = travel_price;
    }

    public void setApproval_status(Integer approval_status) {
        this.approval_status = approval_status;
    }

    public void setCompletion_status(Integer completion_status) {
        this.completion_status = completion_status;
    }

    public String getElse_price_desc() {
        return else_price_desc;
    }

    public void setElse_price_desc(String else_price_desc) {
        this.else_price_desc = else_price_desc;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getApproval_status() {
        return approval_status;
    }

    public void setApproval_status(int approval_status) {
        this.approval_status = approval_status;
    }

    public int getCompletion_status() {
        return completion_status;
    }

    public void setCompletion_status(int completion_status) {
        this.completion_status = completion_status;
    }
    public String getApproval_statusStr() {
        if(approval_status != null){
            if(approval_status == 0){
                approval_statusStr="未审核";
            }
            if(approval_status==1){
                approval_statusStr="已审核";
            }
        }
        return approval_statusStr;
    }

    public void setApproval_statusStr(String approval_statusStr) {
        this.approval_statusStr = approval_statusStr;
    }

    public String getCompletion_statusStr() {
        if(completion_status!=null){
            if(completion_status==0){
                completion_statusStr="未完成";
            }
            if(completion_status==1){
                completion_statusStr="已完成";
            }
        }
        return completion_statusStr;
    }

    public void setCompletion_statusStr(String completion_statusStr) {
        this.completion_statusStr = completion_statusStr;
    }

//    @Override
//    public String toString() {
//        return "Apply{" +
//                "id=" + id +
//                ", address='" + address + '\'' +
//                ", destination='" + destination + '\'' +
//                ", departure_timeStr='" + departure_timeStr + '\'' +
//                ", return_timeStr='" + return_timeStr + '\'' +
//                ", traffic_price=" + traffic_price +
//                ", hotel_price=" + hotel_price +
//                ", meal_fee=" + meal_fee +
//                ", else_price=" + else_price +
//                ", else_price_desc='" + else_price_desc + '\'' +
//                ", travel_price=" + travel_price +
//                ", task='" + task + '\'' +
//                ", approval_statusStr='" + approval_statusStr + '\'' +
//                ", completion_statusStr='" + completion_statusStr + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Apply{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", destination='" + destination + '\'' +
                ", departure_time=" + departure_time +
                ", departure_timeStr='" + departure_timeStr + '\'' +
                ", return_time=" + return_time +
                ", return_timeStr='" + return_timeStr + '\'' +
                ", traffic_price=" + traffic_price +
                ", hotel_price=" + hotel_price +
                ", meal_fee=" + meal_fee +
                ", else_price=" + else_price +
                ", else_price_desc='" + else_price_desc + '\'' +
                ", travel_price=" + travel_price +
                ", task='" + task + '\'' +
                ", approval_status=" + approval_status +
                ", approval_statusStr='" + approval_statusStr + '\'' +
                ", completion_status=" + completion_status +
                ", completion_statusStr='" + completion_statusStr + '\'' +
                '}';
    }
}
