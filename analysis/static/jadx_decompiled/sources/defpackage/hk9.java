package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* loaded from: classes2.dex */
public final class hk9 extends u2 implements ve8, ue8, slf {
    public final String X;
    public final we8 Y;
    public final long Z;
    public final FrgTrimVideo c;
    public final ad o;
    public long s0;
    public long t0;
    public long u0;
    public final xpb v0;
    public sd7 w0;
    public sd7 x0;
    public boolean y0;

    public hk9(nl9 nl9Var, FrgTrimVideo frgTrimVideo, ad adVar, String str, we8 we8Var, long j, long j2, boolean z) {
        super(0, nl9Var);
        this.v0 = new xpb();
        this.y0 = true;
        this.c = frgTrimVideo;
        this.o = adVar;
        this.X = str;
        this.Y = we8Var;
        this.s0 = j;
        this.t0 = j2;
        nl9Var.r(this);
        bq7 bq7Var = (bq7) we8Var;
        bq7Var.e = this;
        long jS = s36.s(frgTrimVideo.d0(), Uri.parse(str));
        this.Z = jS;
        bq7Var.s(new ee9(j, jS, Collections.singletonList(new ce9(0, str, 0, 0)), z), this);
        nl9Var.A(j, j, j2, jS);
        c2();
    }

    @Override // defpackage.ve8
    public final void D1(Throwable th) {
        int i = jpc.j3;
        FrgTrimVideo frgTrimVideo = this.c;
        Context contextD0 = frgTrimVideo.d0();
        if (contextD0 != null) {
            a14.N(0, contextD0, frgTrimVideo.h0(i));
        }
    }

    @Override // defpackage.slf
    public final void G(Surface surface) {
        ((bq7) this.Y).r(surface);
    }

    @Override // defpackage.slf
    public final int M0() {
        return ((bq7) this.Y).h();
    }

    @Override // defpackage.ve8
    public final void P(int i, int i2, int i3) {
        ((nl9) ((kk9) this.b)).t0.d();
    }

    @Override // defpackage.slf
    public final int R() {
        return ((bq7) this.Y).j();
    }

    @Override // defpackage.ve8
    public final void W0() {
        hm9.k("hk9", "onMediaPlayerControllerDetach");
    }

    public final void Z1() {
        if (this.w0 == null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ztc ztcVarA = ce.a();
            xpb xpbVar = this.v0;
            xpbVar.getClass();
            Objects.requireNonNull(timeUnit, "unit is null");
            r0a r0aVarN = new o1a(xpbVar, 300L, timeUnit, ztcVarA, false).n(ce.a());
            we8 we8Var = this.Y;
            Objects.requireNonNull(we8Var);
            yt8 yt8Var = new yt8(8, we8Var);
            kj6 kj6Var = ft.e;
            r66 r66Var = ft.d;
            sd7 sd7Var = new sd7(kj6Var, ft.f, r66Var);
            Objects.requireNonNull(sd7Var, "observer is null");
            try {
                r0aVarN.a(new nz9(sd7Var, yt8Var, kj6Var, r66Var));
                this.w0 = sd7Var;
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

    public final void a2() {
        pause();
        ((bq7) this.Y).q(this.s0);
        nl9 nl9Var = (nl9) ((kk9) this.b);
        nl9Var.y0.setPointerPosition(this.s0);
    }

    public final void b2() {
        cqc.b(this.w0);
        this.w0 = null;
    }

    @Override // defpackage.ue8
    public final void c1() {
    }

    public final void c2() {
        long j = this.s0;
        kk9 kk9Var = (kk9) this.b;
        if (j == 0 && this.t0 == this.Z) {
            ((nl9) kk9Var).B(false);
        } else {
            ((nl9) kk9Var).B(true);
        }
    }

    @Override // defpackage.slf
    public final void f1() {
    }

    @Override // defpackage.ve8
    public final void h() {
        nl9 nl9Var = (nl9) ((kk9) this.b);
        ((View) nl9Var.c).setKeepScreenOn(false);
        cqc.b(this.x0);
        this.x0 = null;
        nl9Var.u0.setVisibility(0);
        nl9Var.v0.setVisibility(4);
        nl9Var.C(true, ((bq7) this.Y).k());
    }

    @Override // defpackage.ve8
    public final void i() {
        nl9 nl9Var = (nl9) ((kk9) this.b);
        ((View) nl9Var.c).setKeepScreenOn(true);
        nl9Var.v0.setVisibility(0);
        nl9Var.u0.setVisibility(4);
    }

    @Override // defpackage.slf
    public final int i1() {
        return ((bq7) this.Y).i();
    }

    @Override // defpackage.slf
    public final int j() {
        fef fefVar = ((bq7) this.Y).f;
        if (fefVar == null) {
            return 0;
        }
        return fefVar.j();
    }

    @Override // defpackage.ve8
    public final void o() {
        a2();
    }

    @Override // defpackage.u2, defpackage.q3b
    public final void pause() {
        cqc.b(this.x0);
        this.x0 = null;
        ((bq7) this.Y).n();
    }
}
