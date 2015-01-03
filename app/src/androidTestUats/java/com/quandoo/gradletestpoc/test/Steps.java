package com.quandoo.gradletestpoc.test;

import com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers;
import com.quandoo.gradletestpoc.R;

import cucumber.api.java.en.Then;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.typeText;

/**
 * Created by vitali on 06/10/14.
 */
public class Steps {
    @Then("^I click on button$")
    public static void I_click_on_button() {
        onView(ViewMatchers.withId(R.id.button)).perform(click());
    }

    @Then("^I enter some text")
    public static void I_enter_some_text() {
        onView(ViewMatchers.withId(R.id.edit)).perform(typeText("some text"));
    }
}
