package tests;

        import android.test.ActivityInstrumentationTestCase2;
        import android.widget.TextView;

        import com.example.k6lu.testadd2.MainActivity;
        import com.example.k6lu.testadd2.R;

/**
 * Created by k6lu on 4/13/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_sum()
    {
        double testval;
        //mainActivity.findViewById(R.id.add).performClick();
        //mainActivity.findViewById(R.id.num1);
        mainActivity = getActivity();
        testval = mainActivity.sum(4,5);
        //TextView textView = (TextView) mainActivity.findViewById(R.id.txtResult);
        //String tester = textView.getText().toString();

        assertEquals(9.0, testval);
    }
}