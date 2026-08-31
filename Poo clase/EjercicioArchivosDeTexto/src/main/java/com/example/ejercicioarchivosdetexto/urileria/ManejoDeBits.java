package com.example.ejercicioarchivosdetexto.urileria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ManejoDeBits {
    File nombreArchivo;
    public  ManejoDeBits(String nombreArchivo){
        this.nombreArchivo=new File(nombreArchivo);
    }
    public void escribirByte(int c){

    }

    public int leerByte() {
        int unByte = -1;
        FileInputStream in = null;

        try {
            in = new FileInputStream(nombreArchivo);
            if ((unByte = in.read()) != -1) {
                System.out.println(unByte);
            }

            if ((unByte = in.read()) != -1) {
                System.out.println(unByte);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) ;
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return unByte;
        }

    public ArrayList<Integer> leer8bytes(){
int unByte=-1;
int contador=0;

ArrayList<Integer> ochoByte=new ArrayList<>();
        FileInputStream in=null;

        try {
            in =new FileInputStream(nombreArchivo);
            while((unByte=in.read())!=-1 && (contador<8)){
                System.out.println(unByte);
            }

            if  ((unByte= in.read()) != -1) {
                System.out.println(unByte);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
     finally {
        if (in != null) ;
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
            return ochoByte;
    }

   public  String verificarFormato(ArrayList<Integer> ochoByte){
        String formato="";

        return formato;
   }
}
