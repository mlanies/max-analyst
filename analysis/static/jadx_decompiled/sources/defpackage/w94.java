package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.drm.KeysExpiredException;
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
public final class w94 implements er4 {
    public final List a;
    public final s65 b;
    public final h7b c;
    public final re6 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final ex3 i;
    public final buc j;
    public final i4b k;
    public final w36 l;
    public final UUID m;
    public final cy n;
    public int o;
    public int p;
    public HandlerThread q;
    public t94 r;
    public pz3 s;
    public DrmSession$DrmSessionException t;
    public byte[] u;
    public byte[] v;
    public o65 w;
    public q65 x;

    public w94(UUID uuid, s65 s65Var, h7b h7bVar, re6 re6Var, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap map, w36 w36Var, Looper looper, buc bucVar, i4b i4bVar) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = h7bVar;
        this.d = re6Var;
        this.b = s65Var;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = map;
        this.l = w36Var;
        this.i = new ex3(0);
        this.j = bucVar;
        this.k = i4bVar;
        this.o = 2;
        this.n = new cy(this, looper, 2);
    }

    @Override // defpackage.er4
    public final UUID a() {
        return this.m;
    }

    @Override // defpackage.er4
    public final boolean b() {
        return this.f;
    }

    @Override // defpackage.er4
    public final boolean c(String str) {
        byte[] bArr = this.u;
        np8.g(bArr);
        return this.b.i(bArr, str);
    }

    @Override // defpackage.er4
    public final DrmSession$DrmSessionException d() {
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // defpackage.er4
    public final pz3 e() {
        return this.s;
    }

    @Override // defpackage.er4
    public final void f(kr4 kr4Var) {
        int i = this.p;
        if (i <= 0) {
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.o = 0;
            cy cyVar = this.n;
            int i3 = maf.a;
            cyVar.removeCallbacksAndMessages(null);
            t94 t94Var = this.r;
            synchronized (t94Var) {
                t94Var.removeCallbacksAndMessages(null);
                t94Var.b = true;
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.w = null;
            this.x = null;
            byte[] bArr = this.u;
            if (bArr != null) {
                this.b.k(bArr);
                this.u = null;
            }
        }
        if (kr4Var != null) {
            ex3 ex3Var = this.i;
            synchronized (ex3Var.b) {
                try {
                    Integer num = (Integer) ex3Var.c.get(kr4Var);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(ex3Var.X);
                        arrayList.remove(kr4Var);
                        ex3Var.X = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            ex3Var.c.remove(kr4Var);
                            HashSet hashSet = new HashSet(ex3Var.o);
                            hashSet.remove(kr4Var);
                            ex3Var.o = Collections.unmodifiableSet(hashSet);
                        } else {
                            ex3Var.c.put(kr4Var, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.i.a(kr4Var) == 0) {
                kr4Var.f();
            }
        }
        re6 re6Var = this.d;
        int i4 = this.p;
        aa4 aa4Var = (aa4) re6Var.b;
        if (i4 == 1 && aa4Var.p > 0 && aa4Var.l != -9223372036854775807L) {
            aa4Var.o.add(this);
            Handler handler = aa4Var.u;
            handler.getClass();
            handler.postAtTime(new cu1(28, this), this, SystemClock.uptimeMillis() + aa4Var.l);
        } else if (i4 == 0) {
            aa4Var.m.remove(this);
            if (aa4Var.r == this) {
                aa4Var.r = null;
            }
            if (aa4Var.s == this) {
                aa4Var.s = null;
            }
            h7b h7bVar = aa4Var.i;
            HashSet hashSet2 = (HashSet) h7bVar.b;
            hashSet2.remove(this);
            if (((w94) h7bVar.c) == this) {
                h7bVar.c = null;
                if (!hashSet2.isEmpty()) {
                    w94 w94Var = (w94) hashSet2.iterator().next();
                    h7bVar.c = w94Var;
                    q65 q65VarD = w94Var.b.d();
                    w94Var.x = q65VarD;
                    t94 t94Var2 = w94Var.r;
                    int i5 = maf.a;
                    q65VarD.getClass();
                    t94Var2.getClass();
                    t94Var2.obtainMessage(0, new u94(xn7.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), q65VarD)).sendToTarget();
                }
            }
            if (aa4Var.l != -9223372036854775807L) {
                Handler handler2 = aa4Var.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                aa4Var.o.remove(this);
            }
        }
        aa4Var.j();
    }

    @Override // defpackage.er4
    public final void g(kr4 kr4Var) {
        if (this.p < 0) {
            this.p = 0;
        }
        if (kr4Var != null) {
            ex3 ex3Var = this.i;
            synchronized (ex3Var.b) {
                try {
                    ArrayList arrayList = new ArrayList(ex3Var.X);
                    arrayList.add(kr4Var);
                    ex3Var.X = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) ex3Var.c.get(kr4Var);
                    if (num == null) {
                        HashSet hashSet = new HashSet(ex3Var.o);
                        hashSet.add(kr4Var);
                        ex3Var.o = Collections.unmodifiableSet(hashSet);
                    }
                    ex3Var.c.put(kr4Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.p + 1;
        this.p = i;
        if (i == 1) {
            np8.f(this.o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new t94(this, this.q.getLooper(), 0);
            if (l()) {
                h(true);
            }
        } else if (kr4Var != null && i() && this.i.a(kr4Var) == 1) {
            kr4Var.d(this.o);
        }
        aa4 aa4Var = (aa4) this.d.b;
        if (aa4Var.l != -9223372036854775807L) {
            aa4Var.o.remove(this);
            Handler handler = aa4Var.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.er4
    public final int getState() {
        return this.o;
    }

    public final void h(boolean z) {
        Pair pair;
        String str;
        long jMin;
        Set set;
        if (this.g) {
            return;
        }
        byte[] bArr = this.u;
        int i = maf.a;
        int i2 = this.e;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.v.getClass();
                this.u.getClass();
                m(3, this.v, z);
                return;
            }
            byte[] bArr2 = this.v;
            if (bArr2 != null) {
                try {
                    this.b.j(bArr, bArr2);
                } catch (Exception e) {
                    j(e, 1);
                    return;
                }
            }
            m(2, bArr, z);
            return;
        }
        byte[] bArr3 = this.v;
        if (bArr3 == null) {
            m(1, bArr, z);
            return;
        }
        if (this.o != 4) {
            try {
                this.b.j(bArr, bArr3);
            } catch (Exception e2) {
                j(e2, 1);
                return;
            }
        }
        if (bw0.d.equals(this.m)) {
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
            m(2, bArr, z);
            return;
        }
        if (jMin <= 0) {
            j(new KeysExpiredException(), 2);
            return;
        }
        this.o = 4;
        ex3 ex3Var = this.i;
        synchronized (ex3Var.b) {
            set = ex3Var.o;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((kr4) it.next()).c();
        }
    }

    public final boolean i() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Exception r8, int r9) {
        /*
            r7 = this;
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = new com.google.android.exoplayer2.drm.DrmSession$DrmSessionException
            int r1 = defpackage.maf.a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = defpackage.vr4.a(r8)
            if (r2 == 0) goto L14
            int r9 = defpackage.vr4.b(r8)
            goto L5d
        L14:
            r2 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r2) goto L22
            boolean r2 = defpackage.xr4.a(r8)
            if (r2 == 0) goto L22
        L20:
            r9 = r4
            goto L5d
        L22:
            r2 = 6002(0x1772, float:8.41E-42)
            r5 = 18
            if (r1 < r5) goto L30
            boolean r6 = defpackage.ur4.b(r8)
            if (r6 == 0) goto L30
        L2e:
            r9 = r2
            goto L5d
        L30:
            if (r1 < r5) goto L3b
            boolean r1 = defpackage.ur4.a(r8)
            if (r1 == 0) goto L3b
            r9 = 6007(0x1777, float:8.418E-42)
            goto L5d
        L3b:
            boolean r1 = r8 instanceof com.google.android.exoplayer2.drm.UnsupportedDrmException
            if (r1 == 0) goto L42
            r9 = 6001(0x1771, float:8.409E-42)
            goto L5d
        L42:
            boolean r1 = r8 instanceof com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MissingSchemeDataException
            if (r1 == 0) goto L49
            r9 = 6003(0x1773, float:8.412E-42)
            goto L5d
        L49:
            boolean r1 = r8 instanceof com.google.android.exoplayer2.drm.KeysExpiredException
            if (r1 == 0) goto L50
            r9 = 6008(0x1778, float:8.419E-42)
            goto L5d
        L50:
            if (r9 != r3) goto L53
            goto L20
        L53:
            r1 = 2
            if (r9 != r1) goto L59
            r9 = 6004(0x1774, float:8.413E-42)
            goto L5d
        L59:
            r1 = 3
            if (r9 != r1) goto L8e
            goto L2e
        L5d:
            r0.<init>(r8, r9)
            r7.t = r0
            java.lang.String r9 = "DRM session error"
            defpackage.fm9.c(r9, r8)
            ex3 r9 = r7.i
            java.lang.Object r0 = r9.b
            monitor-enter(r0)
            java.util.Set r9 = r9.o     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r9 = r9.iterator()
        L73:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r9.next()
            kr4 r0 = (defpackage.kr4) r0
            r0.e(r8)
            goto L73
        L83:
            int r8 = r7.o
            r9 = 4
            if (r8 == r9) goto L8a
            r7.o = r3
        L8a:
            return
        L8b:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            throw r7
        L8e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w94.j(java.lang.Exception, int):void");
    }

    public final void k(Exception exc, boolean z) {
        if (!(exc instanceof NotProvisionedException)) {
            j(exc, z ? 1 : 2);
            return;
        }
        h7b h7bVar = this.c;
        ((HashSet) h7bVar.b).add(this);
        if (((w94) h7bVar.c) != null) {
            return;
        }
        h7bVar.c = this;
        q65 q65VarD = this.b.d();
        this.x = q65VarD;
        t94 t94Var = this.r;
        int i = maf.a;
        q65VarD.getClass();
        t94Var.getClass();
        t94Var.obtainMessage(0, new u94(xn7.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), q65VarD)).sendToTarget();
    }

    public final boolean l() {
        Set set;
        if (i()) {
            return true;
        }
        try {
            byte[] bArrG = this.b.g();
            this.u = bArrG;
            this.b.t(bArrG, this.k);
            this.s = this.b.f(this.u);
            this.o = 3;
            ex3 ex3Var = this.i;
            synchronized (ex3Var.b) {
                set = ex3Var.o;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((kr4) it.next()).d(3);
            }
            this.u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            h7b h7bVar = this.c;
            ((HashSet) h7bVar.b).add(this);
            if (((w94) h7bVar.c) == null) {
                h7bVar.c = this;
                q65 q65VarD = this.b.d();
                this.x = q65VarD;
                t94 t94Var = this.r;
                int i = maf.a;
                q65VarD.getClass();
                t94Var.getClass();
                t94Var.obtainMessage(0, new u94(xn7.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), q65VarD)).sendToTarget();
            }
            return false;
        } catch (Exception e) {
            j(e, 1);
            return false;
        }
    }

    public final void m(int i, byte[] bArr, boolean z) {
        try {
            o65 o65VarN = this.b.n(bArr, this.a, i, this.h);
            this.w = o65VarN;
            t94 t94Var = this.r;
            int i2 = maf.a;
            o65VarN.getClass();
            t94Var.getClass();
            t94Var.obtainMessage(1, new u94(xn7.h.getAndIncrement(), z, SystemClock.elapsedRealtime(), o65VarN)).sendToTarget();
        } catch (Exception e) {
            k(e, true);
        }
    }

    public final Map n() {
        byte[] bArr = this.u;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }
}
