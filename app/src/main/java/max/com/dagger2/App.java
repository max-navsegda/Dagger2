package max.com.dagger2;

import android.app.Application;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by Maxim on 12/25/2017.
 */

public class App extends Application {

    AppComponent component;

    public AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();
    }
}
