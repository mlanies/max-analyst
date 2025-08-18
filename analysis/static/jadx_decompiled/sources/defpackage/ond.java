package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ond implements s29 {
    public final long a;
    public final String b;
    public final kv0 c;
    public final fv0 d;
    public final jqe e;
    public final jqe f;
    public final List g;

    public ond(long j, String str, kv0 kv0Var, fv0 fv0Var, eqe eqeVar, eqe eqeVar2, List list) {
        this.a = j;
        this.b = str;
        this.c = kv0Var;
        this.d = fv0Var;
        this.e = eqeVar;
        this.f = eqeVar2;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ond)) {
            return false;
        }
        ond ondVar = (ond) obj;
        return this.a == ondVar.a && tpa.f(this.b, ondVar.b) && tpa.f(this.c, ondVar.c) && tpa.f(this.d, ondVar.d) && tpa.f(this.e, ondVar.e) && tpa.f(this.f, ondVar.f) && tpa.f(this.g, ondVar.g);
    }

    public final int hashCode() {
        int iF = k7d.f((this.d.hashCode() + ((this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        jqe jqeVar = this.f;
        return this.g.hashCode() + ((iF + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowShareContactForBotConfirmation(messageId=");
        sb.append(this.a);
        sb.append(", keyboardId=");
        sb.append(this.b);
        sb.append(", buttonPosition=");
        sb.append(this.c);
        sb.append(", button=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", buttons=");
        return au1.i(sb, this.g, ")");
    }
}
