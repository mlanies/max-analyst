package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class kte extends d5c {
    public final boolean b;
    public final boolean c;

    public kte() {
        this.b = false;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kte)) {
            return false;
        }
        kte kteVar = (kte) obj;
        return this.c == kteVar.c && this.b == kteVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public kte(boolean z) {
        this.b = true;
        this.c = z;
    }
}
