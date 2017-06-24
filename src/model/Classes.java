/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Shagy
 */
public class Classes {
    private int id;
    private String name;
    private String level;
    private Date beginDate;
    private String period;
    
    public Classes(){
        
    }
    
    public Classes(int id, String name, String level, Date beginDate, String period){
        this.id = id;
        this.name = name;
        this.level = level;
        this.beginDate = beginDate;
        this.period = period;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
