package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nfc implements hx3 {
    public final float a;

    public nfc(float f) {
        this.a = f;
    }

    @Override // defpackage.hx3
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nfc) && this.a == ((nfc) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
