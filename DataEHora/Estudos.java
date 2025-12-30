package DataEHora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Estudos {
    // localDate - apenas data
    // localTime - apenas hora
    // localDateTime - data e hora

    // .of() - insere ano-mês-dia
    // .parse() - 
    // .now() - pega a data atual

    // plusDays - adiciona dias após o .of
    // plusWeeks - adiciona semanas após o .of
    // plusMonths - adiciona meses após o .of
    // plusYears - adiciona anos após o .of

    // minusDays - 
    // minusWeeks - 
    // minusMonths - 
    // minusYears - 

    // isBefore - é antes de...?
    // isAfter - é depois de...?
    // isEqual - é igual a...?

    // DateTimeFormatter - formata para o padrão desejado
    // ZonedDateTime - formata para o local desejado

    // Duration
    // Period
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.of(2025, 1, 7);
        LocalDate dataPrimeiraParcela = LocalDate.of(2026, 5, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if (dataPrimeiraParcela.isEqual(LocalDate.now())) {
            System.out.println("Hoje é o dia do vencimento.");
        } else {
            System.out.println("Sua parcela ainda não venceu.");
        }

        System.out.println("Data da compra: " + dataCompra);
        System.out.println("Data da primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data da segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        // nesse caso os dois "M's" precisam ser maiúsculos, caso contrário a IDE iterpreta como minutos ao invés de mês
        
        System.out.println("Data da compra formatada: " + dataCompra.format(formato));

        ZonedDateTime conclusaoCompra = ZonedDateTime.now();
        System.out.println("Data e horário da compra: " + conclusaoCompra.format(formato));        
        ZonedDateTime dataCompraNY = conclusaoCompra.withZoneSameInstant(
            ZoneId.of("America/New_York"));
        System.out.println("Data da conclusão da compra em NY: " + dataCompraNY);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos.");
    
        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença em dias: " + periodo.getDays());
    }
}
