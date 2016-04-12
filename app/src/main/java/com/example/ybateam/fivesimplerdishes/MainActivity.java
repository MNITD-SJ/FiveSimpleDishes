package com.example.ybateam.fivesimplerdishes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ybateam.fivesimplerdishes.fragments.DetailFragment;
import com.example.ybateam.fivesimplerdishes.fragments.MainFragment;
import com.example.ybateam.fivesimplerdishes.model.Item;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AppInterface {

    private int mPosition;
    private ArrayList<Item> mItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillItems();
        setMainFragment();
    }

    private void fillItems() {
        mItems = new ArrayList<>();

        Item item1 = new Item();
        item1.setName("Spaghetti");
        item1.setImageId(R.drawable.image_spaghetti);
        item1.setDescription("1. Spaghetti better to cook in a large wide pan with the addition of large amounts of water - at least 2 liters per 200 grams of pasta. At the same time expect that two servings of spaghetti garnish need 100 grams of dry pasta as spaghetti when cooked increased in weight by 3 times.\n\n" +
                "2. Put a pot of water over high heat and bring the water to a boil.\n\n" +
                "3. Salt water (1 liter of water - 1 teaspoon of salt.)\n\n" +
                "4. Put the spaghetti in boiling water. In a saucepan spaghetti spread fan (or can be broken in half if spaghetti is too long), in a moment of their little prominaetsya to spaghetti immersed in water completely. It is convenient to use a shovel - or take the edge of the dry pasta by hand, to promote the soft part of the deep pan.\n\n" +
                "5. Reduce the heat - it should be moderate, so that the water is actively boiling, but not frothed.\n\n" +
                "6. Cook the spaghetti without cover 8-9 minutes.\n\n" +
                "7. Put the spaghetti in a colander, to drain water 3 minutes (can be a little shake the colander to glass and the liquid has evaporated vapor).\n\n" +
                "8. Post spaghetti hot or to use in dishes with a fork and spoons");

        Item item2 = new Item();
        item2.setName("Eggs");
        item2.setImageId(R.drawable.image_eggs);
        item2.setDescription("1. Eggs should be washed before cooking.\n\n" +
                "2. In a saucepan pour cold water for cooking eggs.\n\n" +
                "3. Put the eggs in a pot of cold water. If you put in a pot of boiling water or hot, they burst. To eggs not exactly cracked during cooking, in cold water before putting the eggs, put a teaspoon of salt or vinegar 9%. When cooking eggs should be completely covered by water.\n\n" +
                "4. Put the pan with eggs on the fire and cook for 7-10 minutes.\n\n" +
                "5. After cooking, pour the boiled eggs in cold water.\n\n" +
                "6. Split on a chopping board with a spoon or egg shells.\n\n" +
                "7. Clear the egg from the shell and serve or use in dishes. Your eggs are cooked!");

        Item item3 = new Item();
        item3.setName("Rise");
        item3.setImageId(R.drawable.image_rise);
        item3.setDescription("1. Before cooking rice rinsed in cold water a couple of minutes, which is best used sieve. In this case, it turns crumbly rice.\n\n" +
                "2. Before you cook the rice in a pot of water, you can pour a little vegetable oil (just a tablespoon).\n\n" +
                "3. Rice put in cold water, not in an enamel bowl.\n\n" +
                "4. Water and salt are added seasonings before being put in her rice.\n\n" +
                "5. The volume of water that is poured into the pan should be 2 times larger than the volume of rice (for example, half a cup of rice - a glass of water).\n\n" +
                "6. In which the water pan and cook the rice? - Rice is better to boil in a small saucepan with cold water; cooking 2 cups of rice is only two-three-liter pots.\n\n" +
                "7. Rise is boiled simmered.\n\n" +
                "8. Rice is cooked in a pan, lid closed.\n\n" +
                "9. Once the water evaporated completely - rice cooked.\n\n" +
                "10. After cooking rice shift in a colander, then stored in a bowl.");

        Item item4 = new Item();
        item4.setName("Potato");
        item4.setImageId(R.drawable.image_potato);
        item4.setDescription("1. It is best to select potatoes of the same size. Or, if the potatoes are still different sizes, you can do so: small potatoes to cook a whole, and larger potatoes cut into several pieces. For faster cooking (15 min) of cleaning potatoes can be cut into 2-3 parts.\n\n" +
                "2. Wash the potatoes thoroughly and cleaned from the skin.\n\n" +
                "3. put the potatoes in cold salted water (half a kilo of potatoes, covered with water up to the top -one teaspoon) to avoid of cooking. Potatoes after boiling water cook on a quiet fire.\n\n" +
                "4. Water in the pan should be enough to cover the potatoes completely.\n\n" +
                "5. Potatoes during cooking cover, so that the water is not evaporated.\n\n" +
                "6. If there is a need to check the readiness of the potatoes, the potatoes can be pierced with a fork. If the potatoes are easily pierced with a fork completely - then the potatoes ready.\n\n" +
                "7. When cooking potatoes virtually unchanged in weight.");

        Item item5 = new Item();
        item5.setName("Meat dumplings");
        item5.setImageId(R.drawable.image_mock);
        item5.setDescription("1. Pour water into the pan (1 serving 15-20 dumplings - half a liter of water), put the pan over high heat.\n\n" +
                "2. Add water, black pepper and salt. If the dumplings will be served with the broth, the pepper powder can be used to not have to hunt down in the murky pea soup.\n\n" +
                "3. Wait until the water boils.\n\n" +
                "4. Put frozen dumplings in the pan\n\n" +
                "5. Once the water boils again, reduce the heat and stir the dumplings, so they do not stick to each other and do not stick to the bottom and walls of the pan.\n\n" +
                "6. Cook the dumplings for 10 minutes, to catch the dumplings out of the water with a slotted spoon or tablespoon.\n\n" +
                "7. Serve the dumplings with sour cream and dumplings broth, to taste, sprinkle with herbs.");

        mItems.add(item1);
        mItems.add(item2);
        mItems.add(item3);
        mItems.add(item4);
        mItems.add(item5);
    }

    @Override
    public void setMainFragment() {
        FragmentTransaction fT = getSupportFragmentManager().beginTransaction();
        fT.replace(R.id.main_container, new MainFragment());
        fT.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fT.commit();
    }

    @Override
    public void setDetailsFragment() {
        FragmentTransaction fT = getSupportFragmentManager().beginTransaction();
        fT.replace(R.id.main_container, new DetailFragment());
        fT.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fT.addToBackStack(null);
        fT.commit();
    }

    @Override
    public ArrayList<Item> getItems() {

        return mItems;
    }

    @Override
    public void setCurrentPosition(int position) {
        mPosition = position;
    }

    @Override
    public int getCurrentPosition() {
        return mPosition;
    }

    @Override
    public void onBackPressed() {
        Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.main_container);

        if(currentFragment instanceof DetailFragment) {
            getSupportFragmentManager().popBackStack();
        }
        else {
            super.onBackPressed();
        }

    }

}
