package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.ote;
import defpackage.rsb;
import defpackage.t2c;
import java.util.HashSet;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iM = ote.m(rsb.dialogPreferenceStyle, R.attr.dialogPreferenceStyle, context);
        super(context, attributeSet, iM);
        new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.MultiSelectListPreference, iM, 0);
        int i = t2c.MultiSelectListPreference_entries;
        int i2 = t2c.MultiSelectListPreference_android_entries;
        if (typedArrayObtainStyledAttributes.getTextArray(i) == null) {
            typedArrayObtainStyledAttributes.getTextArray(i2);
        }
        int i3 = t2c.MultiSelectListPreference_entryValues;
        int i4 = t2c.MultiSelectListPreference_android_entryValues;
        if (typedArrayObtainStyledAttributes.getTextArray(i3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(i4);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
