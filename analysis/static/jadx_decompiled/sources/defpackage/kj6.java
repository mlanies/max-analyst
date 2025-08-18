package defpackage;

import android.graphics.Bitmap;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class kj6 implements s43, b7b, qj3, lm9, ihb, mbe, rh {
    public final /* synthetic */ int a;
    public static final kj6 b = new kj6(1);
    public static final kj6 c = new kj6(2);
    public static final kj6 o = new kj6(3);
    public static final kj6 X = new kj6(4);
    public static final kj6 Y = new kj6(5);

    public /* synthetic */ kj6(int i) {
        this.a = i;
    }

    public static byte[] d(long j, List list) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yz3 yz3Var = (yz3) it.next();
            Bundle bundleB = yz3Var.b();
            Bitmap bitmap = yz3Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                fm9.k(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleB.putByteArray(yz3.w, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleB);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static boolean g(File file) {
        Object njcVar;
        try {
            njcVar = Boolean.valueOf(file.exists() && file.canRead());
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Object obj = Boolean.FALSE;
        if (njcVar instanceof njc) {
            njcVar = obj;
        }
        return ((Boolean) njcVar).booleanValue();
    }

    public static boolean h(String str) {
        Object njcVar;
        try {
            njcVar = Boolean.valueOf(g(new File(str)));
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Object obj = Boolean.FALSE;
        if (njcVar instanceof njc) {
            njcVar = obj;
        }
        return ((Boolean) njcVar).booleanValue();
    }

    public static Font k(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : HttpStatus.SC_BAD_REQUEST, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iN = n(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iN2 = n(fontStyle, font2.getStyle());
            if (iN2 < iN) {
                font = font2;
                iN = iN2;
            }
        }
        return font;
    }

    public static ub8 m(int i) {
        Object next;
        v25 v25Var = ub8.Z;
        v25Var.getClass();
        u1 u1Var = new u1(0, v25Var);
        while (true) {
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            if (((ub8) next).ordinal() == i) {
                break;
            }
        }
        ub8 ub8Var = (ub8) next;
        return ub8Var == null ? ub8.b : ub8Var;
    }

    public static int n(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static File p(File file, String str) {
        String str2;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return file2;
        }
        int iE0 = w9e.E0(str, '.', 0, 6);
        int i = 0;
        while (i < 100) {
            if (iE0 != -1) {
                str2 = str.substring(0, iE0) + "(" + (i + 1) + ")" + str.substring(iE0);
            } else {
                str2 = str + "(" + (i + 1) + ")";
            }
            File file3 = new File(file, str2);
            if (!file3.exists()) {
                return file3;
            }
            i++;
            file2 = file3;
        }
        return file2;
    }

    public static void r(String str) {
        Object njcVar;
        Object njcVar2;
        try {
            File file = new File(str);
            try {
                njcVar2 = Boolean.valueOf(file.exists() ? file.delete() : false);
            } catch (Throwable th) {
                njcVar2 = new njc(th);
            }
            Object obj = Boolean.FALSE;
            if (njcVar2 instanceof njc) {
                njcVar2 = obj;
            }
            njcVar = (Boolean) njcVar2;
        } catch (Throwable th2) {
            njcVar = new njc(th2);
        }
        Object obj2 = Boolean.FALSE;
        if (njcVar instanceof njc) {
            njcVar = obj2;
        }
    }

    @Override // defpackage.mbe
    public boolean a(qy5 qy5Var) {
        return false;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
    }

    public void b(p05 p05Var) {
        q80 q80Var = q80.a;
        pa7 pa7Var = (pa7) p05Var;
        pa7Var.a(fl0.class, q80Var);
        pa7Var.a(s90.class, q80Var);
        t80 t80Var = t80.a;
        pa7Var.a(ws7.class, t80Var);
        pa7Var.a(ya0.class, t80Var);
        r80 r80Var = r80.a;
        pa7Var.a(o33.class, r80Var);
        pa7Var.a(z90.class, r80Var);
        p80 p80Var = p80.a;
        pa7Var.a(kd.class, p80Var);
        pa7Var.a(k90.class, p80Var);
        s80 s80Var = s80.a;
        pa7Var.a(qs7.class, s80Var);
        pa7Var.a(xa0.class, s80Var);
        u80 u80Var = u80.a;
        pa7Var.a(sn9.class, u80Var);
        pa7Var.a(bb0.class, u80Var);
    }

    public n85[] c(l85[] l85VarArr, hg0 hg0Var) {
        int i;
        n85 c9Var;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= l85VarArr.length) {
                break;
            }
            l85 l85Var = l85VarArr[i4];
            if (l85Var == null || l85Var.b.length <= 1) {
                arrayList.add(null);
            } else {
                ww6 ww6VarI = zw6.i();
                ww6VarI.d(new a9(0L, 0L));
                arrayList.add(ww6VarI);
            }
            i4++;
        }
        int length = l85VarArr.length;
        long[][] jArr = new long[length][];
        for (int i5 = 0; i5 < l85VarArr.length; i5++) {
            l85 l85Var2 = l85VarArr[i5];
            if (l85Var2 == null) {
                jArr[i5] = new long[0];
            } else {
                int[] iArr = l85Var2.b;
                jArr[i5] = new long[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    long j = l85Var2.a.d[iArr[i6]].i;
                    long[] jArr2 = jArr[i5];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i6] = j;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            long[] jArr4 = jArr[i7];
            jArr3[i7] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        c9.v(arrayList, jArr3);
        pg9 pg9VarG = sh0.H().c().g();
        int i8 = 0;
        while (i8 < length) {
            long[] jArr5 = jArr[i8];
            if (jArr5.length <= i) {
                i2 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i9 = i3;
                while (true) {
                    long[] jArr6 = jArr[i8];
                    double dLog = 0.0d;
                    if (i9 >= jArr6.length) {
                        break;
                    }
                    int i10 = length;
                    long j2 = jArr6[i9];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i9] = dLog;
                    i9++;
                    length = i10;
                }
                i2 = length;
                int i11 = length2 - 1;
                double d = dArr[i11] - dArr[0];
                int i12 = 0;
                while (i12 < i11) {
                    double d2 = dArr[i12];
                    i12++;
                    pg9VarG.g(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i12]) * 0.5d) - dArr[0]) / d), Integer.valueOf(i8));
                }
            }
            i8++;
            length = i2;
            i3 = 0;
            i = 1;
        }
        zw6 zw6VarJ = zw6.j(pg9VarG.h());
        for (int i13 = 0; i13 < zw6VarJ.size(); i13++) {
            int iIntValue = ((Integer) zw6VarJ.get(i13)).intValue();
            int i14 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i14;
            jArr3[iIntValue] = jArr[iIntValue][i14];
            c9.v(arrayList, jArr3);
        }
        for (int i15 = 0; i15 < l85VarArr.length; i15++) {
            if (arrayList.get(i15) != null) {
                jArr3[i15] = jArr3[i15] * 2;
            }
        }
        c9.v(arrayList, jArr3);
        ww6 ww6VarI2 = zw6.i();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ww6 ww6Var = (ww6) arrayList.get(i16);
            ww6VarI2.d(ww6Var == null ? zw6.m() : ww6Var.j());
        }
        ffc ffcVarJ = ww6VarI2.j();
        n85[] n85VarArr = new n85[l85VarArr.length];
        for (int i17 = 0; i17 < l85VarArr.length; i17++) {
            l85 l85Var3 = l85VarArr[i17];
            if (l85Var3 != null) {
                int[] iArr3 = l85Var3.b;
                if (iArr3.length != 0) {
                    if (iArr3.length == 1) {
                        c9Var = new hm5(l85Var3.a, new int[]{iArr3[0]});
                    } else {
                        long j3 = 25000;
                        c9Var = new c9(l85Var3.a, iArr3, hg0Var, 10000, j3, j3, 1279, 719, 0.7f, 0.75f, (zw6) ffcVarJ.get(i17), she.a);
                    }
                    n85VarArr[i17] = c9Var;
                }
            }
        }
        return n85VarArr;
    }

    @Override // defpackage.mbe
    public obe e(qy5 qy5Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.ihb
    public void f(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    @Override // defpackage.lm9
    public void i(String str) {
        hm9.n("Webm", str);
    }

    @Override // defpackage.lm9
    public void j(String str, Throwable th) {
        hm9.p("Webm", str, th);
    }

    @Override // defpackage.mbe
    public int l(qy5 qy5Var) {
        return 1;
    }

    @Override // defpackage.lm9
    public void o(Throwable th) {
        hm9.p("Webm", "fail!", th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[Catch: all -> 0x0082, TryCatch #1 {all -> 0x0082, blocks: (B:24:0x007a, B:21:0x005d, B:27:0x0084, B:19:0x004d), top: B:43:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #1 {all -> 0x0082, blocks: (B:24:0x007a, B:21:0x005d, B:27:0x0084, B:19:0x004d), top: B:43:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:24:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(java.io.File r13, java.io.InputStream r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.jk5
            if (r0 == 0) goto L13
            r0 = r15
            jk5 r0 = (defpackage.jk5) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w0 = r1
            goto L18
        L13:
            jk5 r0 = new jk5
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r12 = r0.u0
            tx3 r15 = defpackage.tx3.a
            int r1 = r0.w0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 != r3) goto L3b
            long r13 = r0.t0
            byte[] r1 = r0.s0
            java.io.OutputStream r4 = r0.Z
            java.io.Closeable r5 = r0.Y
            java.io.InputStream r6 = r0.X
            java.io.Closeable r7 = r0.o
            defpackage.od2.a0(r12)     // Catch: java.lang.Throwable -> L38
            r12 = r6
            r10 = r13
            r14 = r7
            r6 = r10
            goto L7a
        L38:
            r12 = move-exception
            r14 = r7
            goto L93
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            defpackage.od2.a0(r12)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r5.<init>(r13, r2)
            r12 = 8192(0x2000, float:1.148E-41)
            byte[] r12 = new byte[r12]     // Catch: java.lang.Throwable -> L82
            java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L82
            int r13 = r14.read(r12)     // Catch: java.lang.Throwable -> L82
            r6 = 0
            r1 = r12
            r12 = r14
            r4 = r5
        L5b:
            if (r13 < 0) goto L84
            java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L82
            r4.write(r1, r2, r13)     // Catch: java.lang.Throwable -> L82
            long r8 = (long) r13     // Catch: java.lang.Throwable -> L82
            long r6 = r6 + r8
            r0.o = r14     // Catch: java.lang.Throwable -> L82
            r0.X = r12     // Catch: java.lang.Throwable -> L82
            r0.Y = r5     // Catch: java.lang.Throwable -> L82
            r0.Z = r4     // Catch: java.lang.Throwable -> L82
            r0.s0 = r1     // Catch: java.lang.Throwable -> L82
            r0.t0 = r6     // Catch: java.lang.Throwable -> L82
            r0.w0 = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r13 = defpackage.i24.L(r0)     // Catch: java.lang.Throwable -> L82
            if (r13 != r15) goto L7a
            return r15
        L7a:
            java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L82
            int r13 = r12.read(r1)     // Catch: java.lang.Throwable -> L82
            goto L5b
        L82:
            r12 = move-exception
            goto L93
        L84:
            r4.flush()     // Catch: java.lang.Throwable -> L82
            r12 = 0
            defpackage.v3c.i(r5, r12)     // Catch: java.lang.Throwable -> L91
            defpackage.v3c.i(r14, r12)
            e5f r12 = defpackage.e5f.a
            return r12
        L91:
            r12 = move-exception
            goto L99
        L93:
            throw r12     // Catch: java.lang.Throwable -> L94
        L94:
            r13 = move-exception
            defpackage.v3c.i(r5, r12)     // Catch: java.lang.Throwable -> L91
            throw r13     // Catch: java.lang.Throwable -> L91
        L99:
            throw r12     // Catch: java.lang.Throwable -> L9a
        L9a:
            r13 = move-exception
            defpackage.v3c.i(r14, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj6.q(java.io.File, java.io.InputStream, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        return fme.a(((Number) obj).intValue());
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "EmptyConsumer";
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            default:
                return super.toString();
            case 13:
                return "MediaItemType";
        }
    }

    @Override // defpackage.s43
    public gle w(gy8 gy8Var) {
        int iN;
        String strP;
        int iN2;
        if (!gy8Var.m()) {
            return null;
        }
        try {
            iN = lz7.N(gy8Var);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int iS = au1.s(k7d.a);
            if (iS != 0) {
                if (iS != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
            iN = 0;
        }
        if (iN == 0) {
            return null;
        }
        us usVar = new us(0);
        for (int i = 0; i < iN; i++) {
            try {
                strP = lz7.P(gy8Var);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int iS2 = au1.s(k7d.a);
                if (iS2 != 0) {
                    if (iS2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th2;
                }
                strP = null;
            }
            if (strP != null) {
                if (strP.equals("messagesReactions")) {
                    try {
                        iN2 = lz7.N(gy8Var);
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int iS3 = au1.s(k7d.a);
                        if (iS3 != 0) {
                            if (iS3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                        iN2 = 0;
                    }
                    for (int i2 = 0; i2 < iN2; i2++) {
                        long jM = 0;
                        try {
                            jM = lz7.M(gy8Var, 0L);
                        } catch (Throwable th4) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = u7d.a.iterator();
                            while (it4.hasNext()) {
                                ((r4a) it4.next()).getClass();
                                r4a.a(th4);
                            }
                            int iS4 = au1.s(k7d.a);
                            if (iS4 != 0) {
                                if (iS4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th4;
                            }
                        }
                        fx8 fx8VarF = ote.F(gy8Var);
                        if (fx8VarF != null) {
                            usVar.put(Long.valueOf(jM), fx8VarF);
                        }
                    }
                } else {
                    try {
                        gy8Var.z();
                    } catch (Throwable th5) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = u7d.a.iterator();
                        while (it5.hasNext()) {
                            ((r4a) it5.next()).getClass();
                            r4a.a(th5);
                        }
                        int iS5 = au1.s(k7d.a);
                        if (iS5 != 0) {
                            if (iS5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th5;
                        }
                    }
                }
            }
        }
        return new cf9(usVar);
    }

    public kj6() {
        this.a = 18;
        new ConcurrentHashMap();
    }

    public kj6(kd7 kd7Var, kd7 kd7Var2) {
        this.a = 8;
        kd7Var.getClass();
        kd7Var2.getClass();
        c54.k(0.0f <= 0.0f);
    }
}
