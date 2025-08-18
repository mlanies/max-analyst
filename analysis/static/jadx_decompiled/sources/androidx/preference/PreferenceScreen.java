package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import defpackage.ote;
import defpackage.rsb;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ote.m(rsb.preferenceScreenStyle, R.attr.preferenceScreenStyle, context));
    }
}
