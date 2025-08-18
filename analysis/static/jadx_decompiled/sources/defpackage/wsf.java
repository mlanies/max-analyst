package defpackage;

/* loaded from: classes2.dex */
public final class wsf {
    public final long a;
    public final String b;
    public final osf c;
    public final q42 d;
    public final String e = null;

    public wsf(long j, String str, osf osfVar, q42 q42Var) {
        this.a = j;
        this.b = str;
        this.c = osfVar;
        this.d = q42Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsf)) {
            return false;
        }
        wsf wsfVar = (wsf) obj;
        return this.a == wsfVar.a && tpa.f(this.b, wsfVar.b) && this.c == wsfVar.c && tpa.f(this.d, wsfVar.d) && tpa.f(this.e, wsfVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppAnalyticsParam(botId=");
        sb.append(this.a);
        sb.append(", webAppName=");
        sb.append(this.b);
        sb.append(", entryPoint=");
        sb.append(this.c);
        sb.append(", sourceType=");
        sb.append(this.d);
        sb.append(", label=");
        return zr6.l(sb, this.e, ")");
    }
}
