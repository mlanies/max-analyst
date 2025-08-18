package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;

/* loaded from: classes.dex */
public abstract class fp0 {
    public static ColorFilter a(int i, Object obj) {
        return new BlendModeColorFilter(i, (BlendMode) obj);
    }
}
