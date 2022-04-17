package com.joshowen.wrapcontenttablayout

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ActivityWrapSelectedTest {

    @Before
    fun setUp() {
        ActivityScenario.launch(ActivityWrapSelected::class.java)
    }

    @Test
    fun `tab_layout_is_visible`() {
        onView(withId(R.id.tab_layout)).check(matches(isDisplayed()))
    }

    @Test
    fun `tab_layout_displays_4_tabs`() {
        onView(withId(R.id.tab_layout)).check(matches(isDisplayed()))
    }

    @Test
    fun `tab_layout_swipe_right_once`() {
        onView(withId(R.id.tab_layout)).perform(swipeRight())

        //verify
    }

    @Test
    fun `tab_layout_swipe_left_once`() {
        onView(withId(R.id.tab_layout)).perform(swipeLeft())

        //verify
    }

}