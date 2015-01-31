package com.vv.gradletestpoc;

import android.test.ActivityInstrumentationTestCase2;

import com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers;
import com.vv.gradletestpoc.core.MainActivity;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.typeText;

public class IntegrationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public IntegrationTest() {
        super(MainActivity.class);
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
