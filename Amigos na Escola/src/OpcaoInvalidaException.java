public class OpcaoInvalidaException extends Exception {
	
public OpcaoInvalidaException(String message) {
	
super(message);

}
public OpcaoInvalidaException(int x) throws Exception{
    if( x < 0|| x> 10){
        throw new Exception("Digite uma opcao valida");
    }
}


}