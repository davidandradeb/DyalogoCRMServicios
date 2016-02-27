/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyalogo.crm.servicios.general;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/**
 * Esta clase maneja un envio basico de http request y los metodos retornan un
 * String con la respuesta obtenida de la URL
 *
 * @author DYALOGOSAS.davidandrade
 */
public class HTTPRequest {

    private final static String USER_AGENT = "Mozilla/5.0";

    public static DatosRespuestaHTTPRequest enviarHTTPGET(String strURLDesti__p, Map<String, String> mapParametro_p) throws MalformedURLException, ProtocolException, IOException, Exception {
        String strURLConex__t;
        URL objURLConex__t;
        HttpURLConnection objConHttp___t;
        String strLlavePara__t;

        DatosRespuestaHTTPRequest objRespuesta_t = new DatosRespuestaHTTPRequest();

        try {

            objRespuesta_t.setDatIniLlaHtt_t(new Date());

            strURLConex__t = strURLDesti__p;

            if (mapParametro_p != null) {
                strURLConex__t += "?";
                Iterator it = mapParametro_p.keySet().iterator();

                while (it.hasNext()) {
                    strLlavePara__t = (String) it.next();
                    strURLConex__t += strLlavePara__t + "=" + mapParametro_p.get(strLlavePara__t) + "&";
                }
                strURLConex__t = strURLConex__t.substring(0, strURLConex__t.length() - 1);
            }

            objURLConex__t = new URL(strURLConex__t);
            objConHttp___t = (HttpURLConnection) objURLConex__t.openConnection();

            objConHttp___t.setRequestMethod("GET");
            objConHttp___t.setRequestProperty("User-Agent", USER_AGENT);

            //log.info("ConexionHttpGestionEstado.GET " + strURLConex__t);
            objRespuesta_t.setIntCodiResp__t(objConHttp___t.getResponseCode());

            //log.info("Codigo de respuesta GET : " + intCodiResp__t);
            try {
                objRespuesta_t.setStrResultado_t(resultadoHTTP(objConHttp___t.getInputStream()));
            } catch (Exception e) {
                objRespuesta_t.setStrResultado_t(resultadoHTTP(objConHttp___t.getErrorStream()));
            }

            //log.info("RESPUESTA GET: " + strRespuHTTP_t);
            objRespuesta_t.setDatFinLlaHtt_t(new Date());

        } finally {
            strURLConex__t = null;
            objURLConex__t = null;
            objConHttp___t = null;
        }

        return objRespuesta_t;

    }

    /**
     *
     * @param strURLDesti__p
     * @param mapParametro_p
     * @return
     * @throws MalformedURLException
     * @throws IOException
     * @throws Exception
     */
    public static DatosRespuestaHTTPRequest enviarHTTPPOST(String strURLDesti__p, Map<String, String> mapParametro_p) throws MalformedURLException, IOException, Exception {
        URL objURLConex__t;
        HttpURLConnection objConHttp___t;
        DataOutputStream objSeriParam_t;

        String strParamURL__t = "", strLlavePara__t = "";
        DatosRespuestaHTTPRequest objRespuesta_t = new DatosRespuestaHTTPRequest();

        try {
            objRespuesta_t.setDatIniLlaHtt_t(new Date());
            objURLConex__t = new URL(strURLDesti__p);

            objConHttp___t = (HttpURLConnection) objURLConex__t.openConnection();

            objConHttp___t.setRequestMethod("POST");
            objConHttp___t.setRequestProperty("User-Agent", USER_AGENT);
            objConHttp___t.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

            Iterator it = mapParametro_p.keySet().iterator();

            while (it.hasNext()) {
                strLlavePara__t = (String) it.next();
                strParamURL__t += strParamURL__t + strLlavePara__t + "=" + mapParametro_p.get(strLlavePara__t) + "&";
            }
            strParamURL__t = strParamURL__t.substring(0, strParamURL__t.length() - 1);

            objConHttp___t.setDoOutput(true);

            objSeriParam_t = new DataOutputStream(objConHttp___t.getOutputStream());

            objSeriParam_t.writeBytes(strParamURL__t);
            objSeriParam_t.flush();
            objSeriParam_t.close();

            objRespuesta_t.setIntCodiResp__t(objConHttp___t.getResponseCode());

            try {
                objRespuesta_t.setStrResultado_t(resultadoHTTP(objConHttp___t.getInputStream()));
            } catch (Exception e) {
                objRespuesta_t.setStrResultado_t(resultadoHTTP(objConHttp___t.getErrorStream()));
            }

            objRespuesta_t.setDatIniLlaHtt_t(new Date());

        } finally {
            objURLConex__t = null;
            objConHttp___t = null;
            objSeriParam_t = null;
            strParamURL__t = null;

        }

        return objRespuesta_t;
    }

    /**
     * Imprime el resultado de una consulta HTTP
     *
     * @param objInputStre_p
     * @throws IOException
     */
    private static String resultadoHTTP(InputStream objInputStre_p) throws IOException {
        StringBuffer response;
        BufferedReader in;
        String inputLine;
        try {
            in = new BufferedReader(new InputStreamReader(objInputStre_p));
            response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            return response.toString().trim();
        } finally {
            response = null;
            in = null;
            inputLine = null;
        }

    }

}
