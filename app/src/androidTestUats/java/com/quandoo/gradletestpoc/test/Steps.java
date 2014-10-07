package com.quandoo.gradletestpoc.test;

import com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers;
import com.quandoo.gradletestpoc.R;

import cucumber.api.java.en.Then;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;

/**
 * Created by vitali on 06/10/14.
 */
public class Steps {
    @Then("^I click on button$")
    public static void I_click_on_button() {
        onView(ViewMatchers.withId(R.id.button)).perform(click());
    }
}
