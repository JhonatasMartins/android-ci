package br.com.jhonatasmartins;


import android.test.ActivityInstrumentationTestCase2;

import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.*;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.*;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.*;

public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity>{

    public ApplicationTest(){
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

         /* call get activity to start it */
        getActivity();
    }

    public void testButtonText(){
        /* when click on Hello text */
        /* result should be failed because text not exist */
        onView(withText("Hello")).perform(click());
    }

    public void testButtonToNextActivity(){
        /* when click on button */
        /* result should be second activity */
        onView(withId(R.id.btn_go_second)).perform(click());
    }
}