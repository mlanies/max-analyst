package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p14 implements yd8, g6d, q13 {
    public static final Pattern I0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern J0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final kr4 A0;
    public wd8 B0;
    public rxd E0;
    public h14 F0;
    public int G0;
    public List H0;
    public final buc X;
    public final c8d Y;
    public final long Z;
    public final int a;
    public final ey1 b;
    public final y0f c;
    public final sr4 o;
    public final ko7 s0;
    public final n64 t0;
    public final sze u0;
    public final n14[] v0;
    public final mq9 w0;
    public final e4b x0;
    public final gk8 z0;
    public s13[] C0 = new s13[0];
    public f45[] D0 = new f45[0];
    public final IdentityHashMap y0 = new IdentityHashMap();

    public p14(int i, h14 h14Var, c8d c8dVar, int i2, ey1 ey1Var, y0f y0fVar, sr4 sr4Var, kr4 kr4Var, buc bucVar, gk8 gk8Var, long j, ko7 ko7Var, n64 n64Var, mq9 mq9Var, wmc wmcVar, i4b i4bVar) throws NumberFormatException {
        int i3;
        List list;
        int i4;
        int i5;
        oy5[] oy5VarArr;
        oy5[] oy5VarArrG;
        zh4 zh4VarB;
        this.a = i;
        this.F0 = h14Var;
        this.Y = c8dVar;
        this.G0 = i2;
        this.b = ey1Var;
        this.c = y0fVar;
        this.o = sr4Var;
        this.A0 = kr4Var;
        this.X = bucVar;
        this.z0 = gk8Var;
        this.Z = j;
        this.s0 = ko7Var;
        this.t0 = n64Var;
        this.w0 = mq9Var;
        this.x0 = new e4b(h14Var, wmcVar, n64Var);
        int i6 = 0;
        s13[] s13VarArr = this.C0;
        mq9Var.getClass();
        this.E0 = new rxd(10, s13VarArr);
        jta jtaVarB = h14Var.b(i2);
        List list2 = jtaVarB.d;
        this.H0 = list2;
        List list3 = jtaVarB.c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            sparseIntArray.put(((t8) list3.get(i7)).a, i7);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i7));
            arrayList.add(arrayList2);
            sparseArray.put(i7, arrayList2);
        }
        int i8 = 0;
        while (i8 < size) {
            t8 t8Var = (t8) list3.get(i8);
            zh4 zh4VarB2 = b("http://dashif.org/guidelines/trickmode", t8Var.e);
            List list4 = t8Var.f;
            zh4VarB2 = zh4VarB2 == null ? b("http://dashif.org/guidelines/trickmode", list4) : zh4VarB2;
            int iMin = (zh4VarB2 == null || (iMin = sparseIntArray.get(Integer.parseInt(zh4VarB2.b), -1)) == -1) ? i8 : iMin;
            if (iMin == i8 && (zh4VarB = b("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i9 = maf.a;
                String[] strArrSplit = zh4VarB.b.split(",", -1);
                int length = strArrSplit.length;
                for (int i10 = i6; i10 < length; i10++) {
                    int i11 = sparseIntArray.get(Integer.parseInt(strArrSplit[i10]), -1);
                    if (i11 != -1) {
                        iMin = Math.min(iMin, i11);
                    }
                }
            }
            if (iMin != i8) {
                List list5 = (List) sparseArray.get(i8);
                List list6 = (List) sparseArray.get(iMin);
                list6.addAll(list5);
                sparseArray.put(i8, list6);
                arrayList.remove(list5);
            }
            i8++;
            i6 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] iArrC0 = s5c.c0((Collection) arrayList.get(i12));
            iArr[i12] = iArrC0;
            Arrays.sort(iArrC0);
        }
        boolean[] zArr = new boolean[size2];
        oy5[][] oy5VarArr2 = new oy5[size2][];
        int i13 = 0;
        int i14 = 0;
        while (i13 < size2) {
            int[] iArr2 = iArr[i13];
            int length2 = iArr2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    break;
                }
                List list7 = ((t8) list3.get(iArr2[i15])).c;
                for (int i16 = 0; i16 < list7.size(); i16++) {
                    if (!((khc) list7.get(i16)).o.isEmpty()) {
                        zArr[i13] = true;
                        i14++;
                        break;
                    }
                }
                i15++;
            }
            int[] iArr3 = iArr[i13];
            int length3 = iArr3.length;
            int i17 = 0;
            while (i17 < length3) {
                int i18 = iArr3[i17];
                t8 t8Var2 = (t8) list3.get(i18);
                List list8 = ((t8) list3.get(i18)).d;
                int[] iArr4 = iArr3;
                int i19 = 0;
                while (i19 < list8.size()) {
                    zh4 zh4Var = (zh4) list8.get(i19);
                    int i20 = length3;
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(zh4Var.a)) {
                        my5 my5Var = new my5();
                        my5Var.k = "application/cea-608";
                        int i21 = t8Var2.a;
                        StringBuilder sb = new StringBuilder(18);
                        sb.append(i21);
                        sb.append(":cea608");
                        my5Var.a = sb.toString();
                        oy5VarArrG = g(zh4Var, I0, new oy5(my5Var));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(zh4Var.a)) {
                        my5 my5Var2 = new my5();
                        my5Var2.k = "application/cea-708";
                        int i22 = t8Var2.a;
                        StringBuilder sb2 = new StringBuilder(18);
                        sb2.append(i22);
                        sb2.append(":cea708");
                        my5Var2.a = sb2.toString();
                        oy5VarArrG = g(zh4Var, J0, new oy5(my5Var2));
                    } else {
                        i19++;
                        list8 = list9;
                        length3 = i20;
                    }
                    oy5VarArr = oy5VarArrG;
                    i5 = 1;
                }
                i17++;
                iArr3 = iArr4;
            }
            i5 = 1;
            oy5VarArr = new oy5[0];
            oy5VarArr2[i13] = oy5VarArr;
            if (oy5VarArr.length != 0) {
                i14 += i5;
            }
            i13 += i5;
        }
        int size3 = list2.size() + i14 + size2;
        qze[] qzeVarArr = new qze[size3];
        n14[] n14VarArr = new n14[size3];
        int i23 = 0;
        int i24 = 0;
        while (i24 < size2) {
            int[] iArr5 = iArr[i24];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr5.length;
            int i25 = size2;
            int i26 = 0;
            while (i26 < length4) {
                arrayList3.addAll(((t8) list3.get(iArr5[i26])).c);
                i26++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            oy5[] oy5VarArr3 = new oy5[size4];
            int i27 = 0;
            while (i27 < size4) {
                int i28 = size4;
                oy5 oy5Var = ((khc) arrayList3.get(i27)).a;
                ArrayList arrayList4 = arrayList3;
                int iB = sr4Var.b(oy5Var);
                my5 my5VarA = oy5Var.a();
                my5VarA.D = iB;
                oy5VarArr3[i27] = my5VarA.a();
                i27++;
                size4 = i28;
                arrayList3 = arrayList4;
            }
            t8 t8Var3 = (t8) list3.get(iArr5[0]);
            int i29 = t8Var3.a;
            String string = i29 != -1 ? Integer.toString(i29) : z7b.h(17, i24, "unset:");
            int i30 = i23 + 1;
            if (zArr[i24]) {
                i3 = i30;
                i30 = i23 + 2;
            } else {
                i3 = -1;
            }
            if (oy5VarArr2[i24].length != 0) {
                i4 = i30;
                i30++;
                list = list3;
            } else {
                list = list3;
                i4 = -1;
            }
            qzeVarArr[i23] = new qze(string, oy5VarArr3);
            n14VarArr[i23] = new n14(t8Var3.b, 0, iArr5, i23, i3, i4, -1);
            int i31 = i3;
            int i32 = -1;
            if (i31 != -1) {
                String strConcat = String.valueOf(string).concat(":emsg");
                my5 my5Var3 = new my5();
                my5Var3.a = strConcat;
                my5Var3.k = "application/x-emsg";
                qzeVarArr[i31] = new qze(strConcat, new oy5(my5Var3));
                n14VarArr[i31] = new n14(5, 1, iArr5, i23, -1, -1, -1);
                i32 = -1;
            }
            if (i4 != i32) {
                qzeVarArr[i4] = new qze(String.valueOf(string).concat(":cc"), oy5VarArr2[i24]);
                n14VarArr[i4] = new n14(3, 1, iArr5, i23, -1, -1, -1);
            }
            i24++;
            size2 = i25;
            iArr = iArr6;
            i23 = i30;
            list3 = list;
        }
        int i33 = 0;
        while (i33 < list2.size()) {
            j45 j45Var = (j45) list2.get(i33);
            my5 my5Var4 = new my5();
            my5Var4.a = j45Var.a();
            my5Var4.k = "application/x-emsg";
            oy5 oy5Var2 = new oy5(my5Var4);
            String strA = j45Var.a();
            StringBuilder sb3 = new StringBuilder(rh4.e(12, strA));
            sb3.append(strA);
            sb3.append(":");
            sb3.append(i33);
            qzeVarArr[i23] = new qze(sb3.toString(), oy5Var2);
            n14VarArr[i23] = new n14(5, 2, new int[0], -1, -1, -1, i33);
            i33++;
            i23++;
        }
        Pair pairCreate = Pair.create(new sze(qzeVarArr), n14VarArr);
        this.u0 = (sze) pairCreate.first;
        this.v0 = (n14[]) pairCreate.second;
    }

    public static zh4 b(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            zh4 zh4Var = (zh4) list.get(i);
            if (str.equals(zh4Var.a)) {
                return zh4Var;
            }
        }
        return null;
    }

    public static oy5[] g(zh4 zh4Var, Pattern pattern, oy5 oy5Var) throws NumberFormatException {
        String str = zh4Var.b;
        if (str == null) {
            return new oy5[]{oy5Var};
        }
        int i = maf.a;
        String[] strArrSplit = str.split(";", -1);
        oy5[] oy5VarArr = new oy5[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            Matcher matcher = pattern.matcher(strArrSplit[i2]);
            if (!matcher.matches()) {
                return new oy5[]{oy5Var};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            my5 my5VarA = oy5Var.a();
            String str2 = oy5Var.a;
            StringBuilder sb = new StringBuilder(rh4.e(12, str2));
            sb.append(str2);
            sb.append(":");
            sb.append(i3);
            my5VarA.a = sb.toString();
            my5VarA.C = i3;
            my5VarA.c = matcher.group(2);
            oy5VarArr[i2] = new oy5(my5VarA);
        }
        return oy5VarArr;
    }

    @Override // defpackage.yd8
    public final long A(long j, w1d w1dVar) {
        for (s13 s13Var : this.C0) {
            if (s13Var.a == 2) {
                for (c94 c94Var : s13Var.X.h) {
                    z14 z14Var = (z14) c94Var.g;
                    if (z14Var != null) {
                        long j2 = c94Var.b;
                        long jV = z14Var.v(j, j2);
                        long j3 = c94Var.c;
                        long j4 = jV + j3;
                        long jG = c94Var.g(j4);
                        z14 z14Var2 = (z14) c94Var.g;
                        long jD = z14Var2.D(j2);
                        return w1dVar.a(j, jG, (jG >= j || (jD != -1 && j4 >= ((z14Var2.C() + j3) + jD) - 1)) ? jG : c94Var.g(j4 + 1));
                    }
                }
                return j;
            }
        }
        return j;
    }

    @Override // defpackage.i6d
    public final boolean C(long j) {
        return this.E0.C(j);
    }

    @Override // defpackage.yd8
    public final void J(wd8 wd8Var, long j) {
        this.B0 = wd8Var;
        wd8Var.d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    @Override // defpackage.yd8
    public final long L(m85[] m85VarArr, boolean[] zArr, frc[] frcVarArr, boolean[] zArr2, long j) {
        int i;
        boolean z;
        int[] iArr;
        int i2;
        int[] iArr2;
        frc[] frcVarArr2;
        ?? r4;
        qze qzeVarA;
        qze qzeVarA2;
        int i3;
        boolean z2;
        c4b c4bVar;
        boolean z3;
        m85[] m85VarArr2 = m85VarArr;
        frc[] frcVarArr3 = frcVarArr;
        int[] iArr3 = new int[m85VarArr2.length];
        int i4 = 0;
        while (true) {
            i = -1;
            if (i4 >= m85VarArr2.length) {
                break;
            }
            m85 m85Var = m85VarArr2[i4];
            if (m85Var != null) {
                iArr3[i4] = this.u0.b(m85Var.a());
            } else {
                iArr3[i4] = -1;
            }
            i4++;
        }
        for (int i5 = 0; i5 < m85VarArr2.length; i5++) {
            if (m85VarArr2[i5] == null || !zArr[i5]) {
                frc frcVar = frcVarArr3[i5];
                if (frcVar instanceof s13) {
                    ((s13) frcVar).v(this);
                } else if (frcVar instanceof o13) {
                    o13 o13Var = (o13) frcVar;
                    s13 s13Var = o13Var.X;
                    boolean[] zArr3 = s13Var.o;
                    int i6 = o13Var.c;
                    np8.f(zArr3[i6]);
                    s13Var.o[i6] = false;
                }
                frcVarArr3[i5] = null;
            }
        }
        int i7 = 0;
        while (true) {
            if (i7 >= m85VarArr2.length) {
                break;
            }
            frc frcVar2 = frcVarArr3[i7];
            if ((frcVar2 instanceof rz4) || (frcVar2 instanceof o13)) {
                int iE = e(i7, iArr3);
                if (iE == -1) {
                    z3 = frcVarArr3[i7] instanceof rz4;
                } else {
                    frc frcVar3 = frcVarArr3[i7];
                    z3 = (frcVar3 instanceof o13) && ((o13) frcVar3).a == frcVarArr3[iE];
                }
                if (!z3) {
                    frc frcVar4 = frcVarArr3[i7];
                    if (frcVar4 instanceof o13) {
                        o13 o13Var2 = (o13) frcVar4;
                        s13 s13Var2 = o13Var2.X;
                        boolean[] zArr4 = s13Var2.o;
                        int i8 = o13Var2.c;
                        np8.f(zArr4[i8]);
                        s13Var2.o[i8] = false;
                    }
                    frcVarArr3[i7] = null;
                }
            }
            i7++;
        }
        int i9 = 0;
        while (i9 < m85VarArr2.length) {
            m85 m85Var2 = m85VarArr2[i9];
            if (m85Var2 == null) {
                i2 = i9;
                iArr2 = iArr3;
                frcVarArr2 = frcVarArr3;
            } else {
                frc frcVar5 = frcVarArr3[i9];
                if (frcVar5 == null) {
                    zArr2[i9] = z;
                    n14 n14Var = this.v0[iArr3[i9]];
                    int i10 = n14Var.c;
                    if (i10 == 0) {
                        int i11 = n14Var.f;
                        boolean z4 = i11 != i ? z : false;
                        if (z4) {
                            qzeVarA = this.u0.a(i11);
                            r4 = z;
                        } else {
                            r4 = 0;
                            qzeVarA = null;
                        }
                        int i12 = n14Var.g;
                        boolean z5 = i12 != i ? z : false;
                        if (z5) {
                            qzeVarA2 = this.u0.a(i12);
                            i3 = r4 + qzeVarA2.a;
                        } else {
                            qzeVarA2 = null;
                            i3 = r4;
                        }
                        oy5[] oy5VarArr = new oy5[i3];
                        int[] iArr4 = new int[i3];
                        if (z4) {
                            oy5VarArr[0] = qzeVarA.c[0];
                            iArr4[0] = 5;
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z5) {
                            int i13 = 0;
                            ?? r3 = z2;
                            while (i13 < qzeVarA2.a) {
                                oy5 oy5Var = qzeVarA2.c[i13];
                                oy5VarArr[r3] = oy5Var;
                                iArr4[r3] = 3;
                                arrayList.add(oy5Var);
                                i13++;
                                r3++;
                            }
                        }
                        if (this.F0.d && z4) {
                            e4b e4bVar = this.x0;
                            c4bVar = new c4b(e4bVar, (n64) e4bVar.Z);
                        } else {
                            c4bVar = null;
                        }
                        ey1 ey1Var = this.b;
                        ko7 ko7Var = this.s0;
                        h14 h14Var = this.F0;
                        int i14 = i9;
                        c8d c8dVar = this.Y;
                        int[] iArr5 = iArr3;
                        int i15 = this.G0;
                        int[] iArr6 = n14Var.a;
                        int i16 = n14Var.b;
                        c4b c4bVar2 = c4bVar;
                        long j2 = this.Z;
                        y0f y0fVar = this.c;
                        r24 r24VarA = ((p24) ey1Var.b).a();
                        if (y0fVar != null) {
                            r24VarA.N(y0fVar);
                        }
                        i2 = i14;
                        iArr2 = iArr5;
                        s13 s13Var3 = new s13(n14Var.b, iArr4, oy5VarArr, new f94(ko7Var, h14Var, c8dVar, i15, iArr6, m85Var2, i16, r24VarA, j2, z4, arrayList, c4bVar2), this, this.t0, j, this.o, this.A0, this.X, this.z0);
                        synchronized (this) {
                            this.y0.put(s13Var3, c4bVar2);
                        }
                        frcVarArr2 = frcVarArr;
                        frcVarArr2[i2] = s13Var3;
                    } else {
                        i2 = i9;
                        iArr2 = iArr3;
                        frcVarArr2 = frcVarArr3;
                        if (i10 == 2) {
                            frcVarArr2[i2] = new f45((j45) this.H0.get(n14Var.d), m85Var2.a().c[0], this.F0.d);
                        }
                    }
                } else {
                    i2 = i9;
                    iArr2 = iArr3;
                    frcVarArr2 = frcVarArr3;
                    if (frcVar5 instanceof s13) {
                        ((s13) frcVar5).X.i = m85Var2;
                    }
                }
            }
            i9 = i2 + 1;
            frcVarArr3 = frcVarArr2;
            iArr3 = iArr2;
            z = true;
            i = -1;
            m85VarArr2 = m85VarArr;
        }
        int[] iArr7 = iArr3;
        frc[] frcVarArr4 = frcVarArr3;
        int i17 = 0;
        while (i17 < m85VarArr.length) {
            if (frcVarArr4[i17] != null || m85VarArr[i17] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                n14 n14Var2 = this.v0[iArr[i17]];
                if (n14Var2.c == 1) {
                    int iE2 = e(i17, iArr);
                    if (iE2 == -1) {
                        frcVarArr4[i17] = new rz4();
                    } else {
                        s13 s13Var4 = (s13) frcVarArr4[iE2];
                        int i18 = n14Var2.b;
                        int i19 = 0;
                        while (true) {
                            drc[] drcVarArr = s13Var4.y0;
                            if (i19 >= drcVarArr.length) {
                                throw new IllegalStateException();
                            }
                            if (s13Var4.b[i19] == i18) {
                                boolean[] zArr5 = s13Var4.o;
                                np8.f(!zArr5[i19]);
                                zArr5[i19] = true;
                                drcVarArr[i19].A(j, true);
                                frcVarArr4[i17] = new o13(s13Var4, s13Var4, drcVarArr[i19], i19);
                                break;
                            }
                            i19++;
                        }
                    }
                    i17++;
                    iArr7 = iArr;
                }
            }
            i17++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (frc frcVar6 : frcVarArr4) {
            if (frcVar6 instanceof s13) {
                arrayList2.add((s13) frcVar6);
            } else if (frcVar6 instanceof f45) {
                arrayList3.add((f45) frcVar6);
            }
        }
        s13[] s13VarArr = new s13[arrayList2.size()];
        this.C0 = s13VarArr;
        arrayList2.toArray(s13VarArr);
        f45[] f45VarArr = new f45[arrayList3.size()];
        this.D0 = f45VarArr;
        arrayList3.toArray(f45VarArr);
        mq9 mq9Var = this.w0;
        s13[] s13VarArr2 = this.C0;
        mq9Var.getClass();
        this.E0 = new rxd(10, s13VarArr2);
        return j;
    }

    @Override // defpackage.i6d
    public final boolean a() {
        return this.E0.a();
    }

    @Override // defpackage.g6d
    public final void c(i6d i6dVar) {
        this.B0.c(this);
    }

    public final int e(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        n14[] n14VarArr = this.v0;
        int i3 = n14VarArr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && n14VarArr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // defpackage.i6d
    public final long f() {
        return this.E0.f();
    }

    @Override // defpackage.yd8
    public final void k() {
        this.s0.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r12 = null;
     */
    @Override // defpackage.yd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(long r18) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p14.l(long):long");
    }

    @Override // defpackage.yd8
    public final long n() {
        return -9223372036854775807L;
    }

    @Override // defpackage.yd8
    public final sze q() {
        return this.u0;
    }

    @Override // defpackage.i6d
    public final long r() {
        return this.E0.r();
    }

    @Override // defpackage.yd8
    public final void s(long j, boolean z) {
        long j2;
        for (s13 s13Var : this.C0) {
            if (!s13Var.m()) {
                drc drcVar = s13Var.x0;
                int i = drcVar.q;
                drcVar.h(j, z, true);
                drc drcVar2 = s13Var.x0;
                int i2 = drcVar2.q;
                if (i2 > i) {
                    synchronized (drcVar2) {
                        j2 = drcVar2.p == 0 ? Long.MIN_VALUE : drcVar2.n[drcVar2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        drc[] drcVarArr = s13Var.y0;
                        if (i3 >= drcVarArr.length) {
                            break;
                        }
                        drcVarArr[i3].h(j2, z, s13Var.o[i3]);
                        i3++;
                    }
                }
                int iMin = Math.min(s13Var.u(i2, 0), s13Var.F0);
                if (iMin > 0) {
                    maf.I(s13Var.v0, 0, iMin);
                    s13Var.F0 -= iMin;
                }
            }
        }
    }

    @Override // defpackage.i6d
    public final void t(long j) {
        this.E0.t(j);
    }
}
