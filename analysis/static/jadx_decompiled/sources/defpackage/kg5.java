package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class kg5 {
    public final File a;

    public kg5(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof kg5)) {
            return false;
        }
        return tpa.f(this.a, ((kg5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
