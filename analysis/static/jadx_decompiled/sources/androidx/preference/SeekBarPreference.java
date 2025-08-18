package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.rsb;
import defpackage.t2c;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public final int s0;
    public final int t0;

    /* JADX WARN: Illegal instructions before constructor call */
    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        int i = rsb.seekBarPreferenceStyle;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.SeekBarPreference, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(t2c.SeekBarPreference_min, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(t2c.SeekBarPreference_android_max, 100);
        i3 = i3 < i2 ? i2 : i3;
        if (i3 != this.s0) {
            this.s0 = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(t2c.SeekBarPreference_seekBarIncrement, 0);
        if (i4 != this.t0) {
            this.t0 = Math.min(this.s0 - i2, Math.abs(i4));
        }
        typedArrayObtainStyledAttributes.getBoolean(t2c.SeekBarPreference_adjustable, true);
        typedArrayObtainStyledAttributes.getBoolean(t2c.SeekBarPreference_showSeekBarValue, false);
        typedArrayObtainStyledAttributes.getBoolean(t2c.SeekBarPreference_updatesContinuously, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }
}
