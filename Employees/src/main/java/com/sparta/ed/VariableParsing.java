package com.sparta.ed;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VariableParsing {
    public static void main(String[] args) {
        System.out.println(convertStringToDate("05/9/2022"));
    }

    public static int convertStringToInt(String employeeID){
        try{
            return Integer.parseInt(employeeID);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException("Employee ID must be a number");
        }
    }

    public static LocalDate convertStringToDate (String date){
        try{

            String[] splitDate = date.split("/");
            int i = 0;
            String newDate;

            for(String dayMonth: splitDate){
                if (dayMonth.length() < 2){
                    splitDate[i] = "0" + dayMonth;
                    i++;
                }
                else{
                    i++;
                }

            }
            newDate = splitDate[0] + "-" + splitDate[1] + "-" + splitDate[2];
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
            return LocalDate.parse(newDate,formatter);

        }catch (DateTimeException e){
            throw new IllegalArgumentException("Invalid date format");
        }
    }
}
