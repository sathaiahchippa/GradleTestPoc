package com.quandoo.gradletestpoc.test;

import android.test.ActivityInstrumentationTestCase2;
import com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers;
import com.quandoo.gradletestpoc.MyActivity;
import com.quandoo.gradletestpoc.R;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.typeText;

/**
 * Created by vitali on 06/10/14.
 */
public class MyActivityTest extends ActivityInstrumentationTestCase2<MyActivity> {

    public MyActivityTest() {
        super(MyActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testClick() {
        onView(ViewMatchers.withId(R.id.edit)).perform(typeText("Lorem ipsum"));
    }
}
