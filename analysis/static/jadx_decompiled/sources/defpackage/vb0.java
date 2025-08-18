package defpackage;

import android.util.Range;
import android.util.Size;

/* loaded from: classes.dex */
public final class vb0 {
    public static final Range f = new Range(0, 0);
    public final Size a;
    public final eu4 b;
    public final Range c;
    public final ce3 d;
    public final boolean e;

    public vb0(Size size, eu4 eu4Var, Range range, ce3 ce3Var, boolean z) {
        this.a = size;
        this.b = eu4Var;
        this.c = range;
        this.d = ce3Var;
        this.e = z;
    }

    public final x3c a() {
        x3c x3cVar = new x3c(1);
        x3cVar.b = this.a;
        x3cVar.c = this.b;
        x3cVar.o = this.c;
        x3cVar.X = this.d;
        x3cVar.Y = Boolean.valueOf(this.e);
        return x3cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vb0)) {
            return false;
        }
        vb0 vb0Var = (vb0) obj;
        if (this.a.equals(vb0Var.a) && this.b.equals(vb0Var.b) && this.c.equals(vb0Var.c)) {
            ce3 ce3Var = vb0Var.d;
            ce3 ce3Var2 = this.d;
            if (ce3Var2 != null ? ce3Var2.equals(ce3Var) : ce3Var == null) {
                if (this.e == vb0Var.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        ce3 ce3Var = this.d;
        return (this.e ? 1231 : 1237) ^ ((iHashCode ^ (ce3Var == null ? 0 : ce3Var.hashCode())) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", dynamicRange=");
        sb.append(this.b);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.c);
        sb.append(", implementationOptions=");
        sb.append(this.d);
        sb.append(", zslDisabled=");
        return au1.j(sb, this.e, "}");
    }
}
