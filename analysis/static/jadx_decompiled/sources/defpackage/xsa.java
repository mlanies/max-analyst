package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xsa extends d5c {
    public final float b;

    public xsa() {
        this.b = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xsa) {
            return this.b == ((xsa) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b)});
    }

    public xsa(float f) {
        np8.c("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }
}
