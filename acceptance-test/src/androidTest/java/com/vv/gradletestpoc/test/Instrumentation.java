package com.vv.gradletestpoc.test;

import android.os.Bundle;

import com.google.android.apps.common.testing.testrunner.GoogleInstrumentation;
import com.vv.gradletestpoc.*;

import cucumber.api.android.CucumberInstrumentationCore;

public class Instrumentation extends GoogleInstrumentation {

    private static final String TAGS_KEY = "tags";

    private final CucumberInstrumentationCore instrumentationCore = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);

        // Reading runner params
        String tags = com.vv.gradletestpoc.BuildConfig.TAGS;
        if (!tags.isEmpty()) {
            bundle.putString(TAGS_KEY, tags);
        }

        instrumentationCore.create(bundle);
        start();
    }

    @Override
    public void onStart() {
        waitForIdleSync();
        instrumentationCore.start();
    }
}