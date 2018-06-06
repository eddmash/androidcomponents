package com.eddmash.validation.checks;

import android.widget.TextView;

/**
 * Enables comparing different view values.
 */
public interface ViewComparisonInterface extends CheckInterface {

    void addView(TextView v);

    void removeView(TextView v);
}
