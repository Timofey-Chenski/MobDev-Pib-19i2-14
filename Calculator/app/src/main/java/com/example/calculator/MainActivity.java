package com.example.calculator;

        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.calculator.MESSAGE";

    char[] mathArray;

    public String mathCalc(char[] mathArray)
    {
        String answer = null;
        double x,y,z;
        x = (double) (mathArray[0] - '0');
        y = (double) (mathArray[2] - '0');
        switch (mathArray[1])
        {
            case '+':
                z = x + y;
                answer = ""+z;
                break;
            case '-':
                z = x - y;
                answer = ""+z;
                break;
            case '*':
                z = x * y;
                answer = ""+z;
                break;
            case '/':
                z = x / y;
                answer = ""+z;
                break;
        }



        return answer;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void sendMessage(View view)
        {
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
            String conversion = editText.getText().toString();

            mathArray = conversion.toCharArray();

            String message = mathCalc(mathArray);

            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

}






