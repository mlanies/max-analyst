package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.ote;
import defpackage.rsb;
import defpackage.t2c;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iM = ote.m(rsb.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle, context);
        super(context, attributeSet, iM);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.CheckBoxPreference, iM, 0);
        ote.x(typedArrayObtainStyledAttributes, t2c.CheckBoxPreference_summaryOn, t2c.CheckBoxPreference_android_summaryOn);
        int i = t2c.CheckBoxPreference_summaryOff;
        int i2 = t2c.CheckBoxPreference_android_summaryOff;
        if (typedArrayObtainStyledAttributes.getString(i) == null) {
            typedArrayObtainStyledAttributes.getString(i2);
        }
        typedArrayObtainStyledAttributes.getBoolean(t2c.CheckBoxPreference_disableDependentsState, typedArrayObtainStyledAttributes.getBoolean(t2c.CheckBoxPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
