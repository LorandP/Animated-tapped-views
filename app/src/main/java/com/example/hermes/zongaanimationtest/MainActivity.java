package com.example.hermes.zongaanimationtest;

import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;

public class MainActivity extends AppCompatActivity {
    private Window window;
    private boolean buttonClicked = false;
    // We declare this button1 as a field because we will use it in two different methods
    // first as a listener as second, we change it's colour after it's been clicked.
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        window = this.getWindow();
        // clear the flags for translucent status
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        // add flag to set a background to the status bar
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);


        Button button2 = (Button)findViewById(R.id.testButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapTargetForButton2();
                buttonClicked = true;
                window.setStatusBarColor(ContextCompat.getColor(v.getContext(), R.color.red));
            }
        });
        button2.setBackground(getResources().getDrawable(R.drawable.blueheart));

        button1 = (Button)findViewById(R.id.testButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapTargetForButton1();
                buttonClicked = true;
                window.setStatusBarColor(ContextCompat.getColor(v.getContext(), R.color.red));
            }


        });
        button1.setBackground(getResources().getDrawable(R.drawable.blueheart));

        Button button3 = (Button)findViewById(R.id.testButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapTargetForButton3();
                buttonClicked = true;
                window.setStatusBarColor(ContextCompat.getColor(v.getContext(), R.color.red));
            }
        });
        button3.setBackground(getResources().getDrawable(R.drawable.blueheart));

        Button button4 = (Button)findViewById(R.id.testButton4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapTargetForButton4();
                buttonClicked = true;
                window.setStatusBarColor(ContextCompat.getColor(v.getContext(), R.color.red));
            }
        });
        button4.setBackground(getResources().getDrawable(R.drawable.blueheart));

        Button button5 = (Button)findViewById(R.id.testButton5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapTargetForButton5();
                buttonClicked = true;
                window.setStatusBarColor(ContextCompat.getColor(v.getContext(), R.color.red));
            }
        });
        button5.setBackground(getResources().getDrawable(R.drawable.blueheart));

        Button button6 = (Button)findViewById(R.id.testButton6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapTargetForButton6();
                buttonClicked = true;
                window.setStatusBarColor(ContextCompat.getColor(v.getContext(), R.color.red));
            }
        });
        button6.setBackground(getResources().getDrawable(R.drawable.blueheart));
    }

    /**
     * These methods are used to implement the animation.
     * An implementation is also added to change the colour of the action bar when the
     * animation starts.
     */
    private void tapTargetForButton1(){
        // Here we also change the colour of the button1 right when we click it.
        button1.setBackground(getResources().getDrawable(R.drawable.readheart));
        TapTargetView.showFor(this, TapTarget.forView(findViewById(R.id.testButton),"Test","Test2")
                        //All options below are optional
                        .outerCircleColor(R.color.red)
                        .outerCircleAlpha(0.96f)
                        .targetCircleColor(R.color.white)
                        .titleTextSize(20)
                        .titleTextColor(R.color.white)
                        .descriptionTextSize(10)
                        .textColor(R.color.white)
                        .descriptionTextColor(R.color.white)
                        .textTypeface(Typeface.SANS_SERIF)
                        .dimColor(R.color.black)
                        .drawShadow(true)
                        .cancelable(false)
                        .tintTarget(true)
                        .transparentTarget(true)
                       // .icon(getResources().getDrawable(R.drawable.heart))
                        .targetRadius(60),
                new TapTargetView.Listener(){
                    @Override
                    public void onTargetClick(TapTargetView view) {
                        super.onTargetClick(view);
                        if (buttonClicked){
                            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                            window.setStatusBarColor(ContextCompat.getColor(view.getContext(), R.color.colorPrimary));
                            buttonClicked = false;
                        }
                        button1.setBackground(getResources().getDrawable(R.drawable.blueheart));
                    }

                });

    }
    private void tapTargetForButton2(){
        TapTargetView.showFor(this, TapTarget.forView(findViewById(R.id.testButton2),"Test","Test2")
                //All options below are optional
                .outerCircleColor(R.color.red)
                .outerCircleAlpha(0.96f)
                .targetCircleColor(R.color.white)
                .titleTextSize(20)
                .titleTextColor(R.color.white)
                .descriptionTextSize(10)
                .textColor(R.color.white)
                .descriptionTextColor(R.color.white)
                .textTypeface(Typeface.SANS_SERIF)
                .dimColor(R.color.black)
                .drawShadow(true)
                .cancelable(false)
                .tintTarget(true)
                .transparentTarget(true)
                // .icon(getResources().getDrawable(R.drawable.heart))
                .targetRadius(60),
                new TapTargetView.Listener(){
                    @Override
                    public void onTargetClick(TapTargetView view) {
                        super.onTargetClick(view);
                        if (buttonClicked){
                            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                            window.setStatusBarColor(ContextCompat.getColor(view.getContext(), R.color.colorPrimary));
                            buttonClicked = false;
                        }
                    }
                });
    }
    private void tapTargetForButton3(){
        TapTargetView.showFor(this, TapTarget.forView(findViewById(R.id.testButton3),"Test","Test2")
            //All options below are optional
            .outerCircleColor(R.color.red)
            .outerCircleAlpha(0.96f)
            .targetCircleColor(R.color.white)
            .titleTextSize(20)
            .titleTextColor(R.color.white)
            .descriptionTextSize(10)
            .textColor(R.color.white)
            .descriptionTextColor(R.color.white)
            .textTypeface(Typeface.SANS_SERIF)
            .dimColor(R.color.black)
            .drawShadow(true)
            .cancelable(false)
            .tintTarget(true)
            .transparentTarget(true)
            // .icon(getResources().getDrawable(R.drawable.heart))
            .targetRadius(60),
                new TapTargetView.Listener(){
                    @Override
                    public void onTargetClick(TapTargetView view) {
                        super.onTargetClick(view);
                        if (buttonClicked){
                            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                            window.setStatusBarColor(ContextCompat.getColor(view.getContext(), R.color.colorPrimary));
                            buttonClicked = false;
                        }
                    }
                });}
    private void tapTargetForButton4(){
        TapTargetView.showFor(this, TapTarget.forView(findViewById(R.id.testButton4),"Test","Test2")
                //All options below are optional
                .outerCircleColor(R.color.red)
                .outerCircleAlpha(0.96f)
                .targetCircleColor(R.color.white)
                .titleTextSize(20)
                .titleTextColor(R.color.white)
                .descriptionTextSize(10)
                .textColor(R.color.white)
                .descriptionTextColor(R.color.white)
                .textTypeface(Typeface.SANS_SERIF)
                .dimColor(R.color.black)
                .drawShadow(true)
                .cancelable(false)
                .tintTarget(true)
                .transparentTarget(true)
                // .icon(getResources().getDrawable(R.drawable.heart))
                .targetRadius(60),
                new TapTargetView.Listener(){
                    @Override
                    public void onTargetClick(TapTargetView view) {
                        super.onTargetClick(view);
                        if (buttonClicked){
                            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                            window.setStatusBarColor(ContextCompat.getColor(view.getContext(), R.color.colorPrimary));
                            buttonClicked = false;
                        }
                    }
                });
    }
    private void tapTargetForButton5(){

        TapTargetView.showFor(this, TapTarget.forView(findViewById(R.id.testButton5),"Test","Test2")
                //All options below are optional
                .outerCircleColor(R.color.red)
                .outerCircleAlpha(0.96f)
                .targetCircleColor(R.color.white)
                .titleTextSize(20)
                .titleTextColor(R.color.white)
                .descriptionTextSize(10)
                .textColor(R.color.white)
                .descriptionTextColor(R.color.white)
                .textTypeface(Typeface.SANS_SERIF)
                .dimColor(R.color.black)
                .drawShadow(true)
                .cancelable(false)
                .tintTarget(true)
                .transparentTarget(true)
                // .icon(getResources().getDrawable(R.drawable.heart))
                .targetRadius(60),
                new TapTargetView.Listener(){
                    @Override
                    public void onTargetClick(TapTargetView view) {
                        super.onTargetClick(view);

                        if (buttonClicked){
                            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                            window.setStatusBarColor(ContextCompat.getColor(view.getContext(), R.color.colorPrimary));
                            buttonClicked = false;
                        }
                    }
                });
    }
    private void tapTargetForButton6(){
        TapTargetView.showFor(this, TapTarget.forView(findViewById(R.id.testButton6),"Test","Test2")
                //All options below are optional
                .outerCircleColor(R.color.red)
                .outerCircleAlpha(0.96f)
                .targetCircleColor(R.color.white)
                .titleTextSize(20)
                .titleTextColor(R.color.white)
                .descriptionTextSize(10)
                .textColor(R.color.white)
                .descriptionTextColor(R.color.white)
                .textTypeface(Typeface.SANS_SERIF)
                .dimColor(R.color.black)
                .drawShadow(true)
                .cancelable(false)
                .tintTarget(true)
                .transparentTarget(true)
                // .icon(getResources().getDrawable(R.drawable.heart))
                .targetRadius(60),
                new TapTargetView.Listener(){
                    @Override
                    public void onTargetClick(TapTargetView view) {
                        super.onTargetClick(view);

                        if (buttonClicked){
                            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                            window.setStatusBarColor(ContextCompat.getColor(view.getContext(), R.color.colorPrimary));
                            buttonClicked = false;
                        }
                    }
                });
    }

}
