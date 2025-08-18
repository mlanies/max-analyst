package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class aa4 implements sr4 {
    public final UUID b;
    public final av1 c;
    public final w36 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final h7b i;
    public final buc j;
    public final re6 k;
    public final long l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public s65 q;
    public w94 r;
    public w94 s;
    public Looper t;
    public Handler u;
    public int v;
    public byte[] w;
    public i4b x;
    public volatile cy y;

    public aa4(UUID uuid, w36 w36Var, HashMap map, boolean z, int[] iArr, boolean z2, buc bucVar, long j) {
        av1 av1Var = f36.X;
        uuid.getClass();
        np8.c("Use C.CLEARKEY_UUID instead", !bw0.b.equals(uuid));
        this.b = uuid;
        this.c = av1Var;
        this.d = w36Var;
        this.e = map;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = bucVar;
        this.i = new h7b(15);
        this.k = new re6(12, this);
        this.v = 0;
        this.m = new ArrayList();
        this.n = ngg.B();
        this.o = ngg.B();
        this.l = j;
    }

    public static boolean f(w94 w94Var) {
        if (w94Var.o == 1) {
            if (maf.a < 19) {
                return true;
            }
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionD = w94Var.d();
            drmSession$DrmSessionExceptionD.getClass();
            if (drmSession$DrmSessionExceptionD.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList i(cr4 cr4Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(cr4Var.o);
        for (int i = 0; i < cr4Var.o; i++) {
            ar4 ar4Var = cr4Var.a[i];
            if ((ar4Var.a(uuid) || (bw0.c.equals(uuid) && ar4Var.a(bw0.b))) && (ar4Var.X != null || z)) {
                arrayList.add(ar4Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.sr4
    public final er4 a(kr4 kr4Var, oy5 oy5Var) {
        np8.f(this.p > 0);
        np8.g(this.t);
        return e(this.t, kr4Var, oy5Var, true);
    }

    @Override // defpackage.sr4
    public final int b(oy5 oy5Var) {
        String str;
        s65 s65Var = this.q;
        s65Var.getClass();
        int iO = s65Var.o();
        cr4 cr4Var = oy5Var.z0;
        if (cr4Var == null) {
            int iG = ha9.g(oy5Var.w0);
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
        if (!i(cr4Var, uuid, true).isEmpty()) {
            str = cr4Var.c;
            if (str == null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    if (maf.a >= 25) {
                        return iO;
                    }
                } else if (!"cbc1".equals(str) && !"cens".equals(str)) {
                    return iO;
                }
            }
        } else if (cr4Var.o == 1 && cr4Var.a[0].a(bw0.b)) {
            new StringBuilder(String.valueOf(uuid).length() + 72);
            str = cr4Var.c;
            return str == null ? iO : iO;
        }
        return 1;
    }

    @Override // defpackage.sr4
    public final void c(Looper looper, i4b i4bVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    np8.f(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.x = i4bVar;
    }

    @Override // defpackage.sr4
    public final qr4 d(kr4 kr4Var, oy5 oy5Var) {
        np8.f(this.p > 0);
        np8.g(this.t);
        y94 y94Var = new y94(this, kr4Var);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new wt1(y94Var, 19, oy5Var));
        return y94Var;
    }

    public final er4 e(Looper looper, kr4 kr4Var, oy5 oy5Var, boolean z) {
        ArrayList arrayListI;
        if (this.y == null) {
            this.y = new cy(this, looper, 4);
        }
        cr4 cr4Var = oy5Var.z0;
        int i = 0;
        w94 w94VarH = null;
        if (cr4Var == null) {
            int iG = ha9.g(oy5Var.w0);
            s65 s65Var = this.q;
            s65Var.getClass();
            if (s65Var.o() == 2 && a36.d) {
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
            if (i == -1 || s65Var.o() == 1) {
                return null;
            }
            w94 w94Var = this.r;
            if (w94Var == null) {
                ls5 ls5Var = zw6.b;
                w94 w94VarH2 = h(ffc.X, true, null, z);
                this.m.add(w94VarH2);
                this.r = w94VarH2;
            } else {
                w94Var.g(null);
            }
            return this.r;
        }
        if (this.w == null) {
            arrayListI = i(cr4Var, this.b, false);
            if (arrayListI.isEmpty()) {
                String strValueOf = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
                sb.append("Media does not support uuid: ");
                sb.append(strValueOf);
                DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException(sb.toString());
                fm9.c("DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                if (kr4Var != null) {
                    kr4Var.e(defaultDrmSessionManager$MissingSchemeDataException);
                }
                return new f35(new DrmSession$DrmSessionException(defaultDrmSessionManager$MissingSchemeDataException, 6003));
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
                w94 w94Var2 = (w94) it.next();
                if (maf.a(w94Var2.a, arrayListI)) {
                    w94VarH = w94Var2;
                    break;
                }
            }
        } else {
            w94VarH = this.s;
        }
        if (w94VarH == null) {
            w94VarH = h(arrayListI, false, kr4Var, z);
            if (!this.f) {
                this.s = w94VarH;
            }
            this.m.add(w94VarH);
        } else {
            w94VarH.g(kr4Var);
        }
        return w94VarH;
    }

    public final w94 g(List list, boolean z, kr4 kr4Var) {
        this.q.getClass();
        boolean z2 = this.h | z;
        s65 s65Var = this.q;
        int i = this.v;
        byte[] bArr = this.w;
        Looper looper = this.t;
        looper.getClass();
        i4b i4bVar = this.x;
        i4bVar.getClass();
        w94 w94Var = new w94(this.b, s65Var, this.i, this.k, list, i, z2, z, bArr, this.e, this.d, looper, this.j, i4bVar);
        w94Var.g(kr4Var);
        if (this.l != -9223372036854775807L) {
            w94Var.g(null);
        }
        return w94Var;
    }

    public final w94 h(List list, boolean z, kr4 kr4Var, boolean z2) {
        w94 w94VarG = g(list, z, kr4Var);
        boolean zF = f(w94VarG);
        long j = this.l;
        Set set = this.o;
        if (zF && !set.isEmpty()) {
            m5f it = jx6.j(set).iterator();
            while (it.hasNext()) {
                ((er4) it.next()).f(null);
            }
            w94VarG.f(kr4Var);
            if (j != -9223372036854775807L) {
                w94VarG.f(null);
            }
            w94VarG = g(list, z, kr4Var);
        }
        if (!f(w94VarG) || !z2) {
            return w94VarG;
        }
        Set set2 = this.n;
        if (set2.isEmpty()) {
            return w94VarG;
        }
        m5f it2 = jx6.j(set2).iterator();
        while (it2.hasNext()) {
            ((y94) it2.next()).release();
        }
        if (!set.isEmpty()) {
            m5f it3 = jx6.j(set).iterator();
            while (it3.hasNext()) {
                ((er4) it3.next()).f(null);
            }
        }
        w94VarG.f(kr4Var);
        if (j != -9223372036854775807L) {
            w94VarG.f(null);
        }
        return g(list, z, kr4Var);
    }

    public final void j() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            s65 s65Var = this.q;
            s65Var.getClass();
            s65Var.release();
            this.q = null;
        }
    }

    @Override // defpackage.sr4
    public final void prepare() throws UnsupportedDrmException {
        s65 dp3Var;
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
                    try {
                        dp3Var = new f36(uuid, 0);
                    } catch (Exception e) {
                        throw new UnsupportedDrmException(e);
                    }
                } catch (UnsupportedSchemeException e2) {
                    throw new UnsupportedDrmException(e2);
                }
            } catch (UnsupportedDrmException unused) {
                new StringBuilder(String.valueOf(uuid).length() + 53);
                dp3Var = new dp3();
            }
            this.q = dp3Var;
            dp3Var.p(new sy4(12, this));
            return;
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
            ((w94) arrayList.get(i2)).g(null);
            i2++;
        }
    }

    @Override // defpackage.sr4
    public final void release() {
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((w94) arrayList.get(i2)).f(null);
            }
        }
        m5f it = jx6.j(this.n).iterator();
        while (it.hasNext()) {
            ((y94) it.next()).release();
        }
        j();
    }
}
