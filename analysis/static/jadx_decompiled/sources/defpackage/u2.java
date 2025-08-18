package defpackage;

import android.media.MediaCodecInfo;
import android.view.View;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class u2 implements jo, q3b, s7c {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.q3b
    public long A() {
        u75 u75Var = (u75) this;
        mue mueVarX0 = u75Var.x0();
        if (mueVarX0.q()) {
            return -9223372036854775807L;
        }
        return oaf.h0(mueVarX0.n(u75Var.p0(), (kue) this.b, 0L).m);
    }

    @Override // defpackage.q3b
    public void A0(int i, tb8 tb8Var) {
        u75 u75Var = (u75) this;
        u75Var.s0(zw6.n(tb8Var), i, i + 1);
    }

    public abstract int B();

    @Override // defpackage.q3b
    public void C0(tb8 tb8Var) {
        ((u75) this).O0(zw6.n(tb8Var));
    }

    @Override // defpackage.q3b
    public void D() {
        Y1(6);
    }

    @Override // defpackage.q3b
    public void E() {
        V1(((u75) this).p0(), -9223372036854775807L, false);
    }

    @Override // defpackage.jo
    public void G1(int i, float f) {
    }

    @Override // defpackage.q3b
    public void J0() {
        int iE;
        u75 u75Var = (u75) this;
        if (u75Var.x0().q() || u75Var.n()) {
            S1();
            return;
        }
        if (!j0()) {
            if (K1() && y1()) {
                V1(u75Var.p0(), -9223372036854775807L, false);
                return;
            } else {
                S1();
                return;
            }
        }
        mue mueVarX0 = u75Var.x0();
        if (mueVarX0.q()) {
            iE = -1;
        } else {
            int iP0 = u75Var.p0();
            u75Var.w2();
            int i = u75Var.R0;
            if (i == 1) {
                i = 0;
            }
            u75Var.w2();
            iE = mueVarX0.e(iP0, i, u75Var.S0);
        }
        if (iE == -1) {
            S1();
        } else if (iE == u75Var.p0()) {
            V1(u75Var.p0(), -9223372036854775807L, true);
        } else {
            V1(iE, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.q3b
    public void K0() {
        u75 u75Var = (u75) this;
        u75Var.w2();
        X1(12, u75Var.H0);
    }

    @Override // defpackage.q3b
    public boolean K1() {
        u75 u75Var = (u75) this;
        mue mueVarX0 = u75Var.x0();
        return !mueVarX0.q() && mueVarX0.n(u75Var.p0(), (kue) this.b, 0L).a();
    }

    @Override // defpackage.q3b
    public void L0() {
        u75 u75Var = (u75) this;
        u75Var.w2();
        X1(11, -u75Var.G0);
    }

    public abstract void L1(Object obj, Object obj2);

    @Override // defpackage.q3b
    public boolean M() {
        int iL;
        u75 u75Var = (u75) this;
        mue mueVarX0 = u75Var.x0();
        if (mueVarX0.q()) {
            iL = -1;
        } else {
            int iP0 = u75Var.p0();
            u75Var.w2();
            int i = u75Var.R0;
            if (i == 1) {
                i = 0;
            }
            u75Var.w2();
            iL = mueVarX0.l(iP0, i, u75Var.S0);
        }
        return iL != -1;
    }

    public void M1(u2 u2Var) {
        ((BitSet) this.b).or((BitSet) u2Var.b);
    }

    public abstract boolean N1();

    public abstract int O();

    public abstract lue O1();

    public f64 P1() {
        return (f64) ((je7) this.b).getValue();
    }

    public abstract void Q1();

    @Override // defpackage.q3b
    public tb8 R0() {
        u75 u75Var = (u75) this;
        mue mueVarX0 = u75Var.x0();
        if (mueVarX0.q()) {
            return null;
        }
        return mueVarX0.n(u75Var.p0(), (kue) this.b, 0L).c;
    }

    public void R1(c64 c64Var) {
        P1().b(c64Var.b, null);
    }

    @Override // defpackage.q3b
    public void S(int i) {
        ((u75) this).U(i, i + 1);
    }

    public void S1() {
        ((u75) this).w2();
    }

    @Override // defpackage.q7c
    public Object T0(Object obj, bc7 bc7Var) {
        return this.b;
    }

    public boolean T1(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        yoe yoeVar = (yoe) this.b;
        if (yoeVar == null) {
            return N1();
        }
        int iB = yoeVar.b(i, charSequence);
        if (iB == 0) {
            return true;
        }
        if (iB != 1) {
            return N1();
        }
        return false;
    }

    public boolean U1() {
        int i;
        ovd ovdVar = (ovd) this.b;
        View view = ovdVar.c.U0;
        if (view != null) {
            i = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(zr6.h(visibility, "Unknown visibility "));
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        int i2 = ovdVar.a;
        return i == i2 || !(i == 2 || i2 == 2);
    }

    @Override // defpackage.q3b
    public void V() {
        u75 u75Var = (u75) this;
        if (u75Var.x0().q() || u75Var.n()) {
            S1();
            return;
        }
        boolean zM = M();
        if (K1() && !n1()) {
            if (zM) {
                Y1(7);
                return;
            } else {
                S1();
                return;
            }
        }
        if (zM) {
            long jK = u75Var.k();
            u75Var.w2();
            if (jK <= u75Var.I0) {
                Y1(7);
                return;
            }
        }
        W1(7, 0L);
    }

    public abstract void V1(int i, long j, boolean z);

    public void W1(int i, long j) {
        V1(((u75) this).p0(), j, false);
    }

    public void X1(int i, long j) {
        u75 u75Var = (u75) this;
        long jK = u75Var.k() + j;
        long jC = u75Var.c();
        if (jC != -9223372036854775807L) {
            jK = Math.min(jK, jC);
        }
        W1(i, Math.max(jK, 0L));
    }

    public void Y1(int i) {
        int iL;
        u75 u75Var = (u75) this;
        mue mueVarX0 = u75Var.x0();
        if (mueVarX0.q()) {
            iL = -1;
        } else {
            int iP0 = u75Var.p0();
            u75Var.w2();
            int i2 = u75Var.R0;
            if (i2 == 1) {
                i2 = 0;
            }
            u75Var.w2();
            iL = mueVarX0.l(iP0, i2, u75Var.S0);
        }
        if (iL == -1) {
            S1();
        } else if (iL == u75Var.p0()) {
            V1(u75Var.p0(), -9223372036854775807L, true);
        } else {
            V1(iL, -9223372036854775807L, false);
        }
    }

    @Override // defpackage.q3b
    public void Z(int i) {
        V1(i, -9223372036854775807L, false);
    }

    public boolean b() {
        u75 u75Var = (u75) this;
        return u75Var.getPlaybackState() == 3 && u75Var.u() && u75Var.v0() == 0;
    }

    public abstract long b0();

    @Override // defpackage.q3b
    public void f0() {
        int iE;
        u75 u75Var = (u75) this;
        mue mueVarX0 = u75Var.x0();
        if (mueVarX0.q()) {
            iE = -1;
        } else {
            int iP0 = u75Var.p0();
            u75Var.w2();
            int i = u75Var.R0;
            if (i == 1) {
                i = 0;
            }
            u75Var.w2();
            iE = mueVarX0.e(iP0, i, u75Var.S0);
        }
        if (iE == -1) {
            S1();
        } else if (iE == u75Var.p0()) {
            V1(u75Var.p0(), -9223372036854775807L, true);
        } else {
            V1(iE, -9223372036854775807L, false);
        }
    }

    public abstract int getRepeatMode();

    @Override // defpackage.q3b
    public boolean j0() {
        int iE;
        u75 u75Var = (u75) this;
        mue mueVarX0 = u75Var.x0();
        if (mueVarX0.q()) {
            iE = -1;
        } else {
            int iP0 = u75Var.p0();
            u75Var.w2();
            int i = u75Var.R0;
            if (i == 1) {
                i = 0;
            }
            u75Var.w2();
            iE = mueVarX0.e(iP0, i, u75Var.S0);
        }
        return iE != -1;
    }

    public abstract long k();

    public abstract boolean n();

    @Override // defpackage.q3b
    public boolean n1() {
        u75 u75Var = (u75) this;
        mue mueVarX0 = u75Var.x0();
        return !mueVarX0.q() && mueVarX0.n(u75Var.p0(), (kue) this.b, 0L).h;
    }

    public abstract int o0();

    @Override // defpackage.s7c
    public void o1(Object obj, bc7 bc7Var, Object obj2) {
        Object obj3 = this.b;
        this.b = obj2;
        L1(obj3, obj2);
    }

    @Override // defpackage.q3b
    public long p() {
        u75 u75Var = (u75) this;
        mue mueVarX0 = u75Var.x0();
        if (mueVarX0.q()) {
            return -9223372036854775807L;
        }
        int iP0 = u75Var.p0();
        kue kueVar = (kue) this.b;
        if (mueVarX0.n(iP0, kueVar, 0L).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (oaf.B(kueVar.g) - kueVar.f) - u75Var.b0();
    }

    public abstract int p0();

    public void pause() {
        ((u75) this).Y(false);
    }

    @Override // defpackage.q3b
    public void play() {
        ((u75) this).Y(true);
    }

    public abstract long q();

    public void r(int i, long j) {
        V1(i, j, false);
    }

    @Override // defpackage.q3b
    public void seekTo(long j) {
        W1(5, j);
    }

    @Override // defpackage.q3b
    public void setPlaybackSpeed(float f) {
        u75 u75Var = (u75) this;
        u75Var.f(new c3b(f, u75Var.d().b));
    }

    @Override // defpackage.q3b
    public void t(tb8 tb8Var, long j) {
        ((u75) this).H0(0, j, zw6.n(tb8Var));
    }

    @Override // defpackage.q3b
    public void t0(int i, int i2) {
        if (i != i2) {
            ((u75) this).u0(i, i + 1, i2);
        }
    }

    @Override // defpackage.q3b
    public boolean t1(int i) {
        u75 u75Var = (u75) this;
        u75Var.w2();
        return u75Var.X0.a(i);
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return "ObservableProperty(value=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.q3b
    public void v() {
        ((u75) this).U(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.q3b
    public void w0(List list) {
        ((u75) this).d0(Integer.MAX_VALUE, list);
    }

    @Override // defpackage.q3b
    public int x() {
        u75 u75Var = (u75) this;
        long jE0 = u75Var.e0();
        long jC = u75Var.c();
        if (jE0 == -9223372036854775807L || jC == -9223372036854775807L) {
            return 0;
        }
        if (jC == 0) {
            return 100;
        }
        return oaf.j((int) ((jE0 * 100) / jC), 0, 100);
    }

    @Override // defpackage.q3b
    public boolean y1() {
        u75 u75Var = (u75) this;
        mue mueVarX0 = u75Var.x0();
        return !mueVarX0.q() && mueVarX0.n(u75Var.p0(), (kue) this.b, 0L).i;
    }

    public u2(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new kue();
                break;
            case 4:
            case 5:
            default:
                this.b = new jue();
                break;
            case 6:
                this.b = new ArrayList();
                break;
            case 7:
                this.b = new BitSet(20);
                break;
            case 8:
                this.b = g64.a.getAccessor().d(f64.class);
                break;
        }
    }

    public u2(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        this.a = 5;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.b = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(wg0.i("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }
}
