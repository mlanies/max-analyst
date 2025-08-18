package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class yqc {
    public final hj9 a;
    public final int b;
    public final f99 c;
    public boolean d;

    public yqc(qy5 qy5Var, hj9 hj9Var) {
        this.a = hj9Var;
        this.c = qy5Var.k;
        this.b = np8.w(qy5Var.n);
    }

    public static String i(qy5 qy5Var, List list) throws ExportException {
        String str;
        String str2 = qy5Var.n;
        fm9.h(str2);
        boolean zK = ia9.k(str2);
        ix6 ix6Var = new ix6(4);
        ix6Var.j(str2);
        if (zK) {
            ix6Var.j("video/hevc");
            ix6Var.j("video/avc");
        }
        ix6Var.k(list);
        zw6 zw6VarA = ix6Var.l().a();
        int i = 0;
        while (true) {
            int size = zw6VarA.size();
            i63 i63Var = qy5Var.A;
            if (i >= size) {
                boolean zK2 = ia9.k(str2);
                if (zK2 && i63.g(i63Var)) {
                    str = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: " + i63Var;
                } else {
                    str = "No MIME type is supported by both encoder and muxer.";
                }
                throw ExportException.c(new IllegalArgumentException(str), 4003, new qh3(qy5Var.toString(), null, zK2, false));
            }
            String str3 = (String) zw6VarA.get(i);
            if (list.contains(str3)) {
                if (zK && i63.g(i63Var)) {
                    if (!h15.g(str3, i63Var).isEmpty()) {
                        return str3;
                    }
                } else if (!h15.f(str3).isEmpty()) {
                    return str3;
                }
            }
            i++;
        }
    }

    public abstract sf6 j(lv4 lv4Var, qy5 qy5Var, int i);

    public abstract p54 k();

    public abstract qy5 l();

    public abstract boolean m();

    public boolean n() {
        return false;
    }

    public abstract void o();

    public abstract void p();
}
