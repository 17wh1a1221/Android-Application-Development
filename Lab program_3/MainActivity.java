public class MainActivity extends AppCompatActivity{
    private ListView mListView;
    private ArrayAdapter aAdapter;
    private String[] users = { "abc", "def", "ghi", "jkl", "mno"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.userlist);
        aAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        mListView.setAdapter(aAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //String num = ((TextView)view).getText().toString();
                //Toast.makeText(getApplicationContext(),num,Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(MainActivity.this,Main2Activity.class);
                i1.putExtra("number",(String)mListView.getAdapter().getItem(i));
                startActivity(i1);
            }                //
        });
    }
}