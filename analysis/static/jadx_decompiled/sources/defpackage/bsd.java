package defpackage;

/* loaded from: classes2.dex */
public final class bsd implements zcf, x38 {
    public final long a;
    public final String b;
    public final wcf c;
    public final j0e d;
    public final boolean e;

    public bsd(long j, String str, wcf wcfVar, q0e q0eVar, boolean z) {
        this.a = j;
        this.b = str;
        this.c = wcfVar;
        this.d = q0eVar;
        this.e = z;
    }

    @Override // defpackage.zcf
    public final boolean a() {
        return true;
    }

    @Override // defpackage.zcf
    public final wcf b() {
        return this.c;
    }

    @Override // defpackage.x38
    public final boolean c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsd)) {
            return false;
        }
        bsd bsdVar = (bsd) obj;
        if (this.a != bsdVar.a) {
            return false;
        }
        if (!tpa.f(this.b, bsdVar.b)) {
            return false;
        }
        if (tpa.f(this.c, bsdVar.c)) {
            return this.e == bsdVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    @Override // defpackage.zcf
    public final String i() {
        return this.b;
    }

    @Override // defpackage.zcf
    public final long j() {
        return this.a;
    }
}
