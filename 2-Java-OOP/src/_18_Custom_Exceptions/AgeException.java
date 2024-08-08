package _18_Custom_Exceptions;
// Custom Exception = User Defined exception derived from Exception class.
//                    Used to customize the exception according to users need.

public class AgeException extends Exception{
    AgeException(String message){
        super(message);
    }
}
