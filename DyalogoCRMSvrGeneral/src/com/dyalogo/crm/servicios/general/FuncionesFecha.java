/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyalogo.crm.servicios.general;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class FuncionesFecha {

    /**
     *
     * @param strFormato___p
     * @param strFecha____p
     * @return
     */
    public static Date stringToDate(String strFormato___p, String strFecha____p) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(strFormato___p);
            return sdf.parse(strFecha____p);
        } catch (ParseException ex) {

            Logger.getLogger(FuncionesFecha.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     *
     * @param strFormato___p
     * @param strFecha____p
     * @return
     */
    public static Date stringToDateTime(String strFormato___p, String strFecha____p) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(strFormato___p);
            return sdf.parse(strFecha____p);
        } catch (ParseException ex) {

            Logger.getLogger(FuncionesFecha.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Retorna las 3 primeras letras del dia en idioma ingles
     *
     * @param datFecha_p
     * @return
     */
    public static String nombreDiaIngles(Date datFecha_p) {
        String strNombre_t;

        strNombre_t = dateToString(datFecha_p, "E").toLowerCase();

        if (strNombre_t.length() > 3) {
            strNombre_t = strNombre_t.substring(0, 3);
        }
        return strNombre_t;
    }

    /**
     *
     * @param datFecha_____p
     * @param strFormato___p
     * @return
     */
    public static String dateToString(Date datFecha_____p, String strFormato___p) {
        try {

            SimpleDateFormat sdf = new SimpleDateFormat(strFormato___p, new Locale("US"));
            //sdf.setTimeZone(new SimpleTimeZone);
            return sdf.format(datFecha_____p);
        } catch (Exception ex) {
            Logger.getLogger(FuncionesFecha.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     *
     * @param datFecha_____p
     * @param strFormato___p
     * @param strIdioma____p US
     * @return
     */
    public static String dateToString(Date datFecha_____p, String strFormato___p, String strIdioma____p) {
        try {

            SimpleDateFormat sdf = new SimpleDateFormat(strFormato___p, new Locale(strIdioma____p));
            //sdf.setTimeZone(new SimpleTimeZone);
            return sdf.format(datFecha_____p);
        } catch (Exception ex) {
            Logger.getLogger(FuncionesFecha.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * DATE ADD - Es la funcion que permite sumar o restar cantidades de
     * terminadas a una fecha enviada por parametro
     *
     * @param fecha - la fecha que se va a operar
     * @param parte - Calendar.YEAR , Calendar.DAY, etc
     * @param cantidad - La cantidad que se suma o se resta si el numero es
     * negativo
     * @return La nueva fecha operada
     */
    public static Date dateAdd(Date fecha, int parte, int cantidad) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        calendario.add(parte, cantidad);
        return calendario.getTime();
    }

    /**
     * Retorna el numero del dato que se necesite
     *
     * @param datFechaUno__p DATE
     * @param datFechaDos__p DATE
     * @param strDatoRetor_p String ml=milisegundos, s=segundos, m=minutos,
     * h=horas
     * @return
     */
    public static long diferenciaFechas(Date datFechaUno__p, Date datFechaDos__p, String strDatoRetor_p) {
        long lngDiferenci_t = datFechaDos__p.getTime() - datFechaUno__p.getTime();
        lngDiferenci_t = Math.abs(lngDiferenci_t);

        switch (strDatoRetor_p) {
            case "ml":
                return lngDiferenci_t;
            case "s":
                return lngDiferenci_t / 1000;
            case "m":
                return lngDiferenci_t / (1000 * 60);
            case "h":
                return lngDiferenci_t / (1000 * 60 * 60);
            case "d":
                return lngDiferenci_t / (1000 * 60 * 60 * 24);
            case "y":
                return ((lngDiferenci_t / (1000 * 60 * 60 * 24)) / 30) / 12;
            default:
                return 0;
        }
    }

    /**
     * Retorna si la fecha uno es mayor a la fecha 2
     *
     * @param datFechaUno__p
     * @param datFechaDos__p
     * @return
     */
    public static boolean fechaUnoMayorFechaDos(Date datFechaUno__p, Date datFechaDos__p) {
        return datFechaUno__p.getTime() > datFechaDos__p.getTime();
    }

    /**
     * Se envia jan, feb,mar,abr,may.jun.jul.agu,sep,oct,nov,dec
     *
     * @param strNombre____p
     * @return
     */
    public static int numeroMes(String strNombre____p) {

        switch (strNombre____p) {
            case "jan":
                return 1;
            case "feb":
                return 2;
            case "mar":
                return 3;
            case "abr":
                return 4;
            case "may":
                return 5;
            case "jun":
                return 6;
            case "jul":
                return 7;
            case "aug":
                return 8;
            case "sep":
                return 9;
            case "oct":
                return 10;
            case "nov":
                return 11;
            case "dec":
                return 12;

        }
        return -1;
    }

    /**
     * Retorna el nombre del mes
     *
     * @param intNumeroMes_p
     * @return
     */
    public static String nombreMes(int intNumeroMes_p) {
        switch (intNumeroMes_p) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
        }

        return "";
    }

    public static int numeroMesEsp(String strNombreMes_p) {
        switch (strNombreMes_p) {

            case "Enero":
                return 1;

            case "Febrero":
                return 2;

            case "Marzo":
                return 3;

            case "Abril":
                return 4;

            case "Mayo":
                return 5;

            case "Junio":
                return 6;

            case "Julio":
                return 7;

            case "Agosto":
                return 8;

            case "Septiembre":
                return 9;

            case "Octubre":
                return 10;

            case "Noviembre":
                return 11;

            case "Diciembre":
                return 12;
        }

        return -1;
    }

    /**
     *
     * @param strNombIng___p debe estar las tres primeras letras del nombre en
     * ingles. sun,mon,tue
     * @return
     */
    public static int diaSemana(String strNombIng___p) {
        strNombIng___p = strNombIng___p.toLowerCase();

        switch (strNombIng___p) {
            case "sun":
                return Calendar.SUNDAY;
            case "mon":
                return Calendar.MONDAY;
            case "tue":
                return Calendar.TUESDAY;
            case "wed":
                return Calendar.WEDNESDAY;
            case "thu":
                return Calendar.THURSDAY;
            case "fri":
                return Calendar.FRIDAY;
            case "sat":
                return Calendar.SATURDAY;

        }

        return -1;

    }

    /**
     * Retorna las 3 primeras letras del nombre en ingles
     *
     * @param datFecha_p
     * @return
     */
    public static String nombreMesIngles(Date datFecha_p) {
        String strNombre_t;

        strNombre_t = dateToString(datFecha_p, "MMM").toLowerCase();

        if (strNombre_t.length() > 3) {
            strNombre_t = strNombre_t.substring(0, 3);
        }
        return strNombre_t;
    }

    public static String getTimeZone() {

        //get Calendar instance
        Calendar now = Calendar.getInstance();

        //get current TimeZone using getTimeZone method of Calendar class
        TimeZone timeZone = now.getTimeZone();
        //display current TimeZone using getDisplayName() method of TimeZone class
        return timeZone.getID();
    }

    public static Date fechaInicialAno() {
        return stringToDate("yyyy-MM-dd", dateToString(new Date(), "yyyy") + "-01-01");
    }

    public static Date fechaFinalAno() {
        return stringToDate("yyyy-MM-dd", dateToString(new Date(), "yyyy") + "-12-31");
    }
}
