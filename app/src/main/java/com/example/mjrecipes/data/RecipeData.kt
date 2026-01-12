package com.example.mjrecipes.data

import androidx.compose.ui.platform.isDebugInspectorInfoEnabled

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
                "6,5 dl mjölk"
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
                "1 burk Tacosås",
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
                "7-8 skivor Bröd"
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
                "1 Röd lök",
                "0,5 dl hackad Dill",
                "hackad Gräslök",
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
                "0,25 paket Jäst (färsk eller torr)",
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
                "2 ägg",
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
                "2 ägg",
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
            name = "Kladkaka med toscatäcke",
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
                "1,5 dl Ljussirap",
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
                "2 msk Ljussirap",
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
                "2 ägg",
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
            id = 200,
            name = "Pannkakor",
            showUpOnRandom = true,
            halfAvailable = false,
            ingredientsWhole = listOf(
                "3 ägg",
                "3dl mjöl",
                "6dl mjölk"
            ),
            ingredientsHalf = listOf(),
            instructions = "Vispa ihop allt",
        ),
        Recipe(
            id = 300,
            name = "Äggakaka",
            showUpOnRandom = false,
            halfAvailable = true,
            ingredientsWhole = listOf("5 Ägg", "2 msk Socker", "1 tsk Salt", "7,5 dl Mjölk", "5 msk Vetemjöl"),
            ingredientsHalf = listOf("3 Ägg", "1 msk Socker", "0,5 tsk Salt", "3,75 dl Mjölk", "3 msk Vetemjöl"),
            instructions = "Blanda ihop ingredienserna.\n" +
                    "Stek och samtidigt skrapa botten på stekpannan konstant."
        )
    )
}