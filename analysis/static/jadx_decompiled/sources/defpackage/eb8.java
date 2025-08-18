package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class eb8 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final UUID a;
    public final Uri b;
    public final cx6 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final zw6 g;
    public final byte[] h;

    static {
        int i2 = oaf.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public eb8(s74 s74Var) {
        fm9.k((s74Var.c && ((Uri) s74Var.e) == null) ? false : true);
        UUID uuid = (UUID) s74Var.d;
        uuid.getClass();
        this.a = uuid;
        this.b = (Uri) s74Var.e;
        this.c = (cx6) s74Var.f;
        this.d = s74Var.a;
        this.f = s74Var.c;
        this.e = s74Var.b;
        this.g = (zw6) s74Var.g;
        byte[] bArr = (byte[]) s74Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb8)) {
            return false;
        }
        eb8 eb8Var = (eb8) obj;
        return this.a.equals(eb8Var.a) && oaf.a(this.b, eb8Var.b) && oaf.a(this.c, eb8Var.c) && this.d == eb8Var.d && this.f == eb8Var.f && this.e == eb8Var.e && this.g.equals(eb8Var.g) && Arrays.equals(this.h, eb8Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
