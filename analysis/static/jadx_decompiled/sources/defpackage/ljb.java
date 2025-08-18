package defpackage;

/* loaded from: classes2.dex */
public final class ljb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ljb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static ljb a(ljb ljbVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = ljbVar.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = ljbVar.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = ljbVar.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = ljbVar.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = ljbVar.e;
        }
        ljbVar.getClass();
        return new ljb(z6, z7, z8, z9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljb)) {
            return false;
        }
        ljb ljbVar = (ljb) obj;
        return this.a == ljbVar.a && this.b == ljbVar.b && this.c == ljbVar.c && this.d == ljbVar.d && this.e == ljbVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ms2.d(ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileMemberPermissionsModel(changePhoto=");
        sb.append(this.a);
        sb.append(", canAddMembers=");
        sb.append(this.b);
        sb.append(", canPinMessage=");
        sb.append(this.c);
        sb.append(", canCallInChat=");
        sb.append(this.d);
        sb.append(", canSeePrivateChatLink=");
        return au1.j(sb, this.e, ")");
    }
}
