package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class qt2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;

    public /* synthetic */ qt2(int i, je7 je7Var) {
        this.a = i;
        this.b = je7Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((wt2) this.b.getValue()).a().b());
            default:
                je7 je7Var = this.b;
                t9f t9fVarH = ((ri4) je7Var.getValue()).h();
                t9f t9fVarH2 = ((ri4) je7Var.getValue()).h();
                t9f t9fVarH3 = ((ri4) je7Var.getValue()).h();
                t9f t9fVarH4 = ((ri4) je7Var.getValue()).h();
                StringBuilder sb = new StringBuilder("OKMessages/");
                sb.append(t9fVarH.b);
                sb.append(" (");
                sb.append(t9fVarH2.e);
                sb.append("; ");
                sb.append(t9fVarH3.h);
                sb.append("; ");
                String strL = zr6.l(sb, t9fVarH4.i, ")");
                try {
                    return URLEncoder.encode(strL, Charset.defaultCharset().name());
                } catch (UnsupportedEncodingException unused) {
                    return strL;
                }
        }
    }
}
