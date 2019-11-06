package jon.com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

        thirdImage.setImageDrawable(loadImageFromURL("http://cdn.inside.com.tw/wp-content/uploads/2012/05/Chrome.jpg"));
    }
    private ImageView thirdImage;

    private void findViews() {
        thirdImage = (ImageView) findViewById(R.id.imageView);
    }

    private Drawable loadImageFromURL(String url){
        try{
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable draw = Drawable.createFromStream(is, "src");
            return draw;
        }catch (Exception e) {
            //TODO handle error
            Log.i("loadingImg", e.toString());
            return null;
        }
    }
}
