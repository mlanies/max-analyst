package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.ote;
import defpackage.rsb;
import defpackage.t2c;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        int i = rsb.switchPreferenceCompatStyle;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.SwitchPreferenceCompat, i, 0);
        ote.x(typedArrayObtainStyledAttributes, t2c.SwitchPreferenceCompat_summaryOn, t2c.SwitchPreferenceCompat_android_summaryOn);
        int i2 = t2c.SwitchPreferenceCompat_summaryOff;
        int i3 = t2c.SwitchPreferenceCompat_android_summaryOff;
        if (typedArrayObtainStyledAttributes.getString(i2) == null) {
            typedArrayObtainStyledAttributes.getString(i3);
        }
        int i4 = t2c.SwitchPreferenceCompat_switchTextOn;
        int i5 = t2c.SwitchPreferenceCompat_android_switchTextOn;
        if (typedArrayObtainStyledAttributes.getString(i4) == null) {
            typedArrayObtainStyledAttributes.getString(i5);
        }
        int i6 = t2c.SwitchPreferenceCompat_switchTextOff;
        int i7 = t2c.SwitchPreferenceCompat_android_switchTextOff;
        if (typedArrayObtainStyledAttributes.getString(i6) == null) {
            typedArrayObtainStyledAttributes.getString(i7);
        }
        typedArrayObtainStyledAttributes.getBoolean(t2c.SwitchPreferenceCompat_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(t2c.SwitchPreferenceCompat_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
