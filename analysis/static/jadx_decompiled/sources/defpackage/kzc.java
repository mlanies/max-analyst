package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class kzc implements Serializable, Comparable {
    public final uj3 X;
    public final fs8 Y;
    public final long Z;
    public final int a;
    public final String b;
    public final List c;
    public final e52 o;
    public final vpb s0;

    public kzc(int i, String str, List list, e52 e52Var, uj3 uj3Var, fs8 fs8Var, long j, vpb vpbVar) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.o = e52Var;
        this.X = uj3Var;
        this.Y = fs8Var;
        this.Z = j;
        this.s0 = vpbVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        kzc kzcVar = (kzc) obj;
        if (kzcVar == null) {
            return 0;
        }
        e52 e52Var = this.o;
        e52 e52Var2 = kzcVar.o;
        return (e52Var == null || e52Var2 == null) ? (e52Var == null || e52Var2 != null) ? 0 : -1 : Long.compare(e52Var2.m(), e52Var.m());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResult{type=");
        sb.append(z7b.l(this.a));
        sb.append(", feedback='");
        sb.append(this.b);
        sb.append("', highlights=");
        sb.append(this.c.size());
        sb.append(", chat=");
        sb.append(this.o);
        sb.append(", contact=");
        sb.append(this.X);
        sb.append(", message=");
        sb.append(this.Y);
        sb.append(", chatId=");
        return z7b.i(sb, this.Z, '}');
    }
}
