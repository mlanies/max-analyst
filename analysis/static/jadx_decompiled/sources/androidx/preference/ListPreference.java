package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.f7b;
import defpackage.ote;
import defpackage.oz7;
import defpackage.rsb;
import defpackage.t2c;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] t0;
    public final String u0;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.ListPreference, i, 0);
        int i2 = t2c.ListPreference_entries;
        int i3 = t2c.ListPreference_android_entries;
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(i2);
        this.t0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(i3) : textArray;
        int i4 = t2c.ListPreference_entryValues;
        int i5 = t2c.ListPreference_android_entryValues;
        if (typedArrayObtainStyledAttributes.getTextArray(i4) == null) {
            typedArrayObtainStyledAttributes.getTextArray(i5);
        }
        int i6 = t2c.ListPreference_useSimpleSummaryProvider;
        if (typedArrayObtainStyledAttributes.getBoolean(i6, typedArrayObtainStyledAttributes.getBoolean(i6, false))) {
            if (oz7.o == null) {
                oz7.o = new oz7();
            }
            this.Z = oz7.o;
            b();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t2c.Preference, i, 0);
        this.u0 = ote.x(typedArrayObtainStyledAttributes2, t2c.Preference_summary, t2c.Preference_android_summary);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        f7b f7bVar = this.Z;
        if (f7bVar != null) {
            return f7bVar.k(this);
        }
        CharSequence charSequenceD = d();
        CharSequence charSequenceA = super.a();
        String str = this.u0;
        if (str == null) {
            return charSequenceA;
        }
        if (charSequenceD == null) {
            charSequenceD = "";
        }
        String str2 = String.format(str, charSequenceD);
        return TextUtils.equals(str2, charSequenceA) ? charSequenceA : str2;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final CharSequence d() {
        return null;
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ote.m(rsb.dialogPreferenceStyle, R.attr.dialogPreferenceStyle, context));
    }
}
