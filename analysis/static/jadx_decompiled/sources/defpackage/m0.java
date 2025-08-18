package defpackage;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class m0 implements ide {
    public final /* synthetic */ mq4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ n0 f;

    public m0(n0 n0Var, d2b d2bVar, String str, Object obj, Object obj2, int i) {
        this.f = n0Var;
        this.a = d2bVar;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = i;
    }

    @Override // defpackage.ide
    public final Object get() {
        vv6 vv6Var;
        n0 n0Var = this.f;
        mq4 mq4Var = this.a;
        String str = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        int i = this.e;
        e2b e2bVar = (e2b) n0Var;
        e2bVar.getClass();
        wv6 wv6Var = (wv6) obj;
        iv6 iv6Var = e2bVar.p;
        int iS = au1.s(i);
        if (iS == 0) {
            vv6Var = vv6.FULL_FETCH;
        } else if (iS == 1) {
            vv6Var = vv6.DISK_CACHE;
        } else {
            if (iS != 2) {
                StringBuilder sb = new StringBuilder("Cache level");
                sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "BITMAP_MEMORY_CACHE" : "DISK_CACHE" : "FULL_FETCH");
                sb.append("is not supported. ");
                throw new RuntimeException(sb.toString());
            }
            vv6Var = vv6.BITMAP_MEMORY_CACHE;
        }
        vv6 vv6Var2 = vv6Var;
        p06 p06Var = null;
        if (mq4Var instanceof d2b) {
            d2b d2bVar = (d2b) mq4Var;
            synchronized (d2bVar) {
                HashSet hashSet = d2bVar.G;
                if (hashSet != null) {
                    p06Var = new p06(hashSet);
                }
            }
        }
        return iv6Var.b(wv6Var, obj2, vv6Var2, p06Var, str);
    }

    public final String toString() {
        nw4 nw4VarR0 = j47.r0(this);
        nw4VarR0.e(this.c.toString(), "request");
        return nw4VarR0.toString();
    }
}
