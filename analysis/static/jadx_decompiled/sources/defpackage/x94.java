package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class x94 implements fr4 {
    public final List a;
    public final t65 b;
    public final imc c;
    public final fd7 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final ex3 i;
    public final huc j;
    public final j4b k;
    public final w36 l;
    public final UUID m;
    public final Looper n;
    public final cy o;
    public int p;
    public int q;
    public HandlerThread r;
    public t94 s;
    public qz3 t;
    public DrmSession$DrmSessionException u;
    public byte[] v;
    public byte[] w;
    public p65 x;
    public r65 y;

    public x94(UUID uuid, t65 t65Var, imc imcVar, fd7 fd7Var, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap map, w36 w36Var, Looper looper, huc hucVar, j4b j4bVar) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = imcVar;
        this.d = fd7Var;
        this.b = t65Var;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = map;
        this.l = w36Var;
        this.i = new ex3(1);
        this.j = hucVar;
        this.k = j4bVar;
        this.p = 2;
        this.n = looper;
        this.o = new cy(this, looper, 3);
    }

    @Override // defpackage.fr4
    public final UUID a() {
        p();
        return this.m;
    }

    @Override // defpackage.fr4
    public final boolean b() {
        p();
        return this.f;
    }

    @Override // defpackage.fr4
    public final boolean c(String str) {
        p();
        byte[] bArr = this.v;
        fm9.l(bArr);
        return this.b.i(bArr, str);
    }

    @Override // defpackage.fr4
    public final DrmSession$DrmSessionException d() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // defpackage.fr4
    public final qz3 e() {
        p();
        return this.t;
    }

    @Override // defpackage.fr4
    public final void f(lr4 lr4Var) {
        p();
        int i = this.q;
        if (i <= 0) {
            z04.u("release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = 0;
            cy cyVar = this.o;
            int i3 = oaf.a;
            cyVar.removeCallbacksAndMessages(null);
            t94 t94Var = this.s;
            synchronized (t94Var) {
                t94Var.removeCallbacksAndMessages(null);
                t94Var.b = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.k(bArr);
                this.v = null;
            }
        }
        if (lr4Var != null) {
            ex3 ex3Var = this.i;
            synchronized (ex3Var.b) {
                try {
                    Integer num = (Integer) ex3Var.c.get(lr4Var);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(ex3Var.X);
                        arrayList.remove(lr4Var);
                        ex3Var.X = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            ex3Var.c.remove(lr4Var);
                            HashSet hashSet = new HashSet(ex3Var.o);
                            hashSet.remove(lr4Var);
                            ex3Var.o = Collections.unmodifiableSet(hashSet);
                        } else {
                            ex3Var.c.put(lr4Var, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.i.a(lr4Var) == 0) {
                lr4Var.f();
            }
        }
        fd7 fd7Var = this.d;
        int i4 = this.q;
        ba4 ba4Var = (ba4) fd7Var.a;
        if (i4 == 1 && ba4Var.p > 0 && ba4Var.l != -9223372036854775807L) {
            ba4Var.o.add(this);
            Handler handler = ba4Var.u;
            handler.getClass();
            handler.postAtTime(new cu1(29, this), this, SystemClock.uptimeMillis() + ba4Var.l);
        } else if (i4 == 0) {
            ba4Var.m.remove(this);
            if (ba4Var.r == this) {
                ba4Var.r = null;
            }
            if (ba4Var.s == this) {
                ba4Var.s = null;
            }
            imc imcVar = ba4Var.i;
            HashSet hashSet2 = (HashSet) imcVar.b;
            hashSet2.remove(this);
            if (((x94) imcVar.c) == this) {
                imcVar.c = null;
                if (!hashSet2.isEmpty()) {
                    x94 x94Var = (x94) hashSet2.iterator().next();
                    imcVar.c = x94Var;
                    r65 r65VarMo2d = x94Var.b.mo2d();
                    x94Var.y = r65VarMo2d;
                    t94 t94Var2 = x94Var.s;
                    int i5 = oaf.a;
                    r65VarMo2d.getClass();
                    t94Var2.getClass();
                    t94Var2.obtainMessage(1, new v94(yn7.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), r65VarMo2d)).sendToTarget();
                }
            }
            if (ba4Var.l != -9223372036854775807L) {
                Handler handler2 = ba4Var.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                ba4Var.o.remove(this);
            }
        }
        ba4Var.j();
    }

    @Override // defpackage.fr4
    public final void g(lr4 lr4Var) {
        p();
        if (this.q < 0) {
            z04.u("Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (lr4Var != null) {
            ex3 ex3Var = this.i;
            synchronized (ex3Var.b) {
                try {
                    ArrayList arrayList = new ArrayList(ex3Var.X);
                    arrayList.add(lr4Var);
                    ex3Var.X = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) ex3Var.c.get(lr4Var);
                    if (num == null) {
                        HashSet hashSet = new HashSet(ex3Var.o);
                        hashSet.add(lr4Var);
                        ex3Var.o = Collections.unmodifiableSet(hashSet);
                    }
                    ex3Var.c.put(lr4Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            fm9.k(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new t94(this, this.r.getLooper(), 1);
            if (l()) {
                h(true);
            }
        } else if (lr4Var != null && i() && this.i.a(lr4Var) == 1) {
            lr4Var.d(this.p);
        }
        ba4 ba4Var = (ba4) this.d.a;
        if (ba4Var.l != -9223372036854775807L) {
            ba4Var.o.remove(this);
            Handler handler = ba4Var.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.fr4
    public final int getState() {
        p();
        return this.p;
    }

    public final void h(boolean z) {
        Pair pair;
        String str;
        long jMin;
        Set set;
        if (this.g) {
            return;
        }
        byte[] bArr = this.v;
        int i = oaf.a;
        int i2 = this.e;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                if (this.w == null || o()) {
                    m(2, bArr, z);
                    return;
                }
                return;
            }
            if (i2 != 3) {
                return;
            }
            this.w.getClass();
            this.v.getClass();
            m(3, this.w, z);
            return;
        }
        if (this.w == null) {
            m(1, bArr, z);
            return;
        }
        if (this.p == 4 || o()) {
            if (ew0.d.equals(this.m)) {
                Map mapN = n();
                if (mapN == null) {
                    pair = null;
                } else {
                    long j = -9223372036854775807L;
                    try {
                        str = (String) mapN.get("LicenseDurationRemaining");
                    } catch (NumberFormatException unused) {
                    }
                    long j2 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                    Long lValueOf = Long.valueOf(j2);
                    try {
                        String str2 = (String) mapN.get("PlaybackDurationRemaining");
                        if (str2 != null) {
                            j = Long.parseLong(str2);
                        }
                    } catch (NumberFormatException unused2) {
                    }
                    pair = new Pair(lValueOf, Long.valueOf(j));
                }
                pair.getClass();
                jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                jMin = Long.MAX_VALUE;
            }
            if (this.e == 0 && jMin <= 60) {
                z04.t("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
                m(2, bArr, z);
                return;
            }
            if (jMin <= 0) {
                j(new KeysExpiredException(), 2);
                return;
            }
            this.p = 4;
            ex3 ex3Var = this.i;
            synchronized (ex3Var.b) {
                set = ex3Var.o;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((lr4) it.next()).c();
            }
        }
    }

    public final boolean i() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Throwable r6, int r7) {
        /*
            r5 = this;
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r0 = new androidx.media3.exoplayer.drm.DrmSession$DrmSessionException
            int r1 = defpackage.oaf.a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = defpackage.wr4.a(r6)
            if (r2 == 0) goto L14
            int r7 = defpackage.wr4.b(r6)
            goto L5f
        L14:
            r2 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r2) goto L22
            boolean r1 = defpackage.yr4.a(r6)
            if (r1 == 0) goto L22
        L20:
            r7 = r4
            goto L5f
        L22:
            boolean r1 = r6 instanceof android.media.NotProvisionedException
            r2 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L57
            boolean r1 = defpackage.xfg.s(r6)
            if (r1 == 0) goto L2f
            goto L57
        L2f:
            boolean r1 = r6 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L36
            r7 = 6007(0x1777, float:8.418E-42)
            goto L5f
        L36:
            boolean r1 = r6 instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException
            if (r1 == 0) goto L3d
            r7 = 6001(0x1771, float:8.409E-42)
            goto L5f
        L3d:
            boolean r1 = r6 instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException
            if (r1 == 0) goto L44
            r7 = 6003(0x1773, float:8.412E-42)
            goto L5f
        L44:
            boolean r1 = r6 instanceof androidx.media3.exoplayer.drm.KeysExpiredException
            if (r1 == 0) goto L4b
            r7 = 6008(0x1778, float:8.419E-42)
            goto L5f
        L4b:
            if (r7 != r3) goto L4e
            goto L20
        L4e:
            r1 = 2
            if (r7 != r1) goto L54
            r7 = 6004(0x1774, float:8.413E-42)
            goto L5f
        L54:
            r1 = 3
            if (r7 != r1) goto L59
        L57:
            r7 = r2
            goto L5f
        L59:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L5f:
            r0.<init>(r6, r7)
            r5.u = r0
            java.lang.String r7 = "DRM session error"
            defpackage.z04.v(r7, r6)
            boolean r7 = r6 instanceof java.lang.Exception
            if (r7 == 0) goto L8f
            ex3 r7 = r5.i
            java.lang.Object r0 = r7.b
            monitor-enter(r0)
            java.util.Set r7 = r7.o     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            java.util.Iterator r7 = r7.iterator()
        L79:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r7.next()
            lr4 r0 = (defpackage.lr4) r0
            r1 = r6
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.e(r1)
            goto L79
        L8c:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            throw r5
        L8f:
            boolean r7 = r6 instanceof java.lang.Error
            if (r7 == 0) goto Lab
            boolean r7 = defpackage.xfg.t(r6)
            if (r7 != 0) goto La3
            boolean r7 = defpackage.xfg.s(r6)
            if (r7 == 0) goto La0
            goto La3
        La0:
            java.lang.Error r6 = (java.lang.Error) r6
            throw r6
        La3:
            int r6 = r5.p
            r7 = 4
            if (r6 == r7) goto Laa
            r5.p = r3
        Laa:
            return
        Lab:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r7 = "Unexpected Throwable subclass"
            r5.<init>(r7, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x94.j(java.lang.Throwable, int):void");
    }

    public final void k(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || xfg.s(th)) {
            this.c.Z(this);
        } else {
            j(th, z ? 1 : 2);
        }
    }

    public final boolean l() {
        Set set;
        if (i()) {
            return true;
        }
        try {
            try {
                byte[] bArrG = this.b.g();
                this.v = bArrG;
                this.b.z(bArrG, this.k);
                this.t = this.b.mo3f(this.v);
                this.p = 3;
                ex3 ex3Var = this.i;
                synchronized (ex3Var.b) {
                    set = ex3Var.o;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((lr4) it.next()).d(3);
                }
                this.v.getClass();
                return true;
            } catch (NotProvisionedException unused) {
                this.c.Z(this);
                return false;
            }
        } catch (Exception | NoSuchMethodError e) {
            if (xfg.s(e)) {
                this.c.Z(this);
                return false;
            }
            j(e, 1);
            return false;
        }
    }

    public final void m(int i, byte[] bArr, boolean z) {
        try {
            p65 p65VarMo4n = this.b.mo4n(bArr, this.a, i, this.h);
            this.x = p65VarMo4n;
            t94 t94Var = this.s;
            int i2 = oaf.a;
            p65VarMo4n.getClass();
            t94Var.getClass();
            t94Var.obtainMessage(2, new v94(yn7.b.getAndIncrement(), z, SystemClock.elapsedRealtime(), p65VarMo4n)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            k(e, true);
        }
    }

    public final Map n() {
        p();
        byte[] bArr = this.v;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }

    public final boolean o() {
        try {
            this.b.j(this.v, this.w);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            j(e, 1);
            return false;
        }
    }

    public final void p() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.n;
        if (threadCurrentThread != looper.getThread()) {
            z04.d0("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
