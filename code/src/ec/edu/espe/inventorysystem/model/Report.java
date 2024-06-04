/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.inventorysystem.model;

import java.util.Date;

/**
 *
 * @author Alfonso Arroyo <As-Byte Wizards> DDCC ESPE
 */
public class Report {
    private String reportType;
    private Date startDate;
    private Date endDate;
    private String reportData;

    public Report(String reportType, Date startDate, Date endDate, String reportData) {
        this.reportType = reportType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reportData = reportData;
    }

    public void generateReport() {
        
    }

    public void displayReport() {
        
    }

    @Override
    public String toString() {
        return "Report{" + "reportType=" + getReportType() + ", startDate=" + getStartDate() + ", endDate=" + getEndDate() + ", reportData=" + getReportData() + '}';
    }

    /**
     * @return the reportType
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * @param reportType the reportType to set
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the reportData
     */
    public String getReportData() {
        return reportData;
    }

    /**
     * @param reportData the reportData to set
     */
    public void setReportData(String reportData) {
        this.reportData = reportData;
    }
    
}
