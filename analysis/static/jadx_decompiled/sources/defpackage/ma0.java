package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class ma0 {
    public final long a;
    public final long b;
    public final File c;

    public ma0(long j, long j2, File file) {
        this.a = j;
        this.b = j2;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ma0)) {
            return false;
        }
        ma0 ma0Var = (ma0) obj;
        return this.a == ma0Var.a && this.b == ma0Var.b && this.c.equals(ma0Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * (-721379959));
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.a + ", durationLimitMillis=" + this.b + ", location=null, file=" + this.c + "}";
    }
}
