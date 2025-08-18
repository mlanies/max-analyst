package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class tw1 extends ww1 {
    public final String a;
    public final List b;

    public tw1(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.ww1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw1)) {
            return false;
        }
        tw1 tw1Var = (tw1) obj;
        return tpa.f(this.a, tw1Var.a) && tpa.f(this.b, tw1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Back(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}
