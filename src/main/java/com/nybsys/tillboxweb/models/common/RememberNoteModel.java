/**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/23/2018
 * Time: 10:23 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.models.common;


import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class RememberNoteModel {
    private Integer rememberNoteID;
    private Integer businessID;
    private Integer referenceType;
    private Integer referenceID;
    private Date entryDate;
    private Date actionDate;
    private String subject;
    private String note;
    private Boolean IsComplete;
    private Byte[] Attachment;


    public Integer getRememberNoteID() {
        return rememberNoteID;
    }

    public void setRememberNoteID(Integer rememberNoteID) {
        this.rememberNoteID = rememberNoteID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(Integer referenceType) {
        this.referenceType = referenceType;
    }

    public Integer getReferenceID() {
        return referenceID;
    }

    public void setReferenceID(Integer referenceID) {
        this.referenceID = referenceID;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getComplete() {
        return IsComplete;
    }

    public void setComplete(Boolean complete) {
        IsComplete = complete;
    }

    public Byte[] getAttachment() {
        return Attachment;
    }

    public void setAttachment(Byte[] attachment) {
        Attachment = attachment;
    }
}
