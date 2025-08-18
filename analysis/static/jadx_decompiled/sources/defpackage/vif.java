package defpackage;

import android.util.Size;

/* loaded from: classes2.dex */
public final class vif {
    public final Size a;
    public final String b;
    public final String c;

    public vif(Size size, String str, String str2) {
        this.a = size;
        this.b = str;
        this.c = str2;
    }

    public static vif a(vif vifVar, Size size, String str, String str2, int i) {
        if ((i & 1) != 0) {
            size = vifVar.a;
        }
        if ((i & 2) != 0) {
            str = vifVar.b;
        }
        if ((i & 4) != 0) {
            str2 = vifVar.c;
        }
        vifVar.getClass();
        return new vif(size, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vif)) {
            return false;
        }
        vif vifVar = (vif) obj;
        return tpa.f(this.a, vifVar.a) && tpa.f(this.b, vifVar.b) && tpa.f(this.c, vifVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(previewSize=");
        sb.append(this.a);
        sb.append(", recordPath=");
        sb.append(this.b);
        sb.append(", previewBase64=");
        return zr6.l(sb, this.c, ")");
    }
}
