package com.example.chess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Pusty = findViewById(R.id.pustepole);
        ImageView Przerzut = findViewById(R.id.przerzut);
        Pusty.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        Przerzut.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));



        //Czarne figury
        ImageView A8 = findViewById(R.id.A8);
        A8.setImageResource(getResources().getIdentifier("@drawable/blackrook", null, this.getPackageName()));
        A8.setTag("B");
        ImageView B8 = findViewById(R.id.B8);
        B8.setImageResource(getResources().getIdentifier("@drawable/blackknight", null, this.getPackageName()));
        B8.setTag("B");
        ImageView C8 = findViewById(R.id.C8);
        C8.setImageResource(getResources().getIdentifier("@drawable/blackbishop", null, this.getPackageName()));
        C8.setTag("B");
        ImageView D8 = findViewById(R.id.D8);
        D8.setImageResource(getResources().getIdentifier("@drawable/blackqueen", null, this.getPackageName()));
        D8.setTag("B");
        ImageView E8 = findViewById(R.id.E8);
        E8.setImageResource(getResources().getIdentifier("@drawable/blackking", null, this.getPackageName()));
        E8.setTag("B");
        ImageView F8 = findViewById(R.id.F8);
        F8.setImageResource(getResources().getIdentifier("@drawable/blackbishop", null, this.getPackageName()));
        F8.setTag("B");
        ImageView G8 = findViewById(R.id.G8);
        G8.setImageResource(getResources().getIdentifier("@drawable/blackknight", null, this.getPackageName()));
        G8.setTag("B");
        ImageView H8 = findViewById(R.id.H8);
        H8.setImageResource(getResources().getIdentifier("@drawable/blackrook", null, this.getPackageName()));
        H8.setTag("B");



        //Biale figury
        ImageView A1 = findViewById(R.id.A1);
        A1.setImageResource(getResources().getIdentifier("@drawable/whiterook", null, this.getPackageName()));
        A1.setTag("W");
        ImageView B1 = findViewById(R.id.B1);
        B1.setImageResource(getResources().getIdentifier("@drawable/whiteknight", null, this.getPackageName()));
        B1.setTag("W");
        ImageView C1 = findViewById(R.id.C1);
        C1.setImageResource(getResources().getIdentifier("@drawable/whitebishop", null, this.getPackageName()));
        C1.setTag("W");
        ImageView D1 = findViewById(R.id.D1);
        D1.setImageResource(getResources().getIdentifier("@drawable/whiteking", null, this.getPackageName()));
        D1.setTag("W");
        ImageView E1 = findViewById(R.id.E1);
        E1.setImageResource(getResources().getIdentifier("@drawable/whitequeen", null, this.getPackageName()));
        E1.setTag("W");
        ImageView F1 = findViewById(R.id.F1);
        F1.setImageResource(getResources().getIdentifier("@drawable/whitebishop", null, this.getPackageName()));
        F1.setTag("W");
        ImageView G1 = findViewById(R.id.G1);
        G1.setImageResource(getResources().getIdentifier("@drawable/whiteknight", null, this.getPackageName()));
        G1.setTag("W");
        ImageView H1 = findViewById(R.id.H1);
        H1.setImageResource(getResources().getIdentifier("@drawable/whiterook", null, this.getPackageName()));
        H1.setTag("W");



        //Pionki czarne
        ImageView A7 = findViewById(R.id.A7);
        A7.setImageResource(getResources().getIdentifier("@drawable/blackpawn", null, this.getPackageName()));
        A7.setTag("B");
        ImageView B7 = findViewById(R.id.B7);
        B7.setImageResource(getResources().getIdentifier("@drawable/blackpawn", null, this.getPackageName()));
        B7.setTag("B");
        ImageView C7 = findViewById(R.id.C7);
        C7.setImageResource(getResources().getIdentifier("@drawable/blackpawn", null, this.getPackageName()));
        C7.setTag("B");
        ImageView D7 = findViewById(R.id.D7);
        D7.setImageResource(getResources().getIdentifier("@drawable/blackpawn", null, this.getPackageName()));
        D7.setTag("B");
        ImageView E7 = findViewById(R.id.E7);
        E7.setImageResource(getResources().getIdentifier("@drawable/blackpawn", null, this.getPackageName()));
        E7.setTag("B");
        ImageView F7 = findViewById(R.id.F7);
        F7.setImageResource(getResources().getIdentifier("@drawable/blackpawn", null, this.getPackageName()));
        F7.setTag("B");
        ImageView G7 = findViewById(R.id.G7);
        G7.setImageResource(getResources().getIdentifier("@drawable/blackpawn", null, this.getPackageName()));
        G7.setTag("B");
        ImageView H7 = findViewById(R.id.H7);
        H7.setImageResource(getResources().getIdentifier("@drawable/blackpawn", null, this.getPackageName()));
        H7.setTag("B");



        //Pionki Białe
        ImageView A2 = findViewById(R.id.A2);
        A2.setImageResource(getResources().getIdentifier("@drawable/whitepawn", null, this.getPackageName()));
        A2.setTag("W");
        ImageView B2 = findViewById(R.id.B2);
        B2.setImageResource(getResources().getIdentifier("@drawable/whitepawn", null, this.getPackageName()));
        B2.setTag("W");
        ImageView C2 = findViewById(R.id.C2);
        C2.setImageResource(getResources().getIdentifier("@drawable/whitepawn", null, this.getPackageName()));
        C2.setTag("W");
        ImageView D2 = findViewById(R.id.D2);
        D2.setImageResource(getResources().getIdentifier("@drawable/whitepawn", null, this.getPackageName()));
        D2.setTag("W");
        ImageView E2 = findViewById(R.id.E2);
        E2.setImageResource(getResources().getIdentifier("@drawable/whitepawn", null, this.getPackageName()));
        E2.setTag("W");
        ImageView F2 = findViewById(R.id.F2);
        F2.setImageResource(getResources().getIdentifier("@drawable/whitepawn", null, this.getPackageName()));
        F2.setTag("W");
        ImageView G2 = findViewById(R.id.G2);
        G2.setImageResource(getResources().getIdentifier("@drawable/whitepawn", null, this.getPackageName()));
        G2.setTag("W");
        ImageView H2 = findViewById(R.id.H2);
        H2.setImageResource(getResources().getIdentifier("@drawable/whitepawn", null, this.getPackageName()));
        H2.setTag("W");


        //Puste Pola
        ImageView A3 = findViewById(R.id.A3);
        A3.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        A3.setTag("P");
        ImageView B3 = findViewById(R.id.B3);
        B3.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        B3.setTag("P");
        ImageView C3 = findViewById(R.id.C3);
        C3.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        C3.setTag("P");
        ImageView D3 = findViewById(R.id.D3);
        D3.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        D3.setTag("P");
        ImageView E3 = findViewById(R.id.E3);
        E3.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        E3.setTag("P");
        ImageView F3 = findViewById(R.id.F3);
        F3.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        F3.setTag("P");
        ImageView G3 = findViewById(R.id.G3);
        G3.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        G3.setTag("P");
        ImageView H3 = findViewById(R.id.H3);
        H3.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        H3.setTag("P");
        ImageView A4 = findViewById(R.id.A4);
        A4.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        A4.setTag("P");
        ImageView B4 = findViewById(R.id.B4);
        B4.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        B4.setTag("P");
        ImageView C4 = findViewById(R.id.C4);
        C4.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        C4.setTag("P");
        ImageView D4 = findViewById(R.id.D4);
        D4.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        D4.setTag("P");
        ImageView E4 = findViewById(R.id.E4);
        E4.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        E4.setTag("P");
        ImageView F4 = findViewById(R.id.F4);
        F4.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        F4.setTag("P");
        ImageView G4 = findViewById(R.id.G4);
        G4.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        G4.setTag("P");
        ImageView H4 = findViewById(R.id.H4);
        H4.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        H4.setTag("P");
        ImageView A5 = findViewById(R.id.A5);
        A5.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        A5.setTag("P");
        ImageView B5 = findViewById(R.id.B5);
        B5.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        B5.setTag("P");
        ImageView C5 = findViewById(R.id.C5);
        C5.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        C5.setTag("P");
        ImageView D5 = findViewById(R.id.D5);
        D5.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        D5.setTag("P");
        ImageView E5 = findViewById(R.id.E5);
        E5.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        E5.setTag("P");
        ImageView F5 = findViewById(R.id.F5);
        F5.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        F5.setTag("P");
        ImageView G5 = findViewById(R.id.G5);
        G5.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        G5.setTag("P");
        ImageView H5 = findViewById(R.id.H5);
        H5.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        H5.setTag("P");
        ImageView A6 = findViewById(R.id.A6);
        A6.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        A6.setTag("P");
        ImageView B6 = findViewById(R.id.B6);
        B6.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        B6.setTag("P");
        ImageView C6 = findViewById(R.id.C6);
        C6.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        C6.setTag("P");
        ImageView D6 = findViewById(R.id.D6);
        D6.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        D6.setTag("P");
        ImageView E6 = findViewById(R.id.E6);
        E6.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        E6.setTag("P");
        ImageView F6 = findViewById(R.id.F6);
        F6.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        F6.setTag("P");
        ImageView G6 = findViewById(R.id.G6);
        G6.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        G6.setTag("P");
        ImageView H6 = findViewById(R.id.H6);
        H6.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
        H6.setTag("P");



    }

    boolean klik = false;
    String tura = "W";

    ImageView oldone;

    public void Move(View view) {
        ImageView Klikniety = (ImageView) findViewById(view.getId());

        if (tura == "W" && Klikniety.getTag()== tura && !klik) {
            Movement(view);
        }
        else if (tura == "W" && klik  && Klikniety.getTag() != tura)
        {
            Movement(view);
            tura = "B";
        }
        else if (tura == "B" && Klikniety.getTag() == tura && !klik)
        {
            Movement(view);
        }
        else if (tura == "B" && klik && Klikniety.getTag() != tura)
        {
            Movement(view);
            tura = "W";
        }
        else if (Klikniety.getTag() == "P")
        {}
        else if (klik && Klikniety.getTag() == tura)
        {
            Context context = getApplicationContext();
            CharSequence text = "Odłożyłeś figurę";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            klik=!klik;
        }
        else
            {
                Context context = getApplicationContext();
                CharSequence text = "Nie twoja tura";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
    }

    public void GoToMenu(View view) {
        Intent menu = new Intent(this, Menu.class);
        startActivity(menu);
    }
    public void Movement(View view)
    {
        ImageView Klikniety = (ImageView) findViewById(view.getId());
        ImageView przerzut = (ImageView) findViewById(R.id.przerzut);
        ImageView Pusty = (ImageView) findViewById(R.id.pustepole);


        if(!klik) {
            Bitmap Czy1 = ((BitmapDrawable) Pusty.getDrawable()).getBitmap();
            Bitmap Czy2 = ((BitmapDrawable) Klikniety.getDrawable()).getBitmap();

            if(Czy1 != Czy2) {
                przerzut.setImageDrawable(Klikniety.getDrawable());
                przerzut.setTag(Klikniety.getTag());
                oldone = Klikniety;

                klik = !klik;
            }
        }
        else {

            if (Klikniety.getTag() != oldone.getTag()) {
                oldone.setImageResource(getResources().getIdentifier("@drawable/nofigure", null, this.getPackageName()));
                Klikniety.setImageDrawable(przerzut.getDrawable());
                Klikniety.setTag(oldone.getTag());
                oldone.setTag("P");

                klik = !klik;
            } else if (Klikniety.getId() == oldone.getId()) {
                klik = !klik;
            } else {
                Context context = getApplicationContext();
                CharSequence text = "Nie możesz zbić swojej figury !";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show()
                ;
            }
        }
    }
}
