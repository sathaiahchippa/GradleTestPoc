package com.vv.gradletestpoc.tests;

import android.app.Activity;
import android.view.View;

import com.vv.gradletestpoc.RobolectricGradleTestRunner;
import com.vv.gradletestpoc.core.MainActivity;
import com.vv.gradletestpoc.core.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricGradleTestRunner.class)
public class MyAndroidClassTest {

    @Test
    public void testWhenActivityCreatedButtonViewIsVisible() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);

        int visibility = activity.findViewById(R.id.button).getVisibility();
        assertEquals(visibility, View.VISIBLE);
    }
}
