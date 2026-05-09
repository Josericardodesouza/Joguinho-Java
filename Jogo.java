// JOGO RPG JOSE RICARDO 1.0


import java.util.Scanner;


/* class CriarPersonagem() {



void exibirMenu() {








} 




} */


public class Jogo {

 public static void main (String[] args) {


Scanner entrada = new Scanner(System.in);

Boolean menuCabelo = true;
String corCabeloEscolhido;
boolean validarCabelo;


while (menuCabelo) {

System.out.println("Qual a cor do cabelo do seu personagem?");
System.out.println("[ 1 ] Preto.");
System.out.println("[ 2 ] Castanho.");
System.out.println("[ 3 ] Loiro.");
System.out.println("[ 4 ] Ruivo.");

if (entrada.hasNextInt()) {

int opcaoCabelo = entrada.nextInt();


 switch (opcaoCabelo) {

 case 1:

corCabeloEscolhido = "preto";
 validarCabelo = false;
break;


 case 2:
 
 corCabeloEscolhido = "castanho";
 validarCabelo = false;
break;

case 3: 

 corCabeloEscolhido = "loiro";
 validarCabelo = false;
break;


case 4:

 corCabeloEscolhido = "ruivo";
 validarCabelo = false;
 break;


default:

 System.out.println("Opção inválida!");
  validarCabelo = true;
break;

} //fechamento switch;




} else {

 System.out.println("Opção inválida!");
  validarCabelo = true;
  entrada.next();


}


menuCabelo = validarCabelo;



} //fechamento while;







 



} //fechamento Jogo

} // fechamento Main