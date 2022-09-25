import java.time.LocalDate;

public class Partida {
    private Time timeCasa;
    private Time timeFora;

    private int golsCasa;
    private int golsFora;

    private Estadio estadio;

    private LocalDate data;

    public Partida(Time timeCasa, Time timeFora) {
        this.timeCasa=timeCasa;
        this.timeFora=timeFora;
    }
    public Partida() {}

    public Time getTimeCasa() {
        return timeCasa;
    }
    public void setTimeCasa(Time timeCasa) {
        this.timeCasa = timeCasa;
    }
    public Time getTimeFora() {
        return timeFora;
    }
    public void setTimeFora(Time timeFora) {
        this.timeFora = timeFora;
    }
    public int getGolsCasa() {
        return golsCasa;
    }
    public void setGolsCasa(int golsCasa) {
        this.golsCasa = golsCasa;
    }
    public int getGolsFora() {
        return golsFora;
    }
    public void setGolsFora(int golsFora) {
        this.golsFora = golsFora;
    }
    public void setGols(int golsCasa, int golsFora) {
        this.golsCasa=golsCasa;
        this.golsFora=golsFora;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
}