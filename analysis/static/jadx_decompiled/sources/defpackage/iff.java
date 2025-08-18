package defpackage;

/* loaded from: classes.dex */
public final class iff {
    public static final iff i = new iff(-1, 1, -1, -1, 1.0f, -1, -1, false);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;
    public final boolean h;

    public iff(int i2, int i3, int i4, int i5, float f, int i6, int i7, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = f;
        this.f = i6;
        this.g = i7;
        this.h = z;
    }

    public final hff a() {
        hff hffVar = new hff();
        hffVar.a = this.a;
        hffVar.b = this.b;
        hffVar.c = this.c;
        hffVar.d = this.d;
        hffVar.e = this.e;
        hffVar.f = this.f;
        hffVar.g = this.g;
        hffVar.h = this.h;
        return hffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iff)) {
            return false;
        }
        iff iffVar = (iff) obj;
        return this.a == iffVar.a && this.b == iffVar.b && this.c == iffVar.c && this.d == iffVar.d && this.e == iffVar.e && this.f == iffVar.f && this.g == iffVar.g && this.h == iffVar.h;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.e) + ((((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31) + this.f) * 31) + this.g) * 31) + (this.h ? 1 : 0);
    }
}
