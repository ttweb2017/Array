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
    private String tag;
    private String name;
    private String level;
    private Date beginDate;
    private String period;
    
    public Classes(){
        
    }
    
    public Classes(int id, String tag, String name, String level, Date beginDate, String period){
        this.id = id;
        this.tag = tag;
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

    public String getTag(){
        return tag;
    }
    
    public void setTag(String tag){
        this.tag = tag;
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
