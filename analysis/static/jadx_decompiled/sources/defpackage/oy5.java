package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class oy5 implements su0 {
    public static final oy5 R0 = new oy5(new my5());
    public static final ig5 S0 = new ig5(16);
    public final long A0;
    public final int B0;
    public final int C0;
    public final float D0;
    public final int E0;
    public final float F0;
    public final byte[] G0;
    public final int H0;
    public final h63 I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public final int O0;
    public final int P0;
    public int Q0;
    public final int X;
    public final int Y;
    public final int Z;
    public final String a;
    public final String b;
    public final String c;
    public final int o;
    public final int s0;
    public final String t0;
    public final e99 u0;
    public final String v0;
    public final String w0;
    public final int x0;
    public final List y0;
    public final cr4 z0;

    public oy5(my5 my5Var) {
        this.a = my5Var.a;
        this.b = my5Var.b;
        this.c = maf.E(my5Var.c);
        this.o = my5Var.d;
        this.X = my5Var.e;
        int i = my5Var.f;
        this.Y = i;
        int i2 = my5Var.g;
        this.Z = i2;
        this.s0 = i2 != -1 ? i2 : i;
        this.t0 = my5Var.h;
        this.u0 = my5Var.i;
        this.v0 = my5Var.j;
        this.w0 = my5Var.k;
        this.x0 = my5Var.l;
        List list = my5Var.m;
        this.y0 = list == null ? Collections.emptyList() : list;
        cr4 cr4Var = my5Var.n;
        this.z0 = cr4Var;
        this.A0 = my5Var.o;
        this.B0 = my5Var.p;
        this.C0 = my5Var.q;
        this.D0 = my5Var.r;
        int i3 = my5Var.s;
        this.E0 = i3 == -1 ? 0 : i3;
        float f = my5Var.t;
        this.F0 = f == -1.0f ? 1.0f : f;
        this.G0 = my5Var.u;
        this.H0 = my5Var.v;
        this.I0 = my5Var.w;
        this.J0 = my5Var.x;
        this.K0 = my5Var.y;
        this.L0 = my5Var.z;
        int i4 = my5Var.A;
        this.M0 = i4 == -1 ? 0 : i4;
        int i5 = my5Var.B;
        this.N0 = i5 != -1 ? i5 : 0;
        this.O0 = my5Var.C;
        int i6 = my5Var.D;
        if (i6 != 0 || cr4Var == null) {
            this.P0 = i6;
        } else {
            this.P0 = 1;
        }
    }

    public final my5 a() {
        my5 my5Var = new my5();
        my5Var.a = this.a;
        my5Var.b = this.b;
        my5Var.c = this.c;
        my5Var.d = this.o;
        my5Var.e = this.X;
        my5Var.f = this.Y;
        my5Var.g = this.Z;
        my5Var.h = this.t0;
        my5Var.i = this.u0;
        my5Var.j = this.v0;
        my5Var.k = this.w0;
        my5Var.l = this.x0;
        my5Var.m = this.y0;
        my5Var.n = this.z0;
        my5Var.o = this.A0;
        my5Var.p = this.B0;
        my5Var.q = this.C0;
        my5Var.r = this.D0;
        my5Var.s = this.E0;
        my5Var.t = this.F0;
        my5Var.u = this.G0;
        my5Var.v = this.H0;
        my5Var.w = this.I0;
        my5Var.x = this.J0;
        my5Var.y = this.K0;
        my5Var.z = this.L0;
        my5Var.A = this.M0;
        my5Var.B = this.N0;
        my5Var.C = this.O0;
        my5Var.D = this.P0;
        return my5Var;
    }

    public final int b() {
        int i;
        int i2 = this.B0;
        if (i2 == -1 || (i = this.C0) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(oy5 oy5Var) {
        List list = this.y0;
        if (list.size() != oy5Var.y0.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) oy5Var.y0.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final oy5 d(oy5 oy5Var) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        if (this == oy5Var) {
            return this;
        }
        int iG = ha9.g(this.w0);
        String str3 = oy5Var.a;
        String str4 = oy5Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if ((iG != 3 && iG != 1) || (str = oy5Var.c) == null) {
            str = this.c;
        }
        int i4 = this.Y;
        if (i4 == -1) {
            i4 = oy5Var.Y;
        }
        int i5 = this.Z;
        if (i5 == -1) {
            i5 = oy5Var.Z;
        }
        String str5 = this.t0;
        if (str5 == null) {
            String strQ = maf.q(iG, oy5Var.t0);
            if (maf.L(strQ).length == 1) {
                str5 = strQ;
            }
        }
        e99 e99Var = oy5Var.u0;
        e99 e99Var2 = this.u0;
        if (e99Var2 != null) {
            if (e99Var != null) {
                c99[] c99VarArr = e99Var.a;
                if (c99VarArr.length != 0) {
                    int i6 = maf.a;
                    c99[] c99VarArr2 = e99Var2.a;
                    Object[] objArrCopyOf = Arrays.copyOf(c99VarArr2, c99VarArr2.length + c99VarArr.length);
                    System.arraycopy(c99VarArr, 0, objArrCopyOf, c99VarArr2.length, c99VarArr.length);
                    e99Var2 = new e99((c99[]) objArrCopyOf);
                }
            }
            e99Var = e99Var2;
        }
        float f = this.D0;
        if (f == -1.0f && iG == 2) {
            f = oy5Var.D0;
        }
        int i7 = this.o | oy5Var.o;
        int i8 = this.X | oy5Var.X;
        ArrayList arrayList = new ArrayList();
        cr4 cr4Var = oy5Var.z0;
        if (cr4Var != null) {
            ar4[] ar4VarArr = cr4Var.a;
            int length = ar4VarArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = length;
                ar4 ar4Var = ar4VarArr[i9];
                ar4[] ar4VarArr2 = ar4VarArr;
                if (ar4Var.X != null) {
                    arrayList.add(ar4Var);
                }
                i9++;
                length = i10;
                ar4VarArr = ar4VarArr2;
            }
            str2 = cr4Var.c;
        } else {
            str2 = null;
        }
        cr4 cr4Var2 = this.z0;
        if (cr4Var2 != null) {
            if (str2 == null) {
                str2 = cr4Var2.c;
            }
            int size = arrayList.size();
            ar4[] ar4VarArr3 = cr4Var2.a;
            int length2 = ar4VarArr3.length;
            int i11 = 0;
            while (true) {
                String str6 = str2;
                if (i11 >= length2) {
                    break;
                }
                ar4 ar4Var2 = ar4VarArr3[i11];
                ar4[] ar4VarArr4 = ar4VarArr3;
                if (ar4Var2.X != null) {
                    int i12 = 0;
                    while (i12 < size) {
                        i = size;
                        i2 = length2;
                        if (!((ar4) arrayList.get(i12)).b.equals(ar4Var2.b)) {
                            i12++;
                            length2 = i2;
                            size = i;
                        }
                    }
                    i = size;
                    i2 = length2;
                    i3 = 1;
                    arrayList.add(ar4Var2);
                    i11 += i3;
                    str2 = str6;
                    ar4VarArr3 = ar4VarArr4;
                    length2 = i2;
                    size = i;
                } else {
                    i = size;
                    i2 = length2;
                }
                i3 = 1;
                i11 += i3;
                str2 = str6;
                ar4VarArr3 = ar4VarArr4;
                length2 = i2;
                size = i;
            }
        }
        cr4 cr4Var3 = arrayList.isEmpty() ? null : new cr4(str2, arrayList);
        my5 my5VarA = a();
        my5VarA.a = str3;
        my5VarA.b = str4;
        my5VarA.c = str;
        my5VarA.d = i7;
        my5VarA.e = i8;
        my5VarA.f = i4;
        my5VarA.g = i5;
        my5VarA.h = str5;
        my5VarA.i = e99Var;
        my5VarA.n = cr4Var3;
        my5VarA.r = f;
        return new oy5(my5VarA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || oy5.class != obj.getClass()) {
            return false;
        }
        oy5 oy5Var = (oy5) obj;
        int i2 = this.Q0;
        if (i2 == 0 || (i = oy5Var.Q0) == 0 || i2 == i) {
            return this.o == oy5Var.o && this.X == oy5Var.X && this.Y == oy5Var.Y && this.Z == oy5Var.Z && this.x0 == oy5Var.x0 && this.A0 == oy5Var.A0 && this.B0 == oy5Var.B0 && this.C0 == oy5Var.C0 && this.E0 == oy5Var.E0 && this.H0 == oy5Var.H0 && this.J0 == oy5Var.J0 && this.K0 == oy5Var.K0 && this.L0 == oy5Var.L0 && this.M0 == oy5Var.M0 && this.N0 == oy5Var.N0 && this.O0 == oy5Var.O0 && this.P0 == oy5Var.P0 && Float.compare(this.D0, oy5Var.D0) == 0 && Float.compare(this.F0, oy5Var.F0) == 0 && maf.a(this.a, oy5Var.a) && maf.a(this.b, oy5Var.b) && maf.a(this.t0, oy5Var.t0) && maf.a(this.v0, oy5Var.v0) && maf.a(this.w0, oy5Var.w0) && maf.a(this.c, oy5Var.c) && Arrays.equals(this.G0, oy5Var.G0) && maf.a(this.u0, oy5Var.u0) && maf.a(this.I0, oy5Var.I0) && maf.a(this.z0, oy5Var.z0) && c(oy5Var);
        }
        return false;
    }

    public final int hashCode() {
        if (this.Q0 == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31;
            String str4 = this.t0;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            e99 e99Var = this.u0;
            int iHashCode5 = (iHashCode4 + (e99Var == null ? 0 : Arrays.hashCode(e99Var.a))) * 31;
            String str5 = this.v0;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.w0;
            this.Q0 = ((((((((((((((((Float.floatToIntBits(this.F0) + ((((Float.floatToIntBits(this.D0) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.x0) * 31) + ((int) this.A0)) * 31) + this.B0) * 31) + this.C0) * 31)) * 31) + this.E0) * 31)) * 31) + this.H0) * 31) + this.J0) * 31) + this.K0) * 31) + this.L0) * 31) + this.M0) * 31) + this.N0) * 31) + this.O0) * 31) + this.P0;
        }
        return this.Q0;
    }

    public final String toString() {
        String str = this.a;
        int iE = rh4.e(104, str);
        String str2 = this.b;
        int iE2 = rh4.e(iE, str2);
        String str3 = this.v0;
        int iE3 = rh4.e(iE2, str3);
        String str4 = this.w0;
        int iE4 = rh4.e(iE3, str4);
        String str5 = this.t0;
        int iE5 = rh4.e(iE4, str5);
        String str6 = this.c;
        StringBuilder sb = new StringBuilder(rh4.e(iE5, str6));
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(this.s0);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(this.B0);
        sb.append(", ");
        sb.append(this.C0);
        sb.append(", ");
        sb.append(this.D0);
        sb.append("], [");
        sb.append(this.J0);
        sb.append(", ");
        return zr6.j(sb, this.K0, "])");
    }
}
