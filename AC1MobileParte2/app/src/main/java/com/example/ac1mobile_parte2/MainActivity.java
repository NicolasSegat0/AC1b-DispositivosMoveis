package com.example.ac1mobile_parte2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityWithDetails("Zoológico", "O Parque Zoológico Municipal “Quinzinho de Barros” é um dos principais cartões-postais de Sorocaba, considerado o segundo zoológico do Brasil em número de espécies e um dos mais completos da América Latina.", R.drawable.zoo2, R.drawable.zoo3, "https://meioambiente.sorocaba.sp.gov.br/zoologico/", "+123456789",-23.506759681866672, -47.438098554751534 );
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityWithDetails("Iguatemi Esplanada", "O principal shopping da região de Sorocaba.", R.drawable.iguatemi1, R.drawable.iguatemi3, "https://iguatemi.com.br/esplanada/", "+987654321", -23.533395593802652, -47.463507776399204 );
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityWithDetails("Parque Natural Municipal Chico Mendes", "O Parque Natural dos Esportes \"Chico Mendes\", criado em 22 de dezembro de 1977, é um parque municipal da cidade de Sorocaba. Possui uma grande área verde, 155.649 m² com cobertura vegetal predominante de eucaliptos, um lago e trilhas para atividades educativas. Há também preservação de áreas de mata ciliar.", R.drawable.parque2, R.drawable.parque3, "https://turismo.sorocaba.sp.gov.br/visite/parque-natural-chico-mendes/#gsc.tab=0", "+555555555", -23.473631082983594, -47.41106242352119);
            }
        });
    }

    private void startActivityWithDetails(String title, String description, int imageResource1, int imageResource2, final String websiteUrl, final String phoneNumber, double latitude, double longitude) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("imageResource1", imageResource1);
        intent.putExtra("imageResource2", imageResource2);
        intent.putExtra("websiteUrl", websiteUrl);
        intent.putExtra("phoneNumber", phoneNumber);
        intent.putExtra("latitude", latitude);
        intent.putExtra("longitude", longitude);
        startActivity(intent);
    }
}