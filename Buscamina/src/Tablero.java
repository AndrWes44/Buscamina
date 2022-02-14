//creamos la clase llamada Casilla
public class Tablero

{
  Casilla[][] casillas;
  
  int numFilas;
  int numColumnas;
  int numMinas;
  int numMinasAlrededor;
  
//creamos otra clase llamada Tablero
    public Tablero(int numFilas, int numColumnas, int numMinas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
    }
    //creamos otra clase y de una vez agregamos una matriz que se va a ocupar despues
    //y se especifica lo que se va a ocupar en ella
   public void iniciarCasillas()
   {
   casillas= new Casilla [this.numFilas][this.numColumnas];
   
   }
    private void generaMinas()
    {
        int minasGeneradas=0;
        //luego se agragaran mas variables para continuar con el código 
        
    }
    
    //este metodo solo va a ser para ocuparlo en modo consola 
    private void imprimirTablero()
    {
    
    
    }
    //este sería para ir actualizando el numero de minas explotadas y sin explotar
   private void actualizarNumMinasTot()
   {
   
   }
    
    //en este vamos a crear un main para hacer una depuracion de lo que llevamos
    
    public static void main (String[]args)
    {
        
        
    }
    
    
    
}
