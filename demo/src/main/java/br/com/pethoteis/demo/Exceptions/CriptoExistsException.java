package br.com.pethoteis.demo.Exceptions;

public class CriptoExistsException extends Exception{
    public CriptoExistsException(String message){
        super(message);
    }
    private static final long SerialVersionUID = 1L;
}
