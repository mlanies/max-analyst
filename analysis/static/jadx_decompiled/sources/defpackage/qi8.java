package defpackage;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class qi8 implements z66, nh8, tk6, dce {
    public Object X;
    public Object a;
    public Object b;
    public Object c;
    public long o;

    public static final List m(qi8 qi8Var, fk2 fk2Var, String str) {
        qi8Var.getClass();
        return l6d.i0(l6d.Z(new r1f(l6d.Z(new at(2, fk2Var.c), new rpc(12, qi8Var)), new k5d(qi8Var, str, 5)), new w8c(16)));
    }

    public static void n(ArrayList arrayList, List list) {
        String str = (String) l6d.c0(new r1f(l6d.Z(new at(2, list), new rpc()), new w8c(15)));
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = tpa.m(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() > 0) {
                arrayList.add(str);
            }
        }
    }

    public void A() {
        si8 si8Var = (si8) this.X;
        si8Var.S(si8Var.f.s);
    }

    public void B(int i) {
        bi8 bi8Var = ((si8) this.X).j;
        int iN = gf7.n(i);
        wh8 wh8Var = bi8Var.a;
        if (wh8Var.j != iN) {
            wh8Var.j = iN;
            synchronized (wh8Var.d) {
                for (int iBeginBroadcast = wh8Var.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((mr6) wh8Var.f.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(iN);
                    } catch (RemoteException unused) {
                    }
                }
                wh8Var.f.finishBroadcast();
            }
        }
    }

    public void C(boolean z) {
        bi8 bi8Var = ((si8) this.X).j;
        jx6 jx6Var = gf7.a;
        wh8 wh8Var = bi8Var.a;
        if (wh8Var.k != z) {
            wh8Var.k = z ? 1 : 0;
            synchronized (wh8Var.d) {
                for (int iBeginBroadcast = wh8Var.f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((mr6) wh8Var.f.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(z ? 1 : 0);
                    } catch (RemoteException unused) {
                    }
                }
                wh8Var.f.finishBroadcast();
            }
        }
    }

    public void D(mue mueVar) {
        F(mueVar);
        E();
    }

    public void E() {
        Bitmap bitmap;
        ib8 ib8Var;
        si8 si8Var = (si8) this.X;
        x4b x4bVar = si8Var.f.s;
        tb8 tb8VarW = x4bVar.W();
        gd8 gd8VarI0 = x4bVar.i0();
        long jC = -9223372036854775807L;
        if ((!x4bVar.t1(16) || !x4bVar.K1()) && x4bVar.t1(16)) {
            jC = x4bVar.c();
        }
        String str = tb8VarW != null ? tb8VarW.a : "";
        Uri uri = (tb8VarW == null || (ib8Var = tb8VarW.b) == null) ? null : ib8Var.a;
        if (Objects.equals((gd8) this.a, gd8VarI0) && Objects.equals((String) this.b, str) && Objects.equals((Uri) this.c, uri) && this.o == jC) {
            return;
        }
        this.b = str;
        this.c = uri;
        this.a = gd8VarI0;
        this.o = jC;
        ii8 ii8Var = si8Var.f;
        bm7 bm7VarV = ii8Var.m.v(gd8VarI0);
        if (bm7VarV != null) {
            si8Var.o = null;
            if (bm7VarV.isDone()) {
                try {
                    bitmap = (Bitmap) fm9.C(bm7VarV);
                } catch (CancellationException | ExecutionException e) {
                    z04.c0("Failed to load bitmap: " + e.getMessage());
                }
            } else {
                qi8 qi8Var = new qi8();
                qi8Var.X = this;
                qi8Var.a = gd8VarI0;
                qi8Var.b = str;
                qi8Var.c = uri;
                qi8Var.o = jC;
                si8Var.o = qi8Var;
                Handler handler = ii8Var.l;
                Objects.requireNonNull(handler);
                bm7VarV.d(new h76(bm7VarV, 0, qi8Var), new a84(handler, 0));
            }
            bitmap = null;
        } else {
            bitmap = null;
        }
        si8.J(si8Var.j, gf7.l(gd8VarI0, str, uri, jC, bitmap));
    }

    public void F(mue mueVar) {
        si8 si8Var = (si8) this.X;
        x4b x4bVar = si8Var.f.s;
        if (!(x4bVar.X.a(17) && x4bVar.s().a(17)) || mueVar.q()) {
            si8.L(si8Var.j, null);
            return;
        }
        jx6 jx6Var = gf7.a;
        ArrayList arrayList = new ArrayList();
        kue kueVar = new kue();
        for (int i = 0; i < mueVar.p(); i++) {
            arrayList.add(mueVar.n(i, kueVar, 0L).c);
        }
        ArrayList arrayList2 = new ArrayList();
        vq1 vq1Var = new vq1(this, new AtomicInteger(0), arrayList, arrayList2, mueVar, 5);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr = ((tb8) arrayList.get(i2)).d.k;
            if (bArr == null) {
                arrayList2.add(null);
                vq1Var.run();
            } else {
                ii8 ii8Var = si8Var.f;
                bm7 bm7VarB = ii8Var.m.B(bArr);
                arrayList2.add(bm7VarB);
                Handler handler = ii8Var.l;
                Objects.requireNonNull(handler);
                bm7VarB.d(vq1Var, new a84(handler, 0));
            }
        }
    }

    @Override // defpackage.z66
    public void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        qi8 qi8Var = (qi8) this.X;
        si8 si8Var = (si8) qi8Var.X;
        if (this != si8Var.o) {
            return;
        }
        si8.J(si8Var.j, gf7.l((gd8) this.a, (String) this.b, (Uri) this.c, this.o, bitmap));
        ii8 ii8Var = ((si8) qi8Var.X).f;
        oaf.W(ii8Var.o, new ci8(ii8Var, 1));
    }

    @Override // defpackage.dce
    public List c() {
        return (List) ((k4a) ((pk) this.a)).K(new au(this.o, "MEMBER", 0L, 100, (String) null), (ztc) this.c).h(new gd1(21, this)).e();
    }

    @Override // defpackage.z66
    public void d(Throwable th) {
        if (this != ((si8) ((qi8) this.X).X).o) {
            return;
        }
        z04.c0("Failed to load bitmap: " + th.getMessage());
    }

    @Override // defpackage.dce
    public List g(String str) {
        return (List) new frd(((k4a) ((pk) this.a)).K(new au(this.o, "MEMBER", 0L, 100, str == null ? null : (str.length() <= 1 || str.charAt(0) != '@') ? str : str.substring(1)), (ztc) this.c).h(new aab(this, str)), null, nz4.a).e();
    }

    @Override // defpackage.nh8
    public void h(int i, k3b k3bVar) {
        si8 si8Var = (si8) this.X;
        x4b x4bVar = si8Var.f.s;
        si8.K(si8Var, x4bVar);
        si8Var.S(x4bVar);
    }

    @Override // defpackage.tk6
    public sk6 i() {
        int iOrdinal = ((mg4) this.a).ordinal();
        if (iOrdinal == 0) {
            return (h8a) ((khe) this.c).getValue();
        }
        if (iOrdinal == 1) {
            return (f8a) ((khe) this.X).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.nh8
    public void k(int i, qad qadVar, boolean z, boolean z2, int i2) {
        si8 si8Var = (si8) this.X;
        si8Var.S(si8Var.f.s);
    }

    @Override // defpackage.dce
    public List l(LinkedHashSet linkedHashSet) {
        if (Looper.getMainLooper().isCurrentThread()) {
            hm9.l0("SuggestContactsNetworkRepository", "Load contacts was called from the main thread.", new IllegalStateException("Load contacts was called from the main thread."));
        }
        return (List) j47.f0(hz4.a, new cce(this, linkedHashSet, null));
    }

    public void o(h30 h30Var) {
        si8 si8Var = (si8) this.X;
        if (si8Var.f.s.I().a == 0) {
            int iW = gf7.w(h30Var);
            wh8 wh8Var = si8Var.j.a;
            wh8Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(iW);
            wh8Var.a.setPlaybackToLocal(builder.build());
        }
    }

    @Override // defpackage.nh8
    public void onDisconnected() {
    }

    public void p() {
        int i;
        v4b v4bVar;
        si8 si8Var = (si8) this.X;
        x4b x4bVar = si8Var.f.s;
        if (x4bVar.I().a == 0) {
            v4bVar = null;
        } else {
            k3b k3bVarS = x4bVar.s();
            if (k3bVarS.a.a(26, 34)) {
                i = k3bVarS.a.a(25, 33) ? 2 : 1;
            } else {
                i = 0;
            }
            Handler handler = new Handler(x4bVar.a.z1());
            int iL = x4bVar.t1(23) ? x4bVar.l() : 0;
            ui4 ui4VarI = x4bVar.I();
            v4bVar = new v4b(x4bVar, i, ui4VarI.c, iL, ui4VarI.d, handler);
        }
        si8Var.m = v4bVar;
        bi8 bi8Var = si8Var.j;
        if (v4bVar != null) {
            wh8 wh8Var = bi8Var.a;
            wh8Var.getClass();
            wh8Var.a.setPlaybackToRemote(v4bVar.a());
        } else {
            int iW = gf7.w(x4bVar.t1(21) ? x4bVar.F() : h30.g);
            wh8 wh8Var2 = bi8Var.a;
            wh8Var2.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(iW);
            wh8Var2.a.setPlaybackToLocal(builder.build());
        }
    }

    public void q(int i, boolean z) {
        v4b v4bVar = ((si8) this.X).m;
        if (v4bVar != null) {
            if (z) {
                i = 0;
            }
            v4bVar.d = i;
            sqf.a(v4bVar.a(), i);
        }
    }

    public void r() {
        si8 si8Var = (si8) this.X;
        si8Var.S(si8Var.f.s);
    }

    public void s(tb8 tb8Var) {
        E();
        si8 si8Var = (si8) this.X;
        if (tb8Var == null) {
            si8Var.j.a.a.setRatingType(0);
        } else {
            bi8 bi8Var = si8Var.j;
            bi8Var.a.a.setRatingType(gf7.x(tb8Var.d.i));
        }
        si8Var.S(si8Var.f.s);
    }

    public void t() {
        si8 si8Var = (si8) this.X;
        si8Var.S(si8Var.f.s);
    }

    public void u() {
        si8 si8Var = (si8) this.X;
        si8Var.S(si8Var.f.s);
    }

    public void v() {
        si8 si8Var = (si8) this.X;
        si8Var.S(si8Var.f.s);
    }

    public void w() {
        si8 si8Var = (si8) this.X;
        si8Var.S(si8Var.f.s);
    }

    public void x(int i, x4b x4bVar) {
        D(x4bVar.c0());
        z(x4bVar.t1(18) ? x4bVar.k0() : gd8.J);
        x4bVar.i0();
        E();
        C(x4bVar.E0());
        B(x4bVar.getRepeatMode());
        x4bVar.I();
        p();
        si8.K((si8) this.X, x4bVar);
        s(x4bVar.W());
    }

    public void y() {
        si8 si8Var = (si8) this.X;
        si8Var.S(si8Var.f.s);
    }

    public void z(gd8 gd8Var) {
        si8 si8Var = (si8) this.X;
        CharSequence queueTitle = ((e98) si8Var.j.b.b).a.getQueueTitle();
        CharSequence charSequence = gd8Var.a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        x4b x4bVar = si8Var.f.s;
        if (!x4bVar.X.a(17) || !x4bVar.s().a(17)) {
            charSequence = null;
        }
        si8Var.j.a.a.setQueueTitle(charSequence);
    }
}
