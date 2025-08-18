package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class s8d extends d8d implements hua, lr7 {
    public final String X = s8d.class.getName();
    public long Y;
    public sd7 Z;
    public final long b;
    public final long c;
    public final boolean o;

    public s8d(long j, long j2, boolean z) {
        this.b = j;
        this.c = j2;
        this.o = z;
    }

    @Override // defpackage.lr7
    public final void U0() {
        hm9.n(this.X, "onServiceNotAvailable, fail task");
        l().c(this);
        cqc.a(new r8d(this, 0), ((jle) q()).a(), null, new ey1(27, this), null);
        cqc.b(this.Z);
        y();
    }

    @Override // defpackage.hua
    public final int c() {
        cu8 cu8VarQ = n().q(this.c);
        if (cu8VarQ != null) {
            return (cu8VarQ.v0 == vx8.DELETED || !cu8VarQ.z()) ? 3 : 1;
        }
        return 3;
    }

    @Override // defpackage.hua
    public final void d() {
        hm9.n(this.X, "onMaxFailCount: remove task, mark message as error");
        cqc.b(this.Z);
        cu8 cu8VarQ = n().q(this.c);
        if (cu8VarQ != null) {
            n().x(cu8VarQ, iu8.s0);
            l().c(this);
            r().d(this.b);
        }
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.LocationRequest locationRequest = new Tasks.LocationRequest();
        locationRequest.requestId = this.b;
        locationRequest.messageId = this.c;
        locationRequest.liveLocation = this.o;
        return qw8.toByteArray(locationRequest);
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.N0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.lr7
    public final void p1(er7 er7Var) {
        int i;
        String str = this.X;
        hm9.m(str, "onLocation: %s", er7Var);
        if (this.o) {
            z(er7Var);
            return;
        }
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        ((ri4) e8dVar.d.getValue()).getClass();
        if (SystemClock.elapsedRealtime() - this.Y > 30000) {
            hm9.n(str, "onLocation: accuracy timeout reached, use minRequiredAccuracy");
            i = HttpStatus.SC_MULTIPLE_CHOICES;
        } else {
            i = 30;
        }
        float f = i;
        float f2 = er7Var.o;
        if (f2 < f) {
            z(er7Var);
        } else {
            hm9.m(str, "onLocation: accuracy %f is not enough, continue listening for location updates", Float.valueOf(f2));
        }
    }

    @Override // defpackage.d8d
    public final void x() {
        hm9.n(this.X, "Process request location for message: " + this.c);
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        ((ri4) e8dVar.d.getValue()).getClass();
        this.Y = SystemClock.elapsedRealtime();
        l().b(this);
        cqc.b(this.Z);
        if (this.o) {
            return;
        }
        long j = 60000;
        r8d r8dVar = new r8d(this, 1);
        wd6 wd6Var = new wd6(26, this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ztc ztcVarA = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztcVarA, "scheduler is null");
        vz9 vz9Var = vz9.a;
        kj6 kj6Var = ft.e;
        sd7 sd7Var = new sd7(new p4c(13), wd6Var, ft.d);
        Objects.requireNonNull(sd7Var, "observer is null");
        try {
            nz9 nz9Var = new nz9(sd7Var, kj6Var, kj6Var, r8dVar);
            Objects.requireNonNull(nz9Var, "observer is null");
            try {
                vz9Var.a(new jz9(new y6d(nz9Var), j, timeUnit, ztcVarA.a()));
                this.Z = sd7Var;
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                c37.B(th);
                j47.Z(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th2) {
            c37.B(th2);
            j47.Z(th2);
            NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException2.initCause(th2);
            throw nullPointerException2;
        }
    }

    public final void y() {
        String str = this.X;
        hm9.n(str, "Reach max timeout");
        l().c(this);
        r().d(this.b);
        au8 au8VarN = n();
        long j = this.c;
        cu8 cu8VarQ = au8VarN.q(j);
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 == vx8.DELETED) {
                return;
            }
            l20 l20VarA = cu8VarQ.a(g20.x0);
            long j2 = cu8VarQ.t0;
            if (l20VarA == null) {
                hm9.p(str, "Reach max timeout: WTF, no location attach in message", null);
                au8 au8VarN2 = n();
                au8VarN2.getClass();
                au8VarN2.c(j2, Collections.singletonList(Long.valueOf(j)));
                t().c(new re9(j2, Collections.singletonList(Long.valueOf(j)), null));
                return;
            }
            n().x(cu8VarQ, iu8.s0);
            n().u(cu8VarQ, l20VarA.r, d20.b);
            t().c(new l6f(cu8VarQ.t0, this.c, 0));
            p82 p82VarB = b();
            if (p82VarB.k.contains(Long.valueOf(j2))) {
                return;
            }
            m().d(cu8VarQ.t0, cu8VarQ.o, this.c);
        }
    }

    public final void z(er7 er7Var) {
        hm9.m(this.X, "onSuccess: %s", er7Var);
        cqc.b(this.Z);
        l().c(this);
        w4d w4dVar = cqc.a;
        cqc.a(new p00(this, 10, er7Var), (ztc) w4dVar.b, null, new sy4(27, this), null);
    }
}
