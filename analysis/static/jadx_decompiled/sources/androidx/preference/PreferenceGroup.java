package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.t2c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Handler(Looper.getMainLooper());
        new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.PreferenceGroup, i, 0);
        int i2 = t2c.PreferenceGroup_orderingFromXml;
        typedArrayObtainStyledAttributes.getBoolean(i2, typedArrayObtainStyledAttributes.getBoolean(i2, true));
        if (typedArrayObtainStyledAttributes.hasValue(t2c.PreferenceGroup_initialExpandedChildrenCount)) {
            int i3 = t2c.PreferenceGroup_initialExpandedChildrenCount;
            if (typedArrayObtainStyledAttributes.getInt(i3, typedArrayObtainStyledAttributes.getInt(i3, Integer.MAX_VALUE)) != Integer.MAX_VALUE) {
                TextUtils.isEmpty(this.X);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
