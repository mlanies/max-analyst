package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.ote;
import defpackage.rsb;
import defpackage.t2c;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final Drawable s0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t2c.DialogPreference, i, 0);
        ote.x(typedArrayObtainStyledAttributes, t2c.DialogPreference_dialogTitle, t2c.DialogPreference_android_dialogTitle);
        ote.x(typedArrayObtainStyledAttributes, t2c.DialogPreference_dialogMessage, t2c.DialogPreference_android_dialogMessage);
        int i2 = t2c.DialogPreference_dialogIcon;
        int i3 = t2c.DialogPreference_android_dialogIcon;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i2);
        this.s0 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(i3) : drawable;
        ote.x(typedArrayObtainStyledAttributes, t2c.DialogPreference_positiveButtonText, t2c.DialogPreference_android_positiveButtonText);
        ote.x(typedArrayObtainStyledAttributes, t2c.DialogPreference_negativeButtonText, t2c.DialogPreference_android_negativeButtonText);
        typedArrayObtainStyledAttributes.getResourceId(t2c.DialogPreference_dialogLayout, typedArrayObtainStyledAttributes.getResourceId(t2c.DialogPreference_android_dialogLayout, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ote.m(rsb.dialogPreferenceStyle, R.attr.dialogPreferenceStyle, context));
    }
}
