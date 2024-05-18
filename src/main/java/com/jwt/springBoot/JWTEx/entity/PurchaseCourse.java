package com.jwt.springBoot.JWTEx.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "purchase_course")
@Data
public class PurchaseCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int purchase_course_id;

    private int pCourseId;
    private String purchaseCourseName;

    private int purchaseCoursePrice;

    private String purchaseCourseUserName;

    private int purchaseCoursePayment;

    private String purchaseCourseUserAccount;

    private String purchaseCourseTime;

    private String purchaseCourseCountry;

    private String purchaseCourseAccountType;

    public int getPurchase_course_id() {
        return purchase_course_id;
    }

    public void setPurchase_course_id(int purchase_course_id) {
        this.purchase_course_id = purchase_course_id;
    }

    public int getpCourseId() {
        return pCourseId;
    }

    public void setpCourseId(int pCourseId) {
        this.pCourseId = pCourseId;
    }

    public String getPurchaseCourseName() {
        return purchaseCourseName;
    }

    public void setPurchaseCourseName(String purchaseCourseName) {
        this.purchaseCourseName = purchaseCourseName;
    }

    public int getPurchaseCoursePrice() {
        return purchaseCoursePrice;
    }

    public void setPurchaseCoursePrice(int purchaseCoursePrice) {
        this.purchaseCoursePrice = purchaseCoursePrice;
    }

    public String getPurchaseCourseUserName() {
        return purchaseCourseUserName;
    }

    public void setPurchaseCourseUserName(String purchaseCourseUserName) {
        this.purchaseCourseUserName = purchaseCourseUserName;
    }

    public int getPurchaseCoursePayment() {
        return purchaseCoursePayment;
    }

    public void setPurchaseCoursePayment(int purchaseCoursePayment) {
        this.purchaseCoursePayment = purchaseCoursePayment;
    }

    public String getPurchaseCourseUserAccount() {
        return purchaseCourseUserAccount;
    }

    public void setPurchaseCourseUserAccount(String purchaseCourseUserAccount) {
        this.purchaseCourseUserAccount = purchaseCourseUserAccount;
    }

    public String getPurchaseCourseTime() {
        return purchaseCourseTime;
    }

    public void setPurchaseCourseTime(String purchaseCourseTime) {
        this.purchaseCourseTime = purchaseCourseTime;
    }

    public String getPurchaseCourseCountry() {
        return purchaseCourseCountry;
    }

    public void setPurchaseCourseCountry(String purchaseCourseCountry) {
        this.purchaseCourseCountry = purchaseCourseCountry;
    }

    public String getPurchaseCourseAccountType() {
        return purchaseCourseAccountType;
    }

    public void setPurchaseCourseAccountType(String purchaseCourseAccountType) {
        this.purchaseCourseAccountType = purchaseCourseAccountType;
    }
}
