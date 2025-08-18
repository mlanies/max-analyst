package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.ote;
import defpackage.rsb;
import defpackage.t2c;
import defpackage.vu4;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iM = ote.m(rsb.editTextPreferenceStyle, R.attr.editTextPreferenceStyle, context);
        super(context, attributeSet, iM);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.EditTextPreference, iM, 0);
        int i = t2c.EditTextPreference_useSimpleSummaryProvider;
        if (typedArrayObtainStyledAttributes.getBoolean(i, typedArrayObtainStyledAttributes.getBoolean(i, false))) {
            if (vu4.Y == null) {
                vu4.Y = new vu4();
            }
            this.Z = vu4.Y;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
