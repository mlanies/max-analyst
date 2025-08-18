package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cb4 implements am6 {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public mbe b;
    public boolean c;

    public static void a(ArrayList arrayList, int i) {
        if (s5c.H(i, 0, 7, d) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public xu0 b(int i, qy5 qy5Var, boolean z, ArrayList arrayList, yze yzeVar) {
        la5 f26Var;
        String str = qy5Var.m;
        if (!ia9.j(str)) {
            if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                f26Var = new d28(this.c ? 1 : 3, this.b);
            } else if (Objects.equals(str, "image/jpeg")) {
                f26Var = new mc4(1);
            } else if (Objects.equals(str, "image/png")) {
                f26Var = new vp0(1);
            } else {
                int i2 = z ? 4 : 0;
                if (!this.c) {
                    i2 |= 32;
                }
                f26Var = new f26(this.b, i2, null, arrayList, yzeVar);
            }
        } else {
            if (!this.c) {
                return null;
            }
            f26Var = new gbe(this.b.e(qy5Var), qy5Var);
        }
        if (this.c && !ia9.j(str) && !(f26Var.m() instanceof f26) && !(f26Var.m() instanceof d28)) {
            f26Var = new pbe(f26Var, this.b);
        }
        return new xu0(f26Var, i, qy5Var);
    }

    public qy5 c(qy5 qy5Var) {
        String str;
        if (!this.c || !this.b.a(qy5Var)) {
            return qy5Var;
        }
        ny5 ny5VarA = qy5Var.a();
        ny5VarA.m = ia9.l("application/x-media3-cues");
        ny5VarA.G = this.b.l(qy5Var);
        StringBuilder sb = new StringBuilder();
        sb.append(qy5Var.n);
        String str2 = qy5Var.j;
        if (str2 != null) {
            str = " " + str2;
        } else {
            str = "";
        }
        sb.append(str);
        ny5VarA.i = sb.toString();
        ny5VarA.r = Long.MAX_VALUE;
        return ny5VarA.a();
    }
}
