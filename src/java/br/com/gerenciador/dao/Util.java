/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gerenciador.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ti
 */
public class Util {
        
          public Calendar parseData(String data) {
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
    
}
