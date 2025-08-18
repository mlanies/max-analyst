package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class pw0 {
    public final File a;
    public final long b;
    public final long c;
    public final gx0 d;

    public pw0(File file, gx0 gx0Var) {
        this.a = file;
        this.b = file.length();
        this.c = file.lastModified();
        this.d = gx0Var;
    }

    public final String toString() {
        return "CacheEntry{file=" + this.a + ", length=" + this.b + ", lastModified=" + this.c + ", cacheType=" + this.d + '}';
    }
}
