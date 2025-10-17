package com.hugomachadodev.CalculadoraSimplesTsi2025;

import com.hugomachadodev.CalculadoraSimplesTsi2025.Exceptions.UnsupportedMathOperationException;

public class NumberConvert {
    public static double convertToDouble(String strNumber) throws Exception {
        if(strNumber == null){
            throw new UnsupportedMathOperationException("Requisição inválida! Por favor, envie apenas números!");
        }

        strNumber = strNumber.replaceAll(",",".");
        
        if(!isNumeric(strNumber)){
            throw new UnsupportedMathOperationException("Requisição inválida! Por favor, envie apenas números!");
        }

        return(Double.parseDouble(strNumber));
    }

    public static boolean isNumeric(String strNumber) {
        if(strNumber == null) {
            return false;
        }

        return(strNumber.matches("[-+]?[0-9]*\\.?[0-9]+"));
    }
}
