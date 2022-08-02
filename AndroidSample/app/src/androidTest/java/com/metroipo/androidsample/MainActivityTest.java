package com.metroipo.androidsample;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.widget.TextView;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Test
    public void shouldDisplyWelcome(){
        ActivityScenario scenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.welcomeTextView));
    }
    @Test
    public void shouldHaveWelcomeText(){
        ActivityScenario scenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.welcomeTextView)).check(matches(withText(R.string.welcome_message)));
    }
    @Test
    public void shouldHaveInputField(){
        ActivityScenario scenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.codeField));
    }
    @Test
    public void shouldHaveVerificationCodeButton(){
        ActivityScenario scenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.enter_button));
    }
    @Test
    public void shouldHaveVerificationCodeButtonText(){
        ActivityScenario scenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.enter_button)).check(matches(withText((R.string.enter_button))));
    }
    @Test
    public void clickVerificationButton(){
        ActivityScenario scenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.enter_button)).perform(click());
    }

}
