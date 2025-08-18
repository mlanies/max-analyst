package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.ote;
import defpackage.rsb;
import defpackage.t2c;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iM = ote.m(rsb.switchPreferenceStyle, R.attr.switchPreferenceStyle, context);
        super(context, attributeSet, iM);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.SwitchPreference, iM, 0);
        ote.x(typedArrayObtainStyledAttributes, t2c.SwitchPreference_summaryOn, t2c.SwitchPreference_android_summaryOn);
        int i = t2c.SwitchPreference_summaryOff;
        int i2 = t2c.SwitchPreference_android_summaryOff;
        if (typedArrayObtainStyledAttributes.getString(i) == null) {
            typedArrayObtainStyledAttributes.getString(i2);
        }
        int i3 = t2c.SwitchPreference_switchTextOn;
        int i4 = t2c.SwitchPreference_android_switchTextOn;
        if (typedArrayObtainStyledAttributes.getString(i3) == null) {
            typedArrayObtainStyledAttributes.getString(i4);
        }
        int i5 = t2c.SwitchPreference_switchTextOff;
        int i6 = t2c.SwitchPreference_android_switchTextOff;
        if (typedArrayObtainStyledAttributes.getString(i5) == null) {
            typedArrayObtainStyledAttributes.getString(i6);
        }
        typedArrayObtainStyledAttributes.getBoolean(t2c.SwitchPreference_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(t2c.SwitchPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
