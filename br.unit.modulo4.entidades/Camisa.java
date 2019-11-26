package br.unit.modulo4.entidades;

import java.util.Random;

//Essa classe serve para simular um objeto do tipo "Camisa". Porém aqui, ao invés de o construtor retornar um objeto, retorna uma String com a cor da camisa para que possa ser armazenada na Lista.

public class Camisa {

	public static String gerarCamisa() {

		Random r = new Random();
		int low = 1;
		int high = 70;
		int idCor = r.nextInt(high - low) + low;

		switch (idCor) {

		case 1:
			return "Abóbora";
		case 2:
			return "Açafrão";
		case 3:
			return "Amarelo";
		case 4:
			return "Âmbar";
		case 5:
			return "Ameixa";
		case 6:
			return "Amêndoa";
		case 7:
			return "Ametista";
		case 8:
			return "Anil";
		case 9:
			return "Azul";
		case 10:
			return "Bege";
		case 11:
			return "Bordô";
		case 12:
			return "Branco";
		case 13:
			return "Bronze";
		case 14:
			return "Cáqui";
		case 15:
			return "Caramelo";
		case 16:
			return "Carmesim";
		case 17:
			return "Carmim";
		case 18:
			return "Castanho";
		case 19:
			return "Cereja";
		case 20:
			return "Chocolate";
		case 21:
			return "Ciano";
		case 22:
			return "Cinza";
		case 23:
			return "Cinzento";
		case 24:
			return "Cobre";
		case 25:
			return "Coral";
		case 26:
			return "Creme";
		case 27:
			return "Damasco";
		case 28:
			return "Dourado";
		case 29:
			return "Escarlate";
		case 30:
			return "Esmeralda";
		case 31:
			return "Ferrugem";
		case 32:
			return "Fúcsia";
		case 33:
			return "Gelo";
		case 34:
			return "Grená";
		case 35:
			return "Gris";
		case 36:
			return "Índigo";
		case 37:
			return "Jade";
		case 38:
			return "Jambo";
		case 39:
			return "Laranja";
		case 40:
			return "Lavanda";
		case 41:
			return "Lilás";
		case 42:
			return "Limão";
		case 43:
			return "Loiro";
		case 44:
			return "Magenta";
		case 45:
			return "Malva";
		case 46:
			return "Marfim";
		case 47:
			return "Marrom";
		case 48:
			return "Mostarda";
		case 49:
			return "Negro";
		case 50:
			return "Ocre";
		case 51:
			return "Oliva";
		case 52:
			return "Ouro";
		case 53:
			return "Pêssego";
		case 54:
			return "Prata";
		case 55:
			return "Preto";
		case 56:
			return "Púrpura";
		case 57:
			return "Rosa";
		case 58:
			return "Roxo";
		case 59:
			return "Rubro";
		case 60:
			return "Salmão";
		case 61:
			return "Sépia";
		case 62:
			return "Terracota";
		case 63:
			return "Tijolo";
		case 64:
			return "Turquesa";
		case 65:
			return "Uva";
		case 66:
			return "Verde";
		case 67:
			return "Vermelho";
		case 68:
			return "Vinho";
		case 69:
			return "Violeta";
		}
		
		return null;

	}

}