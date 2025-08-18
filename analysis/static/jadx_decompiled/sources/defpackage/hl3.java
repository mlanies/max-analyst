package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class hl3 {
    public long a;
    public String b;
    public String c;
    public String d;
    public long e;
    public List f;
    public long g;
    public long h;
    public nl3 i;
    public int j;
    public ol3 k;
    public int l;
    public int m;
    public List n;
    public String o;
    public String p;
    public String q;
    public long r;
    public long s;
    public long t;
    public kl3 u;
    public int[] v;
    public ml3 w;

    public final pl3 a() {
        if (this.k == null) {
            this.k = ol3.b;
        }
        if (this.l == 0) {
            this.l = 1;
        }
        if (this.n == null) {
            this.n = Collections.emptyList();
        }
        List list = this.f;
        if (list == null || list.isEmpty()) {
            this.f = Collections.singletonList(jl3.e);
        }
        if (this.v == null) {
            this.v = new int[0];
        }
        return new pl3(this);
    }
}
