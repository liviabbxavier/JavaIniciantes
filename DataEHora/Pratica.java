package DataEHora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {
        // data e hora atual
        String tarefa = "Enviar relatório semanal";

        LocalDate dataEntrega = LocalDate.now();
        LocalTime horaEntrega = LocalTime.now();

        System.out.println("Tarefa: " + tarefa);
        System.out.println("Data atual: " + dataEntrega);
        System.out.println("Hora atual: " + horaEntrega + "\n");

        // formatando data e hora
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data formatada: " + dataEntrega.format(formatoData));
        System.out.println("Hora formatada: " + horaEntrega.format(formatoHora) + "\n");

        // diferença entre horas
        LocalTime horaInicio = LocalTime.of(8, 0);
        LocalTime horaFim = LocalTime.of(12, 0);

        Duration duracao = Duration.between(horaInicio, horaFim);
        System.out.println("Diferença de horário do prazo: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos.\n");

        // calculando data de entrega
        LocalDate dataInicio = LocalDate.of(2025, 12, 30);
        int prazoDias = 60;
        LocalDate dataFim = dataInicio.plusDays(prazoDias);
        
        System.out.println("Data de etrega: " + dataFim.format(formatoData) + "\n");

        // data de vencimento
        LocalDate dataVencimento = LocalDate.of(2026, 7, 15);
        LocalDate novaDataVencimento = dataVencimento.plusMonths(2);

        System.out.println("Data de vencimento original: " + dataVencimento.format(formatoData));
        System.out.println("Nova data de vencimento: " + novaDataVencimento.format(formatoData) + "\n");

        // verificando data de um evento
        LocalDate dataEvento = LocalDate.of(2026, 6, 15);
        LocalDate dataAtual = LocalDate.now();

        System.out.println("Data do evento: " + dataEvento.format(formatoData));
        System.out.println("Data atual: " + dataAtual.format(formatoData));

        if (dataEvento.isBefore(dataAtual)) {
            System.out.println("O evento já aconteceu!\n");
        } else if (dataEvento.isEqual(dataAtual)) {
            System.out.println("O evento é hoje!\n");
        } else {
            System.out.println("O evento ainda não aconteceu!\n");
        }

        // lembrete de pagamento
        int antecedeDias = 5;
        LocalDate dataLembrete = dataVencimento.minusDays(antecedeDias);
        System.out.println("Data do lembrete: " + dataLembrete.format(formatoData));

        // fuso horário

        ZonedDateTime horaTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("\nHorário atual em Tokyo: " + horaTokyo.format(formatoHora));

        // convertendo fuso-horário
        ZonedDateTime horaAtual = horaTokyo.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        System.out.println("\nHorário atual em Tokyo: " + horaTokyo.format(formatoHora));
        System.out.println("\nHorário atual no sistema: " + horaAtual.format(formatoHora));

        // controle de expediente
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatoHora);
 
        System.out.print("Digite a carga horária diária (em horas): ");
        int cargaHoraria = scanner.nextInt();
 
        System.out.print("Digite o horário real de saída (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(scanner.next(), formatoHora);
 
        scanner.close();
        
        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);
        
        Duration diferenca = Duration.between(saidaPrevista, saidaReal);
        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();
        
        System.out.println("\nHorário de entrada: " + entrada.format(formatoHora));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatoHora));
        System.out.println("Horário real de saída: " + saidaReal.format(formatoHora));
 
        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;
            
            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }
        
            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }
    }
}
