// JOGO RPG JOSE RICARDO Versão 0.2


import java.util.Scanner;


class Personagem {





}


/* class CriarPersonagem() {



void exibirMenu() {








} 




} */


public class Jogo {

 public static void main (String[] args) {


Scanner entrada = new Scanner(System.in);

Boolean menuCabelo = true;
Boolean menuAltura = true;
Boolean nomeNConfirm = true;
String corCabeloEscolhido = "";
String alturaEscolhida = "";
boolean validarCabelo;
boolean validarAltura;
String nomeJogador = "";
String alturaJogador = "";



while (nomeNConfirm) {

System.out.println("Olá jogador! Qual o seu nome?");
nomeJogador = entrada.nextLine();


if (!nomeJogador.trim().isEmpty()) {

 nomeNConfirm = false;

} else {

 System.out.println("Por favor digite um nome ;)");
nomeNConfirm = true;
 



}

}


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


while (menuAltura) {

System.out.println("Qual a altura do seu personagem?");
System.out.println("[ 1 ] Muito alto.");
System.out.println("[ 2 ] Alto.");
System.out.println("[ 3 ] Baixo.");
System.out.println("[ 4 ] Muito baixo.");

if (entrada.hasNextInt()) {

int opcaoAltura = entrada.nextInt();


 switch (opcaoAltura) {

 case 1:

alturaEscolhida = "muito alto(a)";
 validarAltura = false;
break;


 case 2:
 
 alturaEscolhida = "alto(a)";
 validarAltura = false;
break;

case 3: 

 alturaEscolhida = "baixo(a)";
 validarAltura = false;
break;


case 4:

 alturaEscolhida = "muito baixo(a)";
 validarAltura = false;
 break;


default:

 System.out.println("Opção inválida!");
  validarAltura = true;
break;

} //fechamento switch;




} else {

 System.out.println("Opção inválida!");
  validarAltura = true;
  entrada.next();


}


menuAltura = validarAltura;




} //fechamento while;





System.out.println("Olá " + nomeJogador);
System.out.println("Você tem um belo cabelo " + corCabeloEscolhido + " e é " + alturaEscolhida);



 



} //fechamento Jogo

} // fechamento Main