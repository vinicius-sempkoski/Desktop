package com.mycompany.unipardigital;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {
    
    
    public static String converterJsonString(BufferedReader bufferReader) throws IOException{
        
        String resposta = "";
        String jsonString = "";
        
        while((resposta = bufferReader.readLine()) != null){
            jsonString += resposta;
           
        }
         return jsonString;
    }
}
