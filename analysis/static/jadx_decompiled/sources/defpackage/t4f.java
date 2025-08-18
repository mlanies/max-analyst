package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class t4f {
    public final q0e a;

    public t4f() {
        jp jpVar = ((y8a) vl.b()).n().c;
        this.a = r0e.a(Float.valueOf(jpVar.g.getFloat("app.extra.text.size.sp", 0.0f)));
        ml0 ml0Var = jpVar.h;
        ml0Var.getClass();
        sd7 sd7Var = new sd7(new bkg(29, this), ft.f, ft.d);
        Objects.requireNonNull(sd7Var, "observer is null");
        try {
            ml0Var.a(new lz9(sd7Var));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            j47.Z(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
