package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import defpackage.ote;
import defpackage.rsb;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ote.m(rsb.preferenceCategoryStyle, R.attr.preferenceCategoryStyle, context));
    }
}
