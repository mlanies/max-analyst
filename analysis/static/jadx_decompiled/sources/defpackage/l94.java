package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class l94 {
    public final String a;
    public final kg5 b;
    public long c;
    public long d;

    public l94(File file, String str) {
        str.getClass();
        this.a = str;
        this.b = new kg5(file);
        this.c = -1L;
        this.d = -1L;
    }

    public final long a() {
        if (this.d < 0) {
            this.d = this.b.a.lastModified();
        }
        return this.d;
    }
}
