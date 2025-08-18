package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class lna {
    public final long a;
    public final String b;
    public final wz c;
    public final nna d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final List h;
    public final ng4 i;
    public final int j;
    public final boolean k;

    public lna(kna knaVar) {
        this.a = knaVar.a;
        this.b = knaVar.b;
        this.c = knaVar.c;
        this.d = knaVar.d;
        this.e = knaVar.e;
        this.f = knaVar.f;
        this.g = knaVar.g;
        this.h = knaVar.h;
        this.i = knaVar.i;
        this.j = knaVar.j;
        this.k = knaVar.k;
    }

    public final us a() {
        us usVar = new us(0);
        usVar.put("cid", Long.valueOf(this.a));
        usVar.put("zoom", Integer.valueOf(this.j));
        usVar.put("attachMEL", Boolean.valueOf(this.k));
        String str = this.b;
        if (!oag.t(str)) {
            usVar.put("text", str);
        }
        usVar.put("detectShare", Boolean.valueOf(this.e));
        wz wzVar = this.c;
        if (wzVar != null && wzVar.size() > 0) {
            usVar.put("attaches", wzVar);
        }
        nna nnaVar = this.d;
        if (nnaVar != null) {
            usVar.put("link", nnaVar);
        }
        int i = this.f;
        if (i > 0) {
            usVar.put("ttl", Integer.valueOf(i));
        }
        usVar.put("isLive", Boolean.valueOf(this.g));
        List list = this.h;
        if (list != null) {
            usVar.put("elements", list);
        }
        ng4 ng4Var = this.i;
        if (ng4Var != null) {
            usVar.put("delayedAttributes", ng4Var.a());
        }
        return usVar;
    }

    public final String toString() {
        o84.Z.getClass();
        int iO = s5c.o(this.h);
        StringBuilder sb = new StringBuilder("OutgoingMessage{cid=");
        ms2.j(this.a, ", text=", "***", sb);
        sb.append(", attaches=");
        sb.append(this.c);
        sb.append(", link=");
        sb.append(this.d);
        sb.append(", detectShare=");
        sb.append(this.e);
        sb.append(", ttl=");
        sb.append(this.f);
        sb.append(", live='");
        sb.append(this.g);
        sb.append("', elements=");
        sb.append(iO);
        sb.append(", zoom=");
        sb.append(this.j);
        sb.append(", attachMEL=");
        return au1.j(sb, this.k, "}");
    }
}
