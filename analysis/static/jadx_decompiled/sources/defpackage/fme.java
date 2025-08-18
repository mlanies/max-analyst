package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class fme {
    public static final /* synthetic */ int b = 0;
    public final je7 a;

    public fme(je7 je7Var) {
        this.a = je7Var;
    }

    public static boolean a(int i) {
        return i == 2 || i == 3;
    }

    public static boolean c(Throwable th) {
        return (th instanceof TamErrorException) && f46.U(((TamErrorException) th).a.b);
    }

    public static boolean d(Throwable th) {
        return (th instanceof TamErrorException) && "io.exception".equals(((TamErrorException) th).a.b);
    }

    public final u1a b() {
        ml0 ml0Var = ((jbd) ((hbd) this.a.getValue())).e;
        m2e m2eVar = new m2e(28);
        ml0Var.getClass();
        return new ty9(ml0Var, m2eVar, 1).s(1L);
    }
}
