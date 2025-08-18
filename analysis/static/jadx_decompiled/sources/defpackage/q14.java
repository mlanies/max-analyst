package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q14 implements zd8, h6d, r13 {
    public static final Pattern I0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern J0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final lr4 A0;
    public xd8 B0;
    public sc3 E0;
    public i14 F0;
    public int G0;
    public List H0;
    public final huc X;
    public final die Y;
    public final long Z;
    public final int a;
    public final jn b;
    public final z0f c;
    public final tr4 o;
    public final lo7 s0;
    public final n64 t0;
    public final tze u0;
    public final o14[] v0;
    public final oq9 w0;
    public final e4b x0;
    public final jn z0;
    public t13[] C0 = new t13[0];
    public g45[] D0 = new g45[0];
    public final IdentityHashMap y0 = new IdentityHashMap();

    public q14(int i, i14 i14Var, die dieVar, int i2, jn jnVar, z0f z0fVar, tr4 tr4Var, lr4 lr4Var, huc hucVar, jn jnVar2, long j, lo7 lo7Var, n64 n64Var, oq9 oq9Var, ey1 ey1Var, j4b j4bVar) throws NumberFormatException {
        int i3;
        int i4;
        int i5;
        qy5[] qy5VarArr;
        qy5[] qy5VarArrM;
        ai4 ai4VarB;
        Integer num;
        tr4 tr4Var2 = tr4Var;
        this.a = i;
        this.F0 = i14Var;
        this.Y = dieVar;
        this.G0 = i2;
        this.b = jnVar;
        this.c = z0fVar;
        this.o = tr4Var2;
        this.A0 = lr4Var;
        this.X = hucVar;
        this.z0 = jnVar2;
        this.Z = j;
        this.s0 = lo7Var;
        this.t0 = n64Var;
        this.w0 = oq9Var;
        this.x0 = new e4b(i14Var, ey1Var, n64Var);
        int i6 = 0;
        oq9Var.getClass();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        this.E0 = new sc3(ffcVar, ffcVar);
        kta ktaVarB = i14Var.b(i2);
        List list = ktaVarB.d;
        this.H0 = list;
        List list2 = ktaVarB.c;
        int size = list2.size();
        HashMap map = new HashMap(ngg.j(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            map.put(Long.valueOf(((u8) list2.get(i7)).a), Integer.valueOf(i7));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        int i8 = 0;
        while (i8 < size) {
            u8 u8Var = (u8) list2.get(i8);
            ai4 ai4VarB2 = b("http://dashif.org/guidelines/trickmode", u8Var.e);
            List list3 = u8Var.f;
            ai4VarB2 = ai4VarB2 == null ? b("http://dashif.org/guidelines/trickmode", list3) : ai4VarB2;
            int iIntValue = (ai4VarB2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(ai4VarB2.b)))) == null) ? i8 : num.intValue();
            if (iIntValue == i8 && (ai4VarB = b("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i9 = oaf.a;
                String[] strArrSplit = ai4VarB.b.split(",", -1);
                int length = strArrSplit.length;
                for (int i10 = i6; i10 < length; i10++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i10])));
                    if (num2 != null) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i8) {
                List list4 = (List) sparseArray.get(i8);
                List list5 = (List) sparseArray.get(iIntValue);
                list5.addAll(list4);
                sparseArray.put(i8, list5);
                arrayList.remove(list4);
            }
            i8++;
            i6 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i11 = 0; i11 < size2; i11++) {
            int[] iArrC0 = s5c.c0((Collection) arrayList.get(i11));
            iArr[i11] = iArrC0;
            Arrays.sort(iArrC0);
        }
        boolean[] zArr = new boolean[size2];
        qy5[][] qy5VarArr2 = new qy5[size2][];
        int i12 = 0;
        int i13 = 0;
        while (i12 < size2) {
            int[] iArr2 = iArr[i12];
            int length2 = iArr2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    break;
                }
                List list6 = ((u8) list2.get(iArr2[i14])).c;
                int[] iArr3 = iArr2;
                for (int i15 = 0; i15 < list6.size(); i15++) {
                    if (!((lhc) list6.get(i15)).o.isEmpty()) {
                        zArr[i12] = true;
                        i13++;
                        break;
                    }
                }
                i14++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i12];
            int length3 = iArr4.length;
            int i16 = 0;
            while (i16 < length3) {
                int i17 = iArr4[i16];
                u8 u8Var2 = (u8) list2.get(i17);
                List list7 = ((u8) list2.get(i17)).d;
                int[] iArr5 = iArr4;
                int i18 = length3;
                int i19 = 0;
                while (i19 < list7.size()) {
                    ai4 ai4Var = (ai4) list7.get(i19);
                    List list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(ai4Var.a)) {
                        ny5 ny5Var = new ny5();
                        ny5Var.m = ia9.l("application/cea-608");
                        ny5Var.a = zr6.k(new StringBuilder(), u8Var2.a, ":cea608");
                        qy5VarArrM = m(ai4Var, I0, new qy5(ny5Var));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(ai4Var.a)) {
                        ny5 ny5Var2 = new ny5();
                        ny5Var2.m = ia9.l("application/cea-708");
                        ny5Var2.a = zr6.k(new StringBuilder(), u8Var2.a, ":cea708");
                        qy5VarArrM = m(ai4Var, J0, new qy5(ny5Var2));
                    } else {
                        i19++;
                        list7 = list8;
                    }
                    qy5VarArr = qy5VarArrM;
                    i5 = 1;
                }
                i16++;
                iArr4 = iArr5;
                length3 = i18;
            }
            i5 = 1;
            qy5VarArr = new qy5[0];
            qy5VarArr2[i12] = qy5VarArr;
            if (qy5VarArr.length != 0) {
                i13 += i5;
            }
            i12 += i5;
        }
        int size3 = list.size() + i13 + size2;
        rze[] rzeVarArr = new rze[size3];
        o14[] o14VarArr = new o14[size3];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr6 = iArr[i20];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr6.length;
            int i22 = size2;
            int i23 = 0;
            while (i23 < length4) {
                arrayList3.addAll(((u8) list2.get(iArr6[i23])).c);
                i23++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            qy5[] qy5VarArr3 = new qy5[size4];
            int i24 = 0;
            while (i24 < size4) {
                int i25 = size4;
                qy5 qy5Var = ((lhc) arrayList3.get(i24)).a;
                ArrayList arrayList4 = arrayList3;
                ny5 ny5VarA = qy5Var.a();
                ny5VarA.J = tr4Var2.d(qy5Var);
                qy5VarArr3[i24] = new qy5(ny5VarA);
                i24++;
                size4 = i25;
                arrayList3 = arrayList4;
            }
            u8 u8Var3 = (u8) list2.get(iArr6[0]);
            long j2 = u8Var3.a;
            String string = j2 != -1 ? Long.toString(j2) : zr6.h(i20, "unset:");
            int i26 = i21 + 1;
            if (zArr[i20]) {
                i3 = i26;
                i26 = i21 + 2;
            } else {
                i3 = -1;
            }
            if (qy5VarArr2[i20].length != 0) {
                i4 = i26;
                i26++;
            } else {
                i4 = -1;
            }
            d(jnVar, qy5VarArr3);
            List list9 = list2;
            rzeVarArr[i21] = new rze(string, qy5VarArr3);
            ls5 ls5Var2 = zw6.b;
            ffc ffcVar2 = ffc.X;
            o14VarArr[i21] = new o14(u8Var3.b, 0, iArr6, i21, i3, i4, -1, ffcVar2);
            int i27 = i3;
            int i28 = -1;
            if (i27 != -1) {
                String strG = au1.g(string, ":emsg");
                ny5 ny5Var3 = new ny5();
                ny5Var3.a = strG;
                ny5Var3.m = ia9.l("application/x-emsg");
                rzeVarArr[i27] = new rze(strG, new qy5(ny5Var3));
                o14VarArr[i27] = new o14(5, 1, iArr6, i21, -1, -1, -1, ffcVar2);
                i28 = -1;
            }
            if (i4 != i28) {
                String strG2 = au1.g(string, ":cc");
                o14VarArr[i4] = new o14(3, 1, iArr6, i21, -1, -1, -1, zw6.k(qy5VarArr2[i20]));
                d(jnVar, qy5VarArr2[i20]);
                rzeVarArr[i4] = new rze(strG2, qy5VarArr2[i20]);
            }
            i20++;
            size2 = i22;
            tr4Var2 = tr4Var;
            iArr = iArr7;
            i21 = i26;
            list2 = list9;
        }
        int i29 = 0;
        while (i29 < list.size()) {
            k45 k45Var = (k45) list.get(i29);
            ny5 ny5Var4 = new ny5();
            ny5Var4.a = k45Var.a();
            ny5Var4.m = ia9.l("application/x-emsg");
            rzeVarArr[i21] = new rze(k45Var.a() + ":" + i29, new qy5(ny5Var4));
            ls5 ls5Var3 = zw6.b;
            o14VarArr[i21] = new o14(5, 2, new int[0], -1, -1, -1, i29, ffc.X);
            i29++;
            i21++;
        }
        Pair pairCreate = Pair.create(new tze(rzeVarArr), o14VarArr);
        this.u0 = (tze) pairCreate.first;
        this.v0 = (o14[]) pairCreate.second;
    }

    public static ai4 b(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            ai4 ai4Var = (ai4) list.get(i);
            if (str.equals(ai4Var.a)) {
                return ai4Var;
            }
        }
        return null;
    }

    public static void d(jn jnVar, qy5[] qy5VarArr) {
        for (int i = 0; i < qy5VarArr.length; i++) {
            qy5 qy5VarA = qy5VarArr[i];
            cb4 cb4Var = (cb4) jnVar.o;
            if (cb4Var.c && cb4Var.b.a(qy5VarA)) {
                ny5 ny5VarA = qy5VarA.a();
                ny5VarA.m = ia9.l("application/x-media3-cues");
                ny5VarA.G = cb4Var.b.l(qy5VarA);
                StringBuilder sb = new StringBuilder();
                sb.append(qy5VarA.n);
                String str = qy5VarA.j;
                sb.append(str != null ? " ".concat(str) : "");
                ny5VarA.i = sb.toString();
                ny5VarA.r = Long.MAX_VALUE;
                qy5VarA = ny5VarA.a();
            }
            qy5VarArr[i] = qy5VarA;
        }
    }

    public static qy5[] m(ai4 ai4Var, Pattern pattern, qy5 qy5Var) throws NumberFormatException {
        String str = ai4Var.b;
        if (str == null) {
            return new qy5[]{qy5Var};
        }
        int i = oaf.a;
        String[] strArrSplit = str.split(";", -1);
        qy5[] qy5VarArr = new qy5[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            Matcher matcher = pattern.matcher(strArrSplit[i2]);
            if (!matcher.matches()) {
                return new qy5[]{qy5Var};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            ny5 ny5VarA = qy5Var.a();
            ny5VarA.a = qy5Var.a + ":" + i3;
            ny5VarA.F = i3;
            ny5VarA.d = matcher.group(2);
            qy5VarArr[i2] = new qy5(ny5VarA);
        }
        return qy5VarArr;
    }

    @Override // defpackage.j6d
    public final boolean a() {
        return this.E0.a();
    }

    public final int c(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        o14[] o14VarArr = this.v0;
        int i3 = o14VarArr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && o14VarArr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // defpackage.j6d
    public final long f() {
        return this.E0.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.zd8
    public final long g(n85[] n85VarArr, boolean[] zArr, grc[] grcVarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int i2;
        int[] iArr2;
        grc[] grcVarArr2;
        ?? r4;
        rze rzeVarA;
        boolean z2;
        boolean z3;
        n85[] n85VarArr2 = n85VarArr;
        grc[] grcVarArr3 = grcVarArr;
        int[] iArr3 = new int[n85VarArr2.length];
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= n85VarArr2.length) {
                break;
            }
            n85 n85Var = n85VarArr2[i3];
            if (n85Var != null) {
                iArr3[i3] = this.u0.b(n85Var.a());
            } else {
                iArr3[i3] = -1;
            }
            i3++;
        }
        for (int i4 = 0; i4 < n85VarArr2.length; i4++) {
            if (n85VarArr2[i4] == null || !zArr[i4]) {
                grc grcVar = grcVarArr3[i4];
                if (grcVar instanceof t13) {
                    ((t13) grcVar).B(this);
                } else if (grcVar instanceof p13) {
                    ((p13) grcVar).b();
                }
                grcVarArr3[i4] = null;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= n85VarArr2.length) {
                break;
            }
            grc grcVar2 = grcVarArr3[i5];
            if ((grcVar2 instanceof sz4) || (grcVar2 instanceof p13)) {
                int iC = c(i5, iArr3);
                if (iC == -1) {
                    z3 = grcVarArr3[i5] instanceof sz4;
                } else {
                    grc grcVar3 = grcVarArr3[i5];
                    z3 = (grcVar3 instanceof p13) && ((p13) grcVar3).a == grcVarArr3[iC];
                }
                if (!z3) {
                    grc grcVar4 = grcVarArr3[i5];
                    if (grcVar4 instanceof p13) {
                        ((p13) grcVar4).b();
                    }
                    grcVarArr3[i5] = null;
                }
            }
            i5++;
        }
        int i6 = 0;
        while (i6 < n85VarArr2.length) {
            n85 n85Var2 = n85VarArr2[i6];
            if (n85Var2 == null) {
                i2 = i6;
                iArr2 = iArr3;
                grcVarArr2 = grcVarArr3;
            } else {
                grc grcVar5 = grcVarArr3[i6];
                if (grcVar5 == null) {
                    zArr2[i6] = z;
                    o14 o14Var = this.v0[iArr3[i6]];
                    int i7 = o14Var.c;
                    if (i7 == 0) {
                        int i8 = o14Var.f;
                        boolean z4 = i8 != i ? z : false;
                        if (z4) {
                            rzeVarA = this.u0.a(i8);
                            r4 = z;
                        } else {
                            r4 = 0;
                            rzeVarA = null;
                        }
                        int i9 = o14Var.g;
                        zw6 zw6VarM = i9 != i ? this.v0[i9].h : zw6.m();
                        int size = zw6VarM.size() + r4;
                        qy5[] qy5VarArr = new qy5[size];
                        int[] iArr4 = new int[size];
                        if (z4) {
                            qy5VarArr[0] = rzeVarA.c();
                            iArr4[0] = 5;
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        ArrayList arrayList = new ArrayList();
                        int i10 = 0;
                        ?? r3 = z2;
                        while (i10 < zw6VarM.size()) {
                            qy5 qy5Var = (qy5) zw6VarM.get(i10);
                            qy5VarArr[r3] = qy5Var;
                            iArr4[r3] = 3;
                            arrayList.add(qy5Var);
                            i10++;
                            r3++;
                        }
                        d4b d4bVarA = (this.F0.d && z4) ? this.x0.a() : null;
                        i2 = i6;
                        d4b d4bVar = d4bVarA;
                        iArr2 = iArr3;
                        t13 t13Var = new t13(o14Var.b, iArr4, qy5VarArr, this.b.k(this.s0, this.F0, this.Y, this.G0, o14Var.a, n85Var2, o14Var.b, this.Z, z4, arrayList, d4bVarA, this.c), this, this.t0, j, this.o, this.A0, this.X, this.z0);
                        synchronized (this) {
                            this.y0.put(t13Var, d4bVar);
                        }
                        grcVarArr2 = grcVarArr;
                        grcVarArr2[i2] = t13Var;
                    } else {
                        i2 = i6;
                        iArr2 = iArr3;
                        grcVarArr2 = grcVarArr3;
                        if (i7 == 2) {
                            grcVarArr2[i2] = new g45((k45) this.H0.get(o14Var.d), n85Var2.a().c(), this.F0.d);
                        }
                    }
                } else {
                    i2 = i6;
                    iArr2 = iArr3;
                    grcVarArr2 = grcVarArr3;
                    if (grcVar5 instanceof t13) {
                        ((t13) grcVar5).u().c(n85Var2);
                    }
                }
            }
            i6 = i2 + 1;
            n85VarArr2 = n85VarArr;
            grcVarArr3 = grcVarArr2;
            iArr3 = iArr2;
            z = true;
            i = -1;
        }
        int[] iArr5 = iArr3;
        grc[] grcVarArr4 = grcVarArr3;
        int i11 = 0;
        while (i11 < n85VarArr.length) {
            if (grcVarArr4[i11] != null || n85VarArr[i11] == null) {
                iArr = iArr5;
            } else {
                iArr = iArr5;
                o14 o14Var2 = this.v0[iArr[i11]];
                if (o14Var2.c == 1) {
                    int iC2 = c(i11, iArr);
                    if (iC2 == -1) {
                        grcVarArr4[i11] = new sz4();
                    } else {
                        grcVarArr4[i11] = ((t13) grcVarArr4[iC2]).D(o14Var2.b, j);
                    }
                    i11++;
                    iArr5 = iArr;
                }
            }
            i11++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (grc grcVar6 : grcVarArr4) {
            if (grcVar6 instanceof t13) {
                arrayList2.add((t13) grcVar6);
            } else if (grcVar6 instanceof g45) {
                arrayList3.add((g45) grcVar6);
            }
        }
        t13[] t13VarArr = new t13[arrayList2.size()];
        this.C0 = t13VarArr;
        arrayList2.toArray(t13VarArr);
        g45[] g45VarArr = new g45[arrayList3.size()];
        this.D0 = g45VarArr;
        arrayList3.toArray(g45VarArr);
        oq9 oq9Var = this.w0;
        AbstractList abstractListZ = br7.Z(new yv3(9), arrayList2);
        oq9Var.getClass();
        this.E0 = new sc3(arrayList2, abstractListZ);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    @Override // defpackage.zd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(long r18, defpackage.x1d r20) {
        /*
            r17 = this;
            r1 = r18
            r0 = r17
            t13[] r0 = r0.C0
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L9:
            if (r5 >= r3) goto L74
            r6 = r0[r5]
            int r7 = r6.a
            r8 = 2
            if (r7 != r8) goto L71
            g94 r0 = r6.X
            c94[] r0 = r0.i
            int r3 = r0.length
        L17:
            if (r4 >= r3) goto L6f
            r5 = r0[r4]
            java.lang.Object r6 = r5.g
            a24 r6 = (defpackage.a24) r6
            if (r6 == 0) goto L6c
            long r6 = r5.e()
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L2c
            goto L6c
        L2c:
            java.lang.Object r0 = r5.g
            a24 r0 = (defpackage.a24) r0
            defpackage.fm9.l(r0)
            long r3 = r5.b
            long r3 = r0.v(r1, r3)
            long r8 = r5.c
            long r3 = r3 + r8
            long r10 = r5.g(r3)
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 >= 0) goto L61
            r12 = -1
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            r13 = 1
            if (r12 == 0) goto L5a
            defpackage.fm9.l(r0)
            long r15 = r0.C()
            long r15 = r15 + r8
            long r15 = r15 + r6
            long r15 = r15 - r13
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 >= 0) goto L61
        L5a:
            long r3 = r3 + r13
            long r3 = r5.g(r3)
            r5 = r3
            goto L62
        L61:
            r5 = r10
        L62:
            r0 = r20
            r1 = r18
            r3 = r10
            long r0 = r0.a(r1, r3, r5)
            goto L70
        L6c:
            int r4 = r4 + 1
            goto L17
        L6f:
            r0 = r1
        L70:
            return r0
        L71:
            int r5 = r5 + 1
            goto L9
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q14.h(long, x1d):long");
    }

    @Override // defpackage.zd8
    public final void i(xd8 xd8Var, long j) {
        this.B0 = xd8Var;
        xd8Var.e(this);
    }

    @Override // defpackage.h6d
    public final void j(j6d j6dVar) {
        this.B0.j(this);
    }

    @Override // defpackage.zd8
    public final void k() {
        this.s0.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        r13 = null;
     */
    @Override // defpackage.zd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(long r18) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q14.l(long):long");
    }

    @Override // defpackage.zd8
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // defpackage.j6d
    public final boolean o(qo7 qo7Var) {
        return this.E0.o(qo7Var);
    }

    @Override // defpackage.zd8
    public final tze q() {
        return this.u0;
    }

    @Override // defpackage.j6d
    public final long r() {
        return this.E0.r();
    }

    @Override // defpackage.zd8
    public final void s(long j, boolean z) {
        long j2;
        for (t13 t13Var : this.C0) {
            if (!t13Var.y()) {
                erc ercVar = t13Var.x0;
                int i = ercVar.q;
                ercVar.g(j, z, true);
                erc ercVar2 = t13Var.x0;
                int i2 = ercVar2.q;
                if (i2 > i) {
                    synchronized (ercVar2) {
                        j2 = ercVar2.p == 0 ? Long.MIN_VALUE : ercVar2.n[ercVar2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        erc[] ercVarArr = t13Var.y0;
                        if (i3 >= ercVarArr.length) {
                            break;
                        }
                        ercVarArr[i3].g(j2, z, t13Var.o[i3]);
                        i3++;
                    }
                }
                int iMin = Math.min(t13Var.A(i2, 0), t13Var.F0);
                if (iMin > 0) {
                    oaf.X(t13Var.v0, 0, iMin);
                    t13Var.F0 -= iMin;
                }
            }
        }
    }

    @Override // defpackage.j6d
    public final void t(long j) {
        this.E0.t(j);
    }
}
