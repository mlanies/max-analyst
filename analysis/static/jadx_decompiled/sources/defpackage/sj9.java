package defpackage;

import java.util.Objects;
import ru.ok.messages.settings.locations.FrgLiveLocationSettings;

/* loaded from: classes2.dex */
public final class sj9 extends u2 {
    public final av0 X;
    public final ad Y;
    public final k8g Z;
    public final m7b c;
    public final cn7 o;
    public final ztc s0;
    public final ri4 t0;
    public g28 u0;
    public sd7 v0;
    public boolean w0;

    public sj9(xk9 xk9Var, p7b p7bVar, p82 p82Var, cn7 cn7Var, cy7 cy7Var, ad adVar, k8g k8gVar, ztc ztcVar, ri4 ri4Var, FrgLiveLocationSettings frgLiveLocationSettings) {
        super(0, xk9Var);
        this.c = p7bVar;
        this.o = cn7Var;
        this.X = cy7Var;
        this.Y = adVar;
        this.Z = k8gVar;
        this.s0 = ztcVar;
        this.t0 = ri4Var;
    }

    public final void Z1() {
        cqc.b(this.u0);
        ((p7b) this.c).a.t();
        this.t0.a();
        this.o.getClass();
        vy9 vy9VarV = new e0a(new q28(m28.a.h(this.s0).f(ce.a()), new jj9(2), 0), new rj9(this, 1), 3).v();
        jj9 jj9Var = new jj9(3);
        g28 g28Var = new g28(new rj9(this, 2), new rj9(this, 3), new e5(13, this));
        Objects.requireNonNull(g28Var, "observer is null");
        try {
            vy9VarV.k(new r28(g28Var, jj9Var, 1));
            this.u0 = g28Var;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @uae
    public void onEvent(ps3 ps3Var) {
        ((xk9) ((kk9) this.b)).s0.m();
    }
}
