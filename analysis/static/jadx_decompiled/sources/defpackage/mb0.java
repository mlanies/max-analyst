package defpackage;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class mb0 {
    public static final mb0 d;
    public static final mb0 e;
    public static final mb0 f;
    public static final mb0 g;
    public static final mb0 h;
    public static final mb0 i;
    public static final mb0 j;
    public static final HashSet k;
    public static final List l;
    public final int a;
    public final String b;
    public final List c;

    static {
        mb0 mb0Var = new mb0(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        d = mb0Var;
        mb0 mb0Var2 = new mb0(5, "HD", Collections.singletonList(new Size(1280, 720)));
        e = mb0Var2;
        mb0 mb0Var3 = new mb0(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f = mb0Var3;
        mb0 mb0Var4 = new mb0(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        g = mb0Var4;
        mb0 mb0Var5 = new mb0(0, "LOWEST", Collections.emptyList());
        h = mb0Var5;
        mb0 mb0Var6 = new mb0(1, "HIGHEST", Collections.emptyList());
        i = mb0Var6;
        j = new mb0(-1, "NONE", Collections.emptyList());
        k = new HashSet(Arrays.asList(mb0Var5, mb0Var6, mb0Var, mb0Var2, mb0Var3, mb0Var4));
        l = Arrays.asList(mb0Var4, mb0Var3, mb0Var2, mb0Var);
    }

    public mb0(int i2, String str, List list) {
        this.a = i2;
        this.b = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mb0)) {
            return false;
        }
        mb0 mb0Var = (mb0) obj;
        return this.a == mb0Var.a && this.b.equals(mb0Var.b) && this.c.equals(mb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", typicalSizes=");
        return au1.i(sb, this.c, "}");
    }
}
