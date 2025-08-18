package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class qy5 {
    public static final qy5 M = new ny5().a();
    public static final String N = Integer.toString(0, 36);
    public static final String O = Integer.toString(1, 36);
    public static final String P = Integer.toString(2, 36);
    public static final String Q = Integer.toString(3, 36);
    public static final String R = Integer.toString(4, 36);
    public static final String S = Integer.toString(5, 36);
    public static final String T = Integer.toString(6, 36);
    public static final String U = Integer.toString(7, 36);
    public static final String V = Integer.toString(8, 36);
    public static final String W = Integer.toString(9, 36);
    public static final String X = Integer.toString(10, 36);
    public static final String Y = Integer.toString(11, 36);
    public static final String Z = Integer.toString(12, 36);
    public static final String a0 = Integer.toString(13, 36);
    public static final String b0 = Integer.toString(14, 36);
    public static final String c0 = Integer.toString(15, 36);
    public static final String d0 = Integer.toString(16, 36);
    public static final String e0 = Integer.toString(17, 36);
    public static final String f0 = Integer.toString(18, 36);
    public static final String g0 = Integer.toString(19, 36);
    public static final String h0 = Integer.toString(20, 36);
    public static final String i0 = Integer.toString(21, 36);
    public static final String j0 = Integer.toString(22, 36);
    public static final String k0 = Integer.toString(23, 36);
    public static final String l0 = Integer.toString(24, 36);
    public static final String m0 = Integer.toString(25, 36);
    public static final String n0 = Integer.toString(26, 36);
    public static final String o0 = Integer.toString(27, 36);
    public static final String p0 = Integer.toString(28, 36);
    public static final String q0 = Integer.toString(29, 36);
    public static final String r0 = Integer.toString(30, 36);
    public static final String s0 = Integer.toString(31, 36);
    public static final String t0 = Integer.toString(32, 36);
    public final i63 A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public int L;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final f99 k;
    public final Object l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final dr4 r;
    public final long s;
    public final int t;
    public final int u;
    public final float v;
    public final int w;
    public final float x;
    public final byte[] y;
    public final int z;

    public qy5(ny5 ny5Var) {
        boolean z;
        String str;
        this.a = ny5Var.a;
        String strT = oaf.T(ny5Var.d);
        this.d = strT;
        if (ny5Var.c.isEmpty() && ny5Var.b != null) {
            this.c = zw6.n(new od7(strT, ny5Var.b));
            this.b = ny5Var.b;
        } else if (!ny5Var.c.isEmpty() && ny5Var.b == null) {
            List list = ny5Var.c;
            this.c = list;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((od7) list.get(0)).b;
                    break;
                }
                od7 od7Var = (od7) it.next();
                if (TextUtils.equals(od7Var.a, strT)) {
                    str = od7Var.b;
                    break;
                }
            }
            this.b = str;
        } else if (ny5Var.c.isEmpty() && ny5Var.b == null) {
            z = true;
            fm9.k(z);
            this.c = ny5Var.c;
            this.b = ny5Var.b;
        } else {
            for (int i = 0; i < ny5Var.c.size(); i++) {
                if (((od7) ny5Var.c.get(i)).b.equals(ny5Var.b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            fm9.k(z);
            this.c = ny5Var.c;
            this.b = ny5Var.b;
        }
        this.e = ny5Var.e;
        this.f = ny5Var.f;
        int i2 = ny5Var.g;
        this.g = i2;
        int i3 = ny5Var.h;
        this.h = i3;
        this.i = i3 != -1 ? i3 : i2;
        this.j = ny5Var.i;
        this.k = ny5Var.j;
        this.l = ny5Var.k;
        this.m = ny5Var.l;
        this.n = ny5Var.m;
        this.o = ny5Var.n;
        this.p = ny5Var.o;
        List list2 = ny5Var.p;
        this.q = list2 == null ? Collections.emptyList() : list2;
        dr4 dr4Var = ny5Var.q;
        this.r = dr4Var;
        this.s = ny5Var.r;
        this.t = ny5Var.s;
        this.u = ny5Var.t;
        this.v = ny5Var.u;
        int i4 = ny5Var.v;
        this.w = i4 == -1 ? 0 : i4;
        float f = ny5Var.w;
        this.x = f == -1.0f ? 1.0f : f;
        this.y = ny5Var.x;
        this.z = ny5Var.y;
        this.A = ny5Var.z;
        this.B = ny5Var.A;
        this.C = ny5Var.B;
        this.D = ny5Var.C;
        int i5 = ny5Var.D;
        this.E = i5 == -1 ? 0 : i5;
        int i6 = ny5Var.E;
        this.F = i6 != -1 ? i6 : 0;
        this.G = ny5Var.F;
        this.H = ny5Var.G;
        this.I = ny5Var.H;
        this.J = ny5Var.I;
        int i7 = ny5Var.J;
        if (i7 != 0 || dr4Var == null) {
            this.K = i7;
        } else {
            this.K = 1;
        }
    }

    public static String e(qy5 qy5Var) {
        String str;
        int i;
        if (qy5Var == null) {
            return "null";
        }
        StringBuilder sbL = au1.l("id=");
        sbL.append(qy5Var.a);
        sbL.append(", mimeType=");
        sbL.append(qy5Var.n);
        String str2 = qy5Var.m;
        if (str2 != null) {
            sbL.append(", container=");
            sbL.append(str2);
        }
        int i2 = qy5Var.i;
        if (i2 != -1) {
            sbL.append(", bitrate=");
            sbL.append(i2);
        }
        String str3 = qy5Var.j;
        if (str3 != null) {
            sbL.append(", codecs=");
            sbL.append(str3);
        }
        dr4 dr4Var = qy5Var.r;
        if (dr4Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i3 = 0; i3 < dr4Var.o; i3++) {
                UUID uuid = dr4Var.a[i3].b;
                if (uuid.equals(ew0.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(ew0.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(ew0.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(ew0.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(ew0.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbL.append(", drm=[");
            new o97(String.valueOf(','), 0).a(sbL, linkedHashSet.iterator());
            sbL.append(']');
        }
        int i4 = qy5Var.t;
        if (i4 != -1 && (i = qy5Var.u) != -1) {
            sbL.append(", res=");
            sbL.append(i4);
            sbL.append("x");
            sbL.append(i);
        }
        i63 i63Var = qy5Var.A;
        if (i63Var != null) {
            int i5 = i63Var.f;
            int i6 = i63Var.e;
            if ((i6 != -1 && i5 != -1) || i63Var.e()) {
                sbL.append(", color=");
                if (i63Var.e()) {
                    String strC = i63.c(i63Var.a);
                    String strB = i63.b(i63Var.b);
                    String strD = i63.d(i63Var.c);
                    int i7 = oaf.a;
                    Locale locale = Locale.US;
                    str = strC + "/" + strB + "/" + strD;
                } else {
                    str = "NA/NA/NA";
                }
                sbL.append(str + "/" + ((i6 == -1 || i5 == -1) ? "NA/NA" : i6 + "/" + i5));
            }
        }
        float f = qy5Var.v;
        if (f != -1.0f) {
            sbL.append(", fps=");
            sbL.append(f);
        }
        int i8 = qy5Var.B;
        if (i8 != -1) {
            sbL.append(", channels=");
            sbL.append(i8);
        }
        int i9 = qy5Var.C;
        if (i9 != -1) {
            sbL.append(", sample_rate=");
            sbL.append(i9);
        }
        String str4 = qy5Var.d;
        if (str4 != null) {
            sbL.append(", language=");
            sbL.append(str4);
        }
        List list = qy5Var.c;
        if (!list.isEmpty()) {
            sbL.append(", labels=[");
            new o97(String.valueOf(','), 0).a(sbL, list.iterator());
            sbL.append("]");
        }
        int i10 = qy5Var.e;
        if (i10 != 0) {
            sbL.append(", selectionFlags=[");
            o97 o97Var = new o97(String.valueOf(','), 0);
            int i11 = oaf.a;
            ArrayList arrayList = new ArrayList();
            if ((i10 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i10 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i10 & 2) != 0) {
                arrayList.add("forced");
            }
            o97Var.a(sbL, arrayList.iterator());
            sbL.append("]");
        }
        int i12 = qy5Var.f;
        if (i12 != 0) {
            sbL.append(", roleFlags=[");
            o97 o97Var2 = new o97(String.valueOf(','), 0);
            int i13 = oaf.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i12 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i12 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i12 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i12 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i12 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i12 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i12 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i12 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i12 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i12 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i12 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i12 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i12 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i12 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i12 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            o97Var2.a(sbL, arrayList2.iterator());
            sbL.append("]");
        }
        Object obj = qy5Var.l;
        if (obj != null) {
            sbL.append(", customData=");
            sbL.append(obj);
        }
        return sbL.toString();
    }

    public final ny5 a() {
        ny5 ny5Var = new ny5();
        ny5Var.a = this.a;
        ny5Var.b = this.b;
        ny5Var.c = this.c;
        ny5Var.d = this.d;
        ny5Var.e = this.e;
        ny5Var.f = this.f;
        ny5Var.g = this.g;
        ny5Var.h = this.h;
        ny5Var.i = this.j;
        ny5Var.j = this.k;
        ny5Var.k = this.l;
        ny5Var.l = this.m;
        ny5Var.m = this.n;
        ny5Var.n = this.o;
        ny5Var.o = this.p;
        ny5Var.p = this.q;
        ny5Var.q = this.r;
        ny5Var.r = this.s;
        ny5Var.s = this.t;
        ny5Var.t = this.u;
        ny5Var.u = this.v;
        ny5Var.v = this.w;
        ny5Var.w = this.x;
        ny5Var.x = this.y;
        ny5Var.y = this.z;
        ny5Var.z = this.A;
        ny5Var.A = this.B;
        ny5Var.B = this.C;
        ny5Var.C = this.D;
        ny5Var.D = this.E;
        ny5Var.E = this.F;
        ny5Var.F = this.G;
        ny5Var.G = this.H;
        ny5Var.H = this.I;
        ny5Var.I = this.J;
        ny5Var.J = this.K;
        return ny5Var;
    }

    public final int b() {
        int i;
        int i2 = this.t;
        if (i2 == -1 || (i = this.u) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(qy5 qy5Var) {
        List list = this.q;
        if (list.size() != qy5Var.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) qy5Var.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final Bundle d(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(N, this.a);
        bundle.putString(O, this.b);
        List<od7> list = this.c;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        for (od7 od7Var : list) {
            od7Var.getClass();
            Bundle bundle2 = new Bundle();
            String str = od7Var.a;
            if (str != null) {
                bundle2.putString(od7.c, str);
            }
            bundle2.putString(od7.d, od7Var.b);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(t0, arrayList);
        bundle.putString(P, this.d);
        bundle.putInt(Q, this.e);
        bundle.putInt(R, this.f);
        bundle.putInt(S, this.g);
        bundle.putInt(T, this.h);
        bundle.putString(U, this.j);
        if (!z) {
            bundle.putParcelable(V, this.k);
        }
        bundle.putString(W, this.m);
        bundle.putString(X, this.n);
        bundle.putInt(Y, this.o);
        int i = 0;
        while (true) {
            List list2 = this.q;
            if (i >= list2.size()) {
                break;
            }
            bundle.putByteArray(Z + "_" + Integer.toString(i, 36), (byte[]) list2.get(i));
            i++;
        }
        bundle.putParcelable(a0, this.r);
        bundle.putLong(b0, this.s);
        bundle.putInt(c0, this.t);
        bundle.putInt(d0, this.u);
        bundle.putFloat(e0, this.v);
        bundle.putInt(f0, this.w);
        bundle.putFloat(g0, this.x);
        bundle.putByteArray(h0, this.y);
        bundle.putInt(i0, this.z);
        i63 i63Var = this.A;
        if (i63Var != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt(i63.j, i63Var.a);
            bundle3.putInt(i63.k, i63Var.b);
            bundle3.putInt(i63.l, i63Var.c);
            bundle3.putByteArray(i63.m, i63Var.d);
            bundle3.putInt(i63.n, i63Var.e);
            bundle3.putInt(i63.o, i63Var.f);
            bundle.putBundle(j0, bundle3);
        }
        bundle.putInt(k0, this.B);
        bundle.putInt(l0, this.C);
        bundle.putInt(m0, this.D);
        bundle.putInt(n0, this.E);
        bundle.putInt(o0, this.F);
        bundle.putInt(p0, this.G);
        bundle.putInt(r0, this.I);
        bundle.putInt(s0, this.J);
        bundle.putInt(q0, this.K);
        return bundle;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || qy5.class != obj.getClass()) {
            return false;
        }
        qy5 qy5Var = (qy5) obj;
        int i2 = this.L;
        if (i2 == 0 || (i = qy5Var.L) == 0 || i2 == i) {
            return this.e == qy5Var.e && this.f == qy5Var.f && this.g == qy5Var.g && this.h == qy5Var.h && this.o == qy5Var.o && this.s == qy5Var.s && this.t == qy5Var.t && this.u == qy5Var.u && this.w == qy5Var.w && this.z == qy5Var.z && this.B == qy5Var.B && this.C == qy5Var.C && this.D == qy5Var.D && this.E == qy5Var.E && this.F == qy5Var.F && this.G == qy5Var.G && this.I == qy5Var.I && this.J == qy5Var.J && this.K == qy5Var.K && Float.compare(this.v, qy5Var.v) == 0 && Float.compare(this.x, qy5Var.x) == 0 && Objects.equals(this.a, qy5Var.a) && Objects.equals(this.b, qy5Var.b) && this.c.equals(qy5Var.c) && Objects.equals(this.j, qy5Var.j) && Objects.equals(this.m, qy5Var.m) && Objects.equals(this.n, qy5Var.n) && Objects.equals(this.d, qy5Var.d) && Arrays.equals(this.y, qy5Var.y) && Objects.equals(this.k, qy5Var.k) && Objects.equals(this.A, qy5Var.A) && Objects.equals(this.r, qy5Var.r) && c(qy5Var) && Objects.equals(this.l, qy5Var.l);
        }
        return false;
    }

    public final qy5 f(qy5 qy5Var) {
        String str;
        float f;
        String str2;
        int i;
        int i2;
        if (this == qy5Var) {
            return this;
        }
        int iG = ia9.g(this.n);
        String str3 = qy5Var.a;
        String str4 = qy5Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        List list = qy5Var.c;
        if (list.isEmpty()) {
            list = this.c;
        }
        if ((iG != 3 && iG != 1) || (str = qy5Var.d) == null) {
            str = this.d;
        }
        int i3 = this.g;
        if (i3 == -1) {
            i3 = qy5Var.g;
        }
        int i4 = this.h;
        if (i4 == -1) {
            i4 = qy5Var.h;
        }
        String str5 = this.j;
        if (str5 == null) {
            String strV = oaf.v(iG, qy5Var.j);
            if (oaf.e0(strV).length == 1) {
                str5 = strV;
            }
        }
        f99 f99VarB = qy5Var.k;
        f99 f99Var = this.k;
        if (f99Var != null) {
            f99VarB = f99Var.b(f99VarB);
        }
        float f2 = this.v;
        if (f2 == -1.0f && iG == 2) {
            f2 = qy5Var.v;
        }
        int i5 = this.e | qy5Var.e;
        int i6 = this.f | qy5Var.f;
        ArrayList arrayList = new ArrayList();
        dr4 dr4Var = qy5Var.r;
        if (dr4Var != null) {
            br4[] br4VarArr = dr4Var.a;
            int length = br4VarArr.length;
            f = f2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = length;
                br4 br4Var = br4VarArr[i7];
                br4[] br4VarArr2 = br4VarArr;
                if (br4Var.X != null) {
                    arrayList.add(br4Var);
                }
                i7++;
                length = i8;
                br4VarArr = br4VarArr2;
            }
            str2 = dr4Var.c;
        } else {
            f = f2;
            str2 = null;
        }
        dr4 dr4Var2 = this.r;
        if (dr4Var2 != null) {
            if (str2 == null) {
                str2 = dr4Var2.c;
            }
            int size = arrayList.size();
            br4[] br4VarArr3 = dr4Var2.a;
            int length2 = br4VarArr3.length;
            int i9 = 0;
            while (true) {
                String str6 = str2;
                if (i9 >= length2) {
                    break;
                }
                br4 br4Var2 = br4VarArr3[i9];
                br4[] br4VarArr4 = br4VarArr3;
                if (br4Var2.X != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            i = size;
                            i2 = length2;
                            arrayList.add(br4Var2);
                            break;
                        }
                        i = size;
                        i2 = length2;
                        if (((br4) arrayList.get(i10)).b.equals(br4Var2.b)) {
                            break;
                        }
                        i10++;
                        length2 = i2;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = length2;
                }
                i9++;
                str2 = str6;
                br4VarArr3 = br4VarArr4;
                length2 = i2;
                size = i;
            }
        }
        dr4 dr4Var3 = arrayList.isEmpty() ? null : new dr4(str2, arrayList);
        ny5 ny5VarA = a();
        ny5VarA.a = str3;
        ny5VarA.b = str4;
        ny5VarA.c = zw6.j(list);
        ny5VarA.d = str;
        ny5VarA.e = i5;
        ny5VarA.f = i6;
        ny5VarA.g = i3;
        ny5VarA.h = i4;
        ny5VarA.i = str5;
        ny5VarA.j = f99VarB;
        ny5VarA.q = dr4Var3;
        ny5VarA.u = f;
        ny5VarA.H = qy5Var.I;
        ny5VarA.I = qy5Var.J;
        return new qy5(ny5VarA);
    }

    public final int hashCode() {
        if (this.L == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            String str4 = this.j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            f99 f99Var = this.k;
            int iHashCode5 = (iHashCode4 + (f99Var == null ? 0 : f99Var.hashCode())) * 31;
            Object obj = this.l;
            int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.m;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.L = ((((((((((((((((((((Float.floatToIntBits(this.x) + ((((Float.floatToIntBits(this.v) + ((((((((((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.t) * 31) + this.u) * 31)) * 31) + this.w) * 31)) * 31) + this.z) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K;
        }
        return this.L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.A);
        sb.append("], [");
        sb.append(this.B);
        sb.append(", ");
        return zr6.j(sb, this.C, "])");
    }
}
