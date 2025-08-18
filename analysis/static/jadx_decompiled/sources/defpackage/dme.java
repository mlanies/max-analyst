package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;

/* loaded from: classes2.dex */
public final /* synthetic */ class dme implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fme b;
    public final /* synthetic */ int c;

    public /* synthetic */ dme(fme fmeVar) {
        this.a = 4;
        this.b = fmeVar;
        this.c = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b66
    /* renamed from: apply */
    public final Object mo131apply(Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                wq5 wq5Var = (wq5) obj;
                fme fmeVar = this.b;
                fmeVar.getClass();
                dme dmeVar = new dme(fmeVar, this.c, 1);
                wq5Var.getClass();
                int i2 = wq5.a;
                hm9.j0(i2, "maxConcurrency");
                hm9.j0(i2, "bufferSize");
                if (!(wq5Var instanceof msc)) {
                    return new jr5(wq5Var, dmeVar, i2, i2);
                }
                Object obj2 = ((msc) wq5Var).get();
                return obj2 == null ? fr5.b : new zr5(obj2, dmeVar);
            case 1:
                Throwable th = (Throwable) obj;
                fme fmeVar2 = this.b;
                fmeVar2.getClass();
                if (fme.d(th) && !fme.a(((jbd) ((hbd) fmeVar2.a.getValue())).h)) {
                    hm9.n("fme", "retryWhenCommonError: no connection, await for connection available");
                    return new ur5(new gr5(2, new oz9(fmeVar2.b(), new m2e(27), ft.e, ft.d)));
                }
                if (!fme.c(th)) {
                    int i3 = wq5.a;
                    Objects.requireNonNull(th, "throwable is null");
                    return new gr5(i, new t66(th));
                }
                long j = this.c;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i4 = wq5.a;
                ztc ztcVarA = muc.a();
                Objects.requireNonNull(timeUnit, "unit is null");
                Objects.requireNonNull(ztcVarA, "scheduler is null");
                return new is5(Math.max(0L, j), timeUnit, ztcVarA);
            case 2:
                fme fmeVar3 = this.b;
                fmeVar3.getClass();
                return ((qy9) obj).h(new dme(fmeVar3, this.c, 3));
            case 3:
                Throwable th2 = (Throwable) obj;
                fme fmeVar4 = this.b;
                fmeVar4.getClass();
                if (fme.d(th2) && !fme.a(((jbd) ((hbd) fmeVar4.a.getValue())).h)) {
                    hm9.n("fme", "retryWhenCommonErrorObs: no connection, await for connection available");
                    return new oz9(fmeVar4.b(), new m2e(29), ft.e, ft.d);
                }
                if (!fme.c(th2)) {
                    return qy9.g(th2);
                }
                hm9.l("fme", "retryWhenCommonErrorObs: common error", th2);
                return qy9.u(this.c, TimeUnit.SECONDS, muc.a());
            default:
                Throwable th3 = (Throwable) obj;
                if (!(th3 instanceof HttpErrorException)) {
                    return qy9.g(th3);
                }
                if (th3 instanceof HttpUrlExpiredException) {
                    hm9.p("ime", "retryWhenTamHttpError: skipped retry on TamHttpUrlExpiredException", null);
                    return qy9.g(th3);
                }
                HttpErrorException httpErrorException = (HttpErrorException) th3;
                if (nu0.x(httpErrorException.a)) {
                    hm9.p("ime", "retryWhenTamHttpError: critical upload error=" + httpErrorException, null);
                    return qy9.g(th3);
                }
                fme fmeVar5 = this.b;
                if (fme.a(((jbd) ((hbd) fmeVar5.a.getValue())).h)) {
                    hm9.p("ime", "retryWhenTamHttpError: http error", httpErrorException);
                    return qy9.u(this.c, TimeUnit.SECONDS, muc.a());
                }
                hm9.n("ime", "retryWhenTamHttpError: no connection, await for connection available");
                return new oz9(fmeVar5.b(), new hme(i), ft.e, ft.d);
        }
    }

    public /* synthetic */ dme(fme fmeVar, int i, int i2) {
        this.a = i2;
        this.b = fmeVar;
        this.c = i;
    }
}
