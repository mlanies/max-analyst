package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class nx0 implements ox0 {
    public final Object X;
    public boolean Y;
    public Object Z;
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object o;
    public Object s0;

    public nx0(Context context, adc adcVar, hi5 hi5Var) {
        this.a = 3;
        this.b = false;
        this.Y = false;
        this.c = lz7.n(context);
        this.o = adcVar;
        this.X = hi5Var;
    }

    public static int g(lx0 lx0Var, int i) {
        int iHashCode = lx0Var.b.hashCode() + (lx0Var.a * 31);
        if (i >= 2) {
            return (iHashCode * 31) + lx0Var.e.hashCode();
        }
        long jA = ct3.a(lx0Var.e);
        return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
    }

    public static int j(mx0 mx0Var, int i) {
        int iHashCode = mx0Var.b.hashCode() + (mx0Var.a * 31);
        if (i >= 2) {
            return (iHashCode * 31) + mx0Var.e.hashCode();
        }
        long jA = dt3.a(mx0Var.e);
        return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
    }

    private final void m(long j) {
    }

    private final void n(long j) {
    }

    public static lx0 r(int i, DataInputStream dataInputStream) throws IOException {
        a94 a94Var;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            h7b h7bVar = new h7b(13);
            h7bVar.e(Long.valueOf(j), "exo_len");
            a94Var = a94.c.b(h7bVar);
        } else {
            int i3 = dataInputStream.readInt();
            HashMap map = new HashMap();
            for (int i4 = 0; i4 < i3; i4++) {
                String utf2 = dataInputStream.readUTF();
                int i5 = dataInputStream.readInt();
                if (i5 < 0) {
                    throw new IOException(z7b.h(31, i5, "Invalid value size: "));
                }
                int iMin = Math.min(i5, 10485760);
                byte[] bArrCopyOf = maf.f;
                int i6 = 0;
                while (i6 != i5) {
                    int i7 = i6 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                    dataInputStream.readFully(bArrCopyOf, i6, iMin);
                    iMin = Math.min(i5 - i7, 10485760);
                    i6 = i7;
                }
                map.put(utf2, bArrCopyOf);
            }
            a94Var = new a94(map);
        }
        return new lx0(i2, utf, a94Var);
    }

    public static mx0 s(int i, DataInputStream dataInputStream) throws IOException {
        b94 b94VarC;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            imc imcVar = new imc(13);
            imcVar.M(Long.valueOf(j), "exo_len");
            b94VarC = b94.c.b(imcVar);
        } else {
            b94VarC = bwf.c(dataInputStream);
        }
        return new mx0(i2, utf, b94VarC);
    }

    @Override // defpackage.ox0
    public void a(HashMap map) throws Throwable {
        bkc bkcVar;
        DataOutputStream dataOutputStream;
        Object obj = this.o;
        Object obj2 = this.X;
        DataOutputStream dataOutputStream2 = null;
        Object obj3 = this.c;
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                Cipher cipher = (Cipher) obj3;
                h7b h7bVar = (h7b) this.Z;
                try {
                    xy xyVarY = h7bVar.y();
                    bkc bkcVar2 = (bkc) this.s0;
                    if (bkcVar2 == null) {
                        this.s0 = new bkc(xyVarY, i);
                    } else {
                        bkcVar2.a(xyVarY);
                    }
                    bkcVar = (bkc) this.s0;
                    dataOutputStream = new DataOutputStream(bkcVar);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    dataOutputStream.writeInt(2);
                    boolean z = this.b;
                    dataOutputStream.writeInt(z ? 1 : 0);
                    if (z) {
                        byte[] bArr = new byte[16];
                        int i3 = maf.a;
                        ((SecureRandom) obj2).nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            cipher.init(1, (SecretKeySpec) obj, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(bkcVar, cipher));
                        } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                            throw new IllegalStateException(e);
                        }
                    } else {
                        dataOutputStream2 = dataOutputStream;
                    }
                    dataOutputStream2.writeInt(map.size());
                    int iG = 0;
                    for (lx0 lx0Var : map.values()) {
                        dataOutputStream2.writeInt(lx0Var.a);
                        dataOutputStream2.writeUTF(lx0Var.b);
                        x99.f(lx0Var.e, dataOutputStream2);
                        iG += g(lx0Var, 2);
                    }
                    dataOutputStream2.writeInt(iG);
                    dataOutputStream2.close();
                    ((File) h7bVar.c).delete();
                    int i4 = maf.a;
                    this.Y = false;
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream2 = dataOutputStream;
                    maf.h(dataOutputStream2);
                    throw th;
                }
            default:
                Cipher cipher2 = (Cipher) obj3;
                imc imcVar = (imc) this.Z;
                try {
                    xy xyVarA0 = imcVar.a0();
                    bkc bkcVar3 = (bkc) this.s0;
                    if (bkcVar3 == null) {
                        this.s0 = new bkc(xyVarA0, i2);
                    } else {
                        bkcVar3.a(xyVarA0);
                    }
                    bkc bkcVar4 = (bkc) this.s0;
                    DataOutputStream dataOutputStream3 = new DataOutputStream(bkcVar4);
                    try {
                        dataOutputStream3.writeInt(2);
                        boolean z2 = this.b;
                        dataOutputStream3.writeInt(z2 ? 1 : 0);
                        if (z2) {
                            byte[] bArr2 = new byte[16];
                            int i5 = oaf.a;
                            ((SecureRandom) obj2).nextBytes(bArr2);
                            dataOutputStream3.write(bArr2);
                            try {
                                cipher2.init(1, (SecretKeySpec) obj, new IvParameterSpec(bArr2));
                                dataOutputStream3.flush();
                                dataOutputStream2 = new DataOutputStream(new CipherOutputStream(bkcVar4, cipher2));
                            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                                throw new IllegalStateException(e2);
                            }
                        } else {
                            dataOutputStream2 = dataOutputStream3;
                        }
                        dataOutputStream2.writeInt(map.size());
                        int iJ = 0;
                        for (mx0 mx0Var : map.values()) {
                            dataOutputStream2.writeInt(mx0Var.a);
                            dataOutputStream2.writeUTF(mx0Var.b);
                            bwf.d(mx0Var.e, dataOutputStream2);
                            iJ += j(mx0Var, 2);
                        }
                        dataOutputStream2.writeInt(iJ);
                        dataOutputStream2.close();
                        ((File) imcVar.c).delete();
                        int i6 = oaf.a;
                        this.Y = false;
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        dataOutputStream2 = dataOutputStream3;
                        oaf.h(dataOutputStream2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
        }
    }

    public void b() throws InterruptedException {
        boolean z;
        synchronized (this.Z) {
            z = true;
            this.Y = true;
            ((ArrayDeque) this.s0).clear();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((ExecutorService) this.c).submit(new av2(this, z, new i12(this, 5, countDownLatch), 6));
        countDownLatch.await();
    }

    @Override // defpackage.ox0
    public void c(mx0 mx0Var, boolean z) {
        this.Y = true;
    }

    public void d(Exception exc) {
        synchronized (this.Z) {
            try {
                if (this.Y) {
                    return;
                }
                this.Y = true;
                ((wff) this.X).c(VideoFrameProcessingException.a(exc));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ox0
    public void e(mx0 mx0Var) {
        this.Y = true;
    }

    @Override // defpackage.ox0
    public boolean f() {
        switch (this.a) {
            case 0:
                h7b h7bVar = (h7b) this.Z;
                if (((File) h7bVar.b).exists() || ((File) h7bVar.c).exists()) {
                }
                break;
            default:
                imc imcVar = (imc) this.Z;
                if (((File) imcVar.b).exists() || ((File) imcVar.c).exists()) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.ox0
    public void h(HashMap map) throws Throwable {
        switch (this.a) {
            case 0:
                if (this.Y) {
                    a(map);
                    break;
                }
                break;
            default:
                if (this.Y) {
                    a(map);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ox0
    public void i(long j) {
        int i = this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    @Override // defpackage.ox0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(java.util.HashMap r14, android.util.SparseArray r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx0.k(java.util.HashMap, android.util.SparseArray):void");
    }

    @Override // defpackage.ox0
    public void l() {
        switch (this.a) {
            case 0:
                h7b h7bVar = (h7b) this.Z;
                ((File) h7bVar.b).delete();
                ((File) h7bVar.c).delete();
                break;
            default:
                imc imcVar = (imc) this.Z;
                ((File) imcVar.b).delete();
                ((File) imcVar.c).delete();
                break;
        }
    }

    public void o(i12 i12Var) {
        try {
            Future future = (Future) this.o;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (Thread.currentThread() == ((Thread) future.get(500L, timeUnit))) {
                try {
                    i12Var.run();
                    return;
                } catch (Exception e) {
                    d(e);
                    return;
                }
            }
            try {
                ((ExecutorService) this.c).submit(new fre(this, 9, i12Var)).get(500L, timeUnit);
            } catch (RuntimeException | ExecutionException | TimeoutException e2) {
                d(e2);
            }
        } catch (InterruptedException e3) {
            throw e3;
        } catch (Exception e4) {
            d(e4);
        }
    }

    public void p(lx0 lx0Var, boolean z) {
        this.Y = true;
    }

    public void q(lx0 lx0Var) {
        this.Y = true;
    }

    public void t(xff xffVar) {
        boolean z;
        synchronized (this.Z) {
            z = true;
            this.Y = true;
            ((ArrayDeque) this.s0).clear();
        }
        ((ExecutorService) this.c).submit(new av2(this, z, xffVar, 6));
        if (this.b) {
            ((ExecutorService) this.c).shutdown();
            if (((ExecutorService) this.c).awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                return;
            }
            ((wff) this.X).c(new VideoFrameProcessingException("Release timed out. OpenGL resources may not be cleaned up properly."));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0028. Please report as an issue. */
    public cdc u(Executor executor, tj3 tj3Var) {
        long j;
        int i;
        nb0 nb0Var;
        nb0 nb0Var2;
        c54.o(executor, "Listener Executor can't be null.");
        this.s0 = executor;
        this.Z = tj3Var;
        final adc adcVar = (adc) this.o;
        adcVar.getClass();
        synchronized (adcVar.h) {
            try {
                j = adcVar.p + 1;
                adcVar.p = j;
                i = 0;
                switch (adcVar.k.ordinal()) {
                    case 0:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zcc zccVar = adcVar.k;
                        zcc zccVar2 = zcc.o;
                        if (zccVar == zccVar2) {
                            c54.p("Expected recorder to be idle but a recording is either pending or in progress.", adcVar.n == null && adcVar.o == null);
                        }
                        try {
                            nb0 nb0Var3 = new nb0((hi5) this.X, (Executor) this.s0, (tj3) this.Z, this.b, this.Y, j);
                            nb0Var3.g((Context) this.c);
                            adcVar.o = nb0Var3;
                            zcc zccVar3 = adcVar.k;
                            if (zccVar3 == zccVar2) {
                                adcVar.B(zcc.b);
                                final int i2 = 0;
                                adcVar.e.execute(new Runnable() { // from class: rcc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z;
                                        nb0 nb0VarQ;
                                        int i3;
                                        nb0 nb0Var4;
                                        Throwable th;
                                        switch (i2) {
                                            case 0:
                                                adc adcVar2 = adcVar;
                                                synchronized (adcVar2.h) {
                                                    try {
                                                        int iOrdinal = adcVar2.k.ordinal();
                                                        boolean z2 = true;
                                                        z = false;
                                                        nb0VarQ = null;
                                                        if (iOrdinal != 1) {
                                                            if (iOrdinal != 2) {
                                                                i3 = 0;
                                                                nb0Var4 = null;
                                                            }
                                                            th = nb0Var4;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (adcVar2.n == null && !adcVar2.Z) {
                                                            if (adcVar2.g0 == 3) {
                                                                nb0Var4 = adcVar2.o;
                                                                adcVar2.o = null;
                                                                adcVar2.y();
                                                                i3 = 4;
                                                                z = z2;
                                                                th = adc.m0;
                                                            } else if (adcVar2.F != null) {
                                                                i3 = 0;
                                                                z = z2;
                                                                th = null;
                                                                nb0VarQ = adcVar2.q(adcVar2.k);
                                                                nb0Var4 = null;
                                                            }
                                                        }
                                                        i3 = 0;
                                                        nb0Var4 = null;
                                                        z = z2;
                                                        th = nb0Var4;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                if (nb0VarQ != null) {
                                                    adcVar2.E(nb0VarQ, z);
                                                    return;
                                                } else {
                                                    if (nb0Var4 != null) {
                                                        adcVar2.j(nb0Var4, i3, th);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                adc adcVar3 = adcVar;
                                                see seeVar = adcVar3.y;
                                                if (seeVar == null) {
                                                    throw new AssertionError("surface request is required to retry initialization.");
                                                }
                                                adcVar3.h(seeVar, adcVar3.z, false);
                                                return;
                                        }
                                    }
                                });
                            } else if (zccVar3 == zcc.t0) {
                                adcVar.B(zcc.b);
                                final int i3 = 1;
                                adcVar.e.execute(new Runnable() { // from class: rcc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z;
                                        nb0 nb0VarQ;
                                        int i32;
                                        nb0 nb0Var4;
                                        Throwable th;
                                        switch (i3) {
                                            case 0:
                                                adc adcVar2 = adcVar;
                                                synchronized (adcVar2.h) {
                                                    try {
                                                        int iOrdinal = adcVar2.k.ordinal();
                                                        boolean z2 = true;
                                                        z = false;
                                                        nb0VarQ = null;
                                                        if (iOrdinal != 1) {
                                                            if (iOrdinal != 2) {
                                                                i32 = 0;
                                                                nb0Var4 = null;
                                                            }
                                                            th = nb0Var4;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (adcVar2.n == null && !adcVar2.Z) {
                                                            if (adcVar2.g0 == 3) {
                                                                nb0Var4 = adcVar2.o;
                                                                adcVar2.o = null;
                                                                adcVar2.y();
                                                                i32 = 4;
                                                                z = z2;
                                                                th = adc.m0;
                                                            } else if (adcVar2.F != null) {
                                                                i32 = 0;
                                                                z = z2;
                                                                th = null;
                                                                nb0VarQ = adcVar2.q(adcVar2.k);
                                                                nb0Var4 = null;
                                                            }
                                                        }
                                                        i32 = 0;
                                                        nb0Var4 = null;
                                                        z = z2;
                                                        th = nb0Var4;
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                                if (nb0VarQ != null) {
                                                    adcVar2.E(nb0VarQ, z);
                                                    return;
                                                } else {
                                                    if (nb0Var4 != null) {
                                                        adcVar2.j(nb0Var4, i32, th);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            default:
                                                adc adcVar3 = adcVar;
                                                see seeVar = adcVar3.y;
                                                if (seeVar == null) {
                                                    throw new AssertionError("surface request is required to retry initialization.");
                                                }
                                                adcVar3.h(seeVar, adcVar3.z, false);
                                                return;
                                        }
                                    }
                                });
                            } else {
                                adcVar.B(zcc.b);
                            }
                            e = null;
                        } catch (IOException e) {
                            e = e;
                            i = 5;
                        }
                        nb0Var2 = null;
                        break;
                    case 1:
                    case 2:
                        nb0Var = adcVar.o;
                        nb0Var.getClass();
                        nb0Var2 = nb0Var;
                        e = null;
                        break;
                    case 4:
                    case 5:
                        nb0Var = adcVar.n;
                        nb0Var2 = nb0Var;
                        e = null;
                        break;
                    default:
                        e = null;
                        nb0Var2 = null;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nb0Var2 != null) {
            throw new IllegalStateException("A recording is already in progress. Previous recordings must be stopped before a new recording can be started.");
        }
        if (i == 0) {
            return new cdc((adc) this.o, j, (hi5) this.X, false);
        }
        Objects.toString(e);
        adcVar.j(new nb0((hi5) this.X, (Executor) this.s0, (tj3) this.Z, this.b, this.Y, j), i, e);
        return new cdc((adc) this.o, j, (hi5) this.X, true);
    }

    public void v(xff xffVar) {
        synchronized (this.Z) {
            if (this.Y) {
                return;
            }
            try {
                ((ExecutorService) this.c).submit(new av2((Object) this, false, (Object) xffVar, 6));
                e = null;
            } catch (RejectedExecutionException e) {
                e = e;
            }
            if (e != null) {
                d(e);
            }
        }
    }

    public void w(xff xffVar) {
        synchronized (this.Z) {
            try {
                if (this.Y) {
                    return;
                }
                ((ArrayDeque) this.s0).add(xffVar);
                v(new vff());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        if (ngg.m((Context) this.c, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        c54.p("The Recorder this recording is associated to doesn't support audio.", ((ab0) adc.l(((adc) this.o).D)).b.e != 0);
        this.b = true;
    }

    public nx0(st1 st1Var, q6d q6dVar) {
        this.a = 2;
        this.b = false;
        this.Y = false;
        this.X = new Object();
        this.Z = new re6(7);
        this.c = st1Var;
        this.o = q6dVar;
    }

    public nx0(ExecutorService executorService, boolean z, wff wffVar) {
        this.a = 4;
        this.c = executorService;
        this.o = executorService.submit(new ae(2));
        this.b = z;
        this.X = wffVar;
        this.Z = new Object();
        this.s0 = new ArrayDeque();
    }

    public nx0(File file, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = false;
                this.c = null;
                this.o = null;
                this.X = null;
                this.Z = new imc(file);
                break;
            default:
                this.b = false;
                this.c = null;
                this.o = null;
                this.X = null;
                this.Z = new h7b(file);
                break;
        }
    }
}
