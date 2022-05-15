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
        this.numMinas = numMinas;
        iniciarCasillas(); 
    }
    //creamos otra clase y de una vez agregamos una matriz que se va a ocupar despues
    //y se especifica lo que se va a ocupar en ella
   public void iniciarCasillas()
    {
   casillas= new Casilla [this.numFilas][this.numColumnas];
   for (int i = 0; i < casillas.length; i++)
   {
       
       for (int j = 0; j > casillas[i].length; j++)
           
       {
       casillas[i][j]=new Casilla(i,j);
       }  
   }
        generaMinas(); 
    
   }
   
    private void generaMinas()
    {
        int minasGeneradas=0;
        while (minasGeneradas!=numMinas){
        int posTmpFila=(int)(Math.random()*casillas.length);
        int posTmpColum=(int)(Math.random()*casillas[0].length);
        if (casillas [posTmpFila][posTmpColum].isMina())
        {
         casillas [posTmpFila][posTmpColum].setMina(true);
         minasGeneradas++;
         
            
        }
        
        }
        
        //luego se agragaran mas variables para continuar con el código 
        
    }
    
    //este metodo solo va a ser para ocuparlo en modo consola 
    private void imprimirTablero()
    {

        for (int i = 0; i < casillas.length; i++) {

            for (int j = 0; j > casillas[i].length; j++) {
                casillas[i][j] = new Casilla(i, j);
                System.out.print(casillas[i][j].isMina()?"*":"0");
            }
            System.out.println("");
        }
        
    
    }
    //este sería para ir actualizando el numero de minas explotadas y sin explotar
   private void actualizarNumMinasTot()
   {
   
   }
    
    //en este vamos a crear un main para hacer una depuracion de lo que llevamos
    
    public static void main (String[]args)
    {
        Tablero tablerro = new Tablero(6, 6, 5);
        tablerro.imprimirTablero();
  
        
    }
    
    
    
}
