package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;

/* loaded from: classes.dex */
public final class z24 {
    public static final /* synthetic */ int k = 0;
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    static {
        h85.a("goog.exo.datasource");
    }

    public z24(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        np8.d(j + j2 >= 0);
        np8.d(j2 >= 0);
        np8.d(j3 > 0 || j3 == -1);
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
        this.j = obj;
    }

    public final y24 a() {
        y24 y24Var = new y24(false, 0);
        y24Var.b = this.a;
        y24Var.c = this.b;
        y24Var.d = this.c;
        y24Var.e = this.d;
        y24Var.f = this.e;
        y24Var.g = this.f;
        y24Var.h = this.g;
        y24Var.i = this.h;
        y24Var.j = this.i;
        y24Var.k = this.j;
        return y24Var;
    }

    public final z24 b(long j) {
        long j2 = this.g;
        return c(j, j2 != -1 ? j2 - j : -1L);
    }

    public final z24 c(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new z24(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i, this.j);
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i == 1) {
            str = HttpGet.METHOD_NAME;
        } else if (i == 2) {
            str = HttpPost.METHOD_NAME;
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = HttpHead.METHOD_NAME;
        }
        String strValueOf = String.valueOf(this.a);
        int length = strValueOf.length() + str.length() + 70;
        String str2 = this.h;
        StringBuilder sb = new StringBuilder(rh4.e(length, str2));
        sb.append("DataSpec[");
        sb.append(str);
        sb.append(" ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        ms2.j(this.g, ", ", str2, sb);
        sb.append(", ");
        return zr6.j(sb, this.i, "]");
    }
}
