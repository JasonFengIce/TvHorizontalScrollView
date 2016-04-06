package cn.ismartv.tvhorizontalscrollviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import cn.ismartv.tvhorizontalscrollview.TvHorizontalScrollView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout mTvHorizontalScrollView;
    private TvHorizontalScrollView mScrollView;
    private Button left;
    private Button right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvHorizontalScrollView = (LinearLayout) findViewById(R.id.horizontal_scrollview);
        mScrollView = (TvHorizontalScrollView) findViewById(R.id.list);
        left = (Button) findViewById(R.id.left);
        right = (Button) findViewById(R.id.right);
        mScrollView.setLeftArrow(left);
        mScrollView.setRightArrow(right);

        for (int i = 0; i < 20; i++) {
            TextView textView = new TextView(this);
            textView.setText("hello world " + i + "| ");
            textView.setFocusable(true);
            textView.setBackgroundResource(R.drawable.selector_item);
            textView.setTextSize(40);
            mTvHorizontalScrollView.addView(textView);
        }
    }

    public void left(View view) {
        mScrollView.pageScroll(View.FOCUS_LEFT);
    }


    public void right(View view) {
        mScrollView.pageScroll(View.FOCUS_RIGHT);
    }

}
