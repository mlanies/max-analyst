package defpackage;

/* loaded from: classes2.dex */
public abstract class ok0 implements fef {
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final long e;
    public final uy f;
    public final boolean g;
    public final int h;
    public final int i;

    public ok0(int i, int i2, long j, long j2, long j3, uy uyVar, String str, boolean z, boolean z2) {
        this.d = str;
        this.a = j;
        this.b = j2;
        this.c = z;
        this.e = j3;
        this.f = uyVar;
        this.g = z2;
        this.h = i;
        this.i = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ok0 ok0Var = (ok0) obj;
        if (this.a != ok0Var.a || this.b != ok0Var.b || this.c != ok0Var.c || this.e != ok0Var.e || this.g != ok0Var.g || this.h != ok0Var.h || this.i != ok0Var.i) {
            return false;
        }
        String str = ok0Var.d;
        String str2 = this.d;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        uy uyVar = ok0Var.f;
        uy uyVar2 = this.f;
        return uyVar2 != null ? uyVar2.equals(uyVar) : uyVar == null;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.c ? 1 : 0)) * 31;
        String str = this.d;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j3 = this.e;
        int i2 = (iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        uy uyVar = this.f;
        return ((((((i2 + (uyVar != null ? uyVar.hashCode() : 0)) * 31) + (this.g ? 1 : 0)) * 31) + this.h) * 31) + this.i;
    }

    @Override // defpackage.fef
    public long k() {
        return this.a;
    }

    @Override // defpackage.fef
    public long m() {
        return 0L;
    }
}
