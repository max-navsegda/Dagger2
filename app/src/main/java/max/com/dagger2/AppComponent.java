package max.com.dagger2;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;

/**
 * Created by Maxim on 12/24/2017.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MainActivity mainActivity);
}


