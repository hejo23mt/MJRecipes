package com.example.mjrecipes.data

/**

Recipe database.

 **/

object RecipeData {
    val allRecipes = listOf(
        Recipe(
            id = 1,
            name = "Baconsås",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "140 g Bacon",
                "0,5 Gul lök",
                "4-5 dl Grädde",
                "2 msk Vetemjöl (till redning)",
                "3-4 msk Chilisås",
                "Salt",
                "Peppar"
            ),
            ingredientsHalf = listOf(),
            instructions = "Bryn hackad lök och strimlad bacon.\n" +
                    "Gör redning med mjölet och lite av grädden, häll på baconet och löken.\n" +
                    "Häll på resten av grädden och chilisåsen. Smaka av med salt och peppar.\n" +
                    "Servera med pasta.\n",
        ),
        Recipe(
            id = 2,
            name = "Blockchokladkakor",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "150 g Blockchoklad",
                "300 g Smör",
                "125 g Florsocker (ca 2,1 dl)",
                "6,5 dl Mjölk"
            ),
            ingredientsHalf = listOf(),
            instructions = "Rör ner 100g av smöret med sockret. Blanda i mjöl och den hackade blockchokladen. Blanda i resten av smöret.\n" +
                    "Rulla degen till en rulle och lägg i kylskåpet i ca 1 timme.\n" +
                    "Skär degen till runda kakor och lägg upp på en plåt.\n" +
                    "Grädda i ugnen på 200 grader i 8-10 minuter.",
        ),
        Recipe(
            id = 3,
            name = "Broccolisoppa",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "500 g Broccoli fryst (1 påse = 800g)",
                "1 Gul lök",
                "0,5 msk Smör",
                "6 dl Vatten (800g broccoli = 1 l vatten)",
                "2 Grönsaksbuljongtärningar",
                "2 dl Créme fraiche",
                "Chilipulver",
                "Salt",
                "Peppar"
            ),
            ingredientsHalf = listOf(),
            instructions = "Skala och hacka löken. Fräs den i smör i en kastrull. Tillsätt vatten och buljongtärningar. Låt koka upp.\n" +
                    "Lägg i den frysta broccolin och låt den koka i ca 5 minuter.\n" +
                    "Mixa broccolin med stavmixer och tillsätt créme fraiche.\n" +
                    "Krydda med kryddorna.\n" +
                    "Låt soppan koka upp.\n" +
                    "Servera med ostmackor."
        ),
        Recipe(
            id = 4,
            name = "Chokladbollar",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "100 g Smör",
                "1,5 dl Socker",
                "1 msk Vaniljsocker",
                "2 msk Kakao",
                "1 Ägg",
                "5 dl Havregryn\n",
                "ev",
                "2 Dubbeldajm",
                "1 Blockchoklad"
            ),
            ingredientsHalf = listOf(),
            instructions = "Ca 30 st\n." +
                    "Blanda smör och socker till en klump. Blanda i resten.\n" +
                    "\n" +
                    "ev:\n" +
                    "Hacka i dajm, smält blockchoklad och doppa chokladbollarna. Lägg upp på bakplåtspapper.",
        ),
        Recipe(
            id = 5,
            name = "Citrondricka",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "2 Citroner",
                "0,75-1 kg Strösocker",
                "50 g Citronsyra",
                "1 l Kokande vatten"
            ),
            ingredientsHalf = listOf(),
            instructions = "Blir ca 1,5 liter\n" +
                    "Skiva citronerna tunt. Lägg i en gryta, häll överdet kokande vattnet.\n" +
                    "Rör ner citronsyran. Rör ner strösocker, minst 3/4 kg. Smaka av.\n" +
                    "Ställ kallt i 2 dygn, sila bort fruktköttet.\n" +
                    "Blanda 1 del saft + 4 delar vatten.\n" +
                    "\n" +
                    "Samma recept funkar för apelsinsaft men ta istället 2 apelsiner och 1 citron.",
        ),
        Recipe(
            id = 6,
            name = "Enchiladas",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1 Röd paprika",
                "1 Gul paprika",
                "1 Gul lök",
                "1 Vitlöksklyfta",
                "200 g Kycklingfärs",
                "3 dl Riven ost",
                "8 Tortillas",
                "1 Burk tacosås",
                "2 dl Créme fraiche"
            ),
            ingredientsHalf = listOf(),
            instructions = "Skär paprikan i små bitar. Skala och hacka lök och vitlök. Fräs allt utan att det tar färg.\n" +
                    "Rör ner kycklingförsen och stek på medelgod värme så att färsen blir genomstekt utan att grönsakerna bränns.\n" +
                    "Smaka av med salt och peppar. Lägg i bunke. Detta kan göras i förväg.\n" +
                    "Tillsätt riven ost och créme fraiche.\n" +
                    "Lägg lite röra i en tortilla, rulla ihop och lägg i en form. Gör likadant med resten av bröden.\n" +
                    "Skiva ost och lägg på varje rulle.\n" +
                    "Sätt in i ugnenpå 200 grader i 10 minuter.",
        ),
        Recipe(
            id = 7,
            name = "Fattiga riddare",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "4 ägg",
                "3 dl Mjölk",
                "0,5 tsk Salt",
                "0,5 krm Svartpeppar",
                "7-8 Skivor bröd"
            ),
            ingredientsHalf = listOf(),
            instructions = "Blanda alla ingredienser utom brödet.\n" +
                    "Låt brödskivorna bli ordentligt indränkta.\n" +
                    "Stek i smör",
        ),
        Recipe(
            id = 8,
            name = "Fisksoppa",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "400 g Fiskfile (ex torsk)",
                "3 Paprikor av olika färger",
                "2-3 Vitlöksklyftor",
                "6 dl Mjölk",
                "2,5 dl Matlagningsgrädde",
                "1 dl Vitt vin eller vatten + 1 dl citron",
                "2 st Fiskbuljongtärningar",
                "1 tsk Timjan",
                "Salt",
                "Cayennepeppar",
                "Smör att steka i"
            ),
            ingredientsHalf = listOf(),
            instructions = "Skär fisken i bitar. Kärna ur paprikorna och skär dem i bitar. Skala och hacka vitlöken.\n" +
                    "Fräs paprikan och vitlöken i smör i en gryta ca 3 minuter. Tillsätt mjölk, grädde, vin, buljongtärning och timjan.\n" +
                    "Låt koka upp. Lägg i fisken och låt soppan koka i 3-4 minuter. Smacksätt med salt och cayennepeppar.",
        ),
        Recipe(
            id = 9,
            name = "Fläskfilégryta med kantareller",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "400 g Fläskfilé",
                "2 dl Créme fraiche",
                "1 msk Smör",
                "1,5 msk Kantarellfond",
                "50 g Kantareller",
                "10 Cocktailtomater, halverade",
                "1 msk Färsk timjan"
            ),
            ingredientsHalf = listOf(),
            instructions = "Dela fläskfilén i bitar. Stek i en stekpanna, salta och peppra.\n" +
                    "Lägg i kantarellerna och stek tills allt har fått färg.\n" +
                    "Vispa ihop créme fraiche coh fond, häll över i pannan. Rör om och låt puttra i några minuter.\n" +
                    "Blanda ner de halverade tomaterna. Riv blad från färsk timjan och strö över.\n" +
                    "Servera med pasta, ris eller potatis.",
        ),
        Recipe(
            id = 10,
            name = "Fläskfilégryta",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1 Fläskfilé",
                "2 Röda Paprikor",
                "200 g Champinjoner",
                "140 g Bacon",
                "4 dl Créme fraiche",
                "2 tsk Paprikapulver",
                "3 msk Tomatpuré",
                "1 msk Malen chilipeppar"
            ),
            ingredientsHalf = listOf(),
            instructions = "Skär fläskfilén i strimlor, stek dem så att dem får en fin stekyta, de behöver ej bli genomstekta.\n" +
                    "Lägg över dem på ett fat. Strimla paprikan och skiva champinjonerna och stek dem i några minuter.\n" +
                    "Häll på créme fraiche, paprikapulver, tomatpuré och chilipeppar och rör om.\n" +
                    "Lägg i fläskfilén och låt puttra i 10 minuter, rör om då och då.\n" +
                    "Dela baconet och lägg i grytan, låt puttra i 5 minuter.\n" +
                    "Servera med pasta.",
        ),
        Recipe(
            id = 11,
            name = "Flygande Jakob",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1 kg Kycklingfilé",
                "140 g Bacon",
                "3 Bananer",
                "1 dl Chilisås",
                "1 dl Sweet chili sås",
                "5 dl Vispgrädde",
                "1,5 dl Chilikryddade cashewnötter"
            ),
            ingredientsHalf = listOf(),
            instructions = "Strimla kycklingen och bacon. Stek tills filén fått fin färg. Lägg kyckling och bacon i en stor ugnsäker form.\n" +
                    "Skiva bananerna och fördela på kycklingen och baconet.\n" +
                    "Vispa grädden och blanda i chilisåser. Bred ut över kycklingen. Strö över cashewnötterna.\n" +
                    "Gratinera mitt i ugnen på 225 grader i 15 minuter.\n" +
                    "Servera med ris och sallad.",
        ),
        Recipe(
            id = 12,
            name = "Foliebakad fisk",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "600 g Fiskfilé",
                "1-2 Gul lök",
                "2 Vitlöksklyftor",
                "2 msk Färsk hackad timjan, rosmarin eller persilja",
                "1 dl Créme fraishe"
            ),
            ingredientsHalf = listOf(),
            instructions = "Klipp till 4 rejäla folieark och smörj dem med smör.\n" +
                    "Dela fisken i 4 bitar. Skiva löken och hacka vitlöken.\n" +
                    "Lägg fisken på folie och lägg löken ovanpå. Krydda med örtsalt och någon av örterna.\n" +
                    "Lägg en klick créme fraishe på toppen.\n" +
                    "Vik ihop paketen ordentligt så att inget kan rinna ut.\n" +
                    "Lägg paketen på grillgallret och låt fisken baka i ca 15 minuter (i ugn 15-20 minuter i 200 grader)\n" +
                    "Öppna och kontrollera så att fisken är vit och fast.",
        ),
        Recipe(
            id = 13,
            name = "Gräddkola",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "100 g Smör",
                "2,5 dl Socker",
                "2 msk Glukossirap",
                "2 dl Vispgrädde",
                "1 dl Ljussirap"
            ),
            ingredientsHalf = listOf(),
            instructions = "Blanda allt och koka tills smeten är 122 grader.\n" +
                    "Häll ut på en plåt och låt stelna.\n" +
                    "Klipp i bitar och slå in i smörpapper.\n" +
                    "\n" +
                    "För chokladkola blanda i 1,5 msk kakao.\n" +
                    "\n" +
                    "För pepparkakskola blanda i 1,5 tsk pepparkakskryddor.",
        ),
        Recipe(
            id = 14,
            name = "Gubbröra med lax",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "2 kokta Ägg",
                "100 g Kallrökt lax",
                "1 Rödlök",
                "0,5 dl hackad Dill",
                "Hackad gräslök",
                "Peppar",
                "Gräddfill (efter smak)"
            ),
            ingredientsHalf = listOf(),
            instructions = "Hacka laxen och de kokta äggen.\n" +
                    "Blanda allt och krydda med peppar\n" +
                    "Gott på macka!",
        ),
        Recipe(
            id = 15,
            name = "Havrebollar",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "200 g Vit choklad",
                "100 g Smör (rumstempererad)",
                "5 dl Havregryn",
                "2 tsk Vaniljsocker",
                "1,5 dl Kokos",
                "1,5 dl Florsocker",
                "1-2 msk Vatten",
                "Pärlsocker till garnering"
            ),
            ingredientsHalf = listOf(),
            instructions = "Riv chokladen på ett rivjärn. Nyp ihop smöret med havregrynet ordentligt.\n" +
                    "Tillsätt resten av ingredienserna och blanda till en lagom kladdig deg.\n" +
                    "Rulla till bollar och rulla dem i pärlsocker. Förvara i kylen.\n" +
                    "Går även bra att frysa in.",
        ),
        Recipe(
            id = 16,
            name = "Hawaii kassler",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "Ris (4 portioner)",
                "400 g Kassler",
                "Grädde",
                "Chilisås",
                "Ost",
                "(Ananas)"
            ),
            ingredientsHalf = listOf(),
            instructions = "Koka riset enligt anvisningar på förpakningen.\n" +
                    "Vispa grädden och blanda i chilisås och ost.\n" +
                    "Skiva kasslern (skär ananasen i bitar)\n" +
                    "Lägg kasslern i en ugnsäker form (ananas ovanpå) och fördela gräddblandningen jämnt\n" +
                    "och sätt in i ugnen på 225 grader i ca 10 minuter eller tills det fått fin färg.\n" +
                    "Servera med riset och sallad.",
        ),
        Recipe(
            id = 17,
            name = "Kalljästa frallor",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "0,25 Paket jäst (färsk eller torr)",
                "5 dl Kallt vatten",
                "5 dl Rägsikt",
                "7 dl Vetemjöl special",
                "(12 dl Vetemjöl kan ersätta rägsikt och vetemjöl special",
                "1 tsk Salt (ev. lite extra)",
                "1 msk Olja",
                "1 msk Socker"
            ),
            ingredientsHalf = listOf(),
            instructions = "På kvällen innan:\n" +
                    "Rör ut jästen i kallt vatten i en bunke. Tillsätt mjöl, salt, olja och socker. Rör till allt blandats.\n" +
                    "Degen är ganska kladdig.\n" +
                    "Täck med handduk och sätt i kylen.\n" +
                    "\n" +
                    "På morgonen/ dagen efter:\n" +
                    "Sätt ugne på 225 grader.\n" +
                    "Stjälp försiktigt upp degen på ett väl mjölat bord. Dela i 20 bitar med degskrapa, bearbeta degen så lite som möjligt.\n" +
                    "Lägg bitarna på en plåt med bakplåtspapper.\n" +
                    "Grädda i 20-25 minuter.",
        ),
        Recipe(
            id = 18,
            name = "Kasslergryta",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "500 g Kassler",
                "2 Röda paprikor",
                "1 Gul lök",
                "Mjöl till redning",
                "8-10 dl Mjölk",
                "Salt",
                "Svartpeppar",
                "1 dl Tomatpuré"
            ),
            ingredientsHalf = listOf(),
            instructions = "Strimla kasslern i lagom bitar, hacka lök och paprika.\n" +
                    "stek kasslern så den får lite färg, på hög värme. Stek i omgångar och ta upp kasslern i en tallrik.\n" +
                    "Stek paprika och lök på medelvärme för att inte bränna löken. Stek tills mjuk.\n" +
                    "Häll i kasslern och tomatpurén. Stek ihop lite.\n" +
                    "Häll på mjöl och blanda runt. Häll på mjölk och låt puttra ihop.\n" +
                    "Smaka av med salt och peppar.\n" +
                    "Servera med pasta och sallad.",
        ), Recipe(
            id = 19,
            name = "Kladdkaka",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "100 g Smör",
                "3 dl Socker",
                "2 Ägg",
                "1,5 dl Vetemjöl",
                "4 msk Kakao",
                "1 tsk Vaniljsockar",
                "(1 krm Salt)"
            ),
            ingredientsHalf = listOf(),
            instructions = "Sätt ugnen på 175 grader.\n" +
                    "Smält smöret och häll i resten av ingredienserna.\n" +
                    "Häll smeten i en smordfom och grädda i nedre delen av ugnen i 30 minuter.\n" +
                    "Servera med vispgrädde.",
        ),
        Recipe(
            id = 20,
            name = "Kladdmuffins",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "2 Ägg",
                "3 dl Socker",
                "1,5 tsk Vaniljsocker",
                "1 krm Salt",
                "4 msk Kakao",
                "1,5 dl Vetemjöl",
                "100 g Smält avsmalnat smör"
            ),
            ingredientsHalf = listOf(),
            instructions = "Starta ugnen på 160 grader.\n" +
                    "Rör ihop smeten enligt ovan ordning.\n" +
                    "Fördela smeten i 12 formar. Ställ dem tätt ihop så de stödjer varandra på plåten.\n" +
                    "Grädda dem i ugnen de blir höga och sprukna med torr yta men helt kladdia inuti.\n" +
                    "Ta ut dem efter 25-30 minuter.Nu sjunker de ihop igen.\n" +
                    "Låt dem svalna.",
        ),
        Recipe(
            id = 21,
            name = "Kladdkaka med toscatäcke",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "Kladdkaka",
                "175 g Rumstempererat smör",
                "2,5 dl Socker",
                "3 Ägg",
                "0,5 dl Ljussirap",
                "1,5 dl Kakao",
                "1 Nypa salt",
                "0,5 tsk Bakpulver",
                "1,5 dl Vetemjöl\n",
                "Toskasmet",
                "75 g smör",
                "2 dl Socker",
                "0,75 dl Vispgrädde",
                "1,5 dl Ljus sirap",
                "200 g Riven kokos"
            ),
            ingredientsHalf = listOf(),
            instructions = "Sätt ugnen på 180 grader. Vispa smör och socker pösigt. Rör ner äggen 1 i taget och sedan sirapen. Vispa en stund till.\n" +
                    "Blanda torra ingredienser i en separat bunke. Rör ner blandningen i äggsmeten och blanda allt till en slät smet.\n" +
                    "Smörj och bröda en ca 23cm stor form. Häll smeten i formen.\n" +
                    "Grädda kakan mitt i ugnen i ca 30 minuter. Börja med toscan när det är ca 10 minuter kvar.\n" +
                    "Tosca: Smält smöret i en kastrull. Tillsätt sirap, grädde och socker.\n" +
                    "Låt blandningen puttra på svag värme i några minuter och blanda sedan ner kokosen.\n" +
                    "Ta kakan ur ugnen och bred ut toscasmeten ovanpå.\n" +
                    "Grädda kakan ytterligare 10-13 minuter.\n" +
                    "Låt svalna i formen.",
        ),
        Recipe(
            id = 22,
            name = "Knäckflarn",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "2 dl Socker",
                "0,5 dl Grädde",
                "0,5 dl Sirap",
                "1,5 dl Smör",
                "2 dl Havregryn",
                "2 dl Vetemjöl",
                "0,5 tsk Bakpulver",
                "1 tsk Vaniljsocker"
            ),
            ingredientsHalf = listOf(),
            instructions = "Starta ugnen på 200-225 grader.\n" +
                    "Blanda ihop alla ingredienser.\n" +
                    "Med en sked lägg klickar på en väl smord plåt.\n" +
                    "Grädda kakorna i ???\n" +
                    "Man kan böja kakorna som spån eller också kan man lägga två och två kakor tillsammans med chokladkräm emellan.\n",
        ),
        Recipe(
            id = 23,
            name = "Knäckiga havrerutor",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "8 dl Havregryn",
                "3 dl Socker",
                "250 g Smör",
                "4 msk Sirap",
                "2 msk Grädde (eller mjölk)"
            ),
            ingredientsHalf = listOf(),
            instructions = "Smält smöret. Blanda alla ingredienser.\n" +
                    "Bred ut blandningen i en långpanna med bakplåtspapper.\n" +
                    "Grädda i ugnen på 175 grader i 15-20 minuter.\n" +
                    "Skär kakan i rutor när den svalnat lite.",
        ),
        Recipe(
            id = 24,
            name = "Kolakakor",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "100 g Rumstempererat smör",
                "1 dl Strösocker",
                "1 msk Vaniljsocker",
                "2 msk Ljus sirap",
                "2,5 dl Vetemjöl",
                "1 tsk Bakpulver"
            ),
            ingredientsHalf = listOf(),
            instructions = "Ca 30 st\n" +
                    "Sätt ugnen på 175 grader.\n" +
                    "Vispa samman smör, socker, vaniljsocker och sirap.\n" +
                    "Blanda mjölet med bakpulvret i en separat bunke, och häll sedan ner mjölblandningen i resten av smeten.\n" +
                    "Blanda samman och dela degen på 2. Forma varje del till en 30cm lång rulle.\n" +
                    "Lägg rullarna på en plåt med bakplåtspapper och platta till dem med fingrarna lite.\n" +
                    "Baka mitt i ugnen i 10-12 minuter.\n" +
                    "Skär kakorna direkt när de tagits ut från ugnen.",
        ),
        Recipe(
            id = 25,
            name = "Köttfärslimpa/ Köttbullar/ Biffar",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "500 g Köttfärs",
                "1,5 dl Mjölk",
                "5,33 msk Skorpmjöl",
                "0,5 Gul lök",
                "1,5 tsk Salt",
                "2 krm Peppar",
                "1 Ägg"
            ),
            ingredientsHalf = listOf(),
            instructions = "200 grader i 35 minuter för köttfärslimpa\n"+
                    "Häll mjölk och skorpmjöl i ett mått (5dl eller större), låt stå och svälla.\n" +
                    "Hacka löken. Blanda alla ingredienser i en bunke. Forma till valfri form.",
        ),
        Recipe(
            id = 26,
            name = "Köttgryta",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1 Gul lök",
                "500 g Grytbitar av kalv eller gris",
                "Vatten",
                "Vetemjöl",
                "Grönsaker",
                "Salt",
                "Peppar",
                "Soja att färga med"
            ),
            ingredientsHalf = listOf(),
            instructions = "Skiva löken, bryn den och köttet. Salta och peppra.\n" +
                    "Häll över vatten och låt koka i ca 20 minuter, häll eventuellt på mer vatten under tiden.\n" +
                    "Häll i vetemjöl blandat med vatten. Rör om, häll i soja och låt sjuda lite till.\n" +
                    "Häll i grönsaker och låt sjuda ett par minuter till.\n" +
                    "Servera med ris.",
        ),
        Recipe(
            id = 27,
            name = "Krabeluror",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "2 Ägg",
                "3 dl Socker",
                "3 dl Mjölk",
                "6 dl Vetemjöl",
                "4 tsk Bakpulver"
            ),
            ingredientsHalf = listOf(),
            instructions = "Blanda ihop vetemjöl och bakpulver i en skål.\n" +
                    "Vispa ägg och socker poröst.\n" +
                    "Blanda i vetemjölblandningen och sedan mjölken.",
        ),
        Recipe(
            id = 28,
            name = "Kyckling i vitt vin",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "200 g Bacon",
                "10 Scharlottenlökar",
                "3 msk Olivolja",
                "1-1,5 kg Kycklingdelar med ben",
                "3 dl Vitt vin",
                "1 Knippe persilja",
                "1 dl Créme fraishe",
                "Salt",
                "Peppar"
            ),
            ingredientsHalf = listOf(),
            instructions = "Skär baconet i strimlor och skala lökarna- lämna dem hela.\n" +
                    "Hetta upp oljan i en wokpanna och fräs bacon och lök på hög värme i 5 minuter.\n" +
                    "Rör om ofta, tag sedan ur baconet och löken. Lägg kycklingen i pannan och bryn dem tills de är gyllenbruna.\n" +
                    "Salta och peppra, lägg sedan tillbaka baconet och löken i pannan.\n" +
                    "Tillsätt det vita vinet, koka upp och låt koka i 2 minuter.\n" +
                    "Sänk värmen och låt sjuda i 20 minuter med lock, rör om då och då. Hacka persiljan.\n" +
                    "Rör försiktigt ner créme fraiche i pannan. Låt sjuda 5 minuter till, på svag värme.\n" +
                    "Sprid persiljan ovan på innan servering.\n" +
                    "Servera med ris.",
        ),
        Recipe(
            id = 29,
            name = "Kyckling med den goda såsen",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1 Kycklingfilé per portion",
                "3 dl Vispgrädde",
                "Créme bonjour cuisine vitlök & örter"
            ),
            ingredientsHalf = listOf(),
            instructions = "Stek kycklingen i hela filéer, dela dem sedan i ca 2cm tjocka bitar och lägg dem i en ugnsäker form.\n" +
                    "Vispa grädden och blanda i crémé bonjour. Bred över blandningen över kycklingen.\n" +
                    "Sätt in i ugnen på 200-225 grader tills den fått fin färg (ca 15 minuter)\n" +
                    "Servera med pressad potatis.",
        ),
        Recipe(
            id = 30,
            name = "Kycklinggryta med fetaost",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1 Gul lök",
                "1 Vitlöksklyfta",
                "250 g Skogschampinjoner",
                "125 g Bacon",
                "150 g Fetaost",
                "3 msk Olja",
                "500 g Skrimlad kycklingfilé",
                "3 dl Mjölk",
                "1 dl Vispgrädde",
                "1 tsk Oregano",
                "1 msk Majsstärkelse",
                "Salt",
                "Svartpeppar",
                "1 msk Smör",
                "1 dl Rostad lök"
            ),
            ingredientsHalf = listOf(),
            instructions = "Skala och hacka lök och vitlök. Rensa och skölj champinjonerna i kvartar. Skär baconet i ca 3cm stora bitar.\n" +
                    "Smula fetaosten. Stek lök och vitlöken i 1/3 av oljan i en stor gryta tills den är mjuk, lyft ur och ställ åt sidan.\n" +
                    "Stek kycklinge i rästen av oljan, tills den är ljusbrun.\n" +
                    "Vispa ihop mjölk, grädde, oregano med majsstärkelse och rör ner i grytan tilsammans med den stekta löken.\n" +
                    "Låt koka sakta i ca 3 minuter. Smaka av med salt och peppar.\n" +
                    "Stek bacon och champinjoner i smöret tills allt har en fin stekyta.\n" +
                    "Dra av från värmen och blanda i fetaosten och den rostade löken.\n" +
                    "Toppa grytan med fetaostblandningen.\n" +
                    "Servera med ris och sallad.",
        ),
        Recipe(
            id = 31,
            name = "Kycklinglasagne",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "Färska lsagneplattor",
                "Smör",
                "500 g Kycklingfärs",
                "Mozzarella\n",
                "Bechemelsås",
                "5 dl Grädde",
                "4 dl Mjölk",
                "1 dl Vetemjöl",
                "100 g Smör",
                "Salt",
                "Peppar",
                "Tacokrydda"
            ),
            ingredientsHalf = listOf(),
            instructions = "Sätt ugnen på 180 grader.\n" +
                    "Stek kycklingen till genomstakt. Gör bechamelsåsen samtidigt.\n" +
                    "Smält smöret, häll i mjölet och blanda ut. Blanda grädde och mjölk.\n" +
                    "Häll i mjölkblandningen lite i taget och blanda under tiden.\n" +
                    "Krydda med salt och peppar. Låt sjuda och tjockna. Krydda med valfri mängd tacokrydda.\n" +
                    "Täck botten på en form med sås, varva med lasagneplattor, kyckling och mozzarella och sås igen. Avsluta med såsen.\n" +
                    "Ställ i mitten av ugnen och grädda i ca 30 minuter, tills plattorna är lagom mjuka.\n" +
                    "Servera med sallad.",
        ),
        Recipe(
            id = 32,
            name = "Kycklingpaj",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "Pajdeg",
                "150 g Smör",
                "3 dl Vetemjöl",
                "3 msk Kallt vatten",
                "Låt vila kallt i en timme\n",
                "Fyllning",
                "2 KycklingFiléer",
                "1 Gul lök",
                "1 Purjolök",
                "1 Paket bacon",
                "5 msk Tomatpuré",
                "2 dl Grädde",
                "Salt",
                "Peppar",
                "Hackad persilja",
                "1 Ägg"
            ),
            ingredientsHalf = listOf(),
            instructions = "Starta ugnen på 200 grader.\n" +
                    "Skiva och stek kycklingen. Lägg undan den stekta kycklingen till sidan.\n" +
                    "Hacka löken, purjolöken och baconen.\n" +
                    "Blanda ihop löken, purjolöken, baconet, tomatpurén, grädden och den stekta kycklingen. Krydda med salt och peppar.\n" +
                    "Lägg blandningen i en smord form och strö över persiljan.\n" +
                    "Kavla ut degen och lägg den över blandningen som ett lock. Stick med en gaffel i degen, pensla med ägg.\n" +
                    "Grädda i ugnen i 45 minuter.",
        ),
        Recipe(
            id = 33,
            name = "Kycklingröra till bakpotatis",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "2 dl Majonnäs",
                "2 msk Gräddfil eller créme fraiche",
                "100 g Kyckling",
                "0,25 Purjolök",
                "0,5 Röd paprika",
                "1 tsk Curry",
                "Salt",
                "Peppar"
            ),
            ingredientsHalf = listOf(),
            instructions = "Blanda gräddfil och majonnäs. Skär purjolöken och paprikan i mindre bitar, blanda i.\n" +
                    "Tillsätt kycklingbitar och krydda med curry, salt och peppar.",
        ),
        Recipe(
            id = 34,
            name = "Kycklingwok",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1 Kycklingfilé/person",
                "Nudlar",
                "Matolja",
                "Curry",
                "Grädde",
                "Sweet chili sås",
                "Wokgrönsaker"
            ),
            ingredientsHalf = listOf(),
            instructions = "Hetta upp olja i en wokpanna och blanda i curry.\n" +
                    "Dela kycklingen i bitar och stek dem i wokpannan.\n" +
                    "Häll i wokgrönsakerna och låt dem stekas med kycklingen. Koka nudlarna under tiden.\n" +
                    "Häll i sweet chili sås och grädde.\n" +
                    "Smaka av och häll sedan i nudlarna.",
        ),
        Recipe(
            id = 35,
            name = "Lättlagad fläskfilé",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "500 g Fläskfilé",
                "200 g Bacon",
                "2 msk Tomatpuré",
                "3 dl Vispgrädde",
                "2 dl Créme fraiche",
                "Salt",
                "Svartpeppar"
            ),
            ingredientsHalf = listOf(),
            instructions = "Stek fläskfilén i skivor, tärna baconet och lägg den tillsammans med fläskfilén. Krydda med salt och peppar.\n" +
                    "Tillsätt tomatpuré, grädde och créme fraiche. Låt alltsammans puttra i ca 20 minuter.\n" +
                    "Servera med pressad potatis.",
        ),
        Recipe(
            id = 36,
            name = "Lax och spenatpaj",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "Pajdeg",
                "4 dl Vetemjöl",
                "125 g Smör",
                "1 Ägg",
                "2 msk Vatten\n",
                "Fyllning",
                "200 g Bladspenat",
                "2 dl Strimlad purjolök",
                "200 g Kallrökt lax",
                "3 Ägg",
                "3 dl Grädde eller mjölk",
                "0,5 tsk Salt",
                "2 krm Svartpeppar",
                "0,5 dl Finhackad dill",
                "4 dl Riven ost"
            ),
            ingredientsHalf = listOf(),
            instructions = "Gör pajdegan och tryck ut i formen, förgrädda i 200 grader ca 10 minuter.\n" +
                    "Fräs spenaten tillsammans med purjolöken i en kastrull, fördela i pajskalet.\n" +
                    "Strimla laxen och fördela i pajskalet.\n" +
                    "Vispa ihop ägg, grädde, kryddor och dill, häll över pajen.\n" +
                    "Grädda i 200 grader i ca 25 minuter eller tills pajen fått fin färg.\n" +
                    "Servera gärna med sallad och créme fraiche.",
        ),
        Recipe(
            id = 37,
            name = "Laxrätt",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "8 Frysta laxfiléer",
                "Salt",
                "Citronpeppar",
                "1,5 dl Vatten",
                "5 dl Créme fraiche",
                "3 dl Matlagningsgrädde",
                "4 msk Hummerfond",
                "2 msk Fransk senap",
                "Klippt dill"
            ),
            ingredientsHalf = listOf(),
            instructions = "Lägg laxfiléerna i en form, salta och pappra, låt ligga i ca 2 timmar.\n" +
                    "Koka upp vatten, créme fraiche, grädde, hummerfond, senap och dill.\n" +
                    "Häll såsen över laxen.\n" +
                    "Sätt in i ugnen i på 200-225 grader i ca 15 minuter.",
        ),
        Recipe(
            id = 38,
            name = "Limelax med örttäcke",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1 kg Benfri lax utan skinn",
                "1 tsk Salt",
                "2 krm Vitpeppar\n",
                "Kryddtäcke",
                "1 dl Hackad dill, citronmeliss, timjan & dragon (behöver ej alla)",
                "4 Skivor vitt bröd",
                "2 dl Riven ost",
                "2 msk Smält smör",
                "1 Lime\n",
                "Sås",
                "4 dl Créme fraiche",
                "0,5 dl Torr sherry",
                "2 msk Kyclingfond konserverad",
                "Salt",
                "Vitpeppar",
                "0,5 tsk Strösocker"
            ),
            ingredientsHalf = listOf(),
            instructions = "Skär laxen i portionsbitar, salta och peppra.\n" +
                    "Mixa örterna i en matberedare, tillsätt brödet i bitar, ost och smör. Mixa till en massa.\n" +
                    "Tillsätt saft och skal från limen.\n" +
                    "Bred massan över laxen och tillaga mitt i ugnen på 225 grader i ca 20 minuter.\n" +
                    "Blanda créme fraiche, sherry och fond i en kastrull. Låt koka upp och smaka av med salt, peppar och socker.\n" +
                    "Servera med kokt potatis och sallad.",
        ),
        Recipe(
            id = 39,
            name = "Makaronipudding",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "4 dl Makaroner",
                "1 Paket bacon",
                "1 Gul lök eller purjolök\n",
                "Äggstanning",
                "3 Ägg",
                "6 dl Mjölk",
                "1 tsk Salt",
                "1 krm Svartpeppar",
                "2 dl Riven ost"
            ),
            ingredientsHalf = listOf(),
            instructions = "Koka makaronerna, strimla baconet och hacka löken. Blanda allt och lägg i en ugnsäker form.\n" +
                    "Häll över äggstanningen.\n" +
                    "Grädda mitt i ugnen i 30-40 minuter på 200 grader.",
        ),
        Recipe(
            id = 40,
            name = "Mangochutneykyckling",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "5 Kycklingfiléer",
                "Salt",
                "Svartpeppar",
                "1 msk Smör",
                "3 dl Vispgrädde",
                "2 msk Mangochutney"
            ),
            ingredientsHalf = listOf(),
            instructions = "Strimla och bruyn filéerna, salta och peppra.\n" +
                    "Blanda ihop grädde och mangochutney.\n" +
                    "Häll över blandningen över filéerna och låt koka ihop i några minuter.\n" +
                    "Servera med ris, banan och mandariner.",
        ),
        Recipe(
            id = 41,
            name = "Mörk chokladmousse",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "200 g Mörk choklad",
                "2 Äggulor",
                "2 msk Strösocker",
                "2 dl Vispgrädde",
                "1 dl Créme fraiche"
            ),
            ingredientsHalf = listOf(),
            instructions = "Smält chokladen i vattenbad.\n" +
                    "Vispa äggulor och socker poröst.\n" +
                    "Vispa ihop grädde och créme fraiche.\n" +
                    "Blanda chokladen med äggsmeten.\n" +
                    "Vänd i gräddfraichen i chokladen lite i taget.\n" +
                    "Höll upp i önskad form.\n" +
                    "Ställ kallt tills den ska serveras.",
        ),
        Recipe(
            id = 42,
            name = "Morotsrulltårta",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "Tårtbotten",
                "2 Ägg",
                "2 dl Socker",
                "2 dl Vetemjöl",
                "1 tsk Vaniljsocker",
                "1 tsk Kanel",
                "1 tsk Bikarbonat",
                "1 tsk Bakpulver",
                "0,5 dl Rapsolja",
                "2 dl Rivna morötter\n",
                "Cream cheese fyllning",
                "50 g Smör",
                "1 dl Florsocker",
                "1 tsk Vaniljsocker",
                "200 g Kall cream chese (Philadelphia)"
            ),
            ingredientsHalf = listOf(),
            instructions = "Vispa smöret i 2-3 minuter. Blanda ner florsocker och vaniljsocker, vispa någon mer minut.\n" +
                    "Vänd i cream cheese och vispa till styv frosting. Övervispa ej!\n" +
                    "\n" +
                    "Sätt ugnen på 200 grader (varmluft). Börja med tårtbotten. Vispa ägg och socker poröst.\n" +
                    "Blanda de torra ingredienserna i en annan bunke och vänd försiktigt ner dem i äggfluffet.\n" +
                    "Vänd ner morötterna och oljan i smeten.\n" +
                    "Bred ut smeten på en plåt med bakplåtspapper.\n" +
                    "Baka i mitten av ugnen i ca 5 minuter, tills kakan är genombakad.\n" +
                    "Ta ut kakan ur ugnen, vänd den uppochner på ett sockrat bakplåtspapper.\n" +
                    "Ta bort det bakade bakade bakplåtspappret och låt kakan svalna helt.\n" +
                    "Bred sedan på fyllningen och rulla ihop.\n" +
                    "Kakan är godast kall och håller flera dagar i kylen.",
        ),
        Recipe(
            id = 43,
            name = "Pannkakor Malins",
            showUpOnRandom = true,
            halfAvailable = true,
            ingredientsWhole = listOf(
                "Hel sats",
                "6 ägg",
                "6 dl Vetemjöl",
                "1 l Mjölk",
                "1 tsk Salt",
                "50 g Smör"
            ),
            ingredientsHalf = listOf(
                "Halv sats",
                "3 ägg",
                "3 dl Vetemjöl",
                "5 dl Mjölk",
                "0,5 tsk Salt",
                "25 g Smör"
            ),
            instructions = "Vispa ihop allt",
        ),
        Recipe(
            id = 44,
            name = "Pannkakor Jonatans",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "4 ägg",
                "1 tsk Salt",
                "1 dl Socker",
                "6 dl Mjölk",
                "8 dl Vetemjöl",
                "50 g Smör"
            ),
            ingredientsHalf = listOf(),
            instructions = "Vispa ihop allt",
        ),
        Recipe(
            id = 45,
            name = "Pasta chicken primavera",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "2-3 Vitlöksklyftor",
                "2 Kycklingfiléer",
                "250 g Sparris",
                "200 g Cocktailtomater",
                "120 g Strimlad morot",
                "1 tsk Peppar",
                "1 tsk Salt",
                "400 g Pasta",
                "110 g Riven parmesan",
                "2 dl Créme fraiche"
            ),
            ingredientsHalf = listOf(),
            instructions = "Strimla kycklingen, dela sparrisen och tomaterna i bitar. Undre tiden koka pastan.\n" +
                    "Stek kycklingen med vitlöken tills den är genomstekt.\n" +
                    "Lägg i sparrisen, tomat, morot och stek tillsammans i ca 2 minuter. Salta och peppra.\n" +
                    "Tillsätt parmesan, créme fraiche och pasta. Rör om tills osten har smält.",
        ),
        Recipe(
            id = 46,
            name = "Pasta med kyckling och soltorkade tomater",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "300 g Pasta",
                "600 g Kycklingfilé",
                "2 Vitlöksklyftor",
                "250 g Soltorkade tomater",
                "1 Broccolistång",
                "1,5 dl Créme fraiche",
                "125 g Babyspanet",
                "250 g Kalamataoliver",
                "Salt",
                "Peppar"
            ),
            ingredientsHalf = listOf(),
            instructions = "Skär kycklingen i bitar. Skala vitlöken, hacka den eller pressa den direkt i grytan senare.\n" +
                    "Mixa tomaterna och oliverna. Skär broccolin i mindre bitar, även stjälken.\n" +
                    "Koka pastan enligt nvisningar, lägg i broccolin när det är ca 2 minuter kvar av koktiden eller koka den i egen gryta.\n" +
                    "Stek kycklingen i olja, krydda med salt och pappar. Tillsätt vitlöken, tomaterna och oliverna. Låt fräsa i ett par minuter.\n" +
                    "Rör ner créme fraiche och spenaten. Låt sjuda i ca 3 minuter.\n" +
                    "Häll av pasta och broccoli, men spara 1-2dl av vattnet.\n" +
                    "Blanda ner pastan och broccolin i kycklinggrytan. Späd med kokvattnet till önskad krämig konstistens.",
        ),
        Recipe(
            id = 47,
            name = "Pastasås med lax och kräftstjärtar",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1 Gul lök",
                "1 msk Olja",
                "2,5 dl Grädde",
                "1 msk Fiskfond (från flaska)",
                "0,5 Citron",
                "100 g Kallrökt lax",
                "50 g Kräftstjärtar",
                "Svartpeppar",
                "Dill",
                "Gräslök"
            ),
            ingredientsHalf = listOf(),
            instructions = "Skala och hacka löken, stek i oljan utan att den får någon färg.\n" +
                    "Häll på grädden, fiskfonden, rivet citronskal och citronsaft.\n" +
                    "Låt koka ihop ett pad minuter. Strimla laxen och häll ner i såsen tillsammans med kräftstjärtar.\n" +
                    "Peppra efter smak.\n" +
                    "Servera med pasta.\n" +
                    "Dekorera med dill och gräslök.",
        ),
        Recipe(
            id = 48,
            name = "Pastasås med lax",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "100 g Lax",
                "1,5 msk Vetemjöl",
                "1,5 dl Grädde",
                "2 dl Mjölk",
                "1 Fiskbuljongtärning",
                "2 msk Hackad dill"
            ),
            ingredientsHalf = listOf(),
            instructions = "Vispa ut mjölet i grädden. Häll i mjölken och smula i buljongen. Låt koka i 3 minuter.\n" +
                    "Lägg i lax och dill straxinnan servering.\n" +
                    "Servera med pasta.",
        ),
        Recipe(
            id = 49,
            name = "Pastasås med skinka",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "150 g Pasta",
                "0,5 Röd paprika",
                "0,5 Gul lök",
                "100 g Rökt skinka",
                "1 dl Matlagningsgrädde",
                "0,5 msk Vetemjöl",
                "1 dl Vatten",
                "0,5 Buljongtärning",
                "0,5 tsk Curry",
                "0,5 krm Svartpeppar",
                "0,5 msk Tomatpuré"
            ),
            ingredientsHalf = listOf(),
            instructions = "Koka pastan och gör såsen under tiden. Finhacka paprikan, löken och skinkan.\n" +
                    "Vispa ihop grädden och vetemjölet i en kastrull. Låt koka upp.\n" +
                    "Tillsätt vatten,buljong , curry, svatpeppar, tomatpuré, paprika, lök och skinka.\n" +
                    "Låt koka i 3 minuter.\n" +
                    "Blanda pastan med såsen och servera.",
        ),
        Recipe(
            id = 50,
            name = "Engelska pepparkakor",
            showUpOnRandom = false,
            halfAvailable = true,
            ingredientsWhole = listOf(
                "Hel sats",
                "3 dl Sirap",
                "400 g Strösocker",
                "1-2 msk Ingefära",
                "350 g Smör",
                "3 dl Grädde",
                "1 msk Bikarbonat",
                "1,5 kg Vetemjöl"
            ),
            ingredientsHalf = listOf(
                "Tredjedels sats",
                "1 dl Sirap",
                "133 g Strösocker",
                "0,33-0,66 msk Ingefära",
                "117 g Smör",
                "1 dl Grädde",
                "0,33 msk Bikarbonat",
                "0,5 kg Vetemjöl"
            ),
            instructions = "Blir ca 250-300 st\n"+
                    "Rör ihop sirap,kryddorna och smör till en smidig massa. Rör ner grädden.\n" +
                    "Arbeta in mjöl och bikarbonat.\n" +
                    "Låt degen vila i kylskåp till nästa dag.\n",
        ),
        Recipe(
            id = 51,
            name = "Pepparkakor",
            showUpOnRandom = false,
            halfAvailable = true,
            ingredientsWhole = listOf(
                "Hel sats",
                "300 g Smör",
                "1,5 dl Sirap",
                "4 dl Socker",
                "2 tsk Kanel",
                "2 tsk Malen ingefära",
                "2 tsk Mald kryddnejlika",
                "3 Ägg",
                "2 tsk Bikarbonat",
                "1,3 l Vetemjöl"
            ),
            ingredientsHalf = listOf(
                "Tredjedels sats",
                "100 g Smör",
                "0,5 dl Sirap",
                "1,33 dl Socker",
                "0,66 tsk Kanel",
                "0,66 tsk Malen ingefära",
                "0,66 tsk Mald kryddnejlika",
                "1 Ägg",
                "0,66 tsk Bikarbonat",
                "4,3 dl Vetemjöl"
            ),
            instructions = "Koka upp smör,sirap,socker och kryddorna. Låt blandningen svalna.\n" +
                    "Tillsätt äggen. Blanda hälften av mjölet med bikarbonatet. Rörner det i smeten.\n" +
                    "Tillsätt rästen av mjölet i omgångar. Spara lite till utbakningen.\n" +
                    "Arbeta degen slät på bakbord. Låt den ligga kalt över natten.\n" +
                    "Gör kakor av degen. Grädda kakorna i 175 grader i 8-10 minuter. Stora kakor i 150 grader i 10-15 minuter.",
        ),
        Recipe(
            id = 52,
            name = "Pizzadeg",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "5 dl Vetemjöl",
                "0,75 tsk Salt",
                "2,5 tsk Bakpulver",
                "2 msk Olja",
                "40 g Smör",
                "2 dl Mjölk"
            ),
            ingredientsHalf = listOf(),
            instructions = "Blanda vetemjöl, salt och bakpulver.\n" +
                    "Tillsätt smöret. Rör ut till en smet.\n" +
                    "Blanda ner resten av ingredienserna.\n" +
                    "Kavla up på en plåt.\n" +
                    "Efter att tillsatt önskade pizza pålägg grädda i ugnen på 250 grader i 10 minuter.",
        ),
        Recipe(
            id = 53,
            name = "Potatis och purjolöksoppa",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1 Gul lök",
                "2 Purjolökar",
                "8-10 Medelstora potatisat (fast sort)",
                "1 Höns, kyckling eller grönsaksbuljongtärning (eller fond)",
                "1-2 Vitlöksklyftor",
                "1,5 l Vatten",
                "2 dl Grädde",
                "Salt",
                "Peppar",
                "Valfria kryddor (ex cayennepappar)",
                "Smör till stekning"
            ),
            ingredientsHalf = listOf(),
            instructions = "Hacka löken och strimla purjolöken. Fräs i en gryta i smöret tills allt blir mjukt, utan att få färg.\n" +
                    "Häll på hälften av vattnet. Lägg i buljongtärningen och låt koka upp.\n" +
                    "Skala potatisen, skiva eller tärna den. Lägg potatisen i den kokade soppbasen. Pressa i vitlöksklyftorna.\n" +
                    "Låt koka på svag värme i 30-40 minuter. För slät soppa mixa den nu.\n" +
                    "Häll i resterande vatten och krydda. Låt koka upp. Häll i grädden. Låt soppan bli varm.\n" +
                    "Smaka av och servera.\n" +
                    "Man kan även steka 500g köttfärs(kryddad med salt och peppar) och hälla i efter mixern.",
        ),
        Recipe(
            id = 54,
            name = "Potatissallad",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "400 g Kokt potatis",
                "0,5 Purjolök",
                "0,5 Gurka",
                "1 dl Créme fraiche",
                "2 msk Majonnäs",
                "1 msk Senap (Förslöv)"
            ),
            ingredientsHalf = listOf(),
            instructions = "Blanda créme fraiche, majonnäs och senap.\n" +
                    "Hacka allt annat och blanda i.",
        ),
        Recipe(
            id = 55,
            name = "Quesadillas",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "4 Tortillabröd",
                "100 g Rökt skinka",
                "250 g Keso",
                "2 tsk Dijonsenap",
                "1 dl Riven ost",
                "2 msk Hackad försk timjan",
                "Svartpeppar",
                "Olja till stekning"
            ),
            ingredientsHalf = listOf(),
            instructions = "Strimla skikan och blanda alla ingredienser i en skål.\n" +
                    "Bred ut röröan på ett bröd, lägg ett annat ovanpå och tryck till.\n" +
                    "Stek i en stekpanna ca 1 minut på varje sida.\n" +
                    "Dela i 4 bitar.",
        ),
        Recipe(
            id = 56,
            name = "Raggmunkar",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "2 dl Vetemjöl",
                "1,5 tsk Salt",
                "5 dl Mjölk",
                "1 Ägg",
                "8 Potatisar"
            ),
            ingredientsHalf = listOf(),
            instructions = "Blanda ihop alla ingredienser utom potatisen.\n" +
                    "Skala potatisen och riv den.\n" +
                    "Blanda ner den rivna potatisen i smeten.\n" +
                    "Stek till raggmunkar med smör.",
        ),
        Recipe(
            id = 57,
            name = "Sambal oelek kotletter",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "4 Kotletter",
                "2 dl Créme fraiche",
                "2,5 dl Vispgrädde",
                "3 msk Kinesisk soya",
                "0,5 tsk Sambal oelek"
            ),
            ingredientsHalf = listOf(),
            instructions = "Koka ihop créme fraiche, grädde, soya och sambal till såsen.\n" +
                    "Vill man ha såsen lite tjockare så kan man reda med 2msk vetemjöl.\n" +
                    "Lägg kotletterna råa i en ugnsäker form. Häll över såsen.\n" +
                    "Sätt in i ugnen på 200 grader i ca 50 minuter.\n" +
                    "Servera med pressad potatis.",
        ),
        Recipe(
            id = 58,
            name = "Schackrutor",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "200 g Smör",
                "1 dl Strösocker",
                "4 dl Vetemjöl",
                "1 dl Potatismjöl",
                "05 tsk Bakpulver",
                "2 tsk Vaniljsocker",
                "2 msk Kakao"
            ),
            ingredientsHalf = listOf(),
            instructions = "Finfördela smöret i de torra ingredienserna.\n" +
                    "Arbeta sedan snabbt ihop det till en deg.\n" +
                    "Dela degen på två och blanda i kakaon i den ena halvan.\n" +
                    "Rulla ut degen i fyra delar. (2 ljusa och 2 mörka) Och lägg dem som ett sckack.\n" +
                    "Grädda i 175 grader i 10 minuter.",
        ),
        Recipe(
            id = 59,
            name = "Semmelbullar",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "50 g Smör",
                "2,5 dl Mjölk",
                "25 g Jäst",
                "1,25 dl Kesella",
                "2 krm Salt",
                "0,75 dl Socker",
                "8 dl Vetemjöl",
                "1 Vispat ägg"
            ),
            ingredientsHalf = listOf(),
            instructions = "Blir 14 semmlor\n" +
                    "Smula jäste i en bunke. Smält smöret, tillsätt mjölken och värm upp till 37 grader.\n" +
                    "Häll mjölkblandningen över jästen och rör tills allt är upplöst.\n" +
                    "Tillsätt salt, kesella, socker och det mesta av mjölet.\n" +
                    "Arbeta degen kraftigt tills den känns smidig. Jäs under bakduk i ca 30 minuter.\n" +
                    "Arbeta degen på ett mjölat bakbord och baka ut till små släta bullar. Låt jäsa under duk i 20 minuter.\n" +
                    "Pensla bullarna med det vispade ägget.\n" +
                    "Grädda bullarna mitt i ugnen i 5-7 minuter på 250 grader.\n" +
                    "Ta ut och låt dem svalna på galler.",
        ),
        Recipe(
            id = 60,
            name = "Sherrymarinerad kassler",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "150 g Kassler",
                "0,75 dl Torr sherry",
                "3 dl Vispgrädde",
                "2-3 msk Tomatpuré",
                "1,5 dl Riven ost"
            ),
            ingredientsHalf = listOf(),
            instructions = "Skär kasslern i 1 cm skivor(lite tunnare)\n" +
                    "Lägg dem omlott i en ugnsäker form, häll på sherryn.\n" +
                    "Låt stå i någon timme, övertäckt och svalt (går bra att göra dagen innan och låta stå svalt)\n" +
                    "Sätt ugnen på 250 grader.\n" +
                    "Vispa grädden, blanda i tomatpuré och ost. Bred över blandningen jämnt över kasslern.\n" +
                    "Gratinera tills den börjar få färg, ca 10 minuter.\n" +
                    "Servera med ris och sallad.",
        ),
        Recipe(
            id = 61,
            name = "Sjömansbiff",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "500-600 g Benfritt kalvkött (i strimlor)",
                "3 msk Smör",
                "2 tsk Salt",
                "Vitpeppar",
                "3-4 Gula lökar (skivade)",
                "8-10 Potatisar (skivade)",
                "4-5 dl Vatten (eller buljong eller öl)",
                "Persilja"
            ),
            ingredientsHalf = listOf(),
            instructions = "Bryn hälften av smöret och lägg i köttet, krydda. Bryn löken.\n" +
                    "I en gryta - varva kött, potatis och lök, avsluta med potatis.\n" +
                    "Häll över vatten. Låt småkoka under lock i ca 30 minuter (tills potatisen är mjuk)\n" +
                    "Strö ev. persilja över.",
        ),
        Recipe(
            id = 62,
            name = "Smör och purjo fisk",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "Smör",
                "Fiskblock",
                "Purjolök"
            ),
            ingredientsHalf = listOf(),
            instructions = "Smörj en form. Dela fisken. Lägg fisken i formen och salta. Hacka purjolöken och strö den över fisken.\n" +
                    "Lägg på mycket smör i skivor på fisken.\n" +
                    "Sätt in i ugnen på 225 grader i 20 minuter.\n" +
                    "Servera med potatismos.",
        ),
        Recipe(
            id = 63,
            name = "Smulpaj",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "4-6 Äpplen",
                "2 msk Socker\n",
                "Pajdeg",
                "2 dl Vetemjöl",
                "2 tsk Socker",
                "80 g Smör"
            ),
            ingredientsHalf = listOf(),
            instructions = "Sätt ugnen på 225 grader.\n" +
                    "Smörj en form. Skala och skiva äpplena och lägg i formen. Strö over socker.\n" +
                    "Lägg vetemjöl, socker och smör i en skål och arbeta med fingertopparna. Strö degen över äpplena.\n" +
                    "Ställ in  i ugnen tills degen fått ljusbrun färg och äpplena är mjuka.",
        ),
        Recipe(
            id = 64,
            name = "Snickers",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1,5 Burk jordnötssmör ca 525 g",
                "3 dl Sirap",
                "1,5 dl Strösocker",
                "1,5 dl Cocos",
                "1,5 l Okrossad cornflakes",
                "1,5 tsk Vaniljsocker",
                "1,5 Blockchokladkakor"
            ),
            ingredientsHalf = listOf(),
            instructions = "Blanda allt utom cornflakes, vaniljsocker och blockchoklad.\n" +
                    "Värm i en kastrull till en slät smet (behöver ej koka eller sjuda)\n" +
                    "Krossa cornflakesen.\n" +
                    "Tillsätt cornflakes och vaniljsocker och rör om.\n" +
                    "Bred ut i en långpanna med bakplåtspapper. Låt svalna.\n" +
                    "Smält Blockchokladen i vattenbad och bred ut över avsvalnande kakan.\n" +
                    "Innan den svalnat helt dela i fyrkanter.",
        ),
        Recipe(
            id = 65,
            name = "Sommarknyte",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "12 Färskpotatisar",
                "4 Kokta ägg",
                "2 Rödlökar",
                "1 krm Salt",
                "1 krm Peppar",
                "75 g Smör",
                "Gräslök",
                "Persilja",
                "Dill"
            ),
            ingredientsHalf = listOf(),
            instructions = "Koka potatisen, låt svalna och skär i skivor. Skala och hacka äggen, skiva löcken.\n" +
                    "Fördela potatisen på 4 folie ark. Lägg på ägg och lök. Salta och peppra.\n" +
                    "Blanda smöret med örterna och fördela överst.\n" +
                    "Vik ihop till paket och nyp till ordentligt så att inger rinner ut.\n" +
                    "Lägg paketen på grillen i ca 10 minuter. De är klara när smöret har smält och potatisen är riktigt varm.\n" +
                    "Gär även att göra i ugnen.",
        ),
        Recipe(
            id = 66,
            name = "Spaghetti carbonara",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "180 g Spaghetti",
                "2 Ägg",
                "1 dl Mjölk",
                "0,5 dl Grädde",
                "1 Paket bacon",
                "0,5 Gul lök",
                "50 g Riven parmesan",
                "Salt",
                "Svartpeppar"
            ),
            ingredientsHalf = listOf(),
            instructions = "Koka pastan och stek det strimlade baconet. Knäck äggen och blanda med mjölken, grädden, ost, salt och peppar.\n" +
                    "Häll i den färdigkokta pastan i pannan med baconet, sedan äggblandningen.\n" +
                    "Rör om försiktigt med värme i ca 30 sekunder.\n" +
                    "Fördela på 2 tallrikar och strö svartpeppar och parmesan på.",
        ),
        Recipe(
            id = 67,
            name = "Tacopaj",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "Pajdeg",
                "2 dl Vetemjöl",
                "1 dl Grahamsmjöl",
                "100 g Smör",
                "3 msk Kallt vatten\n",
                "Fyllning",
                "300 g Köttfärs",
                "2 dl Créme fraiche",
                "4-5 msk Salsasås",
                "2 dl Riven ost",
                "1 Tomat",
                "0,5 Paprika",
                "2 Vitlöksklyftor",
                "Salt",
                "Peppar"
            ),
            ingredientsHalf = listOf(),
            instructions = "Gör pajdegen och tryck ut den i en ugnsäker form. Grädda pajskalet i 10 minuter i 200 grader.\n" +
                    "Blanda créme fraiche, vitlök, salsasås, riven ost, salt, peppar, hackad tomat och hackad paprika.\n" +
                    "Lägg köttfärsen i pajskalet och häll créme fraich- blandningen ovan på.\n" +
                    "Grädda i 225 grader i 25 miuter.\n" +
                    "Servera med sallad och créme fraiche.",
        ),
        Recipe(
            id = 68,
            name = "Tigerkaka",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "2,5 dl Socker",
                "200 g Smör",
                "1,5 dl Grädde eller mjölk",
                "4 dl Vetemjöl",
                "2 tsk Bakpulver",
                "2 msk Kakao"
            ),
            ingredientsHalf = listOf(),
            instructions = "Starta ugnen på 175 grader.\n" +
                    "Vispa ägg och socker pösigt. Rör ner det smälta smöret och grädden.\n" +
                    "Blanda vetemjöl, bakpulver och rör ner det i smeten.\n" +
                    "Dela smeten i två delar. Blanda kakao i den ena.\n" +
                    "Bred ljus och mörk smet omväxlande i en smörd och bröad form.\n" +
                    "Grädda i ca 1 timme.",
        ),
        Recipe(
            id = 69,
            name = "Tryffeltoppar",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1,5 dl Vispgrädde",
                "2 msk Smör",
                "300 g Ljus blockchoklad"
            ),
            ingredientsHalf = listOf(),
            instructions = "Blir ca 80st\n"+
                    "Smält blockchokladen i vattenbad.\n" +
                    "koka upp grädden med smöret.\n" +
                    "Häll under kraftig vispning ner smörblandningen i chokladen.\n" +
                    "Häll chokladblandningen i små knäckformar.\n" +
                    "Låt stelna kallt.",
        ),
        Recipe(
            id = 70,
            name = "Våfflor(k)",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "3 Ägg",
                "0,5 dl Socker",
                "1 tsk Salt",
                "50 g Smör",
                "3 dl Mjölk",
                "3,5 dl Vetemjöl",
                "1 tsk Bakpulver"
            ),
            ingredientsHalf = listOf(),
            instructions = "Vispa ihop allt\n"+
                    "Grädda i våffeljärn.",
        ),
        Recipe(
            id = 71,
            name = "Vaniljbullar",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "50 g Jäst",
                "175 g Smör",
                "4 dl Gräddmjölk",
                "1 dl Socker",
                "1 krm Salt",
                "1 krm Hjorthornsalt",
                "1 Ägg",
                "12-13 dl Vetemjöl\n",
                "Fyllning",
                "Fast marzankräm(ca 3 dl)\n",
                "Pensling",
                "Smält smör",
                "Strösocker"
            ),
            ingredientsHalf = listOf(),
            instructions = "Smula jästen i degbunke. Smält smöret i en kastrull och hälli gräddmjölken. Slå spadet över jästen och rör om.\n" +
                    "Tillsätt socker, salt, hjorthornsalt, ägg och största delen av mjölet.\n" +
                    "Arbeta degen smidig och ta upp den på bakbordet.\n" +
                    "Dela degen i två delar och kavla ut dem till fyrkanter. Som i sin tur sporras ut i fyrkanter ca 7x7 cm.\n" +
                    "Lägg en klick marzankräm i mitten på fyrkanterna och nyp ihop degen så inte krämen rinner ut.\n" +
                    "Lägg bullarna på väl smord plåt med skarvarna nedåt och låt bullarna jäsa långsamt till dubbel storlek.\n" +
                    "Grädda i 250-275 grader i 6-8 minuter.\n" +
                    "Pensla de varma bullarna med smält smör och doppa dem i socker.",
        ),
        Recipe(
            id = 72,
            name = "Vaniljkräm",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "2 dl Mjölk",
                "2 Äggulor",
                "1 msk Majsstärkelse",
                "1 msk Strösocker",
                "1 msk Vaniljsocker"
            ),
            ingredientsHalf = listOf(),
            instructions = "Vispa samman mjölk, äggulor, socker och majsstärkelse i en kastrull.\n" +
                    "Sjud krämen under omrörning tills den tjocknar.\n" +
                    "Smaksätt med vaniljsocker och låt krämen svalna.",
        ),
        Recipe(
            id = 73,
            name = "Vegetarisk röra till bakpotatis",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "1 Rödlök",
                "1 Burk majs",
                "1-2 Tomater",
                "1 Avokado",
                "Keso",
                "Salt",
                "Peppar"
            ),
            ingredientsHalf = listOf(),
            instructions = "Hacka rödlök, tomat och avokado.\n" +
                    "Blanda allt och servera med bakad potatis eller med lite skinka i eller till baguetter.",
        ),
        Recipe(
            id = 74,
            name = "Veggolasagne med keso",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "3 Purjolökar (går bra med gul lök också)",
                "4 Tomater",
                "0,5 dl Tomatpuré",
                "2,5 dl Matlagningsgrädde",
                "1 tsk Salt",
                "1 krm Peppar",
                "1 msk Basilika (torkad eller färsk)",
                "500 g Keso med chili",
                "2 dl Riven ost",
                "8-10 Lasagneplattor",
                "1 Grönsakstärning",
                "Smör att steka i"
            ),
            ingredientsHalf = listOf(),
            instructions = "Sätt ugnen på 115 grader.\n" +
                    "Skölj och strimla purjolöken, fräs den i smör. Skär tomaterna i bitar.\n" +
                    "Rör tomater, tomatpuré, buljongtärning, grädde, salt, peppar och basilika.\n" +
                    "Koka upp såsen och tillsätt keson i slutet.\n" +
                    "Varva lasagneplattor och sås i en smord, ugnsäker form. Avsluta med sås och ost överst.\n" +
                    "Grädda i nedre delen av ugnen i ca 30 minuter.",
        ),
        Recipe(
            id = 75,
            name = "Äggakaka",
            showUpOnRandom = false,
            halfAvailable = true,
            ingredientsWhole = listOf(
                "Hel sats",
                "5 Ägg",
                "2 msk Socker",
                "1 tsk Salt",
                "7,5 dl Mjölk",
                "5 msk Vetemjöl"
            ),
            ingredientsHalf = listOf(
                "Halv sats",
                "3 Ägg",
                "1 msk Socker",
                "0,5 tsk Salt",
                "3,75 dl Mjölk",
                "3 msk Vetemjöl"
            ),
            instructions = "Blanda ihop ingredienserna.\n" +
                    "Stek och samtidigt skrapa botten på stekpannan konstant."
        ),
        Recipe(
            id = 76,
            name = "Örtscones",
            showUpOnRandom = false,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "2 Rundlar",
                "4,5 dl Vetemjöl",
                "2 tsk Bakpulver",
                "0,5 tsk Salt",
                "50 g Smör",
                "2 dl Mjölk",
                "1 msk Oregano",
                "1 dl Riven ost"
            ),
            ingredientsHalf = listOf(),
            instructions = "Grädda i 250 grader ca 12 min",
        ),
    )
}