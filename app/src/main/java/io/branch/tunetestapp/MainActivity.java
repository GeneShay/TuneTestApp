package io.branch.tunetestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.tune.Tune;
import com.tune.TuneDeeplinkListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tune.setDebugMode(true);
        Tune.init(this, "199265", "621b735d10c7784e19d4e309409b3d87");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Tune.getInstance().registerDeeplinkListener(new TuneDeeplinkListener() {
            @Override
            public void didReceiveDeeplink(String deeplink) {
                // Handle the deferred deeplink here
                // e.g. open the link
                if (!"".equals(deeplink)) {
                    System.out.println("DEEP LINK DATA: " + deeplink);
                } else{
                    System.out.println("NO DEEP LINK DATA");
                }
            }

            @Override
            public void didFailDeeplink(String error) {
                System.out.println("DEEP LINK ERROR: " + error);
            }
        });
    }
}
