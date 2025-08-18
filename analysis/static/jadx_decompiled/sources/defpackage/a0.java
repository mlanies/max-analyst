package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 implements hx3 {
    public final float a;

    public a0(float f) {
        this.a = f;
    }

    @Override // defpackage.hx3
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.a == ((a0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
