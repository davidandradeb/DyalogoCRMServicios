/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyalogo.crm.servicios.general;

import com.dyalogo.crm.servicios.config.Configuracion;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
public class UtilidadesArchivos {

    private static long lngDescargaNumeroTotalBytes_t = 10;
    private static long lngDescargaNumeroActualBytes_t = 0;

    /**
     * Retorna el path de la aplicacion
     *
     * @param claseAplicacion Una clase de la aplicacion principal
     * @return
     */
    public static String pathAplicacion(Class claseAplicacion) {
        //CAMBIAR
        String strRutaConfig_t = new File(claseAplicacion.getProtectionDomain().getCodeSource().getLocation().getPath()).toURI().toString();
        strRutaConfig_t = strRutaConfig_t.substring(0, strRutaConfig_t.lastIndexOf("/"));
        strRutaConfig_t = strRutaConfig_t.replace("file:", "");
        return strRutaConfig_t;
    }

    /**
     * Obtiene la propiedad de un archivo especificado .properties
     *
     * @param strRutaArch__p
     * @param strNomPropi__p
     * @return
     * @throws IOException
     */
    public static Object leerPorpiedadArchivo(String strRutaArch__p, String strNomPropi__p) throws IOException {
        Properties proConfAster_t = new Properties();
        FileInputStream objStreamArc_t = null;
        try {
            objStreamArc_t = new FileInputStream(strRutaArch__p);

            proConfAster_t.load(objStreamArc_t);
            return proConfAster_t.getProperty(strNomPropi__p);
        } finally {
            if (objStreamArc_t != null) {
                objStreamArc_t.close();
            }
            objStreamArc_t = null;
            proConfAster_t = null;
        }
    }

    /**
     * Obtiene la lista de archivos de una carpeta especifica filtrando por el
     * dato enviado en filtro se usa el validador contains
     *
     * @param strRutaCarp__p
     * @param strFiltro____p
     * @return
     */
    public static List<String> getListaArchivos(String strRutaCarp__p, String strFiltro____p) {
        File filCarpLlamadasEntrantes = new File(strRutaCarp__p);
        File[] filListaArchivosCarpeta = filCarpLlamadasEntrantes.listFiles();

        List<String> lstArchivos__t = new ArrayList<String>();

        String strNombreArchivo;

        try {
            if (filListaArchivosCarpeta != null) {
                //Se recorre el arreglo con los archivos de la carpeta
                for (File carpeta : filListaArchivosCarpeta) {
                    if (carpeta.isFile()) {
                        strNombreArchivo = carpeta.getName();
                        if (strNombreArchivo.contains(strFiltro____p)) {
                            lstArchivos__t.add(strNombreArchivo);
                        }
                    }
                }
            }
            return lstArchivos__t;
        } finally {
            filCarpLlamadasEntrantes = null;
            filListaArchivosCarpeta = null;
        }
    }

    /**
     * Crea un archivo con los parametros indicados
     *
     * @param strRutaArchi_p
     * @param strNombreArc_p
     * @param strContenido_p
     * @throws IOException
     */
    public static void crearArchivo(String strRutaArchi_p, String strNombreArc_p, String strContenido_p) throws IOException {
        String strRutaArch__t = strRutaArchi_p + strNombreArc_p;
        File filArchiNuev_t;
        FileWriter fwEscriArch_t = null;

        new File(strRutaArchi_p).mkdirs();

        try {
            filArchiNuev_t = new File(strRutaArch__t);

            fwEscriArch_t = new FileWriter(filArchiNuev_t, false);

            //Creamos los directorios
            filArchiNuev_t.createNewFile();
            fwEscriArch_t.write(strContenido_p);
            fwEscriArch_t.close();

        } finally {
            strRutaArch__t = null;
            filArchiNuev_t = null;
            if (fwEscriArch_t != null) {
                try {
                    fwEscriArch_t.close();
                } catch (IOException e) {
                }
            }
        }
    }

    /**
     * Se envia la ruta completa del archivo
     *
     * @param strRutaCompletaArchi_p
     * @param strContenido_p
     * @throws IOException
     */
    public static void crearArchivo(String strRutaCompletaArchi_p, String strContenido_p) throws IOException {
        String strRutaArch__t = strRutaCompletaArchi_p.substring(0, strRutaCompletaArchi_p.lastIndexOf("/"));
        File filArchiNuev_t;
        FileWriter fwEscriArch_t = null;

        new File(strRutaArch__t).mkdirs();

        try {
            filArchiNuev_t = new File(strRutaCompletaArchi_p);

            fwEscriArch_t = new FileWriter(filArchiNuev_t, false);

            //Creamos los directorios
            filArchiNuev_t.createNewFile();
            fwEscriArch_t.write(strContenido_p);
            fwEscriArch_t.close();

        } finally {
            strRutaArch__t = null;
            filArchiNuev_t = null;
            if (fwEscriArch_t != null) {
                try {
                    fwEscriArch_t.close();
                } catch (IOException e) {
                }
            }
        }
    }

    /**
     * Determina si un archivo existe o no
     *
     * @param strRutaArchi_p
     * @return
     */
    public static boolean archivoExiste(String strRutaArchi_p) {
        return new File(strRutaArchi_p).exists();
    }

    /**
     * Un booleano que retorna si un archivo es igual al otro
     *
     * @param strPathOriginal
     * @param strPathCopia
     * @return
     */
    public static boolean archivoIgual(String strPathOriginal, String strPathCopia) {

        File filOriginal;
        File filCopia;

        filOriginal = new File(strPathOriginal);
        filCopia = new File(strPathCopia);

        // Si ambos archivos existen se comprueba su tamaño
        if (filOriginal.exists() && filCopia.exists()) {
            if (filOriginal.length() == filCopia.length()) {
                return true; // El archivo esta igual
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    /**
     * Copia un archivo desde el origen hasta el destino, reemplazando el
     * existente
     *
     * @param pathOrigen
     * @param pathDestino
     * @throws IOException
     */
    public void copiaReemplazaArchivo(String pathOrigen, String pathDestino) throws IOException {
        Files.copy(new File(pathOrigen).toPath(), new File(pathDestino).toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    /**
     * Mueve el archivo desde el origen hasta el destino, reemplazando el
     * destino
     *
     * @param pathOrigen
     * @param pathDestino
     * @throws IOException
     */
    public void mueveReemplazaArchivo(String pathOrigen, String pathDestino) throws IOException {
        Files.move(new File(pathOrigen).toPath(), new File(pathDestino).toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    /**
     * Borra la linea de un archivo por el contenido de la frase enviada
     *
     * @param archivo
     * @param inicio
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void borraLineaDeArchivoPorContenido(String archivo, String inicio) throws FileNotFoundException, IOException {

        File inFile = new File(archivo);

        if (!inFile.isFile()) {
            //System.out.println("Parameter is not an existing file");
            return;
        }

        //Construct the new file that will later be renamed to the original filename.
        File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

        String line = null;

        //Read from the original file and write to the new
        //unless content matches data to be removed.
        while ((line = br.readLine()) != null) {

            if (!line.trim().contains(inicio.trim())) {
                pw.println(line);
                pw.flush();
            }
        }
        pw.close();
        br.close();

        //Delete the original file
        if (!inFile.delete()) {
            //System.out.println("Could not delete file");
            return;
        }

        //Rename the new file to the filename the original file had.
        if (!tempFile.renameTo(inFile)) {
            //System.out.println("Could not rename file");
        }

    }

    /**
     * Elimina el archivo enviado en el path
     *
     * @param path - URL donde esta el archivo fisico
     * @throws IOException
     */
    public void eliminaArchivo(String path) throws IOException {
        Files.delete(new File(path).toPath());
    }

    /**
     * Busca el parametro especificado strLinBusq___p, en el archivo enviado
     *
     * @param objArchivo___p
     * @param strLinBusq___p
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static boolean buscarLinea(File objArchivo___p, String strLinBusq___p) throws FileNotFoundException, IOException {
        BufferedReader bf = new BufferedReader(new FileReader(objArchivo___p));
        String strCadenaLin_t;
        while ((strCadenaLin_t = bf.readLine()) != null) {
            if (strCadenaLin_t.contains(strLinBusq___p)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Agrega una linea al archivo especificado, si el archivo no existe lo crea
     *
     * @param strRutaArchi_p
     * @param strNombreArc_p
     * @param strContenido_p
     * @throws IOException
     */
    public static void agregarLineaArchivo(String strRutaArchi_p, String strNombreArc_p, String strContenido_p) throws IOException {
        File file;
        FileWriter fileWritter;
        BufferedWriter bufferWritter;
        try {
            file = new File(strRutaArchi_p + strNombreArc_p);

            if (!file.exists()) {
                crearArchivo(strRutaArchi_p, strNombreArc_p, strContenido_p);
            }

            fileWritter = new FileWriter(file, true);
            bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write(strContenido_p);
            bufferWritter.close();

        } finally {
            file = null;
            fileWritter = null;
            bufferWritter = null;
        }
    }

    /**
     * Agrega una linea a un archivo enviando el path completo de la locacion
     *
     * @param strRutaCompletaArchi_p
     * @param strContenido_p
     * @throws IOException
     */
    public static void agregarLineaArchivo(String strRutaCompletaArchi_p, String strContenido_p) throws IOException {
        File file;
        FileWriter fileWritter;
        BufferedWriter bufferWritter;

        try {

            file = new File(strRutaCompletaArchi_p);

            if (!file.exists()) {
                crearArchivo(strRutaCompletaArchi_p, strContenido_p);
            }

            fileWritter = new FileWriter(file, true);
            bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write(strContenido_p);
            bufferWritter.close();

        } finally {
            file = null;
            fileWritter = null;
            bufferWritter = null;
        }
    }

    /**
     * Inserta una linea despues de strLinAnte___p, en el archivo especificado
     *
     * @param objArchivo___p
     * @param strLinAnte___p
     * @param strLinInsert_p
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void insertaLineaEnArchivo(File objArchivo___p, String strLinAnte___p, String strLinInsert_p) throws IOException {

        File outFile;
        FileInputStream fis;
        BufferedReader in;
        FileOutputStream fos;
        PrintWriter out;

        String thisLine = "";
        int i;

        try {
            outFile = new File("/etc/asterisk/tmp.conf");
            fis = new FileInputStream(objArchivo___p);
            in = new BufferedReader(new InputStreamReader(fis));
            fos = new FileOutputStream(outFile);
            out = new PrintWriter(fos);

            i = 1;
            while ((thisLine = in.readLine()) != null) {
                out.println(thisLine);
                if (thisLine.contains(strLinAnte___p)) {
                    out.print(strLinInsert_p);
                }

                i++;
            }

            objArchivo___p.delete();
            outFile.renameTo(objArchivo___p);

            out.flush();
            out.close();
            in.close();
        } catch (IOException e) {
            throw new IOException(e);
        } finally {
            outFile = null;
            fis = null;
            fos = null;
            out = null;
            in = null;
        }

    }

    /**
     * Retorna el contenido d e una rchivo leido linea por linea
     *
     * @param strRutComArc_p
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String contenidoArchivo(String strRutComArc_p) throws FileNotFoundException, IOException {
        BufferedReader br = null;
        String strConteArc__t = "";

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader(strRutComArc_p));

            while ((sCurrentLine = br.readLine()) != null) {
                strConteArc__t += sCurrentLine + "\n";
            }

        } finally {

            if (br != null) {
                br.close();
            }

        }

        return strConteArc__t;
    }

    /**
     * Borra el directorio especificado en el parametro
     *
     * @param strRutaCompl_p
     * @throws IOException
     */
    public static void borrarDirectorioRecursivamente(String strRutaCompl_p) throws IOException {
        Path directory = Paths.get(strRutaCompl_p);
        Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }

        });
    }

    /**
     * Borra el archivo especificado en la ruta
     *
     * @param strRutaArch__p
     * @throws IOException
     */
    public static void borrarArchivo(String strRutaArch__p) {
        try {
            Files.deleteIfExists(new File(strRutaArch__p).toPath());
        } catch (IOException e) {
            System.out.println("No lo borro " + e.getLocalizedMessage());
        }
    }

    /**
     * Retorna la lista de archivos de una carpeta ordenada ascendentemente
     *
     * @param folder
     * @return
     */
    public static File[] listaDearchivosOrdenadosAscendente(File folder) {
        if (!folder.isDirectory()) {
            return null;
        }
        File files[] = folder.listFiles();
        Arrays.sort(files, new Comparator() {
            @Override
            public int compare(final Object o1, final Object o2) {
                return new Long(((File) o1).lastModified()).compareTo(((File) o2).lastModified());
            }
        });
        return files;
    }

    /**
     * Crea un archivo con el contenido pasado en input stram
     *
     * @param strRutaComp__p
     * @param objStream____p
     * @throws java.io.FileNotFoundException
     */
    public static void crearArchivo(String strRutaComp__p, InputStream objStream____p) throws FileNotFoundException, IOException {

        try ( // write the inputStream to a FileOutputStream
                OutputStream out = new FileOutputStream(new File(strRutaComp__p))) {
            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = objStream____p.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }

            objStream____p.close();
            out.flush();
        }

    }

    /**
     * Descarga un archivo de la direccion al recurso local destinado
     *
     * @param strDireccion_p
     * @param strArchiLoc_p
     * @throws java.net.MalformedURLException
     * @throws java.io.FileNotFoundException
     */
    public static void descargar(String strDireccion_p, String strArchiLoc_p) throws MalformedURLException, FileNotFoundException, IOException {
        OutputStream out = null;
        URLConnection conn = null;
        InputStream in = null;

        try {
            URL url = new URL(strDireccion_p);
            out = new BufferedOutputStream(new FileOutputStream(strArchiLoc_p));
            conn = url.openConnection();
            in = conn.getInputStream();
            byte[] buffer = new byte[1024];

            lngDescargaNumeroTotalBytes_t = in.available();
            int numRead;
            long numWritten = 0;

            while ((numRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, numRead);
                numWritten += numRead;
                lngDescargaNumeroTotalBytes_t += in.available();
                lngDescargaNumeroActualBytes_t = numWritten;
            }

        } finally {
            lngDescargaNumeroTotalBytes_t = 10;
            lngDescargaNumeroActualBytes_t = 0;
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioe) {
            }
        }
    }

    /**
     * Descarga un archivo
     *
     * @param strDireccion_p
     * @throws java.io.FileNotFoundException
     */
    public static void descargar(String strDireccion_p) throws FileNotFoundException, IOException {
        int lastSlashIndex = strDireccion_p.lastIndexOf('/');
        if (lastSlashIndex >= 0
                && lastSlashIndex < strDireccion_p.length() - 1) {
            descargar(strDireccion_p, strDireccion_p.substring(lastSlashIndex + 1));
        } else {

        }
    }

    public static long getLngDescargaNumeroTotalBytes_t() {
        return lngDescargaNumeroTotalBytes_t;
    }

    public static long getLngDescargaNumeroActualBytes_t() {
        return lngDescargaNumeroActualBytes_t;
    }

}
