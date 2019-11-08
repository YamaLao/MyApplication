package jon.com.myapplication;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;





public class MainActivity extends AppCompatActivity {
//private ImageView IV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageView imageView = (ImageView) findViewById(R.id.imageView);
//        imageView.setImageResource(R.drawable.下載);

        //Glide.with(this).load(R.drawable.member_0004).into(imageView);
//IV=(ImageView)findViewById(R.id.imageView) ;
       // findViews();
//IV.setImageResource(R.drawable.ppp);
    //   IV.setImageResource(R.drawable.下載);able
        val animator = ApngAnimator(context).loadInto(imageView)
        animator.load("https://apng.onevcat.com/assets/elephant.gif")
        // Load a apng to imageView
        // ImageView scaleType support CENTER_INSIDE/CENTER_CROP/FIT_XY, and default FIT_XY



    //private ImageView secondImage;

//    private void findViews() {
//        IV = (ImageView) findViewById(R.id.imageView);
//    }
}
