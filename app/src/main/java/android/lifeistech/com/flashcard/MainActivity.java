package android.lifeistech.com.flashcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (LinearLayout)findViewById(R.id.container);

        CustomWord android = new CustomWord(R.drawable.android, "あんどろいど", "N");
        CustomWord apple = new CustomWord(R.drawable.apple, "あっぷる", "iPhone");
        CustomWord google = new CustomWord(R.drawable.google, "ぐーぐる", "Nexus");
        CustomWord microsoft = new CustomWord(R.drawable.microsoft, "まいくろそふと", "surface");
        addWord(android);
        addWord(apple);
        addWord(google);
        addWord(microsoft);

    }

    public void addWord(CustomWord word) {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        TextView nameTextView = new TextView(this);
        nameTextView.setText(word.name + ":");

        TextView productTextView = new TextView(this);
        productTextView.setText(word.product);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(word.resId);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);


        layout.addView(imageView, createParam(200,200));
        layout.addView(nameTextView);
        layout.addView(productTextView);

        container.addView(layout);
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

}