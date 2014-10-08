package com.quandoo.gradletestpoc.tests;

import android.view.View;

import com.quandoo.gradletestpoc.MyActivity;
import com.quandoo.gradletestpoc.R;
import com.quandoo.gradletestpoc.RobolectricGradleTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricGradleTestRunner.class)
public class MyAndroidClassTest {

    @Test
    public void testWhenActivityCreatedHelloTextViewIsVisible() throws Exception {
        MyActivity activity = new MyActivity();

        ActivityController.of(activity).attach().create();

        int visibility = activity.findViewById(R.id.button).getVisibility();
        assertEquals(visibility, View.VISIBLE);
    }
}
