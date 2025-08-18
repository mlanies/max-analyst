package defpackage;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class jp7 implements dab {
    public final Executor a;
    public final y7g b;

    public jp7(Executor executor, y7g y7gVar) {
        this.a = executor;
        this.b = y7gVar;
    }

    @Override // defpackage.dab
    public final void a(fi0 fi0Var, eab eabVar) {
        oj0 oj0Var = (oj0) eabVar;
        hab habVar = oj0Var.c;
        oj0Var.h("local", "fetch");
        ip7 ip7Var = new ip7(this, fi0Var, habVar, eabVar, e(), oj0Var.a, habVar, eabVar);
        oj0Var.a(new fp7(ip7Var, 1));
        this.a.execute(ip7Var);
    }

    public final g05 c(InputStream inputStream, int i) {
        v84 v84VarO0;
        y7g y7gVar = this.b;
        try {
            if (i <= 0) {
                y7gVar.getClass();
                rq8 rq8Var = new rq8((pq8) y7gVar.b);
                try {
                    ((sh0) y7gVar.c).i(inputStream, rq8Var);
                    qq8 qq8VarN = rq8Var.n();
                    rq8Var.close();
                    v84VarO0 = o43.o0(qq8VarN);
                } catch (Throwable th) {
                    rq8Var.close();
                    throw th;
                }
            } else {
                y7gVar.getClass();
                rq8 rq8Var2 = new rq8((pq8) y7gVar.b, i);
                try {
                    ((sh0) y7gVar.c).i(inputStream, rq8Var2);
                    qq8 qq8VarN2 = rq8Var2.n();
                    rq8Var2.close();
                    v84VarO0 = o43.o0(qq8VarN2);
                } catch (Throwable th2) {
                    rq8Var2.close();
                    throw th2;
                }
            }
            v84 v84Var = v84VarO0;
            g05 g05Var = new g05(v84Var);
            q43.b(inputStream);
            o43.S(v84Var);
            return g05Var;
        } catch (Throwable th3) {
            q43.b(inputStream);
            o43.S(null);
            throw th3;
        }
    }

    public abstract g05 d(wv6 wv6Var);

    public abstract String e();
}
