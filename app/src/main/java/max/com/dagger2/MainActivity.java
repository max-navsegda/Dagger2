package max.com.dagger2;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.android.DaggerActivity;

public class MainActivity extends Activity {
    @Inject
    Bird bird;

    @Inject
    Dog dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App)this.getApplicationContext()).getComponent().inject(this);
        Toast.makeText(this,bird.toString(), Toast.LENGTH_LONG).show();
        Toast.makeText(this,dog.toString(), Toast.LENGTH_LONG).show();
    }

}
