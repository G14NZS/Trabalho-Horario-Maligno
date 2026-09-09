import java.util.*;

public class Horario
{
    private byte hora, minuto, segundo;
    int qtd=0;

    public /*void*/ Horario (byte hora, byte minuto, byte segundo) throws Exception
    {
      
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);

    }

    public void setHora (byte hora) throws Exception
    {
        if (hora>23 || hora<0)
            throw new Exception ("Hora invalida");
        this.hora=hora;
    }

    public void setMinuto (byte minuto) throws Exception
    {
        if (minuto>59 || minuto<0)
            throw new Exception ("Minuto invalido");
        this.minuto=minuto;
    }

    public void setSegundo (byte segundo) throws Exception
    {
        if (segundo>59 || segundo<0)
            throw new Exception ("Segundo invalido");
        this.segundo=segundo;
    }

    public byte getHora ()
    {
      return this.hora;
    }

    public byte getMinuto ()
    {
      return this.minuto;
    }

    public byte getSegundo ()
    {
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
             if (this.hora>23)
              this.hora=(this.hora%24);
          this.minuto+=segundos/60;
            if (this.minuto>59)
              this.hora=(this.hora%24);
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
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==this) return true;
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass()) return false;
        Horario time = (Horario) obj;
        if (time.qtd!= this.qtd) return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.qtd);
    }
}
