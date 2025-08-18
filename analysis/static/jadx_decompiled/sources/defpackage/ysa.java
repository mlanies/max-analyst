package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ysa extends e5c {
    public static final String c;
    public final float b;

    static {
        int i = oaf.a;
        c = Integer.toString(1, 36);
    }

    public ysa() {
        this.b = -1.0f;
    }

    @Override // defpackage.e5c
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // defpackage.e5c
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(e5c.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ysa) {
            return this.b == ((ysa) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b)});
    }

    public ysa(float f) {
        fm9.e("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }
}
