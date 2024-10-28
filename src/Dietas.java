public class Dietas {
    public Dietas(double IMC){

  String desayunoSP [] = new String[3];
  desayunoSP[0] = " 2 rebanadas de pan integral (tostado)\n" +
          " 2 cucharadas de mantequilla de maní o almendra\n" +
          " 1 plátano rebanado encima del pan\n" +
          " 1 taza de yogur griego (con granola y frutas como fresas o moras)\n" +
          " 1 vaso de leche entera o un batido con leche, fruta y un poco de avena\n";

    desayunoSP[1] = """
             1 bol de avena cocida con leche entera (añade una cucharada de semillas de chía, almendras y un puñado de frutas secas)
             1 huevo revuelto con espinacas y queso
             1 vaso de jugo natural de naranja o mango
            """;

    desayunoSP[2] = """
             Smoothie energético: 1 taza de leche entera, 1/2 taza de avena, 1 plátano, 1 cucharada de mantequilla de maní, 1 cucharada de cacao en polvo (sin azúcar) y un puñado de espinacas.
             2 rebanadas de pan integral con aguacate y queso
            """;


        String[] desayunoMP = new String[3];
        desayunoMP[0] = """
                 1 bol de avena cocida con leche o agua (añade una cucharada de semillas de chía y un puñado de frutas como fresas o manzana)
                 1 huevo revuelto o cocido
                 1 taza de té verde o café sin azúcar
                """;

        desayunoMP[1] = " 1 yogur griego con 1/4 taza de granola sin azúcar y trozos de fruta (mango, fresas o kiwi)\n" +
                " 1 rebanada de pan integral con aguacate\n" +
                " 1 vaso de agua con limón\n";

        desayunoMP[2] = " 1 smoothie con leche, 1/2 taza de frutas (fresas o papaya), 1 cucharada de semillas de lino y espinacas\n" +
                " 1 puñado de nueces o almendras\n";

        String desayunoBP [] = new String[3];
        desayunoBP[0] = """
                 1 bol de yogur griego bajo en grasa con 1/4 de taza de frutas frescas (como fresas o frambuesas)
                 1 cucharada de semillas de chía o linaza
                 1 huevo cocido o revuelto con espinacas
                """;

        desayunoBP[1] = " Smoothie bajo en calorías: agua, espinacas, pepino, 1/2 manzana y jugo de limón\n" +
                " 1 rebanada de pan integral con aguacate (opcional, solo una capa delgada)\n";

        desayunoBP[2] = " 1 taza de avena cocida en agua con canela y trozos de manzana (sin azúcar añadida)\n" +
                " 1 huevo revuelto con espinacas y champiñones\n";

        String colacionSP [] = new String[3];
        colacionSP[0] = " 1 batido energético: 1 taza de leche entera, 1 plátano, 1 cucharada de mantequilla de maní y un puñado de avena.\n" +
                " 1 puñado de nueces o almendras (30 g).\n";

        colacionSP[1] = """
                 2 rebanadas de pan integral con aguacate y rodajas de pavo o queso.
                 1 taza de yogur griego con frutas secas y una cucharada de granola.
                """;

        colacionSP[2] = """
                 Hummus con pan pita (30 g de hummus y 1 pan pita pequeño).
                 1 fruta como mango, plátano o uvas.
                """;

        String[] colacionMP = new String[3];
        colacionMP[0] = """
                 1 yogur griego natural con una cucharada de semillas de chía o linaza.
                 Frutas frescas como fresas o moras.
                """;

        colacionMP[1] = " 1 manzana con 1 cucharada de mantequilla de almendra o de maní.\n" +
                " 1 puñado pequeño de almendras (15-20 g).\n";

        colacionMP[2] = " 1 huevo cocido con sal y pimienta.\n" +
                " Palitos de zanahoria o pepino como acompañamiento.\n";

        String colacionBP [] = new String[3];
        colacionBP[0] = " Palitos de pepino, zanahoria y apio con un poco de limón y sal.\n" +
                " 1 puñado pequeño de nueces o almendras (10-15 g).\n";

        colacionBP[1] = " 1 yogur natural bajo en grasa o griego sin azúcar.\n" +
                " Frutas frescas como frambuesas o fresas (media taza).\n";

        colacionBP[2] = " 1 huevo cocido con espinacas y champiñones al vapor.\n" +
                " Infusión de té verde o té de jengibre sin azúcar.\n";

        String comidaSP [] = new String[3];
        comidaSP[0] = " Proteína: 150 g de pollo a la parrilla o al horno con especias.\n" +
                " Carbohidratos: 1 taza de arroz integral.\n" +
                " Grasas: 1/4 de aguacate o 1 cucharada de aceite de oliva añadido a una ensalada.\n" +
                " Verduras: Ensalada de espinacas, zanahorias, y tomates con 1 cucharada de semillas de chía o de ajonjolí.\n";

        comidaSP[1] = " Proteína: 200 g de salmón a la plancha con limón y especias.\n" +
                " Carbohidratos: 1 taza de puré de papa con un poco de mantequilla o aceite de oliva.\n" +
                " Grasas: 10-15 almendras o una cucharada de mantequilla de almendras en el puré.\n" +
                " Verduras: Brócoli al vapor o espárragos con un toque de aceite de oliva.\n";

        comidaSP[2] = " Proteína: 150 g de carne magra de res.\n" +
                " Carbohidratos: 1 taza de quinoa cocida o pasta integral.\n" +
                " Rasas: 1 cucharada de pesto o una mezcla de aguacate con limón.\n" +
                " Verduras: Pimientos y calabacín al grill con hierbas.\n";

        String comidaMP [] = new String[3];
        comidaMP[0] = " Proteína: 120 g de pollo a la parrilla.\n" +
                " Carbohidratos: 1/2 taza de arroz integral o de camote.\n" +
                " Grasas: 1 cucharadita de aceite de oliva o 1/4 de aguacate.\n" +
                " Verduras: Ensalada mixta con lechuga, tomate y pepino.\n";

        comidaMP[1] = " Proteína: 100 g de pescado a la plancha, como tilapia o robalo.\n" +
                " Carbohidratos: 1/2 taza de pasta integral con hierbas.\n" +
                " Grasas: Un poco de pesto (1 cucharadita) o aceite de oliva.\n" +
                " Verduras: Espárragos o brócoli al vapor.\n";

        comidaMP[2] = " Proteína: 120 g de carne magra de res o de pavo.\n" +
                " Carbohidratos: 1/2 taza de quinoa cocida.\n" +
                " Grasas: 1 puñado pequeño de nueces o semillas.\n" +
                " Verduras: Calabacín y pimientos salteados.\n";

        String comidaBP [] = new String[3];
        comidaBP[0] = " Proteína: 100 g de pollo a la parrilla sin piel.\n" +
                " Carbohidratos: 1/4 de taza de arroz integral.\n" +
                " Grasas: 1 cucharadita de aceite de oliva para sazonar.\n" +
                " Verduras: Ensalada verde con espinacas, pepino y un poco de limón.\n";

        comidaBP[1] = " Proteína: 80 g de pescado blanco al horno (como merluza).\n" +
                " Carbohidratos: 1/2 batata al vapor.\n" +
                " Grasas: 1 cucharadita de aceite de oliva en el pescado.\n" +
                " Verduras: Brócoli o coliflor al vapor.\n";

        comidaBP[2] = " Proteína: 100 g de pechuga de pavo o tofu.\n" +
                " Carbohidratos: 1/2 taza de calabacín o espagueti de calabacín.\n" +
                " Grasas: 1 cucharadita de aceite de oliva o una pequeña porción de aguacate.\n" +
                " Verduras: Pimientos y cebolla salteados.\n";

        String meriendaSP [] = new String[3];
        meriendaSP[0] = " 1 rebanada de pan integral con aguacate y queso fresco.\n" +
                " 1 batido de leche entera con 1 plátano, una cucharada de avena y una cucharadita de miel.\n";

        meriendaSP[1] = " 1 tazón de yogur griego con 1/4 de taza de granola, frutas frescas (como mango o fresas) y una cucharada de semillas de chía.\n" +
                " 1 puñado de almendras o nueces.\n";

        meriendaSP[2] = " Smoothie de frutas: 1 taza de leche de almendra o de avena, 1 plátano, 1 cucharada de mantequilla de maní y un poco de cacao en polvo sin azúcar.\n" +
                " 2 galletas integrales con crema de cacahuate o almendra.\n";

        String meriendaMP [] = new String[3];
        meriendaMP[0] = " 1 manzana con 1 cucharada de mantequilla de almendra o de maní.\n" +
                " 1 puñado de nueces o almendras (20 g).\n";

        meriendaMP[1] = " 1 yogur griego con una cucharada de semillas de chía o de linaza.\n" +
                " Frutas frescas (como fresas o una mandarina).\n";

        meriendaMP[2] = " Smoothie: 1 taza de leche de almendra, 1/2 taza de espinacas, 1/2 taza de frutas frescas (fresas o mango) y 1 cucharada de semillas de lino.\n";

        String meriendaBP [] = new String[3];
        meriendaBP[0] = " Palitos de pepino, zanahoria y apio con un poco de limón y sal.\n" +
                " 1 puñado pequeño de almendras (10-15 g).\n";

        meriendaBP[1] = " 1 yogur griego bajo en grasa sin azúcar.\n" +
                " 1/2 taza de fresas o frutas frescas con bajo contenido de azúcar.\n";

        meriendaBP[2] = " 1 huevo cocido o un omelette de claras con espinacas.\n" +
                " 1 taza de té verde o té de jengibre sin azúcar.\n";

        String cenaSP [] = new String[3];
        cenaSP[0] = " Proteína: 150 g de pechuga de pollo a la plancha.\n" +
                " Carbohidratos: 1 taza de pasta integral con un poco de pesto o aceite de oliva.\n" +
                " Grasas: 1/4 de aguacate en rodajas para acompañar.\n" +
                " Verduras: Ensalada mixta (espinacas, tomate y zanahoria) con 1 cucharada de semillas de girasol.\n";

        cenaSP[1] = " Proteína: 200 g de salmón al horno con limón y especias.\n" +
                " Carbohidratos: 1 taza de puré de papa con una cucharada de mantequilla.\n" +
                " Grasas: 10-15 almendras.\n" +
                " Verduras: Brócoli al vapor o espárragos con un toque de aceite de oliva.\n";

        cenaSP[2] = " Proteína: 150 g de carne magra de res.\n" +
                " Carbohidratos: 1 taza de quinoa cocida con especias.\n" +
                " Grasas: 1 cucharada de aceite de oliva en la quinoa o sobre las verduras.\n" +
                " Verduras: Pimientos y calabacín al grill.\n";

        String cenaMP [] = new String[3];
        cenaMP[0] = " Proteína: 120 g de pechuga de pollo a la parrilla con especias.\n" +
                " Carbohidratos: 1/2 taza de puré de papa o camote.\n" +
                " Grasas: 1 cucharadita de aceite de oliva para sazonar las verduras.\n" +
                " Verduras: Brócoli y espinacas al vapor.\n";

        cenaMP[1] = " Proteína: 120 g de pescado (como tilapia o dorado) al horno con limón.\n" +
                " Carbohidratos: 1/2 taza de arroz integral.\n" +
                " Grasas: 1 cucharada de semillas de chía o linaza en la ensalada.\n" +
                " Verduras: Ensalada mixta de espinaca, tomate, pepino y zanahoria.\n";

        cenaMP[2] = " Proteína: 100 g de tofu o tempeh a la parrilla.\n" +
                " Carbohidratos: 1/2 taza de pasta integral o espaguetis de calabacín.\n" +
                " Grasas: 1 cucharadita de aceite de oliva o de ajonjolí.\n" +
                " Verduras: Pimientos y champiñones al grill.\n";

        String cenaBP [] = new String[3];
        cenaBP[0] = " Proteína: 100 g de pechuga de pollo o tofu a la parrilla.\n" +
                " Carbohidratos: 1/4 de taza de arroz integral.\n" +
                " Grasas: 1 cucharadita de aceite de oliva para sazonar.\n" +
                " Verduras: Ensalada de espinacas, pepino y tomate con limón.\n";

        cenaBP[1] = " Proteína: 80 g de pescado blanco (como merluza) al horno o a la plancha.\n" +
                " Carbohidratos: 1/2 batata al vapor.\n" +
                " Grasas: 1 cucharadita de aceite de oliva en el pescado.\n" +
                " Verduras: Brócoli y coliflor al vapor.\n";

        cenaBP[2] = " Proteína: 1 huevo y 2 claras (omelette).\n" +
                " Carbohidratos: 1/4 taza de lentejas cocidas.\n" +
                " Grasas: 1 cucharadita de aceite de oliva.\n" +
                " Verduras: Espinacas y champiñones en el omelette.\n";

    }


}
