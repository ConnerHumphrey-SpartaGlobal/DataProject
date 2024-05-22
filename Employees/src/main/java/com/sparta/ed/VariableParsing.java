package com.sparta.ed;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VariableParsing {

    public static int  convertStringToInt(String employeeID){
        try{
            return Integer.parseInt(employeeID);
        }catch(NumberFormatException e){
            throw e;
        }

    }

    public static LocalDate convertStringToDate (String date){
        try{
            date = date.replace("/", "-");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
            return LocalDate.parse(date,formatter);

        }catch (DateTimeException e){
            throw e;
        }

    }
}
