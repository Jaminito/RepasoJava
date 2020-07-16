package com.company;

import com.company.modelo.alumno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat fecha=new SimpleDateFormat("dd-MM-yyyy");
        Date nacimiento= fecha.parse("20-06-1985");
        alumno alumn=new alumno("Xose","Garcia",nacimiento,"12345678Q");
        System.out.println(alumn.toString());
        System.out.println(alumn.getEdad());
        nacimiento =fecha.parse("15-04-1985");
        alumno alumn2=new alumno("juan","Ramon",nacimiento,"2123233ewq");
        System.out.println(alumn2.getEdad());
        nacimiento=fecha.parse("15-07-1985");
        alumno alumn3=new alumno("jorge","lopez",nacimiento,"wqewqqwe");
        System.out.println(alumn3.getEdad());
    }
}
