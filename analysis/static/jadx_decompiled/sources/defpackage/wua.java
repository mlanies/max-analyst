package defpackage;

/* loaded from: classes2.dex */
public final class wua extends mi0 implements Comparable {
    public final String X;
    public final long Y;
    public final String Z;
    public final long c;
    public final int o;
    public final String s0;
    public final String t0;
    public final String u0;
    public final int v0;

    public wua(long j, long j2, int i, String str, long j3, String str2, String str3, String str4, String str5, int i2) {
        super(j);
        this.c = j2;
        this.o = i;
        this.X = str;
        this.Y = j3;
        this.Z = str2;
        this.s0 = str3;
        this.t0 = str4;
        this.u0 = str5;
        this.v0 = ey8.b(i2);
    }

    public final String a() {
        String str = this.s0;
        if (oag.u(str)) {
            String str2 = this.t0;
            if (oag.u(str2)) {
                return str + " " + str2;
            }
        }
        return str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a().compareTo(((wua) obj).a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wua.class != obj.getClass()) {
            return false;
        }
        wua wuaVar = (wua) obj;
        if (this.o != wuaVar.o) {
            return false;
        }
        String str = wuaVar.X;
        String str2 = this.X;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = wuaVar.s0;
        String str4 = this.s0;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = wuaVar.t0;
        String str6 = this.t0;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = wuaVar.u0;
        String str8 = this.u0;
        return str8 == null ? str7 == null : str8.equals(str7);
    }

    @Override // defpackage.mi0
    public final String toString() {
        return "PhoneDb{phonebookId=" + this.c + ", contactId=" + this.o + ", phone='" + this.X + "', serverPhone=" + this.Y + ", firstName='" + this.s0 + "', lastName='" + this.t0 + "', type=" + ey8.q(this.v0) + '}';
    }
}
