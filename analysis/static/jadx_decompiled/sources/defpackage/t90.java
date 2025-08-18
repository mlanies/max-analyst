package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t90 {
    public final String a;
    public final Class b;
    public final fad c;
    public final o9f d;
    public final Size e;
    public final vb0 f;
    public final List g;

    public t90(String str, Class cls, fad fadVar, o9f o9fVar, Size size, vb0 vb0Var, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.a = str;
        this.b = cls;
        if (fadVar == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.c = fadVar;
        if (o9fVar == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.d = o9fVar;
        this.e = size;
        this.f = vb0Var;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t90)) {
            return false;
        }
        t90 t90Var = (t90) obj;
        if (this.a.equals(t90Var.a) && this.b.equals(t90Var.b) && this.c.equals(t90Var.c) && this.d.equals(t90Var.d)) {
            Size size = t90Var.e;
            Size size2 = this.e;
            if (size2 != null ? size2.equals(size) : size == null) {
                vb0 vb0Var = t90Var.f;
                vb0 vb0Var2 = this.f;
                if (vb0Var2 != null ? vb0Var2.equals(vb0Var) : vb0Var == null) {
                    List list = t90Var.g;
                    List list2 = this.g;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                    } else if (list2.equals(list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Size size = this.e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        vb0 vb0Var = this.f;
        int iHashCode3 = (iHashCode2 ^ (vb0Var == null ? 0 : vb0Var.hashCode())) * 1000003;
        List list = this.g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseInfo{useCaseId=");
        sb.append(this.a);
        sb.append(", useCaseType=");
        sb.append(this.b);
        sb.append(", sessionConfig=");
        sb.append(this.c);
        sb.append(", useCaseConfig=");
        sb.append(this.d);
        sb.append(", surfaceResolution=");
        sb.append(this.e);
        sb.append(", streamSpec=");
        sb.append(this.f);
        sb.append(", captureTypes=");
        return au1.i(sb, this.g, "}");
    }
}
