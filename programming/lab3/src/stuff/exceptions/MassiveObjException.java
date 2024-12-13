package prod.stuff.exceptions;

public class MassiveObjException extends RuntimeException{
    public MassiveObjException(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return "Объект такой большой, что не может двигаться";
    }

}
