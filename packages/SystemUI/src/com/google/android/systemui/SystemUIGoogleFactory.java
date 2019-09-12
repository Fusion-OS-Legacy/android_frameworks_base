package com.google.android.systemui;

import android.content.Context;

import com.android.systemui.power.EnhancedEstimates;
import com.android.systemui.SystemUIFactory;

import com.google.android.systemui.power.EnhancedEstimatesGoogleImpl;

public class SystemUIGoogleFactory extends SystemUIFactory {
    @Override
    public EnhancedEstimates provideEnhancedEstimates(Context context) {
        return new EnhancedEstimatesGoogleImpl(context);
    }
}
