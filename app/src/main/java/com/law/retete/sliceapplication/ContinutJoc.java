package com.law.retete.sliceapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class ContinutJoc extends AppCompatActivity {

    private int i = 0, flag1 = 0,  flag2 = 0,  flag3 = 0,  flag4 = 0,  flag5 = 0, flagNext = 0;
    TextView textViewToolbar;
    ImageView img;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continut_joc);
        textViewToolbar = (TextView) findViewById(R.id.textViewToolbar);
        img = (ImageView) findViewById(R.id.imageViewRetetaJ);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        img.setImageResource(R.drawable.j1);
        checkBox1.setText("aluat foietaj");
        checkBox2.setText("mere");
        checkBox3.setText("banane");
        checkBox4.setText("drojdie");
        checkBox5.setText("nuci");
    }

    public void dialogReteta(String titlu, String continut) {
        AlertDialog.Builder builderDialog = new AlertDialog.Builder(this);
        builderDialog.setTitle(titlu);
        builderDialog.setMessage(continut);

        builderDialog.setPositiveButton(
                "Continuă",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (flagNext == 1) {
                            Intent intent = new Intent(ContinutJoc.this, MainActivity.class);
                            startActivity(intent);
                        }
                    }
                });

                builderDialog.show();
    }

    public void cb1onClick(View view) {
        flag1 = 1;
    }

    public void cb2onClick(View view) {
        flag2 = 1;
    }

    public void cb3onClick(View view) {
        flag3 = 1;
    }

    public void cb4onClick(View view) {
        flag4 = 1;
    }

    public void cb5onClick(View view) {
        flag5 = 1;
    }

    public void clickButtonNextJ(View view) {
        int flagC = 0;
        if (i < 10) {
            //1
            if (i == 0 && flag1 == 1 && flag2 == 0 && flag3 == 1 && flag4 == 0 && flag5 == 1) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai ghicit: Rulouri cu ciocolată şi banane", "Ingrediente: aluat foietaj, crema ciocolata, banane, nuci\n" +
                        "\n" +
                        "Reţetă:\n" +
                        "Ingrediente:\n" +
                        "•\tun pachet aluat foitaj \n" +
                        "•\t100-150 g cremă de ciocolată\n" +
                        "•\t2 banane \n" +
                        "•\t150 g nuci\n" +
                        "\n" +
                        "      Mod de preparare:\n" +
                        "\n" +
                        "Desfășoară foietajul pe blatul de lucru, întinde cremă de ciocolată tartinabilă deasupra lui, iar peste așază banană tăiată felii. \n" +
                        " Presară peste cele două straturi nucă coaptă și tăiată cât mai mărunt. Rulează aluatul și taie-l felii de 1-2 cm grosime. \n" +
                        " Așază feliile în tava tapetată cu hârtie de copt sau folie de aluminiu și dă-o la cuptor pentru 20 de minute la 180 de grade, sau până când rulourile se rumenesc bine.\n");
                img.setImageResource(R.drawable.j2);
                checkBox1.setText("aluat foietaj");
                checkBox2.setText("lapte praf");
                checkBox3.setText("ciocolata");
                checkBox4.setText("stafide");
                checkBox5.setText("sare");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                flagC = 1;
            }
            else {
                if (i == 0) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai greșit! Mai încearcă!", "");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false); }
            }
            //2
            if (i == 1 && flag1 == 0 && flag2 == 1 && flag3 == 0 && flag4 == 1 && flag5 == 0) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai ghicit: Ciocolată albă de casă cu nuci şi stafide", "Ingrediente: lapte praf, nuci, stafide, lapte, unt, zahăr, esenţă vanilie\n" +
                        "Reţetă:\n" +
                        "Ingrediente:\n" +
                        "•\t300 g lapte praf\n" +
                        "•\t 4 linguri nuci (alune de pădure/arahide/nucă) \n" +
                        "•\t4 linguri stafide/merişoare \n" +
                        "•\t100 ml lapte\n" +
                        "•\t 1/2 pachet unt \n" +
                        "•\t10 linguri zahăr\n" +
                        "•\t esenţă vanilie\n" +
                        "\n" +
                        "Mod de preparare:\n" +
                        "\n" +
                        "1. Topește untul cu laptele și zahărul și lasă compoziția să dea în clocot. \n" +
                        " 2. Dă preparatul de pe foc și încorporează laptele praf treptat. Amestecă până la omogenizare, apoi adaugă nucile și/sau stafidele, împreună cu esența de vanilie. \n" +
                        " 3. Toarnă compoziția pentru ciocolată albă de casă într-o formă de chec tapetată cu folie alimentară și dă-o la frigider pentru 2-3 ore, sau până când se solidifică și poate fi servită.\n");
                img.setImageResource(R.drawable.j3);
                checkBox1.setText("mure");
                checkBox2.setText("vișine");
                checkBox3.setText("muguri de brad");
                checkBox4.setText("praf de copt");
                checkBox5.setText("miere");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                flagC = 1;
            }
            else {
                if (i == 1) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai greșit! Mai încearcă!", "");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false); }
            }
            //3
            if (i == 2 && flag1 == 0 && flag2 == 1 && flag3 == 0 && flag4 == 1 && flag5 == 0) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai ghicit: Chec cu vişine", "Ingrediente: ouă, zahăr, apă, ulei, făină, vişine, praf de copt\n" +
                        "\n" +
                        "Reţetă:\n" +
                        "Ingrediente:\n" +
                        "•\t4 ouă\n" +
                        "•\t1 cană de zahăr\n" +
                        "•\t4 linguri de apă\n" +
                        "•\t4 linguri de ulei\n" +
                        "•\t1 cană de făină\n" +
                        "•\t1/2 cană visine\n" +
                        "•\t1 lingură cacao\n" +
                        "•\t1 praf de copt\n" +
                        "\n" +
                        "Mod de preparare: \n" +
                        "\n" +
                        "Începem prin a face un sirop de zahăr din 4 linguri de apă și o cană de zahăr . Punem ingredientele într-un ibric și topim pe foc mic zahărul pană obținem un sirop dens.  \n" +
                        "  Lăsăm să se răcească .  \n" +
                        "  Separăm albușurile de gălbenusuri  \n" +
                        "  Gălbenusurile le batem cu o furculița și incorporăm în ele, rând pe rând, câte o lingură de ulei.  \n" +
                        "  Albușurile le batem spumă tare cu putină sare. Când albușurile sunt bătute bine, adăugăm în fir, siropul de zahăr.  \n" +
                        "  Apoi, adăugăm gălbenusurile, praful de copt și făina în ploaie. Omogenizăm ușor.  \n" +
                        "  Într-o tavă de chec pe care am pus hârtie de copt, turnăm ¾ din compoziție. Presărăm deasupra vișinele.  \n" +
                        "  În compoziția rămasă, punem cacao și omogenizăm. Pe mijlocul tăvii de chec, turnăm compoziția cu cacao și cu o scobitoare amestecăm cele 2 compoziții.  \n" +
                        "  Dăm tavă la cuptorul încins la 180 grade C, pentru 25-30 minute sau până trece testul cu scobitoarea.  \n" +
                        "  Din această compoziție, iese un chec înalt (cam 8 cm inăltime ), într-o tavă de 25 cm lungime.  \n");
                img.setImageResource(R.drawable.j4);
                checkBox1.setText("smântână");
                checkBox2.setText("lapte");
                checkBox3.setText("bacon");
                checkBox4.setText("untură");
                checkBox5.setText("ou");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                flagC = 1;
            }
            else {
                if (i == 2) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai greșit! Mai încearcă!", "");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false); }
            }
            //4
            if (i == 3 && flag1 == 1 && flag2 == 0 && flag3 == 1 && flag4 == 0 && flag5 == 1) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai ghicit: Spaghete Carbonara", "Ingrediente: smântână, bacon, ou, parmezan, ceapă, ulei, cimbru\n" +
                        "Reţetă:\n" +
                        "\n" +
                        "\n" +
                        "Ingrediente:\n" +
                        "\n" +
                        "•\t400 g spaghete\n" +
                        "•\t 1 ceapă\n" +
                        "•\t 2 ouă\n" +
                        "•\t 120 g bacon\n" +
                        "•\t 250 g smântână\n" +
                        "•\t 4 linguri parmezan\n" +
                        "•\t 2 linguri ulei\n" +
                        "•\t 2 crengute cimbru\n" +
                        "Mod de preparare:\n" +
                        "1. Se pun la fiert spaghetele în apă cu un praf de sare. Între timp, ceapa și baconul se taie în cubulețe fine, iar cimbrul se spală și se curătă. \n" +
                        " 2. Într-o tigaie ȋncinsă, se rumenește ușor baconul în puțin ulei, apoi se adaugă ceapa tocată mărunt și se lasă puțin la prăjit. Se mai adaugă frunzele de cimbru și se mai lasă câteva minute pe foc, amestecând încontinuu. \n" +
                        " 3. Sosul se prepară astfel: galbenuşele de la cele 2 ouă se amestecă cu smântâna și cu parmezanul. \n" +
                        " 3. Spaghetele fierte se lasă la scurs. Apoi se amestecă cu baconul, cu ceapa și cu amestecul de smântână, ou și parmezan. Se lasă un pic să se întrepătrundă sosul în pastele fierbinți.\n" +
                        " 4. Se servesc ornate cu frunze de cimbru.\n");
                img.setImageResource(R.drawable.j5);
                checkBox1.setText("aluat foietaj");
                checkBox2.setText("ciuperci");
                checkBox3.setText("cimbru");
                checkBox4.setText("mozzarella");
                checkBox5.setText("gouda");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                flagC = 1;
            }
            else {
                if (i == 3) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai greșit! Mai încearcă!", "");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false); }
            }
            //5
            if (i == 4 && flag1 == 0 && flag2 == 1 && flag3 == 0 && flag4 == 1 && flag5 == 0) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai ghicit: Ciuperci umplute la grătar", "Ingrediente: ciuperci, mozzarella, pătrunjel, roşii, sare, piper\n" +
                        "\n" +
                        "\n" +
                        "Reţetă:\n" +
                        "\n" +
                        "\n" +
                        "Ingrediente:\n" +
                        "\n" +
                        "•\t8-10 ciuperci champignion \n" +
                        "•\t100 g mozzarella \n" +
                        "•\t2 linguri pătrunjel proaspăt \n" +
                        "•\t2-3 roșii \n" +
                        "•\tsare \n" +
                        "•\tpiper\n" +
                        "\n" +
                        "\n" +
                        "Mod de preparare:\n" +
                        "1.\tCurată ciupercile și păstrează-le codițele. Tăie roșiile, mozzarella și codițele ciupercilor cubulețe, toacă pătrunjelul mărunt și amestecă toate ingredientele. Potrivește de sare și piper, apoi umple ciupercile. \n" +
                        "2.\tPune ciupercile pe grătar când jarul nu este foarte puternic, pentru a se putea pătrunde. Preparatul este gata când poți înfige furculița în laterală ciupercilor fără dificultăți.\n");
                img.setImageResource(R.drawable.j6);
                checkBox1.setText("morcovi");
                checkBox2.setText("cașcaval");
                checkBox3.setText("zahăr");
                checkBox4.setText("pătrunjel");
                checkBox5.setText("struguri");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                flagC = 1;
            }
            else {
                if (i == 4) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai greșit! Mai încearcă!", "");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false); }
            }
            //6
            if (i == 5 && flag1 == 0 && flag2 == 1 && flag3 == 0 && flag4 == 1 && flag5 == 0) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai ghicit: Vinete umplute cu legume si cascaval", "Ingrediente: vinete, ceapă, ardei, roșii, cașcaval, pătrunjel, sare, piper, ulei\n" +
                        "\n" +
                        "Reţetă:\n" +
                        "\n" +
                        "\n" +
                        "Ingrediente:\n" +
                        "\n" +
                        "•\t4 vinete \n" +
                        "•\t2 linguri ulei \n" +
                        "•\t1 ceapă \n" +
                        "•\t2 ardei \n" +
                        "•\t4 roșii \n" +
                        "•\t100 g cașcaval \n" +
                        "•\tpătrunjel \n" +
                        "•\tsare \n" +
                        "•\tpiper\n" +
                        "\n" +
                        "\n" +
                        "Mod de preparare:\n" +
                        "1.\tTaie vinetele în jumătăți pe lungime și scobește-le de semințe cu o lingură. \n" +
                        "2.\tToacă ceapa, ardeii și pulpa de vinete scobită. Încinge 2 linguri de ulei într-o tigaie și sotează legumele, până când toate ingredientele își schimbă culoarea. \n" +
                        "3.\tScoate legumele într-un castron și amestecă-le cu roșiile tocate cubulețe și cașcavalul ras. \n" +
                        "4.\tUmple vinetele cu această compoziție și dă-le la cuptor acoperite cu folie de aluminiu sau de copt pentru 40 de minute la 180 de grade. \n" +
                        "5.\tÎnlătură apoi folia și mai dă o dată vinetele la cuptor pentru alte 15-20 de minute, sau până se rumenesc după gust.\n");
                img.setImageResource(R.drawable.j7);
                checkBox1.setText("mălai");
                checkBox2.setText("lapte de migdale");
                checkBox3.setText("telemea");
                checkBox4.setText("arahide");
                checkBox5.setText("bacon");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                flagC = 1;
            }
            else {
                if (i == 5) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai greșit! Mai încearcă!", "");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false); }
            }
            //7
            if (i == 6 && flag1 == 1 && flag2 == 0 && flag3 == 1 && flag4 == 0 && flag5 == 1) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai ghicit: Mămăligă în straturi", "Ingrediente: mălai, telemea, bacon, ouă, smântână, lapte, ulei, sare\n" +
                        "\n" +
                        "Reţetă:\n" +
                        "\n" +
                        "\n" +
                        "Ingrediente:\n" +
                        "\n" +
                        "•\t300 g mălai \n" +
                        "•\t300 g bacon  \n" +
                        "•\t200 g brânză telemea \n" +
                        "•\t200 g smântână cu minim 20% grăsime  \n" +
                        "•\t1,5 litri lapte \n" +
                        "•\t4 ouă \n" +
                        "•\t2 linguri de ulei \n" +
                        "•\t1/2 linguriță sare\n" +
                        "\n" +
                        "\n" +
                        "Mod de preparare:\n" +
                        "Taie baconul în cubulețe mici. Călește cubulețele de bacon în două linguri de ulei, cca cinci minute. \n" +
                        "Pune laptele într-o cratiță și adaugă sarea. Amestecă cât să se topească sarea, iar când ajunge la punctul de fierbere încorporează mălaiul. \n" +
                        "Amestecă cu un tel sau o lingură de lemn având grijă să nu se formeze cocoloașe.Când mămăliga începe să se îngroașe, oprește focul și adaugă smântâna. \n" +
                        "Amestecă bine și lasă deoparte. \n" +
                        "Într-o formă cu marginile detașabile, diametrul de aproximativ 20 cm și unsă cu unt, așează 1/3 din mămăligă și nivelează ușor. \n" +
                        "Distribuie uniform jumătate din cantitea de telemea rasă. Pune 1/3 din baconul călit. \n" +
                        "Acoperă cu jumătate din mămăligă rămasă și distribuie uniform restul de telemea rasă și jumătate din bacon. \n" +
                        "Așează restul de mămăligă. Deasupra creează patru gropițe cu ajutorul unei linguri. \n" +
                        "În fiecare gropiță pune câte un ou. Presară cu baconul călit care ți-a rămas. \n" +
                        "Pune forma la cuptorul preîncălzit la 180° C timp de 30 minute. \n" +
                        "Înainte de a scoate din formă lasă să se răcească pentru zece minute.\n");
                img.setImageResource(R.drawable.j8);
                checkBox1.setText("aluat foietaj");
                checkBox2.setText("lapte");
                checkBox3.setText("caramel");
                checkBox4.setText("orez");
                checkBox5.setText("sare");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                flagC = 1;
            }
            else {
                if (i == 6) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai greșit! Mai încearcă!", "");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false); }
            }
            //8
            if (i == 7 && flag1 == 0 && flag2 == 1 && flag3 == 0 && flag4 == 1 && flag5 == 0) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai ghicit: Orez cu lapte", "Ingrediente: Ingrediente: lapte, orez, zahăr, scorţişoară\n" +
                        "\n" +
                        "Reţetă:\n" +
                        "\n" +
                        "\n" +
                        "Ingrediente:\n" +
                        "\n" +
                        "•\t250 g orez  \n" +
                        "•\t1 l lapte  \n" +
                        "•\t170 g zahăr  \n" +
                        "•\t1 linguriţă scorțișoară\n" +
                        "\n" +
                        "Mod de preparare:\n" +
                        "1.\tAdu laptele si orezul la fiert într-o cratiță care nu lipește. După ce ajunge la fierbere, dă focul de la mare la mediu-mic și lasă așa până când orezul absoarbe laptele.\n" +
                        "2.\tAproape ȋnainte de a fi gata, adaugă zahărul şi un pic de scorţişoară.\n");
                img.setImageResource(R.drawable.j9);
                checkBox1.setText("brânză Brie");
                checkBox2.setText("cicocolată de menaj");
                checkBox3.setText("ulei de in");
                checkBox4.setText("trufe");
                checkBox5.setText("sare");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                flagC = 1;
            }
            else {
                if (i == 7) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai greșit! Mai încearcă!", "");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false); }
            }
            //9
            if (i == 8 && flag1 == 0 && flag2 == 1 && flag3 == 0 && flag4 == 1 && flag5 == 0) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai ghicit: Tort de ciocolată și rom", "Ingrediente: ou, făină, zahăr, cacao, ciocolată de menaj, frişcă lichidă, esenţă de rom, trufe pentru décor\n" +
                        "\n" +
                        "Reţetă:\n" +
                        "\n" +
                        "\n" +
                        "Ingrediente:\n" +
                        "\n" +
                        "Pentru blat\n" +
                        "8 ouă\n" +
                        "8 linguri zahăr\n" +
                        "5 linguri făină\n" +
                        "3 linguri cacao\n" +
                        "Pentru cremă\n" +
                        "450 g ciocolată de menaj\n" +
                        "200 ml frişcă lichidă\n" +
                        "2 esenţe de rom\n" +
                        "2 linguri cacao\n" +
                        "trufe pentru decor\n" +
                        "Mod de preparare:\n" +
                        "\n" +
                        "Se bat albuşurile spumă, se adaugă zahărul şi se mixează în continuare, până se topeşte acesta din urmă. Se adaugă treptat gălbenuşurile, ¬făina şi cacaua, amestecând de jos în sus, să nu se lase compoziţia. Se toarnă într-o formă de tort unsă şi tapetată şi se dă la cuptor pentru 45 de minute. Se pune frişca lichidă într-un vas pe baie de aburi şi când este fierbinte se adaugă 350 g ciocolată rasă, o esenţă de rom şi cacaua.\n" +
                        "Se amestecă până se topeşte ciocolata şi se dă la rece (dacă clocoteşte, crema se taie). Se taie blatul răcit în trei părţi. Se aşază o parte de blat pe un platou, se însiropează cu un sirop fiert din apă, zahăr şi o esenţă de rom, se întinde o trei¬me din crema de ciocolată. Se continuă cu blat însiropat, cremă, blat însiropat şi cremă. Se topeşte ciocolata rămasă în trei linguri de apă şi se glazurează tortul. Se decorează cu trufe de ciocolată şi se dă la rece.\n");
                img.setImageResource(R.drawable.j10);
                checkBox1.setText("roșii");
                checkBox2.setText("lapte praf");
                checkBox3.setText("castraveți");
                checkBox4.setText("mere");
                checkBox5.setText("salată verde");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);
                flagC = 1;
            }
            else {
                if (i == 8) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai greșit! Mai încearcă!", "");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false); }
            }
            //10
            if (i == 9 && flag1 == 1 && flag2 == 0 && flag3 == 1 && flag4 == 0 && flag5 == 1) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Felicitări, ai finalizat jocul!\nAi ghicit: Salată grecească", "Ingrediente: roșii, castraveți, salată verde, telemea, măsline, ceapă roşie, ulei de măsline, sare, piper\n" +
                        "\n" +
                        "\n" +
                        "Reţetă:\n" +
                        "\n" +
                        "\n" +
                        "Ingrediente:\n" +
                        "\n" +
                        "•\t2 roșii\n" +
                        "•\t1 castravete\n" +
                        "•\tcâteva frunze de salată verde\n" +
                        "•\t100 g telemea\n" +
                        "•\t50 g măsline\n" +
                        "•\t1 ceapă\n" +
                        "•\tulei de măsline\n" +
                        "•\tsare, piper\n" +
                        "\n" +
                        "Mod de preparare:\n" +
                        "•\tSe taie toate legumele şi brânza cubuleţe. Se amestecă cu ulei de măsline, sare, piper.\n");
                flagNext = 1;
            }
            else {
                if (i == 9) {
                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                dialogReteta("Ai greșit! Mai încearcă!", "");
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false); }
            }
            if (flagC == 1)
                i++;
            textViewToolbar.setText("Rețeta " + (i + 1));
        }
    }
}
