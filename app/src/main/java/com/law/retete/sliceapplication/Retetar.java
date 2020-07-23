package com.law.retete.sliceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Retetar extends AppCompatActivity {

    RecyclerView recyclerView;
    RetetaAdapter adapter;

    List<Reteta> retetaList;

    EditText editTextSearch;

    private void filter(String text) {
        //new array list that will hold the filtered data
        List<Reteta> filteredNames = new ArrayList<>();
        String[] result = text.split("\\s");
        int flagos;

        //looping through existing elements
        for (int i = 0; i < retetaList.size(); i++) {
            flagos = 0;
        for (String s : retetaList.get(i).getTags()) {
            //if the existing elements contains the search input
            for (String h : result) {
            if (s.toLowerCase().contains(h.toLowerCase())) {
                //adding the element to filtered list
                flagos++;
            } }
        }
            if (flagos == result.length) filteredNames.add(retetaList.get(i));
        }

        //calling a method of the adapter class and passing the filtered list
        adapter.filterList(filteredNames);
    }

    public void clickStar(View view) {
        //new array list that will hold the filtered data
        List<Reteta> filteredNames = new ArrayList<>();

        //looping through existing elements
        for (int i = 0; i < retetaList.size(); i++) {
                if (retetaList.get(i).getFav() == 1) {
                    //adding the element to filtered list
                    filteredNames.add(retetaList.get(i));
                }
        }

        //calling a method of the adapter class and passing the filtered list
        adapter.filterList(filteredNames);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retetar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_back);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        retetaList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        retetaList.add(
                new Reteta(
                        1,
                        "Ouă florentine",
                        "Rețetă originală",
                        "Franța",
                        "Timp de preparare: 2 min\nTimp de gătire: 8 min\nGata în: 10 min",
                        R.drawable.oua_posate,
                        new String[]{"chifla", "ou", "rosie", "spanac", "sos", "olandez"},
                        "INGREDIENTE\n2 chifle\n4 ouă\n1 roșie mare - tăiată în 4 felii rotunde\no mână de frunze de spanac\nsos olandez - după plac\nMOD DE PREPARARE\n" +
                                "Ouăle se fierb sau se poșează. Între timp, ne ocupăm de spanac. Se spală bine frunzele, se pune 1 linguriță de unt într-o crăticioară. Când acesta s-a topit se pune spanacul deasupra și se lasă la călit doar până se înmoaie ușor.\n" +
                                "Taie chiflele în 2, prăjește-le un pic, dă-le cu unt. Pune câte o felie de roșie pe fiecare în parte și câte o lingură plină cu spanac. Când sunt gata ouăle, pune-le, așa fierbinți, deasupra spanacului.\n" +
                                "Toarnă sos olandez din belșug și servește-le cât sunt calde.\n"));

        retetaList.add(
                new Reteta(
                        1,
                        "Croque monsieur",
                        "Rețetă clasică",
                        "Franța",
                        "Timp de preparare: 10 min\nTimp de gătire: 15 min\nGata în: 25 min",
                        R.drawable.croque_monsieur,
                        new String[]{"lapte", "unt", "faina", "cimbru", "paine", "mustar", "Dijon", "sunca", "afumata", "branza", "Gruyere", "parmezan", "sare", "piper"},
                        "INGREDIENTE\n300 ml lapte integral\n2 linguri unt nesărat\n3 linguri făină\n3 linguri cimbru proaspăt\n1 pâine normală întreagă\n3 linguri muștar Dijon\n340 g șuncă afumată feliată\n450 g brânză Gruyere\n120 g parmezan ras\nsare și piper după gust\nMOD DE PREPARARE\nPreîncălzește cuptorul la treapta cea mai mare, cu grilajul poziționat la locul al treilea de jos. \n1.	Înfierbântă laptele într-o cratiță, la foc mic spre mediu – pentru aproximativ 5 minute. Într-o altă cărticioară, la foc mic, topește untul. Adaugă peste el făina și amestecă bine să se omogenizeze, timp de 2 minute. Pune peste 1 și 1/2 din frunzele de cimbru, amestecă, apoi adaugă treptat laptele, amestecând continuu. Lasă la foc mic timp de 2 minute, amestecând ocazional să nu se prindă. Dă de pe foc și adaugă 1 linguriță de sare și 1/2 de piper.\n2.	Taie crusta de deasupra pâinii. Taie pâinea pe orizontală, dintr-un cap în celălalt. Umple pâinea cu muștarul, șunca și jumătate din cantitatea de brânză Gruyere.\n3.	Pune pe o tavă tapetată cu hârtie de copt. Dă la cuptorul încins până se topește brânza și devine rumen-aurie. Scoate din cuptor. Dacă ai flacără în partea superioară a cuptorului, aprinde-o pe aceea. Dacă nu, ridică grilajul pe treapta de mijloc.\n4.	Toarnă sos peste stratul de brânză rumenită. Apoi presară și restul de brânză rămasă (inclusiv parmezanul). Dă la cuptor pentru aproximativ 6 minute.\n5.	Scoate din cuptor, râșnește niște piper proaspăt deasupra și restul de cimbru rămas. Lasă-l 5-10 minute până să-l servești."));

        retetaList.add(
                new Reteta(
                        1,
                        "Croque madame",
                        "Rețetă clasică",
                        "Franța",
                        "Timp de preparare: 10 min\nTimp de gătire: 10 min\nGata în: 20 min",
                        R.drawable.croque_madame,
                        new String[]{"paine", "cascaval", "oua", "sunca", "unt", "sare", "piper"},
                        "INGREDIENTE\n8 felii pâine de sandvişuri\n200 g caşcaval\n4 ouă\n4 felii şuncă\n50 g unt\nsare şi piper\nMOD DE PREPARARE\n1. Se ung cu unt toate feliile de pâine si apoi se asaza peste 4 dintre ele câte o felie de cascaval, una de sunca, alta felie de cascaval si apoi una de pâine cu partea unsa cu unt spre interior./n2 Se dau feliile de pâine astfel “umplute” la cuptor 10 minute, pâna ce se rumenesc frumos./n3. Între timp, într-o tigaie care nu se lipește se prăjesc ouăle ochiuri moi./n4. Se aduce pâinea la masă cu ouă deasupra, presărate cu sare și piper negru măcinat."));

        retetaList.add(
                new Reteta(
                        1,
                        "Cordon bleu de pui la cuptor",
                        "Rețetă clasică",
                        "Franța",
                        "Timp de preparare: 15 min\nTimp de gătire: 30 min\nGata în: 45 min",
                        R.drawable.cordon_bleu,
                        new String[]{"pui", "cascaval", "sunca", "oua", "faina", "pesmet"},
                        "INGREDIENTE\n2 bucăți de piept de pui (circa 200g fiecare)\n4 felii cașcaval\n4-6 felii de șuncă (circa 80 g)\n1 ou\n2 linguri de făină sau pesmet(sau pâine uscată bine fărâmițată, să fie mai crocant) si ulei sau unt topit\nMOD DE PREPARARE\nPreîncălzește cuptorul la treaptă mare.\n1. Combină pesmetul sau pâinea uscată fărâmițată cu niște ulei/unt topit într-un bol. Împrăștie-le pe fundul unei tăvi și dă-le la prăjit în cuptorul încins, 3 minute. Scoate-le imediat și pune-le într-un bol.\n 2.	Taie transversal fiecare piept de pui(crestează un buzunar). Împăturește fiecare felie de brânză o dată și bagă 2 felii în fiecare pui. Fă la fel cu feliile de șuncă. Prinde cu scobitori să nu pirzi umplutura. Asezonează cu sare și piper.\n3.	Bate oul cu făina. Dă bucățile de pui prin mixtura de ou și apoi prin pesmet. Pune-le pe tavă și stropește-el ușor cu ulei sau unt topit. Dă la cuptor 25-30 de minute sau până când observi că sunt aurii la exterior și bine pătrunse. Lasă la răcit 5 minute înainte de servire."));

        retetaList.add(
                new Reteta(
                        1,
                        "Paste ratatouille",
                        "Rețetă clasică",
                        "Franța",
                        "Timp de preparare: 10 min\nTimp de gătire: 12 min\nGata în: 22 min",
                        R.drawable.paste_ratatouille,
                        new String[]{"paste", "dovlecel", "vanata", "ardei", "rosu", "rosie", "ceapa", "usturoi", "busuioc", "otet", "balsamic", "sare", "piper"},
                        "INGREDIENTE\n300 g paste\n1 dovlecel mediu\n1/2 vânătă\n1 ardei roșu\n400 g roșii\n1/2 ceapă\n3 căței de usturoi pisați\n480 ml apă fiartă\n1 linguriță busuioc\nsare și piper după gust\n1linguriță oțet balsamic\nMOD DE PREPARARE\n1. Spală și taie legumele. Într-o tigaie mare încinge niște ulei de măsline și pune legumele (fără roșii) la călit, câteva minute, până se rumenesc ușor și încep să își îmbine aromele.\n2. Adaugă și roșiile tocate, apa clocotindă, oțeul și spaghetele. Amestecă și adu la fierbere, apoi lasă-le să se facă la foc mediu timp de 10 minute, până când pastele se fierb și sosul începe să se îngroașe. \n3. Adaugă busuiocul, sare și piper după gust. Amestecă și servește fierbinte."));

        retetaList.add(
                new Reteta(
                        1,
                        "Tarta provence",
                        "Rețetă clasică",
                        "Franța",
                        "Timp de preparare: 55 min\nTimp de gătire: 40 min\nGata în: 95 min",
                        R.drawable.tarta_provence,
                        new String[]{"faina", "oua", "sare", "unt", "mozzarela", "branza", "telemea", "masline", "ciuperci", "ceapa", "ulei", "smantana", "piper", "rosie"},
                        "INGREDIENTE\n\nPentru aluat: \250 g făină\n5 ouă\n1 vârf cuţit de sare\n125 g unt\n1-2 linguri apă rece\n\nPentru umplutură:\150 g mozzarela\n150 g brânză telemea\n100 g măsline\n10 ciuperci\n1 ceapă\n1 lingura ulei\n3 linguri smântână\n2 ouă\nsare, piper\n2 roşii\nMOD DE PREPARARE\n1. 1.	Cerne făina pe o planşetă, fă o adâncitură la mijloc şi pune un ou şi sarea. Adaugă untul tăiat cuburi şi frământă repede. Toarnă treptat apa şi amestecă până se obţine un aluat sfărâmicios.\n2. Înveleşte aluatul în folie de plastic şi lasă-l 30 de minute la frigider. Curăţă ceapa, se spală şi se toacă mărunt. Se căleşte în puţin ulei, după care se adaugă şi ciupercile curăţate şi tăiate solzişori./n3. 3.	Pune şi măslinele, brânza telemea, mozzarela, un ou şi două linguri de smântână. Amestecă toate, după care se iau de pe foc. Tapetează o formă de tartă cu unt şi făină, se pune aluatul, se înţeapă cu furculiţa şi se adaugă umplutura. Dă la cuptor pentru aproximativ 35 de minute./n4. 4.	Înainte cu 10 minute de a fi gata, spală 2 roşii şi taie rondele. Amestecă o lingură de smântână cu un ou şi întinde peste tartă. Peste amestec, aşază şi feliile de roşii./n5. 5.	Se mai lasă la cuptor pentru câteva minute, după care se scoate. Se serveşte caldă."));

        retetaList.add(
                new Reteta(
                        1,
                        "Cornulete cu ciocolata din 3 ingrediente",
                        "Rețetă clasică",
                        "Franța",
                        "Timp de preparare: 10 min\nTimp de gătire: 25 min\nGata în: 35 min",
                        R.drawable.cornulete_cu_ciocolata,
                        new String[]{"oua", "aluat", "foitaj", "ciocolata"},
                        "INGREDIENTE\n1 ou\1 lingură apă\n250 g aluat foitaj\n150 g ciocolată fulgi sau răzuita\nMOD DE PREPARARE\n1. Încinge cuptorul la 180 de grade şi tapetează o tavă mare cu hârtie de copt. Bate oul într-un castron şi adaugă apa când amesteci.\n2. Presară făină pe suprafaţa de lucru şi întinde aluatul franţuzesc cu un făcăleţ, până obţii un pătrat cu latura de 40 cm.\n3. Taie aluatul în dreptunghiuri de circa 8/4 cm, apoi taie dreptunghiurile astfel formate în jumătăţi, pe diagonală.\n4. Pune câte două linguriţe de fulgi de ciocolată, sau ciocolată răzuită în centrul fiecărui triunghi şi rulează de la marginea mare, spre vârful triunghiului, astfel încât să obţii cornuleţe.\n5. Îndoaie puţin cornuleţele, ca să arate ca o semilună şi aşază fiecare bucată în tavă, cu partea rulată ultima dedesubt, ca să nu se desfacă la copt.\n6. Unge cornuleţele cu oul bătut şi dă la cuptor circa 25 de minute, până ce croissantele devin aurii."));

        retetaList.add(
                new Reteta(
                        1,
                        "Trufe de ciocolata negra cu avocado",
                        "Rețetă clasică",
                        "Franța",
                        "Timp de preparare: 10 min\nTimp de gătire: 10 min\nGata în: 20 min",
                        R.drawable.trufe_cu_ciocolata,
                        new String[]{"cacao", "ciocolata", "sare", "vanilie", "avocado"},
                        "INGREDIENTE\n2 linguri pudră de cacao\n1 praf sare\n1/2 linguriță esență de vanilie\n1 avocado copt\n170 g ciocolată amăruie\nMOD DE PREPARARE\n1. Amestecă ciocolata, esenţa de vanilie şi un praf de sare într-o cratiţă pusă pe bain marie. Amestecă încet, până la topirea completă.\n2. Pasează fructul de avocado cu furculiţa şi amestecă în ciocolata topită până la omogenizare.\n3. Dă amestecul de ciocolată neagră şi avocado la frigider circa 20 de minute, sau până se întăreşte puţin.\n4. Foloseşte o lingură pentru a forma circa 12 biluţe din amestec. Pune-le pe o tavă tapetată cu hârtie de copt. Rostogoleşte-le prin palmă dacă vrei să arate mai rotunde şi frumoase.\n5. Pune câteva linguri de cacao într-un castronel şi rostogoleşte trufele prin pudra de cacao.\n6. Se păstrează în frigider și se servesc la temperatura camerei."));

        retetaList.add(
                new Reteta(
                        1,
                        "Clafoutis cu cirese",
                        "Rețetă clasică",
                        "Franța",
                        "Timp de preparare: 4 min\nTimp de gătire: 40 min\nGata în: 45 min",
                        R.drawable.clafoutis_cu_cirese,
                        new String[]{"oua", "cirese", "faina", "zahar", "vanilat", "sare", "vanilie", "lapte", "unt", "pesmet"},
                        "INGREDIENTE\n3-4 ouă\n550 g cireșe\n125-130 g făină\n1 plic zahăr vanilat\n1 vârf de linguriță de sare\n1 fiolă esență de vanilie\n250 ml lapte dulce\n100 g zahăr\nunt pentru uns tava\npesmet pentru tapetat tava (dacă folosiți una care lipește)\nMOD DE PREPARARE\n Pune într-un blender zahărul, laptele, esența de vanilie, făina, sarea și ouăle și amestecă aproximativ un minut, până se omogenizează. Sau, dacă nu ai blender, poți folosi fără probleme un tel și un bol mediu pentru a face aluatul.\n Va ieși un aluat asemănător celui pentru clătite.\n Preîncălzește cuptorul la treaptă mare. Unge o tavă mai înaltă (prăjitura va crește destul de mult în timpul coacerii apoi se va lăsa) cu unt, tapeteaz-o cu făină. Acoperă fundul tăvii cu cireșele cărora le-ai scos în prealabil sâmburii. Toarnă aluatul deasupra, presară deasupra niște zahăr vanilat (opțional). Dați la cupor, la 160 de grade, timp de 35-40 de minute sau până când observi că s-a copt și a căpătat o nuanță aurie.\n Dacă dorești, o poți pudra cu zahăr înainte de servire."));

        adapter = new RetetaAdapter(this, retetaList);
        editTextSearch = (EditText) findViewById(R.id.editTextSearch);

        recyclerView.setAdapter(adapter);

        editTextSearch.setFocusableInTouchMode(true);
        editTextSearch.requestFocus();

        editTextSearch.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // Perform action on key press
                    filter(editTextSearch.getText().toString());
                    return true;
                }
                return false;
            }
        });

} }
