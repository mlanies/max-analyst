package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.camera.video.internal.encoder.EncodeException;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes.dex */
public final class mq9 implements b66, pic, cc3, s43, df9, o05 {
    public static mq9 Z;
    public static mq9 b;
    public final /* synthetic */ int a;
    public static final mq9 c = new mq9(1);
    public static final mq9 o = new mq9(2);
    public static final mq9 X = new mq9(3);
    public static final mq9 Y = new mq9(4);

    public /* synthetic */ mq9(int i) {
        this.a = i;
    }

    public static final String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = -1;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > i5 && bArr[i7] != ((byte) 10)) {
                i7 += i5;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i2 = i8 + i9;
                if (bArr[i2] == ((byte) 10)) {
                    break;
                }
                i9++;
            }
            int i10 = i2 - i8;
            int i11 = i;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b2 = bArr2[i11][i12];
                    byte[] bArr4 = naf.a;
                    int i14 = b2 & 255;
                    z = z2;
                    i3 = i14;
                }
                byte b3 = bArr[i8 + i13];
                byte[] bArr5 = naf.a;
                i4 = i3 - (b3 & 255);
                if (i4 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i10) {
                    break;
                }
                if (bArr2[i11].length != i12) {
                    z2 = z;
                } else {
                    if (i11 == bArr2.length - 1) {
                        break;
                    }
                    i11++;
                    z2 = true;
                    i12 = -1;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i15 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    int length3 = bArr2.length;
                    for (int i16 = i11 + 1; i16 < length3; i16++) {
                        length2 += bArr2[i16].length;
                    }
                    if (length2 >= i15) {
                        if (length2 <= i15) {
                            return new String(bArr, i8, i10, StandardCharsets.UTF_8);
                        }
                    }
                    length = i7;
                }
                i6 = i2 + 1;
            } else {
                length = i7;
            }
            i5 = -1;
        }
        return null;
    }

    public static File h(Context context, o97 o97Var) {
        File fileI = i(context);
        m6d.y(fileI);
        return lk5.J(fileI, o97Var.b + '_' + System.currentTimeMillis() + ".bin");
    }

    public static File i(Context context) {
        String str;
        String strQ = c37.q();
        if (strQ.equals(context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(strQ.replace(':', '-'));
        }
        return new File(context.getCacheDir(), str);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        List<ec1> list = (List) obj;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (ec1 ec1Var : list) {
            arrayList.add(new dc1(ec1Var.c, ec1Var.a, ec1Var.b));
        }
        return arrayList;
    }

    @Override // defpackage.o05
    public void b(EncodeException encodeException) {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r8, int r10, defpackage.lu0 r11, defpackage.cz5 r12, boolean r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r14 instanceof defpackage.yo2
            if (r0 == 0) goto L14
            r0 = r14
            yo2 r0 = (defpackage.yo2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.s0 = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            yo2 r0 = new yo2
            r0.<init>(r7, r14)
            goto L12
        L1a:
            java.lang.Object r7 = r6.Y
            tx3 r14 = defpackage.tx3.a
            int r0 = r6.s0
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            int r10 = r6.X
            boolean r13 = r6.o
            defpackage.od2.a0(r7)
            goto L63
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.od2.a0(r7)
            r7 = 0
            if (r12 == 0) goto L3f
            java.util.Set r0 = r12.a
            r2 = r0
            goto L40
        L3f:
            r2 = r7
        L40:
            if (r12 == 0) goto L46
            java.lang.Long r0 = r12.b
            r3 = r0
            goto L47
        L46:
            r3 = r7
        L47:
            if (r12 == 0) goto L4b
            java.lang.CharSequence r7 = r12.d
        L4b:
            r4 = r7
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r8)
            java.util.Set r5 = java.util.Collections.singleton(r7)
            r6.o = r13
            r6.X = r10
            r6.s0 = r1
            r1 = r11
            java.lang.Object r7 = r1.a(r2, r3, r4, r5, r6)
            if (r7 != r14) goto L63
            return r14
        L63:
            zy5 r7 = (defpackage.zy5) r7
            zo2 r8 = new zo2
            r8.<init>(r10, r7, r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq9.c(long, int, lu0, cz5, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.o05
    public void d() {
    }

    @Override // defpackage.pic
    public /* bridge */ /* synthetic */ void e(Object obj) {
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        return nd7.s((Executor) bg4Var.f(new lqb(ip0.class, Executor.class)));
    }

    @Override // defpackage.o05
    public void j(d05 d05Var) {
    }

    public w3 k(Context context, String str, lq9 lq9Var) {
        w3 w3Var = new w3();
        int iD = lq9Var.d(context, str, true);
        w3Var.b = iD;
        if (iD != 0) {
            w3Var.c = 1;
        } else {
            int iC = lq9Var.c(context, str);
            w3Var.a = iC;
            if (iC != 0) {
                w3Var.c = -1;
            }
        }
        return w3Var;
    }

    @Override // defpackage.o05
    public void n(q64 q64Var) {
    }

    @Override // defpackage.df9
    public Object r(gy8 gy8Var) {
        switch (this.a) {
            case 6:
                long jM = 0;
                try {
                    jM = lz7.M(gy8Var, 0L);
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
                }
                return Long.valueOf(jM);
            default:
                long jM2 = 0;
                try {
                    jM2 = lz7.M(gy8Var, 0L);
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
                }
                return Long.valueOf(jM2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.s43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.gle w(defpackage.gy8 r20) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq9.w(gy8):gle");
    }
}
