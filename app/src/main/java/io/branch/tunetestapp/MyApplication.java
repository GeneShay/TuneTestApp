package io.branch.tunetestapp;

import com.tune.ITune;
import com.tune.Tune;
import com.tune.application.TuneApplication;

public class MyApplication extends TuneApplication {


    @Override
    public void onCreate() {
        super.onCreate();

        Tune.init(this, "199265", "621b735d10c7784e19d4e309409b3d87");

    }
}
