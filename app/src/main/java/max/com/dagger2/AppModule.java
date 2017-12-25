package max.com.dagger2;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Maxim on 12/24/2017.
 */

@Module
public class AppModule {

    Bird bird;

    @Provides
    public Bird bird() {
        return new Bird();
    }

    @Provides
    public Dog dog() {
        return new Dog();
    }

}
