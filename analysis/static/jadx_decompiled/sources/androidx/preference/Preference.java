package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.f7b;
import defpackage.ote;
import defpackage.rsb;
import defpackage.t2c;
import defpackage.tyb;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public final String X;
    public final Object Y;
    public f7b Z;
    public final Context a;
    public final int b;
    public final CharSequence c;
    public final CharSequence o;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.b = Integer.MAX_VALUE;
        this.a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.Preference, i, 0);
        typedArrayObtainStyledAttributes.getResourceId(t2c.Preference_icon, typedArrayObtainStyledAttributes.getResourceId(t2c.Preference_android_icon, 0));
        int i2 = t2c.Preference_key;
        int i3 = t2c.Preference_android_key;
        String string = typedArrayObtainStyledAttributes.getString(i2);
        this.X = string == null ? typedArrayObtainStyledAttributes.getString(i3) : string;
        int i4 = t2c.Preference_title;
        int i5 = t2c.Preference_android_title;
        CharSequence text = typedArrayObtainStyledAttributes.getText(i4);
        this.c = text == null ? typedArrayObtainStyledAttributes.getText(i5) : text;
        int i6 = t2c.Preference_summary;
        int i7 = t2c.Preference_android_summary;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(i6);
        this.o = text2 == null ? typedArrayObtainStyledAttributes.getText(i7) : text2;
        this.b = typedArrayObtainStyledAttributes.getInt(t2c.Preference_order, typedArrayObtainStyledAttributes.getInt(t2c.Preference_android_order, Integer.MAX_VALUE));
        int i8 = t2c.Preference_fragment;
        int i9 = t2c.Preference_android_fragment;
        if (typedArrayObtainStyledAttributes.getString(i8) == null) {
            typedArrayObtainStyledAttributes.getString(i9);
        }
        typedArrayObtainStyledAttributes.getResourceId(t2c.Preference_layout, typedArrayObtainStyledAttributes.getResourceId(t2c.Preference_android_layout, tyb.preference));
        typedArrayObtainStyledAttributes.getResourceId(t2c.Preference_widgetLayout, typedArrayObtainStyledAttributes.getResourceId(t2c.Preference_android_widgetLayout, 0));
        typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_enabled, typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_android_enabled, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_selectable, typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_android_selectable, true));
        typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_persistent, typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_android_persistent, true));
        ote.x(typedArrayObtainStyledAttributes, t2c.Preference_dependency, t2c.Preference_android_dependency);
        int i10 = t2c.Preference_allowDividerAbove;
        typedArrayObtainStyledAttributes.getBoolean(i10, typedArrayObtainStyledAttributes.getBoolean(i10, z));
        int i11 = t2c.Preference_allowDividerBelow;
        typedArrayObtainStyledAttributes.getBoolean(i11, typedArrayObtainStyledAttributes.getBoolean(i11, z));
        if (typedArrayObtainStyledAttributes.hasValue(t2c.Preference_defaultValue)) {
            this.Y = c(typedArrayObtainStyledAttributes, t2c.Preference_defaultValue);
        } else if (typedArrayObtainStyledAttributes.hasValue(t2c.Preference_android_defaultValue)) {
            this.Y = c(typedArrayObtainStyledAttributes, t2c.Preference_android_defaultValue);
        }
        typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_shouldDisableView, typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_android_shouldDisableView, true));
        if (typedArrayObtainStyledAttributes.hasValue(t2c.Preference_singleLineTitle)) {
            typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_singleLineTitle, typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_android_singleLineTitle, true));
        }
        typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_iconSpaceReserved, typedArrayObtainStyledAttributes.getBoolean(t2c.Preference_android_iconSpaceReserved, false));
        int i12 = t2c.Preference_isPreferenceVisible;
        typedArrayObtainStyledAttributes.getBoolean(i12, typedArrayObtainStyledAttributes.getBoolean(i12, true));
        int i13 = t2c.Preference_enableCopying;
        typedArrayObtainStyledAttributes.getBoolean(i13, typedArrayObtainStyledAttributes.getBoolean(i13, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        f7b f7bVar = this.Z;
        return f7bVar != null ? f7bVar.k(this) : this.o;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = preference2.b;
        int i2 = this.b;
        if (i2 != i) {
            return i2 - i;
        }
        CharSequence charSequence = preference2.c;
        CharSequence charSequence2 = this.c;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceA = a();
        if (!TextUtils.isEmpty(charSequenceA)) {
            sb.append(charSequenceA);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ote.m(rsb.preferenceStyle, R.attr.preferenceStyle, context));
    }
}
