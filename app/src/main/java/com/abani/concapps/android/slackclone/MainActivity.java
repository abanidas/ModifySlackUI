package com.abani.concapps.android.slackclone;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    int commentNoSelected = 0;
    String[] commentStrings = {"Slack is really awesome",
                                "We recently celebrated our fourth anniversary, and more and more people are using Slack across every kind of team in businesses of all sizes.",
                                "Slack brings team communication and collaboration into one place so you can get more work done, whether you belong to a large enterprise or a small business",
                                "Hello Guys, It's really amazing"};
    String[] commentUserNames = {"akshit.udacity",
                                    "lIp.udacity",
                                    "slack.user",
                                    "SlackUser"};

    CircleImageView[] commentUser;
    TextView commentingUser, comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        commentUser = new CircleImageView[4];

        commentUser[0] = (CircleImageView) findViewById(R.id.commentUser1);
        commentUser[1] = (CircleImageView) findViewById(R.id.commentUser2);
        commentUser[2] = (CircleImageView) findViewById(R.id.commentUser3);
        commentUser[3] = (CircleImageView) findViewById(R.id.commentUser4);

        commentingUser = (TextView) findViewById(R.id.commentingUser);
        comment = (TextView) findViewById(R.id.comment);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        
        setupClickListeners();
    }

    private void setupClickListeners() {

        commentUser[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (commentNoSelected != 0) {
                    commentingUser.setText(commentUserNames[0]);
                    comment.setText(commentStrings[0]);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.imageview_diameter_large),
                            getResources().getDimensionPixelSize(R.dimen.imageview_diameter_large));
                    commentUser[0].setLayoutParams(params);
                    params = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.imageview_diameter_small),
                            getResources().getDimensionPixelSize(R.dimen.imageview_diameter_small));
                    commentUser[commentNoSelected].setLayoutParams(params);
                    commentNoSelected = 0;
                }
                
            }
        });

        commentUser[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (commentNoSelected != 1) {
                    commentingUser.setText(commentUserNames[1]);
                    comment.setText(commentStrings[1]);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.imageview_diameter_large),
                            getResources().getDimensionPixelSize(R.dimen.imageview_diameter_large));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                        params.setMarginStart(getResources().getDimensionPixelSize(R.dimen.image_margin));
                    }
                    commentUser[1].setLayoutParams(params);
                    params = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.imageview_diameter_small),
                            getResources().getDimensionPixelSize(R.dimen.imageview_diameter_small));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                        params.setMarginStart(getResources().getDimensionPixelSize(R.dimen.image_margin));
                    }
                    commentUser[commentNoSelected].setLayoutParams(params);
                    commentNoSelected = 1;
                }
            }
        });

        commentUser[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (commentNoSelected != 2) {
                    commentingUser.setText(commentUserNames[2]);
                    comment.setText(commentStrings[2]);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.imageview_diameter_large),
                            getResources().getDimensionPixelSize(R.dimen.imageview_diameter_large));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                        params.setMarginStart(getResources().getDimensionPixelSize(R.dimen.image_margin));
                    }
                    commentUser[2].setLayoutParams(params);
                    params = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.imageview_diameter_small),
                            getResources().getDimensionPixelSize(R.dimen.imageview_diameter_small));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                        params.setMarginStart(getResources().getDimensionPixelSize(R.dimen.image_margin));
                    }
                    commentUser[commentNoSelected].setLayoutParams(params);
                    commentNoSelected = 2;
                }
            }
        });

        commentUser[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (commentNoSelected != 3) {
                    commentingUser.setText(commentUserNames[3]);
                    comment.setText(commentStrings[3]);
                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.imageview_diameter_large),
                            getResources().getDimensionPixelSize(R.dimen.imageview_diameter_large));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                        params.setMarginStart(getResources().getDimensionPixelSize(R.dimen.image_margin));
                    }
                    commentUser[3].setLayoutParams(params);
                    params = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.imageview_diameter_small),
                            getResources().getDimensionPixelSize(R.dimen.imageview_diameter_small));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                        params.setMarginStart(getResources().getDimensionPixelSize(R.dimen.image_margin));
                    }
                    commentUser[commentNoSelected].setLayoutParams(params);
                    commentNoSelected = 3;
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

   
}
