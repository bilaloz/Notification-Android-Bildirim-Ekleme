package com.notification;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int color = getResources().getColor(R.color.colorPrimary);
        final Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.android);
        findViewById(R.id.btnNtf).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
                builder
                    .setSmallIcon(android.R.drawable.ic_menu_add)
                    .setContentTitle("baslik")
                        .setContentText("içerik")
                        .setLargeIcon(bitmap)
                .setColor(color);
                Notification notification = builder.build();
                NotificationManagerCompat.from(getApplicationContext()).notify(0,notification);
            }
        });
    }
}
