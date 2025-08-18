package defpackage;

/* loaded from: classes2.dex */
public final class e08 {
    public final er7 a;
    public final long b;
    public final long c;
    public final i08 d;
    public final String e;
    public final String f;
    public final float g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final boolean k;
    public final String l;

    public e08(d08 d08Var) {
        this.a = d08Var.a;
        this.b = d08Var.b;
        this.c = d08Var.c;
        this.d = d08Var.d;
        this.e = d08Var.e;
        this.f = d08Var.f;
        this.g = d08Var.g;
        this.h = d08Var.h;
        this.i = d08Var.i;
        this.j = d08Var.j;
        this.k = d08Var.k;
        this.l = d08Var.l;
    }

    public final d08 a() {
        d08 d08Var = new d08(this.a);
        d08Var.b = this.b;
        d08Var.c = this.c;
        d08Var.d = this.d;
        d08Var.e = this.e;
        d08Var.f = this.f;
        d08Var.g = this.g;
        d08Var.h = this.h;
        d08Var.i = this.i;
        d08Var.j = this.j;
        d08Var.k = this.k;
        d08Var.l = this.l;
        return d08Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarkerData{location=");
        sb.append(this.a);
        sb.append(", contactId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", markerWeight=");
        sb.append(this.d);
        sb.append(", title='");
        sb.append(this.e);
        sb.append("', address='");
        sb.append(this.f);
        sb.append("', distance=");
        sb.append(this.g);
        sb.append(", live=");
        sb.append(this.h);
        sb.append(", decoding=");
        sb.append(this.i);
        sb.append(", date=");
        sb.append(this.j);
        sb.append(", active=");
        sb.append(this.k);
        sb.append(", deviceId='");
        return zr6.l(sb, this.l, "'}");
    }
}
