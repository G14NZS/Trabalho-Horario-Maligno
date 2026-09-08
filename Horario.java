import java.util.*;


public class Main
{
    public static void main(String[] args) {
        Horario criaHorario = new Horario ((byte)22, (byte)42, (byte)50);
        System.out.println(criaHorario);
    }  
}



public class Horario
{
    private byte hora, minuto, segundo;
    int qtd=0;

    public /*void*/ Horario (byte hora, byte minuto, byte segundo) throws Exception
    {
      
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);

        //Horario.qtd++;
    }

    public void setHora (byte hora) throws Exception
    {
        if (!Horario.isValida(hora,this.minuto,this.segundo))
            throw new Exception ("Horario invalida");
        this.hora=hora;
    }

    public void setMinuto (byte minuto) throws Exception
    {
        if (!Horario.isValida(this.hora,minuto,this.segundo))
            throw new Exception ("Horario invalido");
        this.minuto=minuto;
    }

    public void setSegundo (byte segundo) throws Exception
    {
        this.segundo=segundo;
    }

    public byte getHora ()
    {
        if (hora>23 || hora<0)
            throw new Exception ("Hora invalido");
        return this.hora;
    }

    public byte getMinuto ()
    {
        if (minuto>59 || minuto<0)
            throw new Exception ("Minuto invalido");
        return this.minuto;
    }

    public byte getSegundo ()
    {
        if (segundo>59 || segundo<0)
            throw new Exception ("Segundo invalido");
        return this.segundo;
    }
    
    public void adiante (int qtdSegundos) throws Exception
    {
        if (qtdSegundos<=0)
            throw new Exception ("Quantidade de segundos invalido");
        this.segundo+=qtdSegundos;
        if (segundo>59){
            if(segundo>3600)
              this.hora+=segundo/3600;
            this.minuto+=segundo/60;
            if
            this.segundo=segundo%60;
        }
    }

    public void retroceda (int qtdSegundos) throws Exception
    {
        if (qtdSegundos<=0)
          throw new Exception ("Quantidade de segundos invalido");
        
    }

    public Horario getHorarioFuturo (int qtdSegundos) throws Exception // nao altera o this
    {
        // faça
    }

    public Horario getHorarioPassado (int qtdSegundos) throws Exception // nao altera o this
    {
        // faça
    }

    @Override
    public String toString()
    {

    }

    @Override
    public boolean equals(Object obj)
    {

    }

    @Override
    public int hashCode()
    {

    }
}
