package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class adc implements wjf {
    public static final Set h0 = Collections.unmodifiableSet(EnumSet.of(zcc.b, zcc.c));
    public static final Set i0 = Collections.unmodifiableSet(EnumSet.of(zcc.a, zcc.o, zcc.s0, zcc.Z, zcc.t0));
    public static final b9b j0;
    public static final mc0 k0;
    public static final ab0 l0;
    public static final RuntimeException m0;
    public static final av1 n0;
    public static final q6d o0;
    public static final int p0;
    public static final long q0;
    public Surface A;
    public Surface B;
    public MediaMuxer C;
    public final cd6 D;
    public e70 E;
    public n05 F;
    public q64 G;
    public d15 H;
    public q64 I;
    public Uri J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public int S;
    public Throwable T;
    public d05 U;
    public final go9 V;
    public Throwable W;
    public boolean X;
    public ScheduledFuture Y;
    public boolean Z;
    public final cd6 a;
    public zm4 a0;
    public final cd6 b;
    public zm4 b0;
    public final Executor c;
    public double c0;
    public final Executor d;
    public boolean d0;
    public final q6d e;
    public wj4 e0;
    public final av1 f;
    public int f0;
    public final av1 g;
    public int g0;
    public final Object h = new Object();
    public final boolean i;
    public final int j;
    public zcc k;
    public zcc l;
    public int m;
    public nb0 n;
    public nb0 o;
    public long p;
    public nb0 q;
    public boolean r;
    public cc0 s;
    public cc0 t;
    public nc0 u;
    public final ArrayList v;
    public Integer w;
    public Integer x;
    public see y;
    public bue z;

    static {
        mb0 mb0Var = mb0.f;
        b9b b9bVarL = b9b.l(Arrays.asList(mb0Var, mb0.e, mb0.d), new la0(mb0Var, 1));
        j0 = b9bVarL;
        lc0 lc0VarA = mc0.a();
        lc0VarA.a = b9bVarL;
        lc0VarA.d = -1;
        mc0 mc0VarA = lc0VarA.a();
        k0 = mc0VarA;
        nw4 nw4VarA = ab0.a();
        nw4VarA.o = -1;
        nw4VarA.b = mc0VarA;
        l0 = nw4VarA.f();
        m0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        n0 = new av1();
        o0 = new q6d(ju0.z());
        p0 = 3;
        q0 = 1000L;
    }

    public adc(ExecutorService executorService, ab0 ab0Var, av1 av1Var, av1 av1Var2) {
        this.i = xi4.a.e(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.k = zcc.a;
        this.l = null;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.p = 0L;
        this.q = null;
        this.r = false;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = new ArrayList();
        this.w = null;
        this.x = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f0 = 1;
        this.J = Uri.EMPTY;
        this.K = 0L;
        this.L = 0L;
        this.M = Long.MAX_VALUE;
        this.N = Long.MAX_VALUE;
        this.O = Long.MAX_VALUE;
        this.P = Long.MAX_VALUE;
        this.Q = 0L;
        this.R = 0L;
        this.S = 1;
        this.T = null;
        this.U = null;
        this.V = new go9(60, (av1) null);
        this.W = null;
        this.X = false;
        this.g0 = 3;
        this.Y = null;
        this.Z = false;
        this.b0 = null;
        this.c0 = 0.0d;
        this.d0 = false;
        this.e0 = null;
        this.c = executorService;
        Executor executorZ = executorService == null ? ju0.z() : executorService;
        this.d = executorZ;
        q6d q6dVar = new q6d(executorZ);
        this.e = q6dVar;
        mc0 mc0VarA = ab0Var.a;
        o90 o90Var = ab0Var.b;
        Integer numValueOf = Integer.valueOf(ab0Var.c);
        if (ab0Var.a.d == -1) {
            al9 al9Var = new al9(19);
            if (mc0VarA == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            lc0 lc0Var = new lc0();
            lc0Var.a = mc0VarA.a;
            lc0Var.b = mc0VarA.b;
            lc0Var.c = mc0VarA.c;
            lc0Var.d = Integer.valueOf(mc0VarA.d);
            al9Var.accept(lc0Var);
            mc0VarA = lc0Var.a();
        }
        String strConcat = mc0VarA == null ? " videoSpec" : "";
        strConcat = o90Var == null ? strConcat.concat(" audioSpec") : strConcat;
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.D = new cd6(new ab0(mc0VarA, o90Var, numValueOf.intValue()));
        this.j = 0;
        this.a = new cd6(new ub0(this.m, m(this.k), null));
        this.b = new cd6(Boolean.FALSE);
        this.f = av1Var;
        this.g = av1Var2;
        this.a0 = new zm4(av1Var, q6dVar, executorZ);
    }

    public static Object l(cd6 cd6Var) {
        try {
            return cd6Var.j().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int m(zcc zccVar) {
        return (zccVar == zcc.X || (zccVar == zcc.Z && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) xi4.a.e(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? 1 : 2;
    }

    public static boolean p(cdc cdcVar, nb0 nb0Var) {
        return nb0Var != null && cdcVar.c == nb0Var.x0;
    }

    public static void r(n05 n05Var) {
        if (n05Var instanceof d15) {
            d15 d15Var = (d15) n05Var;
            d15Var.h.execute(new r05(d15Var, 5));
        }
    }

    public final void A(Surface surface) {
        int iHashCode;
        if (this.A == surface) {
            return;
        }
        this.A = surface;
        synchronized (this.h) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } finally {
                }
            } else {
                iHashCode = 0;
            }
            if (this.m != iHashCode) {
                this.m = iHashCode;
                this.a.v(new ub0(iHashCode, m(this.k), this.s));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.zcc r4) {
        /*
            r3 = this;
            zcc r0 = r3.k
            if (r0 == r4) goto L62
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r4)
            java.util.Set r0 = defpackage.adc.h0
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L43
            zcc r1 = r3.k
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L4a
            java.util.Set r0 = defpackage.adc.i0
            zcc r1 = r3.k
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2d
            zcc r0 = r3.k
            r3.l = r0
            int r0 = m(r0)
            goto L4b
        L2d:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid state transition. Should not be transitioning to a PENDING state from state "
            r0.<init>(r1)
            zcc r3 = r3.k
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L43:
            zcc r0 = r3.l
            if (r0 == 0) goto L4a
            r0 = 0
            r3.l = r0
        L4a:
            r0 = 0
        L4b:
            r3.k = r4
            if (r0 != 0) goto L53
            int r0 = m(r4)
        L53:
            int r4 = r3.m
            cc0 r1 = r3.s
            ub0 r2 = new ub0
            r2.<init>(r4, r0, r1)
            cd6 r3 = r3.a
            r3.v(r2)
            return
        L62:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempted to transition to state "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", but Recorder is already in state "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adc.B(zcc):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:19:0x003f, B:20:0x0043, B:21:0x004b, B:23:0x0051, B:26:0x0060, B:30:0x006d, B:33:0x0087, B:35:0x0096, B:40:0x00a3, B:54:0x00b9, B:55:0x00c3, B:57:0x00c7, B:58:0x00cf, B:60:0x00ec, B:61:0x00fc, B:62:0x0108, B:64:0x010e, B:69:0x011d), top: B:85:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:19:0x003f, B:20:0x0043, B:21:0x004b, B:23:0x0051, B:26:0x0060, B:30:0x006d, B:33:0x0087, B:35:0x0096, B:40:0x00a3, B:54:0x00b9, B:55:0x00c3, B:57:0x00c7, B:58:0x00cf, B:60:0x00ec, B:61:0x00fc, B:62:0x0108, B:64:0x010e, B:69:0x011d), top: B:85:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e A[Catch: all -> 0x005d, LOOP:2: B:62:0x0108->B:64:0x010e, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:19:0x003f, B:20:0x0043, B:21:0x004b, B:23:0x0051, B:26:0x0060, B:30:0x006d, B:33:0x0087, B:35:0x0096, B:40:0x00a3, B:54:0x00b9, B:55:0x00c3, B:57:0x00c7, B:58:0x00cf, B:60:0x00ec, B:61:0x00fc, B:62:0x0108, B:64:0x010e, B:69:0x011d), top: B:85:0x0020, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.nb0 r11) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adc.C(nb0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(defpackage.nb0 r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adc.D(nb0):void");
    }

    public final void E(nb0 nb0Var, boolean z) {
        if (this.q != null) {
            throw new AssertionError("Attempted to start a new recording while another was in progress.");
        }
        hi5 hi5Var = nb0Var.s0;
        if (hi5Var.a.a > 0) {
            this.Q = Math.round(r1.a * 0.95d);
        } else {
            this.Q = 0L;
        }
        ma0 ma0Var = hi5Var.a;
        if (ma0Var.b > 0) {
            this.R = TimeUnit.MILLISECONDS.toNanos(ma0Var.b);
        } else {
            this.R = 0L;
        }
        this.q = nb0Var;
        int iS = au1.s(this.f0);
        boolean z2 = nb0Var.v0;
        if (iS != 0) {
            if (iS == 1) {
                this.f0 = z2 ? 4 : 3;
            } else if (iS == 2 || iS == 3 || iS == 4 || iS == 5) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state ".concat(z7b.n(this.f0)));
            }
        } else if (z2) {
            if (((ab0) l(this.D)).b.e == 0) {
                throw new AssertionError("The Recorder doesn't support recording with audio");
            }
            try {
                if (!this.q.w0 || this.H == null) {
                    D(nb0Var);
                }
                this.f0 = 4;
            } catch (AudioSourceAccessException | InvalidConfigException e) {
                this.f0 = e instanceof InvalidConfigException ? 5 : 6;
                this.W = e;
            }
        }
        G(nb0Var, false);
        if (n()) {
            e70 e70Var = this.E;
            e70Var.a.execute(new c70(e70Var, nb0Var.Y.get(), 0));
            this.H.k();
        }
        ((d15) this.F).k();
        nb0 nb0Var2 = this.q;
        nb0Var2.n(new vkf(nb0Var2.s0, k()));
        if (z) {
            t(nb0Var);
        }
    }

    public final void F(nb0 nb0Var, long j, int i, Exception exc) throws Exception {
        if (this.q != nb0Var || this.r) {
            return;
        }
        this.r = true;
        this.S = i;
        this.T = exc;
        if (n()) {
            while (true) {
                go9 go9Var = this.V;
                if (go9Var.g()) {
                    break;
                } else {
                    go9Var.d();
                }
            }
            d15 d15Var = this.H;
            d15Var.q.getClass();
            d15Var.h.execute(new u05(0, j, pq9.u(), d15Var));
        }
        d05 d05Var = this.U;
        if (d05Var != null) {
            d05Var.close();
            this.U = null;
        }
        if (this.g0 != 2) {
            u3c u3cVar = new u3c(4, this.F);
            this.Y = ju0.D().schedule(new do9(this.e, 27, u3cVar), 1000L, TimeUnit.MILLISECONDS);
        } else {
            r(this.F);
        }
        d15 d15Var2 = (d15) this.F;
        d15Var2.q.getClass();
        d15Var2.h.execute(new u05(0, j, pq9.u(), d15Var2));
    }

    public final void G(final nb0 nb0Var, boolean z) {
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            nl7 nl7VarB = kq0.b(arrayList);
            if (!nl7VarB.isDone()) {
                nl7VarB.cancel(true);
            }
            arrayList.clear();
        }
        final int i = 0;
        arrayList.add(f8.g(new mq1(this) { // from class: ucc
            public final /* synthetic */ adc b;

            {
                this.b = this;
            }

            @Override // defpackage.mq1
            public final String q(lq1 lq1Var) {
                switch (i) {
                    case 0:
                        adc adcVar = this.b;
                        n05 n05Var = adcVar.F;
                        bkb bkbVar = new bkb(false, adcVar, lq1Var, nb0Var);
                        q6d q6dVar = adcVar.e;
                        d15 d15Var = (d15) n05Var;
                        synchronized (d15Var.b) {
                            d15Var.r = bkbVar;
                            d15Var.s = q6dVar;
                        }
                        return "videoEncodingFuture";
                    default:
                        adc adcVar2 = this.b;
                        adcVar2.getClass();
                        vx1 vx1Var = new vx1(adcVar2, 4, lq1Var);
                        e70 e70Var = adcVar2.E;
                        q6d q6dVar2 = adcVar2.e;
                        e70Var.a.execute(new f5(e70Var, q6dVar2, new l7b(adcVar2, 3, vx1Var), 3));
                        d15 d15Var2 = adcVar2.H;
                        m5d m5dVar = new m5d(adcVar2, lq1Var, vx1Var, nb0Var, 12);
                        synchronized (d15Var2.b) {
                            d15Var2.r = m5dVar;
                            d15Var2.s = q6dVar2;
                        }
                        return "audioEncodingFuture";
                }
            }
        }));
        if (n() && !z) {
            final int i2 = 1;
            arrayList.add(f8.g(new mq1(this) { // from class: ucc
                public final /* synthetic */ adc b;

                {
                    this.b = this;
                }

                @Override // defpackage.mq1
                public final String q(lq1 lq1Var) {
                    switch (i2) {
                        case 0:
                            adc adcVar = this.b;
                            n05 n05Var = adcVar.F;
                            bkb bkbVar = new bkb(false, adcVar, lq1Var, nb0Var);
                            q6d q6dVar = adcVar.e;
                            d15 d15Var = (d15) n05Var;
                            synchronized (d15Var.b) {
                                d15Var.r = bkbVar;
                                d15Var.s = q6dVar;
                            }
                            return "videoEncodingFuture";
                        default:
                            adc adcVar2 = this.b;
                            adcVar2.getClass();
                            vx1 vx1Var = new vx1(adcVar2, 4, lq1Var);
                            e70 e70Var = adcVar2.E;
                            q6d q6dVar2 = adcVar2.e;
                            e70Var.a.execute(new f5(e70Var, q6dVar2, new l7b(adcVar2, 3, vx1Var), 3));
                            d15 d15Var2 = adcVar2.H;
                            m5d m5dVar = new m5d(adcVar2, lq1Var, vx1Var, nb0Var, 12);
                            synchronized (d15Var2.b) {
                                d15Var2.r = m5dVar;
                                d15Var2.s = q6dVar2;
                            }
                            return "audioEncodingFuture";
                    }
                }
            }));
        }
        kq0.a(kq0.b(arrayList), new wmc(this, false), ju0.k());
    }

    public final void H() {
        nb0 nb0Var = this.q;
        if (nb0Var != null) {
            nb0Var.n(new wkf(nb0Var.s0, k()));
        }
    }

    public final void I(zcc zccVar) {
        if (!h0.contains(this.k)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.k);
        }
        if (!i0.contains(zccVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + zccVar);
        }
        if (this.l != zccVar) {
            this.l = zccVar;
            this.a.v(new ub0(this.m, m(zccVar), this.s));
        }
    }

    public final void J(d05 d05Var, nb0 nb0Var) {
        long size = d05Var.size() + this.K;
        long j = this.Q;
        if (j != 0 && size > j) {
            String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.Q));
            s(nb0Var, 2, null);
            return;
        }
        long jY = d05Var.Y();
        long j2 = this.N;
        if (j2 == Long.MAX_VALUE) {
            this.N = jY;
            String.format("First audio time: %d (%s)", Long.valueOf(jY), a14.H(this.N));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jY - Math.min(this.M, j2));
            c54.p("There should be a previous data for adjusting the duration.", this.P != Long.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(jY - this.P) + nanos;
            long j3 = this.R;
            if (j3 != 0 && nanos2 > j3) {
                String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.R));
                s(nb0Var, 9, null);
                return;
            }
        }
        this.C.writeSampleData(this.w.intValue(), d05Var.r(), d05Var.F());
        this.K = size;
        this.P = jY;
    }

    public final void K(d05 d05Var, nb0 nb0Var) {
        if (this.x == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = d05Var.size() + this.K;
        long j = this.Q;
        long j2 = 0;
        if (j != 0 && size > j) {
            String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.Q));
            s(nb0Var, 2, null);
            return;
        }
        long jY = d05Var.Y();
        long j3 = this.M;
        if (j3 == Long.MAX_VALUE) {
            this.M = jY;
            String.format("First video time: %d (%s)", Long.valueOf(jY), a14.H(this.M));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jY - Math.min(j3, this.N));
            c54.p("There should be a previous data for adjusting the duration.", this.O != Long.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(jY - this.O) + nanos;
            long j4 = this.R;
            if (j4 != 0 && nanos2 > j4) {
                String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.R));
                s(nb0Var, 9, null);
                return;
            }
            j2 = nanos;
        }
        this.C.writeSampleData(this.x.intValue(), d05Var.r(), d05Var.F());
        this.K = size;
        this.L = j2;
        this.O = jY;
        H();
    }

    @Override // defpackage.wjf
    public final void a(see seeVar) {
        f(seeVar, bue.a);
    }

    @Override // defpackage.wjf
    public final ry9 b() {
        return this.D;
    }

    @Override // defpackage.wjf
    public final void c(int i) {
        this.e.execute(new l40(i, 13, this));
    }

    @Override // defpackage.wjf
    public final ry9 d() {
        return this.a;
    }

    @Override // defpackage.wjf
    public final ry9 e() {
        return this.b;
    }

    @Override // defpackage.wjf
    public final void f(see seeVar, bue bueVar) {
        synchronized (this.h) {
            try {
                Objects.toString(this.k);
                if (this.k == zcc.t0) {
                    B(zcc.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.execute(new v05(this, seeVar, bueVar, 25));
    }

    @Override // defpackage.wjf
    public final kdf g(yw1 yw1Var) {
        return new bdc(this.j, yw1Var);
    }

    public final void h(see seeVar, bue bueVar, boolean z) {
        Object value;
        mb0 mb0Var;
        if (seeVar.a()) {
            return;
        }
        qcc qccVar = new qcc(this);
        q6d q6dVar = this.e;
        seeVar.c(q6dVar, qccVar);
        bdc bdcVar = new bdc(0, seeVar.e.p());
        eu4 eu4Var = seeVar.c;
        fz1 fz1VarD = bdcVar.d(eu4Var);
        Size size = seeVar.b;
        if (fz1VarD == null) {
            mb0Var = mb0.j;
        } else {
            TreeMap treeMap = fz1VarD.b;
            Size size2 = msd.a;
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
            if (entryCeilingEntry != null) {
                value = entryCeilingEntry.getValue();
            } else {
                Map.Entry entryFloorEntry = treeMap.floorEntry(size);
                value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
            }
            mb0Var = (mb0) value;
            if (mb0Var == null) {
                mb0Var = mb0.j;
            }
        }
        Objects.toString(mb0Var);
        Objects.toString(size);
        if (mb0Var != mb0.j) {
            nc0 nc0VarB = bdcVar.b(mb0Var, eu4Var);
            this.u = nc0VarB;
            if (nc0VarB == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        wj4 wj4Var = this.e0;
        if (wj4Var != null && !wj4Var.b) {
            wj4Var.b = true;
            ScheduledFuture scheduledFuture = (ScheduledFuture) wj4Var.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                wj4Var.f = null;
            }
        }
        wj4 wj4Var2 = new wj4(this, seeVar, bueVar, z ? p0 : 0);
        this.e0 = wj4Var2;
        Objects.toString(this.F);
        zm4 zm4Var = this.a0;
        zm4Var.e();
        kq0.w((bm7) zm4Var.k).d(new v05(wj4Var2, seeVar, bueVar, 26), q6dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0125 A[Catch: all -> 0x00ef, TryCatch #1 {all -> 0x00ef, blocks: (B:39:0x00c1, B:41:0x00c5, B:42:0x00d2, B:80:0x0164, B:45:0x00de, B:47:0x00e2, B:49:0x00e8, B:55:0x00f3, B:57:0x00ff, B:60:0x010a, B:61:0x011d, B:64:0x0121, B:66:0x0125, B:67:0x0134, B:69:0x0138, B:71:0x013e, B:75:0x0146, B:76:0x014f, B:78:0x0153, B:94:0x018d, B:95:0x0194), top: B:104:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134 A[Catch: all -> 0x00ef, TryCatch #1 {all -> 0x00ef, blocks: (B:39:0x00c1, B:41:0x00c5, B:42:0x00d2, B:80:0x0164, B:45:0x00de, B:47:0x00e2, B:49:0x00e8, B:55:0x00f3, B:57:0x00ff, B:60:0x010a, B:61:0x011d, B:64:0x0121, B:66:0x0125, B:67:0x0134, B:69:0x0138, B:71:0x013e, B:75:0x0146, B:76:0x014f, B:78:0x0153, B:94:0x018d, B:95:0x0194), top: B:104:0x00c1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Throwable r9, int r10) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adc.i(java.lang.Throwable, int):void");
    }

    public final void j(nb0 nb0Var, int i, Throwable th) {
        Uri uri = Uri.EMPTY;
        nb0Var.a(uri);
        ob0 ob0VarA = ob0.a(0L, 0L, new p90(1, 0.0d, this.W));
        c54.o(uri, "OutputUri cannot be null.");
        c54.j("An error type is required.", i != 0);
        nb0Var.n(new skf(nb0Var.s0, ob0VarA, i, th));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ob0 k() {
        /*
            r9 = this;
            long r0 = r9.L
            long r2 = r9.K
            int r4 = r9.f0
            int r5 = defpackage.au1.s(r4)
            if (r5 == 0) goto L40
            r6 = 2
            if (r5 == r6) goto L40
            r7 = 5
            r8 = 3
            if (r5 == r8) goto L2b
            r6 = 4
            if (r5 == r6) goto L29
            if (r5 != r7) goto L19
            goto L41
        L19:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r0 = defpackage.z7b.n(r4)
            java.lang.String r1 = "Invalid internal audio state: "
            java.lang.String r0 = r1.concat(r0)
            r9.<init>(r0)
            throw r9
        L29:
            r6 = r8
            goto L41
        L2b:
            nb0 r4 = r9.q
            if (r4 == 0) goto L39
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.Y
            boolean r4 = r4.get()
            if (r4 == 0) goto L39
            r6 = r7
            goto L41
        L39:
            boolean r4 = r9.X
            if (r4 == 0) goto L3e
            goto L41
        L3e:
            r6 = 0
            goto L41
        L40:
            r6 = 1
        L41:
            java.lang.Throwable r4 = r9.W
            double r7 = r9.c0
            p90 r9 = new p90
            r9.<init>(r6, r7, r4)
            ob0 r9 = defpackage.ob0.a(r0, r2, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adc.k():ob0");
    }

    public final boolean n() {
        return this.f0 == 4;
    }

    public final boolean o() {
        nb0 nb0Var = this.q;
        return nb0Var != null && nb0Var.w0;
    }

    public final nb0 q(zcc zccVar) {
        boolean z;
        if (zccVar == zcc.c) {
            z = true;
        } else {
            if (zccVar != zcc.b) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z = false;
        }
        if (this.n != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        nb0 nb0Var = this.o;
        if (nb0Var == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.n = nb0Var;
        nb0Var.Z.f(ju0.k(), new xrb(1, this));
        this.o = null;
        if (z) {
            B(zcc.Y);
        } else {
            B(zcc.X);
        }
        return nb0Var;
    }

    public final void s(nb0 nb0Var, int i, IOException iOException) {
        boolean z;
        if (nb0Var != this.q) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.h) {
            try {
                z = false;
                switch (this.k.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.k);
                    case 4:
                    case 5:
                        B(zcc.Z);
                        z = true;
                    case 1:
                    case 2:
                    case 6:
                    case 7:
                        if (nb0Var != this.n) {
                            throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                        }
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            F(nb0Var, -1L, i, iOException);
        }
    }

    public final void t(nb0 nb0Var) {
        if (this.q != nb0Var || this.r) {
            return;
        }
        if (n()) {
            this.H.e();
        }
        ((d15) this.F).e();
        nb0 nb0Var2 = this.q;
        nb0Var2.n(new tkf(nb0Var2.s0, k()));
    }

    public final void u() {
        e70 e70Var = this.E;
        if (e70Var == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.E = null;
        String.format("Releasing audio source: 0x%x", Integer.valueOf(e70Var.hashCode()));
        kq0.a(f8.g(new ync(8, e70Var)), new bkg(22, e70Var), ju0.k());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void v(boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.h) {
            try {
                z2 = true;
                z3 = false;
                switch (this.k.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        I(zcc.s0);
                        break;
                    case 4:
                    case 5:
                        c54.p("In-progress recording shouldn't be null when in state " + this.k, this.q != null);
                        if (this.n != this.q) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!o()) {
                            B(zcc.s0);
                            z3 = true;
                            z2 = false;
                        }
                        break;
                    case 6:
                        B(zcc.s0);
                        z2 = false;
                        break;
                    case 7:
                    default:
                        z2 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            if (z3) {
                F(this.q, -1L, 4, null);
            }
        } else if (z) {
            x();
        } else {
            w();
        }
    }

    public final void w() {
        d15 d15Var = this.H;
        if (d15Var != null) {
            d15Var.h.execute(new r05(d15Var, 4));
            this.H = null;
            this.I = null;
        }
        if (this.E != null) {
            u();
        }
        this.f0 = 1;
        x();
    }

    public final void x() {
        see seeVar;
        n05 n05Var = this.F;
        boolean z = true;
        if (n05Var != null) {
            zm4 zm4Var = this.b0;
            if (zm4Var != null) {
                c54.p(null, ((d15) zm4Var.f) == n05Var);
                Objects.toString(this.F);
                this.b0.u();
                this.b0 = null;
                this.F = null;
                this.G = null;
                A(null);
            } else {
                Objects.toString(n05Var);
                zm4 zm4Var2 = this.a0;
                zm4Var2.e();
                kq0.w((bm7) zm4Var2.k);
            }
        }
        synchronized (this.h) {
            try {
                switch (this.k.ordinal()) {
                    case 1:
                    case 2:
                        I(zcc.a);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (o()) {
                            z = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        B(zcc.a);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.Z = false;
        if (!z || (seeVar = this.y) == null || seeVar.a()) {
            return;
        }
        h(this.y, this.z, false);
    }

    public final void y() {
        if (h0.contains(this.k)) {
            B(this.l);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.k);
        }
    }

    public final void z(cc0 cc0Var) {
        Objects.toString(cc0Var);
        this.s = cc0Var;
        synchronized (this.h) {
            this.a.v(new ub0(this.m, m(this.k), cc0Var));
        }
    }
}
