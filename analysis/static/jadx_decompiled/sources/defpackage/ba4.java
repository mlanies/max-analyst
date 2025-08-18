package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ba4 implements tr4 {
    public final UUID b;
    public final av1 c;
    public final w36 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final imc i;
    public final huc j;
    public final fd7 k;
    public final long l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public t65 q;
    public x94 r;
    public x94 s;
    public Looper t;
    public Handler u;
    public int v;
    public byte[] w;
    public j4b x;
    public volatile cy y;

    public ba4(UUID uuid, w36 w36Var, HashMap map, boolean z, int[] iArr, boolean z2, huc hucVar, long j) {
        av1 av1Var = f36.Y;
        uuid.getClass();
        fm9.e("Use C.CLEARKEY_UUID instead", !ew0.b.equals(uuid));
        this.b = uuid;
        this.c = av1Var;
        this.d = w36Var;
        this.e = map;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = hucVar;
        this.i = new imc(15);
        this.k = new fd7(this);
        this.v = 0;
        this.m = new ArrayList();
        this.n = ngg.B();
        this.o = ngg.B();
        this.l = j;
    }

    public static boolean f(x94 x94Var) {
        x94Var.p();
        if (x94Var.p != 1) {
            return false;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionD = x94Var.d();
        drmSession$DrmSessionExceptionD.getClass();
        Throwable cause = drmSession$DrmSessionExceptionD.getCause();
        return (cause instanceof ResourceBusyException) || xfg.t(cause);
    }

    public static ArrayList i(dr4 dr4Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(dr4Var.o);
        for (int i = 0; i < dr4Var.o; i++) {
            br4 br4Var = dr4Var.a[i];
            if ((br4Var.a(uuid) || (ew0.c.equals(uuid) && br4Var.a(ew0.b))) && (br4Var.X != null || z)) {
                arrayList.add(br4Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.tr4
    public final fr4 a(lr4 lr4Var, qy5 qy5Var) {
        k(false);
        fm9.k(this.p > 0);
        fm9.l(this.t);
        return e(this.t, lr4Var, qy5Var, true);
    }

    @Override // defpackage.tr4
    public final rr4 b(lr4 lr4Var, qy5 qy5Var) {
        fm9.k(this.p > 0);
        fm9.l(this.t);
        z94 z94Var = new z94(this, lr4Var);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new wt1(z94Var, 20, qy5Var));
        return z94Var;
    }

    @Override // defpackage.tr4
    public final void c(Looper looper, j4b j4bVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    fm9.k(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.x = j4bVar;
    }

    @Override // defpackage.tr4
    public final int d(qy5 qy5Var) {
        String str;
        k(false);
        t65 t65Var = this.q;
        t65Var.getClass();
        int iO = t65Var.o();
        dr4 dr4Var = qy5Var.r;
        if (dr4Var == null) {
            int iG = ia9.g(qy5Var.n);
            int i = 0;
            while (true) {
                int[] iArr = this.g;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iG) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                return iO;
            }
            return 0;
        }
        if (this.w != null) {
            return iO;
        }
        UUID uuid = this.b;
        if (!i(dr4Var, uuid, true).isEmpty()) {
            str = dr4Var.c;
            if (str == null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    if (oaf.a >= 25) {
                        return iO;
                    }
                } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                    return iO;
                }
            }
        } else if (dr4Var.o == 1 && dr4Var.a[0].a(ew0.b)) {
            z04.c0("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
            str = dr4Var.c;
            return str == null ? iO : iO;
        }
        return 1;
    }

    public final fr4 e(Looper looper, lr4 lr4Var, qy5 qy5Var, boolean z) {
        ArrayList arrayListI;
        if (this.y == null) {
            this.y = new cy(this, looper, 5);
        }
        dr4 dr4Var = qy5Var.r;
        int i = 0;
        x94 x94VarH = null;
        if (dr4Var == null) {
            int iG = ia9.g(qy5Var.n);
            t65 t65Var = this.q;
            t65Var.getClass();
            if (t65Var.o() == 2 && b36.c) {
                return null;
            }
            int[] iArr = this.g;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iG) {
                    break;
                }
                i++;
            }
            if (i == -1 || t65Var.o() == 1) {
                return null;
            }
            x94 x94Var = this.r;
            if (x94Var == null) {
                ls5 ls5Var = zw6.b;
                x94 x94VarH2 = h(ffc.X, true, null, z);
                this.m.add(x94VarH2);
                this.r = x94VarH2;
            } else {
                x94Var.g(null);
            }
            return this.r;
        }
        if (this.w == null) {
            arrayListI = i(dr4Var, this.b, false);
            if (arrayListI.isEmpty()) {
                DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException("Media does not support uuid: " + this.b);
                z04.v("DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                if (lr4Var != null) {
                    lr4Var.e(defaultDrmSessionManager$MissingSchemeDataException);
                }
                return new g35(new DrmSession$DrmSessionException(defaultDrmSessionManager$MissingSchemeDataException, 6003));
            }
        } else {
            arrayListI = null;
        }
        if (this.f) {
            Iterator it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x94 x94Var2 = (x94) it.next();
                if (oaf.a(x94Var2.a, arrayListI)) {
                    x94VarH = x94Var2;
                    break;
                }
            }
        } else {
            x94VarH = this.s;
        }
        if (x94VarH == null) {
            x94VarH = h(arrayListI, false, lr4Var, z);
            if (!this.f) {
                this.s = x94VarH;
            }
            this.m.add(x94VarH);
        } else {
            x94VarH.g(lr4Var);
        }
        return x94VarH;
    }

    public final x94 g(List list, boolean z, lr4 lr4Var) {
        this.q.getClass();
        boolean z2 = this.h | z;
        t65 t65Var = this.q;
        int i = this.v;
        byte[] bArr = this.w;
        Looper looper = this.t;
        looper.getClass();
        j4b j4bVar = this.x;
        j4bVar.getClass();
        x94 x94Var = new x94(this.b, t65Var, this.i, this.k, list, i, z2, z, bArr, this.e, this.d, looper, this.j, j4bVar);
        x94Var.g(lr4Var);
        if (this.l != -9223372036854775807L) {
            x94Var.g(null);
        }
        return x94Var;
    }

    public final x94 h(List list, boolean z, lr4 lr4Var, boolean z2) {
        x94 x94VarG = g(list, z, lr4Var);
        boolean zF = f(x94VarG);
        long j = this.l;
        Set set = this.o;
        if (zF && !set.isEmpty()) {
            m5f it = jx6.j(set).iterator();
            while (it.hasNext()) {
                ((fr4) it.next()).f(null);
            }
            x94VarG.f(lr4Var);
            if (j != -9223372036854775807L) {
                x94VarG.f(null);
            }
            x94VarG = g(list, z, lr4Var);
        }
        if (!f(x94VarG) || !z2) {
            return x94VarG;
        }
        Set set2 = this.n;
        if (set2.isEmpty()) {
            return x94VarG;
        }
        m5f it2 = jx6.j(set2).iterator();
        while (it2.hasNext()) {
            ((z94) it2.next()).release();
        }
        if (!set.isEmpty()) {
            m5f it3 = jx6.j(set).iterator();
            while (it3.hasNext()) {
                ((fr4) it3.next()).f(null);
            }
        }
        x94VarG.f(lr4Var);
        if (j != -9223372036854775807L) {
            x94VarG.f(null);
        }
        return g(list, z, lr4Var);
    }

    public final void j() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            t65 t65Var = this.q;
            t65Var.getClass();
            t65Var.release();
            this.q = null;
        }
    }

    public final void k(boolean z) {
        if (z && this.t == null) {
            z04.d0("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            z04.d0("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.tr4
    public final void prepare() throws UnsupportedDrmException {
        t65 sp3Var;
        k(true);
        int i = this.p;
        this.p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            UUID uuid = this.b;
            getClass();
            try {
                try {
                    sp3Var = new f36(uuid, 1);
                } catch (UnsupportedDrmException unused) {
                    z04.u("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    sp3Var = new sp3();
                }
                this.q = sp3Var;
                sp3Var.x(new wd6(12, this));
                return;
            } catch (UnsupportedSchemeException e) {
                throw new UnsupportedDrmException(e);
            } catch (Exception e2) {
                throw new UnsupportedDrmException(e2);
            }
        }
        if (this.l == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((x94) arrayList.get(i2)).g(null);
            i2++;
        }
    }

    @Override // defpackage.tr4
    public final void release() {
        k(true);
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((x94) arrayList.get(i2)).f(null);
            }
        }
        m5f it = jx6.j(this.n).iterator();
        while (it.hasNext()) {
            ((z94) it.next()).release();
        }
        j();
    }
}
