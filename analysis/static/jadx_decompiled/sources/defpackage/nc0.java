package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class nc0 implements f15 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final fa0 e;
    public final ha0 f;

    public nc0(int i, int i2, List list, List list2, fa0 fa0Var, ha0 ha0Var) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.d = list2;
        this.e = fa0Var;
        if (ha0Var == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f = ha0Var;
    }

    @Override // defpackage.f15
    public final int a() {
        return this.a;
    }

    @Override // defpackage.f15
    public final int b() {
        return this.b;
    }

    @Override // defpackage.f15
    public final List c() {
        return this.c;
    }

    @Override // defpackage.f15
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nc0)) {
            return false;
        }
        nc0 nc0Var = (nc0) obj;
        if (this.a == nc0Var.a && this.b == nc0Var.b && this.c.equals(nc0Var.c) && this.d.equals(nc0Var.d)) {
            fa0 fa0Var = nc0Var.e;
            fa0 fa0Var2 = this.e;
            if (fa0Var2 != null ? fa0Var2.equals(fa0Var) : fa0Var == null) {
                if (this.f.equals(nc0Var.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        fa0 fa0Var = this.e;
        return this.f.hashCode() ^ ((iHashCode ^ (fa0Var == null ? 0 : fa0Var.hashCode())) * 1000003);
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.a + ", recommendedFileFormat=" + this.b + ", audioProfiles=" + this.c + ", videoProfiles=" + this.d + ", defaultAudioProfile=" + this.e + ", defaultVideoProfile=" + this.f + "}";
    }
}
