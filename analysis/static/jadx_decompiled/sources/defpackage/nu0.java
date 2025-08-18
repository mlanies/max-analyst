package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public abstract class nu0 implements j8e {
    public static boolean B0 = false;
    public static long C0 = 0;
    public static boolean D0 = true;
    public static final /* synthetic */ int E0 = 0;
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 1000, 960, 800, 800, 480, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, 2048};
    public static final eq6 b = new eq6(HttpStatus.SC_NOT_FOUND, "SC_NOT_FOUND");
    public static final eq6 c = new eq6(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "SC_REQUESTED_RANGE_NOT_SATISFIABLE");
    public static final eq6 o = new eq6(500, "SC_INTERNAL_SERVER_ERROR");
    public static final eq6 X = new eq6(HttpStatus.SC_BAD_REQUEST, "SC_BAD_REQUEST");
    public static final eq6 Y = new eq6(HttpStatus.SC_PRECONDITION_FAILED, "SC_PRECONDITION_FAILED");
    public static final eq6 Z = new eq6(HttpStatus.SC_FORBIDDEN, "SC_FORBIDDEN");
    public static final eq6 s0 = new eq6(HttpStatus.SC_CONFLICT, "SC_CONFLICT");
    public static final eq6 t0 = new eq6(HttpStatus.SC_REQUEST_TOO_LONG, "SC_REQUEST_ENTITY_TOO_LARGE");
    public static final eq6 u0 = new eq6(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, "SC_UNSUPPORTED_MEDIA_TYPE");
    public static final eq6 v0 = new eq6(HttpStatus.SC_NOT_ACCEPTABLE, "SC_NOT_ACCEPTABLE");
    public static final eq6 w0 = new eq6(-1, "UNKNOWN_ERROR");
    public static final eq6 x0 = new eq6(-100, "FILE_NOT_FOUND");
    public static final eq6 y0 = new eq6(-101, "FILE_ZERO_LENGTH");
    public static final Object z0 = new Object();
    public static final Object A0 = new Object();

    public static int A(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(rh4.h("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
    }

    public static final int B(int i) {
        int iS = au1.s(i);
        if (iS == 0) {
            return 0;
        }
        if (iS == 1) {
            return 1;
        }
        if (iS == 2) {
            return 2;
        }
        if (iS == 3) {
            return 3;
        }
        if (iS == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + ey8.t(i) + " to int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0377 A[EXC_TOP_SPLITTER, PHI: r9
      0x0377: PHI (r9v14 int) = (r9v3 int), (r9v4 int), (r9v5 int), (r9v15 int) binds: [B:232:0x0375, B:215:0x0331, B:211:0x031f, B:40:0x008d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.le3 C(defpackage.gy8 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.C(gy8):le3");
    }

    public static final int D(jna jnaVar) {
        int iOrdinal = jnaVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.w3 E(defpackage.s02 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = defpackage.nu0.a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            w3 r1 = new w3
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.E(s02):w3");
    }

    public static void F(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final String G(Long l) {
        if (l.longValue() > 0) {
            return String.format(Locale.ENGLISH, "%d [%tF %tT %tL]", Arrays.copyOf(new Object[]{l, l, l, l}, 4));
        }
        return l + "ms";
    }

    public static void H(Throwable th) {
        if (Error.class.isInstance(th)) {
            throw ((Throwable) Error.class.cast(th));
        }
        if (!RuntimeException.class.isInstance(th)) {
            throw new RuntimeException(th);
        }
        throw ((Throwable) RuntimeException.class.cast(th));
    }

    public static String I(Object obj) {
        return "'" + String.valueOf(obj) + "'";
    }

    public static long J(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static long K(int i, byte[] bArr) {
        long J = J(i, bArr);
        long J2 = J(i + 4, bArr);
        if (J == 0 && J2 == 0) {
            return 0L;
        }
        return ((J2 * 1000) / 4294967296L) + ((J - 2208988800L) * 1000);
    }

    public static final gic L(k56 k56Var) {
        gic gicVar = new gic();
        gicVar.a = k56Var;
        gicVar.b = c32.Y;
        return gicVar;
    }

    public static final byte[] M(Set set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jj3 jj3Var = (jj3) it.next();
                    objectOutputStream.writeUTF(jj3Var.a.toString());
                    objectOutputStream.writeBoolean(jj3Var.b);
                }
                v3c.i(objectOutputStream, null);
                v3c.i(byteArrayOutputStream, null);
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } finally {
        }
    }

    public static void N(View view, q18 q18Var) {
        ew4 ew4Var = q18Var.a.b;
        if (ew4Var == null || !ew4Var.a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = zmf.a;
            fI += omf.i((View) parent);
        }
        p18 p18Var = q18Var.a;
        if (p18Var.m != fI) {
            p18Var.m = fI;
            q18Var.q();
        }
    }

    public static final int O(m7g m7gVar) {
        int iOrdinal = m7gVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        if (iOrdinal == 4) {
            return 4;
        }
        if (iOrdinal == 5) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean P(String str) {
        return str != null && str.trim().length() > 0;
    }

    public static final m32 Q(mn5 mn5Var, long j) {
        return new m32(new oo5(j, mn5Var, null), hz4.a, -2, 1, 0);
    }

    public static ArrayList R(Collection collection, w56 w56Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) w56Var.mo131apply(it.next()));
        }
        return arrayList;
    }

    public static final void S(y5f y5fVar) {
        y5fVar.c(b64.class, new lxc(10));
    }

    public static long a() throws Throwable {
        DatagramSocket datagramSocket;
        long j;
        synchronized (A0) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j = jCurrentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j2 = jCurrentTimeMillis / 1000;
                long j3 = jCurrentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                j = jCurrentTimeMillis;
                bArr[40] = (byte) (j4 >> 24);
                bArr[41] = (byte) (j4 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j4 >> 8);
                    bArr[43] = (byte) j4;
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j5 >> 24);
                    bArr[45] = (byte) (j5 >> 16);
                    bArr[46] = (byte) (j5 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j6 = (jElapsedRealtime2 - jElapsedRealtime) + j;
            byte b2 = bArr[0];
            int i = bArr[1] & 255;
            long jK = K(24, bArr);
            long jK2 = K(32, bArr);
            long jK3 = K(40, bArr);
            d((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i, jK3);
            long j7 = (j6 + (((jK3 - j6) + (jK2 - jK)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j7;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static final int b(mf0 mf0Var) {
        int iOrdinal = mf0Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final LinkedHashSet c(byte[] bArr) {
        ObjectInputStream objectInputStream;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                int i = objectInputStream.readInt();
                for (int i2 = 0; i2 < i; i2++) {
                    linkedHashSet.add(new jj3(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                }
                v3c.i(objectInputStream, null);
                v3c.i(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static void d(byte b2, byte b3, int i, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(z7b.h(26, b3, "SNTP: Untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new IOException(z7b.h(36, i, "SNTP: Untrusted stratum: "));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static final zn5 e(mn5 mn5Var, long j, a66 a66Var) {
        return new zn5(new t03(new m32(new vn5(j, mn5Var, null), hz4.a, -2, 1, 0), 8), a66Var, 0);
    }

    public static hm9 f(int i) {
        if (i != 0 && i == 1) {
            return new w04();
        }
        return new rnc();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List g(defpackage.p8c r3, int r4) throws java.lang.Throwable {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            int r1 = r0.size()
            if (r1 != r4) goto Lc
            goto L1a
        Lc:
            java.lang.Object r1 = r3.f()
            boolean r2 = r1 instanceof defpackage.h42
            if (r2 == 0) goto L1c
            java.lang.Throwable r3 = defpackage.i42.a(r1)
            if (r3 != 0) goto L1b
        L1a:
            return r0
        L1b:
            throw r3
        L1c:
            r0.add(r1)
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.g(p8c, int):java.util.List");
    }

    public static final ac h(mn5 mn5Var, long j, a66 a66Var) {
        int i = 3;
        jp5 jp5VarZ = od2.Z(new zn5(mn5Var, a66Var, 1), 1);
        int i2 = ft4.o;
        return new ac(new t03(new qn5(0, new zo5(z7.S(j, kt4.MILLISECONDS), jp5VarZ, null)), 9), 18, new y03(i, (Continuation) null, i));
    }

    public static ffc i(w56 w56Var, List list) {
        ww6 ww6VarI = zw6.i();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = (Bundle) list.get(i);
            bundle.getClass();
            ww6VarI.a(w56Var.mo131apply(bundle));
        }
        return ww6VarI.j();
    }

    public static eq6 j(int i, String str) {
        eq6 eq6Var = i != 400 ? i != 406 ? i != 409 ? i != 500 ? i != 403 ? i != 404 ? i != 412 ? i != 413 ? i != 415 ? i != 416 ? new eq6(i, null) : c : u0 : t0 : Y : b : Z : o : s0 : v0 : X;
        return str == null ? eq6Var : new eq6(eq6Var.a, eq6Var.b, str);
    }

    public static void k(int i, wpa wpaVar) {
        wpaVar.D(7);
        byte[] bArr = wpaVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static kl7 l(a66 a66Var) {
        kk0 kk0Var = kk0.a;
        kk0 kk0Var2 = kk0.X;
        kl7 kl7VarL = j1e.l();
        Iterator it = new r08(nk0.a).iterator();
        while (true) {
            ListIterator listIterator = ((fkc) it).b;
            if (!listIterator.hasPrevious()) {
                return j1e.d(kl7VarL);
            }
            kk0 kk0Var3 = (kk0) listIterator.previous();
            if (kk0Var3.compareTo(kk0Var) >= 0 && kk0Var3.compareTo(kk0Var2) <= 0) {
                String str = (String) a66Var.invoke(kk0Var3, jk0.b);
                if (str != null) {
                    kl7VarL.add(str);
                }
                String str2 = (String) a66Var.invoke(kk0Var3, jk0.a);
                if (str2 != null) {
                    kl7VarL.add(str2);
                }
            }
        }
    }

    public static kl7 m(a66 a66Var, a66 a66Var2) {
        kk0 kk0Var = kk0.a;
        kk0 kk0Var2 = kk0.X;
        kl7 kl7VarL = j1e.l();
        Iterator it = new r08(nk0.a).iterator();
        while (true) {
            ListIterator listIterator = ((fkc) it).b;
            if (!listIterator.hasPrevious()) {
                return j1e.d(kl7VarL);
            }
            kk0 kk0Var3 = (kk0) listIterator.previous();
            if (kk0Var3.compareTo(kk0Var) >= 0 && kk0Var3.compareTo(kk0Var2) <= 0) {
                Object obj = jk0.b;
                String str = (String) a66Var2.invoke(kk0Var3, obj);
                if (str != null) {
                    kl7VarL.add(str);
                }
                Object obj2 = jk0.a;
                String str2 = (String) a66Var2.invoke(kk0Var3, obj2);
                if (str2 != null) {
                    kl7VarL.add(str2);
                }
                String str3 = (String) a66Var.invoke(kk0Var3, obj);
                if (str3 != null) {
                    kl7VarL.add(str3);
                }
                String str4 = (String) a66Var.invoke(kk0Var3, obj2);
                if (str4 != null) {
                    kl7VarL.add(str4);
                }
            }
        }
    }

    public static final kl7 n(kk0 kk0Var, kk0 kk0Var2, m56 m56Var) {
        String str;
        kl7 kl7VarL = j1e.l();
        Iterator it = new r08(nk0.a).iterator();
        while (true) {
            ListIterator listIterator = ((fkc) it).b;
            if (!listIterator.hasPrevious()) {
                return j1e.d(kl7VarL);
            }
            kk0 kk0Var3 = (kk0) listIterator.previous();
            if (kk0Var3.compareTo(kk0Var) >= 0 && kk0Var3.compareTo(kk0Var2) <= 0 && (str = (String) m56Var.invoke(kk0Var3)) != null) {
                kl7VarL.add(str);
            }
        }
    }

    public static final sy1 o(Continuation continuation) {
        if (!(continuation instanceof DispatchedContinuation)) {
            return new sy1(1, continuation);
        }
        sy1 sy1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core = ((DispatchedContinuation) continuation).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (sy1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sy1.o;
            Object obj = atomicReferenceFieldUpdater.get(sy1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core);
            if (!(obj instanceof jb3) || ((jb3) obj).d == null) {
                sy1.c.set(sy1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core, 536870911);
                atomicReferenceFieldUpdater.set(sy1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core, o7.a);
            } else {
                sy1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core.h();
                sy1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (sy1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return sy1VarClaimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new sy1(2, continuation);
    }

    public static final int p(Layout layout) {
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    public static final int q(Layout layout) {
        if (layout != null) {
            return (layout.getLineCount() <= 0 || layout.getEllipsisCount(0) != 0) ? layout.getEllipsizedWidth() : (int) layout.getLineMax(0);
        }
        return 0;
    }

    public static final int r(r6d r6dVar, r6d[] r6dVarArr) {
        int iHashCode = (r6dVar.a().hashCode() * 31) + Arrays.hashCode(r6dVarArr);
        u6d u6dVar = new u6d(r6dVar, 0);
        int iHashCode2 = 1;
        int i = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!u6dVar.hasNext()) {
                break;
            }
            int i2 = i * 31;
            String strA = ((r6d) u6dVar.next()).a();
            if (strA != null) {
                iHashCode3 = strA.hashCode();
            }
            i = i2 + iHashCode3;
        }
        u6d u6dVar2 = new u6d(r6dVar, 0);
        while (u6dVar2.hasNext()) {
            int i3 = iHashCode2 * 31;
            pag pagVarE = ((r6d) u6dVar2.next()).e();
            iHashCode2 = i3 + (pagVarE != null ? pagVarE.hashCode() : 0);
        }
        return (((iHashCode * 31) + i) * 31) + iHashCode2;
    }

    public static final mf0 s(int i) {
        if (i == 0) {
            return mf0.a;
        }
        if (i == 1) {
            return mf0.b;
        }
        throw new IllegalArgumentException(wg0.g(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int t(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                if (i == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT < 30 || i != 5) {
                    throw new IllegalArgumentException(wg0.g(i, "Could not convert ", " to NetworkType"));
                }
                return 6;
            }
        }
        return i2;
    }

    public static final jna u(int i) {
        if (i == 0) {
            return jna.a;
        }
        if (i == 1) {
            return jna.b;
        }
        throw new IllegalArgumentException(wg0.g(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final m7g v(int i) {
        if (i == 0) {
            return m7g.a;
        }
        if (i == 1) {
            return m7g.b;
        }
        if (i == 2) {
            return m7g.c;
        }
        if (i == 3) {
            return m7g.o;
        }
        if (i == 4) {
            return m7g.X;
        }
        if (i == 5) {
            return m7g.Y;
        }
        throw new IllegalArgumentException(wg0.g(i, "Could not convert ", " to State"));
    }

    public static final void w(ry1 ry1Var, iy1 iy1Var) {
        if (!(ry1Var instanceof sy1)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((sy1) ry1Var).p(iy1Var);
    }

    public static boolean x(eq6 eq6Var) {
        return t0.equals(eq6Var) || u0.equals(eq6Var) || v0.equals(eq6Var) || o.equals(eq6Var) || x0.equals(eq6Var) || y0.equals(eq6Var);
    }

    public static final boolean y(int i) {
        return (8400 <= i && i < 8448) || (8596 <= i && i < 8601) || ((9100 <= i && i < 9301) || ((9723 <= i && i < 9727) || ((9728 <= i && i < 9984) || ((9984 <= i && i < 10176) || ((65024 <= i && i < 65040) || ((127462 <= i && i < 127488) || ((127744 <= i && i < 128512) || ((128512 <= i && i < 128592) || ((128640 <= i && i < 128768) || ((128992 <= i && i < 129004) || ((129648 <= i && i < 129661) || ((129664 <= i && i < 129734) || ((129742 <= i && i < 129756) || ((129760 <= i && i < 129769) || ((129776 <= i && i < 129785) || ((129280 <= i && i < 129536) || ((127000 <= i && i < 127601) || ((917536 <= i && i < 917632) || i == 126980 || i == 129008 || i == 8252 || i == 8265 || i == 8482 || i == 8505 || i == 8601 || i == 8617 || i == 8618 || i == 8986 || i == 8987 || i == 9000 || i == 9410 || i == 9642 || i == 9643 || i == 9654 || i == 9664 || i == 10548 || i == 10549 || i == 11013 || i == 11014 || i == 11015 || i == 11035 || i == 11036 || i == 11088 || i == 11093 || i == 12336 || i == 12349 || i == 12951 || i == 12953 || i == 169 || i == 174))))))))))))))))));
    }

    public static void z(zn5 zn5Var, sx3 sx3Var) {
        j47.T(sx3Var, null, vx3.a, new io5(zn5Var, null), 1);
    }
}
