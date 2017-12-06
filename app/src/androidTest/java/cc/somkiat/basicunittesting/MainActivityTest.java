package cc.somkiat.basicunittesting;


import android.os.SystemClock;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void saveValidInput() {
        onView(withId(R.id.userNameInput)).perform(replaceText("Jaab"));
        onView(withId(R.id.emailInput)).perform(replaceText("jaab@gmail.com"));
        onView(withId(R.id.saveButton)).perform(click());
        onView(withText("Saved"))
                .inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView()))))
                .check(matches(isDisplayed()));
        SystemClock.sleep(2000);
    }

    @Test
    public void saveInvalidInput() {
        onView(withId(R.id.userNameInput)).perform(replaceText("J@@b"));
        onView(withId(R.id.emailInput)).perform(replaceText("jaab$@gmail.c"));
        onView(withId(R.id.saveButton)).perform(click());
        onView(withText("Name format is incorrect"))
                .inRoot(withDecorView(not(is(mActivityTestRule.getActivity().getWindow().getDecorView()))))
                .check(matches(isDisplayed()));
        SystemClock.sleep(2000);
    }

    @Test
    public void revert() {
        onView(withId(R.id.revertButton)).perform(click());
        onView(withId(R.id.userNameInput)).check(matches(withText("")));
        onView(withId(R.id.emailInput)).check(matches(withText("")));
    }

}
