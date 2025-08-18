package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lh9 implements on5 {
    public final /* synthetic */ long X;
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ uh9 o;

    public lh9(long j, String str, String str2, uh9 uh9Var, long j2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = uh9Var;
        this.X = j2;
    }

    @Override // defpackage.on5
    public final Object a(Object obj, Continuation continuation) {
        if (((dn4) obj).b == 3) {
            int i = uh9.K;
            StringBuilder sb = new StringBuilder();
            long j = this.a;
            sb.append(j);
            sb.append(" | ");
            String str = this.b;
            sb.append(str);
            sb.append(" is loaded, ");
            sb.append(this.c);
            hm9.n("uh9", sb.toString());
            uh9 uh9Var = this.o;
            uh9Var.d.v(j, str, new hj8(27));
            uh9Var.f.c(new l6f(this.X, this.a, 0));
        }
        return e5f.a;
    }
}
