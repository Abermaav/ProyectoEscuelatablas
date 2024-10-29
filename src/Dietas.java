public class Dietas {
    String[] desayuno = new String[3];
    String[] colacion = new String[3];
    String[] comida = new String[3];
    String[] merienda = new String[3];
    String[] cena = new String[3];

    public Dietas(double IMC) {
        if (IMC < 18.5) {
            desayuno[0] = "El desayuno de hoy Será:\n2 rebanadas de pan integral (tostado)\n2 cucharadas de mantequilla de maní o almendra\n1 plátano rebanado encima del pan\n1 taza de yogur griego (con granola y frutas como fresas o moras)\n1 vaso de leche entera o un batido con leche, fruta y un poco de avena\n";
            desayuno[1] = "El desayuno de hoy Será:\n1 bol de avena cocida con leche entera\n(añade una cucharada de semillas de chía, almendras y un puñado de frutas secas)\n1 huevo revuelto con espinacas y queso\n1 vaso de jugo natural de naranja o mango\n";
            desayuno[2] = "El desayuno de hoy Será:\nSmoothie energético: 1 taza de leche entera, 1/2 taza de avena, 1 plátano\n1 cucharada de mantequilla de maní, 1 cucharada de cacao en polvo\n(sin azúcar) y un puñado de espinacas\n2 rebanadas de pan integral con aguacate y queso\n";

            colacion[0] = "La colacion de hoy Será:\n1 batido energético: 1 taza de leche entera, 1 plátano, \n1 cucharada de mantequilla de maní y un puñado de avena\n1 puñado de nueces o almendras (30 g)\n";
            colacion[1] = "La colacion de hoy Será:\n2 rebanadas de pan integral con aguacate y rodajas de pavo o queso\n1 taza de yogur griego con frutas secas y una cucharada de granola\n";
            colacion[2] = "La colacion de hoy Será:\nHummus con pan pita (30 g de hummus y 1 pan pita pequeño)\n1 fruta como mango, plátano o uvas\n";

            comida[0] = "La comida de hoy Será:\nProteína: 150 g de pollo a la parrilla o al horno con especias\nCarbohidratos: 1 taza de arroz integral\nGrasas: 1/4 de aguacate o 1 cucharada de aceite de oliva añadido a una ensalada\nVerduras: Ensalada de espinacas, zanahorias, y tomates \ncon 1 cucharada de semillas de chía o de ajonjolí\n";
            comida[1] = "La comida de hoy Será:\nProteína: 200 g de salmón a la plancha con limón y especias\nCarbohidratos: 1 taza de puré de papa con un poco de mantequilla o aceite de oliva\nGrasas: 10-15 almendras o una cucharada de mantequilla de almendras en el puré\nVerduras: Brócoli al vapor o espárragos con un toque de aceite de oliva\n";
            comida[2] = "La comida de hoy Será:\nProteína: 150 g de carne magra de res\nCarbohidratos: 1 taza de quinoa cocida o pasta integral\nGrasas: 1 cucharada de pesto o una mezcla de aguacate con limón\nVerduras: Pimientos y calabacín al grill con hierbas\n";

            merienda[0] = "La merienda de hoy Será:\n1 rebanada de pan integral con aguacate y queso fresco\n1 batido de leche entera con 1 plátano, una cucharada de avena y una cucharadita de miel\n";
            merienda[1] = "La merienda de hoy Será:\n1 tazón de yogur griego con 1/4 de taza de granola, frutas frescas \n(como mango o fresas) y una cucharada de semillas de chía\n1 puñado de almendras o nueces\n";
            merienda[2] = "La merienda de hoy Será:\nSmoothie de frutas: 1 taza de leche de almendra o de avena, 1 plátano, \n1 cucharada de mantequilla de maní y un poco de cacao en polvo sin azúcar\n2 galletas integrales con crema de cacahuate o almendra\n";

            cena[0] = "La cena de hoy Será:\nProteína: 150 g de pechuga de pollo a la plancha\nCarbohidratos: 1 taza de pasta integral con un poco de pesto o aceite de oliva\nGrasas: 1/4 de aguacate en rodajas para acompañar\nVerduras: Ensalada mixta (espinacas, tomate y zanahoria) \ncon 1 cucharada de semillas de girasol\n";
            cena[1] = "La cena de hoy Será:\nProteína: 200 g de salmón al horno con limón y especias\nCarbohidratos: 1 taza de puré de papa con una cucharada de mantequilla\nGrasas: 10-15 almendras\nVerduras: Brócoli al vapor o espárragos con un toque de aceite de oliva\n";
            cena[2] = "La cena de hoy Será:\nProteína: 150 g de carne magra de res\nCarbohidratos: 1 taza de quinoa cocida con especias\nGrasas: 1 cucharada de aceite de oliva en la quinoa o sobre las verduras\nVerduras: Pimientos y calabacín al grill\n";
        }

        if (IMC > 18.5 && IMC < 25) {
            desayuno[0] = "El desayuno de hoy Será:\n1 bol de avena cocida con leche o agua \n(añade una cucharada de semillas de chía y un puñado de frutas como fresas o manzana)\n1 huevo revuelto o cocido\n1 taza de té verde o café sin azúcar\n";
            desayuno[1] = "El desayuno de hoy Será:\n1 yogur griego con 1/4 taza de granola sin azúcar y trozos de fruta \n(mango, fresas o kiwi)\n1 rebanada de pan integral con aguacate\n1 vaso de agua con limón\n";
            desayuno[2] = "El desayuno de hoy Será:\n1 smoothie con leche, 1/2 taza de frutas (fresas o papaya) \n1 cucharada de semillas de lino y espinacas\n1 puñado de nueces o almendras\n";

            colacion[0] = "La colacion de hoy Será:\n1 yogur griego natural \ncon una cucharada de semillas de chía o linaza\nFrutas frescas como fresas o moras\n";
            colacion[1] = "La colacion de hoy Será:\n1 manzana con 1 cucharada de mantequilla de almendra o de maní\n1 puñado pequeño de almendras (15-20 g)\n";
            colacion[2] = "La colacion de hoy Será:\n1 huevo cocido con sal y pimienta\nPalitos de zanahoria o pepino como acompañamiento\n";

            comida[0] = "La comida de hoy Será:\nProteína: 120 g de pollo a la parrilla\nCarbohidratos: 1/2 taza de arroz integral o de camote\nGrasas: 1 cucharadita de aceite de oliva o 1/4 de aguacate\nVerduras: Ensalada mixta con lechuga, tomate y pepino\n";
            comida[1] = "La comida de hoy Será:\nProteína: 100 g de pescado a la plancha, como tilapia o robalo\nCarbohidratos: 1/2 taza de pasta integral con hierbas\nGrasas: Un poco de pesto (1 cucharadita) o aceite de oliva\nVerduras: Espárragos o brócoli al vapor\n";
            comida[2] = "La comida de hoy Será:\nProteína: 120 g de carne magra de res o de pavo\nCarbohidratos: 1/2 taza de quinoa cocida\nGrasas: 1 puñado pequeño de nueces o semillas\nVerduras: Calabacín y pimientos salteados\n";

            merienda[0] = "La merienda de hoy Será:\n1 manzana con 1 cucharada de mantequilla de almendra o de maní\n1 puñado de nueces o almendras (20 g)\n";
            merienda[1] = "La merienda de hoy Será:\n1 yogur griego con una cucharada de semillas de chía o de linaza\nFrutas frescas (como fresas o una mandarina)\n";
            merienda[2] = "La merienda de hoy Será:\nSmoothie: 1 taza de leche de almendra, 1/2 taza de espinacas\n1/2 taza de frutas frescas (fresas o mango) y 1 cucharada de semillas de lino\n";

            cena[0] = "La cena de hoy Será:\nProteína: 120 g de pechuga de pollo a la parrilla con especias\nCarbohidratos: 1/2 taza de puré de papa o camote\nGrasas: 1 cucharadita de aceite de oliva para sazonar las verduras\nVerduras: Brócoli y espinacas al vapor\n";
            cena[1] = "La cena de hoy Será:\nProteína: 120 g de pescado (como tilapia o dorado) al horno con limón\nCarbohidratos: 1/2 taza de arroz integral\nGrasas: 1 cucharada de semillas de chía o linaza en la ensalada\nVerduras: Ensalada mixta de espinaca, tomate, pepino y zanahoria\n";
            cena[2] = "La cena de hoy Será:\nProteína: 100 g de tofu o tempeh a la parrilla\nCarbohidratos: 1/2 taza de pasta integral o espaguetis de calabacín\nGrasas: 1 cucharadita de aceite de oliva o de ajonjolí\nVerduras: Pimientos y champiñones al grill\n";
        }

        if (IMC > 25) {
            desayuno[0] = "El desayuno de hoy Será:\n1 bol de yogur griego bajo en grasa con 1/4 de taza de frutas frescas\n(como fresas o frambuesas)\n1 cucharada de semillas de chía o linaza\n1 huevo cocido o revuelto con espinacas\n";
            desayuno[1] = "El desayuno de hoy Será:\nSmoothie bajo en calorías: agua, espinacas, pepino, 1/2 manzana y jugo de limón\n1 rebanada de pan integral con aguacate (opcional, solo una capa delgada)\n";
            desayuno[2] = "El desayuno de hoy Será:\n1 taza de avena cocida en agua con canela y trozos de manzana (sin azúcar añadida)\n1 huevo revuelto con espinacas y champiñones\n";

            colacion[0] = "La colacion de hoy Será:\nPalitos de pepino, zanahoria y apio con un poco de limón y sal\n1 puñado pequeño de nueces o almendras (10-15 g)\n";
            colacion[1] = "La colacion de hoy Será:\n1 yogur natural bajo en grasa o griego sin azúcar\nFrutas frescas como frambuesas o fresas (media taza)\n";
            colacion[2] = "La colacion de hoy Será:\n1 huevo cocido con espinacas y champiñones al vapor\nInfusión de té verde o té de jengibre sin azúcar\n";

            comida[0] = "La comida de hoy Será:\nProteína: 100 g de pollo a la parrilla sin piel\nCarbohidratos: 1/4 de taza de arroz integral\nGrasas: 1 cucharadita de aceite de oliva para sazonar\nVerduras: Ensalada verde con espinacas, pepino y un poco de limón\n";
            comida[1] = "La comida de hoy Será:\nProteína: 80 g de pescado blanco al horno (como merluza)\nCarbohidratos: 1/2 batata al vapor\nGrasas: 1 cucharadita de aceite de oliva en el pescado\nVerduras: Brócoli o coliflor al vapor\n";
            comida[2] = "La comida de hoy Será:\nProteína: 100 g de pechuga de pavo o tofu\nCarbohidratos: 1/2 taza de calabacín o espagueti de calabacín\nGrasas: 1 cucharadita de aceite de oliva o una pequeña porción de aguacate\nVerduras: Pimientos y cebolla salteados\n";

            merienda[0] = "La merienda de hoy Será:\nPalitos de pepino, zanahoria y apio con un poco de limón y sal\n1 puñado pequeño de almendras (10-15 g)\n";
            merienda[1] = "La merienda de hoy Será:\n1 yogur griego bajo en grasa sin azúcar\n1/2 taza de fresas o frutas frescas con bajo contenido de azúcar\n";
            merienda[2] = "La merienda de hoy Será:\n1 huevo cocido o un omelette de claras con espinacas\n1 taza de té verde o té de jengibre sin azúcar\n";

            cena[0] = "La cena de hoy Será:\nProteína: 100 g de pechuga de pollo o tofu a la parrilla\nCarbohidratos: 1/4 de taza de arroz integral\nGrasas: 1 cucharadita de aceite de oliva para sazonar\nVerduras: Ensalada de espinacas, pepino y tomate con limón\n";
            cena[1] = "La cena de hoy Será:\nProteína: 80 g de pescado blanco (como merluza) al horno o a la plancha\nCarbohidratos: 1/2 batata al vapor\nGrasas: 1 cucharadita de aceite de oliva en el pescado\nVerduras: Brócoli y coliflor al vapor\n";
            cena[2] = "La cena de hoy Será:\nProteína: 1 huevo y 2 claras (omelette)\nCarbohidratos: 1/4 taza de lentejas cocidas\nGrasas: 1 cucharadita de aceite de oliva\nVerduras: Espinacas y champiñones en el omelette\n";
        }
    }

    public String[] getDesayuno() {
        return desayuno;
    }

    public String[] getColacion() {
        return colacion;
    }

    public String[] getComida() {
        return comida;
    }

    public String[] getMerienda() {
        return merienda;
    }

    public String[] getCena() {
        return cena;
    }
}