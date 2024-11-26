import java.util.Scanner;

public class Jugadores {

      Scanner scanner = new Scanner(System.in);
      String jugadorUno;
      String jugadorDos;
      int score;

      public void datosDeJugadores() {
            System.out.println("Ingrese el nombre del jugador uno:");
            jugadorUno = scanner.nextLine();

            System.out.println("Ingrese el nombre del jugador dos:");
            jugadorDos = scanner.nextLine();

            System.out.println("Jugador uno: " + jugadorUno);
            System.out.println("Jugador dos: " + jugadorDos);
      }

      public void guardarEnLS() {
            
      }

}