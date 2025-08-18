package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qze implements su0 {
    public static final hme X = new hme(13);
    public final int a;
    public final String b;
    public final oy5[] c;
    public int o;

    public qze(String str, oy5... oy5VarArr) {
        np8.d(oy5VarArr.length > 0);
        this.b = str;
        this.c = oy5VarArr;
        this.a = oy5VarArr.length;
        String str2 = oy5VarArr[0].c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = oy5VarArr[0].X | 16384;
        for (int i2 = 1; i2 < oy5VarArr.length; i2++) {
            String str3 = oy5VarArr[i2].c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", i2, oy5VarArr[0].c, oy5VarArr[i2].c);
                return;
            } else {
                if (i != (oy5VarArr[i2].X | 16384)) {
                    b("role flags", i2, Integer.toBinaryString(oy5VarArr[0].X), Integer.toBinaryString(oy5VarArr[i2].X));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i, String str2, String str3) {
        StringBuilder sb = new StringBuilder(rh4.e(rh4.e(str.length() + 78, str2), str3));
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        fm9.c("", new IllegalStateException(sb.toString()));
    }

    public final int a(oy5 oy5Var) {
        int i = 0;
        while (true) {
            oy5[] oy5VarArr = this.c;
            if (i >= oy5VarArr.length) {
                return -1;
            }
            if (oy5Var == oy5VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qze.class != obj.getClass()) {
            return false;
        }
        qze qzeVar = (qze) obj;
        return this.a == qzeVar.a && this.b.equals(qzeVar.b) && Arrays.equals(this.c, qzeVar.c);
    }

    public final int hashCode() {
        if (this.o == 0) {
            this.o = rh4.d(527, 31, this.b) + Arrays.hashCode(this.c);
        }
        return this.o;
    }
}
