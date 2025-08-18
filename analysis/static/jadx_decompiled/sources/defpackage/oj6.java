package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class oj6 extends d5c {
    public final boolean b;
    public final boolean c;

    public oj6() {
        this.b = false;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oj6)) {
            return false;
        }
        oj6 oj6Var = (oj6) obj;
        return this.c == oj6Var.c && this.b == oj6Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public oj6(boolean z) {
        this.b = true;
        this.c = z;
    }
}
