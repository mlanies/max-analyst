package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class jc6 implements o55, Provider, abe {
    public static int Y;
    public Object X;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public jc6(p3f p3fVar, HashMap map, HashMap map2, HashMap map3) {
        this.a = p3fVar;
        this.o = map2;
        this.X = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        p3fVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.jc6 r4, long r5, java.util.List r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof defpackage.hc6
            if (r0 == 0) goto L16
            r0 = r8
            hc6 r0 = (defpackage.hc6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Y = r1
            goto L1b
        L16:
            hc6 r0 = new hc6
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.od2.a0(r8)
            goto L4d
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            defpackage.od2.a0(r8)
            java.lang.Object r4 = r4.c
            je7 r4 = (defpackage.je7) r4
            java.lang.Object r4 = r4.getValue()
            ome r4 = (defpackage.ome) r4
            tq2 r8 = new tq2
            r8.<init>(r5, r7)
            r0.Y = r3
            java.lang.Object r8 = r4.e(r8, r0)
            if (r8 != r1) goto L4d
            goto L51
        L4d:
            xe9 r8 = (defpackage.xe9) r8
            java.util.List r1 = r8.o
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc6.b(jc6, long, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.o55
    public ExecutorService a() {
        return (ExecutorService) this.b;
    }

    @Override // defpackage.o55
    public ExecutorService c() {
        return (ExecutorService) this.o;
    }

    @Override // defpackage.o55
    public ExecutorService d() {
        return (ExecutorService) this.c;
    }

    @Override // defpackage.o55
    public ExecutorService e() {
        return (ExecutorService) this.a;
    }

    public void f(qv4 qv4Var, ov4 ov4Var, boolean z) {
        cqc.b((iq1) this.X);
        hle hleVar = (hle) this.b;
        Resources resources = (Resources) this.a;
        iqd iqdVarE = (ov4Var == null || !ov4Var.o) ? ((pkg) this.c).e(resources, hleVar) : ((pkg) this.o).e(resources, hleVar);
        iq1 iq1Var = new iq1(new t64(this, qv4Var, ov4Var, z), 2, new yt8(17, this));
        iqdVarE.k(iq1Var);
        this.X = iq1Var;
    }

    @Override // defpackage.abe
    public int g(long j) {
        long[] jArr = (long[]) this.b;
        int iB = maf.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new gqc((d9f) ((Provider) this.a).get(), (d9f) ((Provider) this.b).get(), (ka0) ((Provider) this.c).get(), (puc) ((Provider) this.o).get(), (Provider) this.X);
    }

    @Override // defpackage.o55
    public ExecutorService h() {
        return (ExecutorService) this.a;
    }

    @Override // defpackage.abe
    public long i(int i) {
        return ((long[]) this.b)[i];
    }

    @Override // defpackage.o55
    public ExecutorService j() {
        return (ExecutorService) this.a;
    }

    public o90 k() {
        String strG = ((Range) this.a) == null ? " bitrate" : "";
        if (((Integer) this.b) == null) {
            strG = strG.concat(" sourceFormat");
        }
        if (((Integer) this.c) == null) {
            strG = au1.g(strG, " source");
        }
        if (((Range) this.o) == null) {
            strG = au1.g(strG, " sampleRate");
        }
        if (((Integer) this.X) == null) {
            strG = au1.g(strG, " channelCount");
        }
        if (strG.isEmpty()) {
            return new o90((Range) this.a, ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (Range) this.o, ((Integer) this.X).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strG));
    }

    public void l() {
        kq0.e();
        l84 l84Var = (l84) this.c;
        l84Var.getClass();
        kq0.e();
        y90 y90Var = (y90) l84Var.d;
        Objects.requireNonNull(y90Var);
        hqc hqcVar = (hqc) l84Var.b;
        Objects.requireNonNull(hqcVar);
        l84Var.getClass();
        fw6 fw6Var = y90Var.b;
        Objects.requireNonNull(fw6Var);
        fw6Var.a();
        fw6 fw6Var2 = y90Var.b;
        Objects.requireNonNull(fw6Var2);
        kq0.w(fw6Var2.e).d(new nz1(hqcVar, 0), ju0.D());
        fw6 fw6Var3 = y90Var.c;
        if (fw6Var3 != null) {
            fw6Var3.a();
            kq0.w(y90Var.c.e).d(new nz1(null, 1), ju0.D());
        }
        ((w9b) this.o).getClass();
    }

    @Override // defpackage.abe
    public List p(long j) {
        p3f p3fVar = (p3f) this.a;
        p3fVar.getClass();
        ArrayList arrayList = new ArrayList();
        p3fVar.g(j, p3fVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        p3fVar.i(j, false, p3fVar.h, treeMap);
        Map map = (Map) this.c;
        Map map2 = (Map) this.o;
        p3fVar.h(j, map, map2, p3fVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((Map) this.X).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                s3f s3fVar = (s3f) map2.get(pair.first);
                s3fVar.getClass();
                arrayList2.add(new xz3(null, null, null, bitmapDecodeByteArray, s3fVar.c, 0, s3fVar.e, s3fVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, s3fVar.f, s3fVar.g, false, -16777216, s3fVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            s3f s3fVar2 = (s3f) map2.get(entry.getKey());
            s3fVar2.getClass();
            vz3 vz3Var = (vz3) entry.getValue();
            CharSequence charSequence = vz3Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (hh4 hh4Var : (hh4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hh4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(hh4Var), spannableStringBuilder.getSpanEnd(hh4Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            vz3Var.e = s3fVar2.c;
            vz3Var.f = s3fVar2.d;
            vz3Var.g = s3fVar2.e;
            vz3Var.h = s3fVar2.b;
            vz3Var.l = s3fVar2.f;
            vz3Var.k = s3fVar2.i;
            vz3Var.j = s3fVar2.h;
            vz3Var.p = s3fVar2.j;
            arrayList2.add(vz3Var.a());
        }
        return arrayList2;
    }

    @Override // defpackage.abe
    public int u() {
        return ((long[]) this.b).length;
    }
}
