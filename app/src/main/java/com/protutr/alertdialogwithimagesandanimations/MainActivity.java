package com.protutr.alertdialogwithimagesandanimations;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button showbtn,normal_dialog,lefttoright,uptobottom,fadeinout,playstore;
    AlertDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showbtn=(Button)findViewById(R.id.show_btn);
        lefttoright=(Button)findViewById(R.id.lefttoright);
        uptobottom=(Button)findViewById(R.id.uptobottom);
        fadeinout=(Button)findViewById(R.id.fadeinout);
        normal_dialog=(Button)findViewById(R.id.normal_dialog);
        playstore=(Button)findViewById(R.id.playstore);

        playstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=com.protutr.protutr"));
                startActivity(intent);
            }
        });

        normal_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowNormalDialog();
            }
        });


        showbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowAlertBoxWithImages();
            }
        });

        lefttoright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                leftToRightAnimation();
            }
        });

        uptobottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upToBottom();
            }
        });
        fadeinout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fadeInOut();
            }
        });
    }

    private void fadeInOut() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("This is Title")
                .setMessage("This is the description of dialog")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You clicked on OK", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You clicked on Cancel", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });

        dialog=builder.create();
        dialog.getWindow().getAttributes().windowAnimations=R.style.fadeInOut;
        dialog.show();
    }

    private void upToBottom() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("This is Title")
                .setMessage("This is the description of dialog")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You clicked on OK", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You clicked on Cancel", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });

        dialog=builder.create();
        dialog.getWindow().getAttributes().windowAnimations = R.style.upToBottom; //style id

        dialog.show();
    }

    private void leftToRightAnimation() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("This is Title")
                .setMessage("This is the description of dialog")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You clicked on OK", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You clicked on Cancel", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });

        dialog=builder.create();
        dialog.getWindow().getAttributes().windowAnimations = R.style.leftToRight; //style id

        dialog.show();
    }

    private void ShowNormalDialog() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("This is Title")
                .setMessage("This is the description of dialog")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You clicked on OK", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You clicked on Cancel", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });

        dialog=builder.create();

        dialog.show();


    }

    private void ShowAlertBoxWithImages() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.custom_dialog, null);
        builder.setView(dialogView).create();
        final AlertDialog alert = builder.show();
        Button cancel = (Button) dialogView.findViewById(R.id.btn_cancel);
        Button ok = (Button) dialogView.findViewById(R.id.btn_ok);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.dismiss();
                Toast.makeText(MainActivity.this, "You clicked on Cancel", Toast.LENGTH_SHORT).show();

            }
        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.dismiss();
                Toast.makeText(MainActivity.this, "You clicked on ok", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
