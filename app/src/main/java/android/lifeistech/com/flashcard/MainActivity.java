package android.lifeistech.com.flashcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        Word android = new Word(R.drawable.android, "あんどろいど");
        Word apple = new Word(R.drawable.apple, "あっぷる");
        Word google = new Word(R.drawable.google, "ぐーぐる");
        Word microsoft = new Word(R.drawable.microsoft, "まいくろそふと");

        addWord(android);
        addWord(apple);
        addWord(google);
        addWord(microsoft);

    }

    public void addWord(Word word) {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);

        TextView nameTextView = new TextView(this);
        nameTextView.setText(word.name);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(word.resId);

        layout.addView(imageView);
        layout.addView(nameTextView);

        container.addView(layout);
    }
}