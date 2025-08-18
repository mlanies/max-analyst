package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class gd8 {
    public static final gd8 J = new ed8().a();
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final CharSequence G;
    public final Integer H;
    public final Bundle I;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final e5c i;
    public final e5c j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Boolean q;
    public final Boolean r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    static {
        int i = oaf.a;
        K = Integer.toString(0, 36);
        L = Integer.toString(1, 36);
        M = Integer.toString(2, 36);
        N = Integer.toString(3, 36);
        O = Integer.toString(4, 36);
        P = Integer.toString(5, 36);
        Q = Integer.toString(6, 36);
        R = Integer.toString(8, 36);
        S = Integer.toString(9, 36);
        T = Integer.toString(10, 36);
        U = Integer.toString(11, 36);
        V = Integer.toString(12, 36);
        W = Integer.toString(13, 36);
        X = Integer.toString(14, 36);
        Y = Integer.toString(15, 36);
        Z = Integer.toString(16, 36);
        a0 = Integer.toString(17, 36);
        b0 = Integer.toString(18, 36);
        c0 = Integer.toString(19, 36);
        d0 = Integer.toString(20, 36);
        e0 = Integer.toString(21, 36);
        f0 = Integer.toString(22, 36);
        g0 = Integer.toString(23, 36);
        h0 = Integer.toString(24, 36);
        i0 = Integer.toString(25, 36);
        j0 = Integer.toString(26, 36);
        k0 = Integer.toString(27, 36);
        l0 = Integer.toString(28, 36);
        m0 = Integer.toString(29, 36);
        n0 = Integer.toString(30, 36);
        o0 = Integer.toString(31, 36);
        p0 = Integer.toString(32, 36);
        q0 = Integer.toString(33, 36);
        r0 = Integer.toString(1000, 36);
    }

    public gd8(ed8 ed8Var) {
        Boolean boolValueOf = ed8Var.q;
        Integer numValueOf = ed8Var.p;
        Integer numValueOf2 = ed8Var.G;
        int i = 1;
        int i2 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                        case 13:
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        case 16:
                        case LangUtils.HASH_SEED /* 17 */:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                numValueOf = Integer.valueOf(i2);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = ed8Var.a;
        this.b = ed8Var.b;
        this.c = ed8Var.c;
        this.d = ed8Var.d;
        this.e = ed8Var.e;
        this.f = ed8Var.f;
        this.g = ed8Var.g;
        this.h = ed8Var.h;
        this.i = ed8Var.i;
        this.j = ed8Var.j;
        this.k = ed8Var.k;
        this.l = ed8Var.l;
        this.m = ed8Var.m;
        this.n = ed8Var.n;
        this.o = ed8Var.o;
        this.p = numValueOf;
        this.q = boolValueOf;
        this.r = ed8Var.r;
        Integer num = ed8Var.s;
        this.s = num;
        this.t = num;
        this.u = ed8Var.t;
        this.v = ed8Var.u;
        this.w = ed8Var.v;
        this.x = ed8Var.w;
        this.y = ed8Var.x;
        this.z = ed8Var.y;
        this.A = ed8Var.z;
        this.B = ed8Var.A;
        this.C = ed8Var.B;
        this.D = ed8Var.C;
        this.E = ed8Var.D;
        this.F = ed8Var.E;
        this.G = ed8Var.F;
        this.H = numValueOf2;
        this.I = ed8Var.H;
    }

    public static gd8 b(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        ed8 ed8Var = new ed8();
        ed8Var.a = bundle.getCharSequence(K);
        ed8Var.b = bundle.getCharSequence(L);
        ed8Var.c = bundle.getCharSequence(M);
        ed8Var.d = bundle.getCharSequence(N);
        ed8Var.e = bundle.getCharSequence(O);
        ed8Var.f = bundle.getCharSequence(P);
        ed8Var.g = bundle.getCharSequence(Q);
        byte[] byteArray = bundle.getByteArray(T);
        String str = m0;
        ed8Var.f(byteArray, bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null);
        ed8Var.m = (Uri) bundle.getParcelable(U);
        ed8Var.y = bundle.getCharSequence(f0);
        ed8Var.z = bundle.getCharSequence(g0);
        ed8Var.A = bundle.getCharSequence(h0);
        ed8Var.D = bundle.getCharSequence(k0);
        ed8Var.E = bundle.getCharSequence(l0);
        ed8Var.F = bundle.getCharSequence(n0);
        ed8Var.H = bundle.getBundle(r0);
        String str2 = R;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            ed8Var.i = e5c.a(bundle3);
        }
        String str3 = S;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            ed8Var.j = e5c.a(bundle2);
        }
        String str4 = q0;
        if (bundle.containsKey(str4)) {
            ed8Var.i(Long.valueOf(bundle.getLong(str4)));
        }
        String str5 = V;
        if (bundle.containsKey(str5)) {
            ed8Var.n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = W;
        if (bundle.containsKey(str6)) {
            ed8Var.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = X;
        if (bundle.containsKey(str7)) {
            ed8Var.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = p0;
        if (bundle.containsKey(str8)) {
            ed8Var.q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Y;
        if (bundle.containsKey(str9)) {
            ed8Var.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = Z;
        if (bundle.containsKey(str10)) {
            ed8Var.s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = a0;
        if (bundle.containsKey(str11)) {
            ed8Var.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = b0;
        if (bundle.containsKey(str12)) {
            ed8Var.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = c0;
        if (bundle.containsKey(str13)) {
            ed8Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = d0;
        if (bundle.containsKey(str14)) {
            ed8Var.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = e0;
        if (bundle.containsKey(str15)) {
            ed8Var.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = i0;
        if (bundle.containsKey(str16)) {
            ed8Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = j0;
        if (bundle.containsKey(str17)) {
            ed8Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = o0;
        if (bundle.containsKey(str18)) {
            ed8Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        return new gd8(ed8Var);
    }

    public final ed8 a() {
        ed8 ed8Var = new ed8();
        ed8Var.a = this.a;
        ed8Var.b = this.b;
        ed8Var.c = this.c;
        ed8Var.d = this.d;
        ed8Var.e = this.e;
        ed8Var.f = this.f;
        ed8Var.g = this.g;
        ed8Var.h = this.h;
        ed8Var.i = this.i;
        ed8Var.j = this.j;
        ed8Var.k = this.k;
        ed8Var.l = this.l;
        ed8Var.m = this.m;
        ed8Var.n = this.n;
        ed8Var.o = this.o;
        ed8Var.p = this.p;
        ed8Var.q = this.q;
        ed8Var.r = this.r;
        ed8Var.s = this.t;
        ed8Var.t = this.u;
        ed8Var.u = this.v;
        ed8Var.v = this.w;
        ed8Var.w = this.x;
        ed8Var.x = this.y;
        ed8Var.y = this.z;
        ed8Var.z = this.A;
        ed8Var.A = this.B;
        ed8Var.B = this.C;
        ed8Var.C = this.D;
        ed8Var.D = this.E;
        ed8Var.E = this.F;
        ed8Var.F = this.G;
        ed8Var.G = this.H;
        ed8Var.H = this.I;
        return ed8Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(K, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(L, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(M, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(N, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(O, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(P, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(Q, charSequence7);
        }
        Long l = this.h;
        if (l != null) {
            bundle.putLong(q0, l.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            bundle.putByteArray(T, bArr);
        }
        Uri uri = this.m;
        if (uri != null) {
            bundle.putParcelable(U, uri);
        }
        CharSequence charSequence8 = this.z;
        if (charSequence8 != null) {
            bundle.putCharSequence(f0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(g0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(h0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(k0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(l0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(n0, charSequence13);
        }
        e5c e5cVar = this.i;
        if (e5cVar != null) {
            bundle.putBundle(R, e5cVar.c());
        }
        e5c e5cVar2 = this.j;
        if (e5cVar2 != null) {
            bundle.putBundle(S, e5cVar2.c());
        }
        Integer num = this.n;
        if (num != null) {
            bundle.putInt(V, num.intValue());
        }
        Integer num2 = this.o;
        if (num2 != null) {
            bundle.putInt(W, num2.intValue());
        }
        Integer num3 = this.p;
        if (num3 != null) {
            bundle.putInt(X, num3.intValue());
        }
        Boolean bool = this.q;
        if (bool != null) {
            bundle.putBoolean(p0, bool.booleanValue());
        }
        Boolean bool2 = this.r;
        if (bool2 != null) {
            bundle.putBoolean(Y, bool2.booleanValue());
        }
        Integer num4 = this.t;
        if (num4 != null) {
            bundle.putInt(Z, num4.intValue());
        }
        Integer num5 = this.u;
        if (num5 != null) {
            bundle.putInt(a0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(b0, num6.intValue());
        }
        Integer num7 = this.w;
        if (num7 != null) {
            bundle.putInt(c0, num7.intValue());
        }
        Integer num8 = this.x;
        if (num8 != null) {
            bundle.putInt(d0, num8.intValue());
        }
        Integer num9 = this.y;
        if (num9 != null) {
            bundle.putInt(e0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(i0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(j0, num11.intValue());
        }
        Integer num12 = this.l;
        if (num12 != null) {
            bundle.putInt(m0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(o0, num13.intValue());
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(r0, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gd8.class != obj.getClass()) {
            return false;
        }
        gd8 gd8Var = (gd8) obj;
        if (oaf.a(this.a, gd8Var.a) && oaf.a(this.b, gd8Var.b) && oaf.a(this.c, gd8Var.c) && oaf.a(this.d, gd8Var.d) && oaf.a(this.e, gd8Var.e) && oaf.a(this.f, gd8Var.f) && oaf.a(this.g, gd8Var.g) && oaf.a(this.h, gd8Var.h) && oaf.a(this.i, gd8Var.i) && oaf.a(this.j, gd8Var.j) && Arrays.equals(this.k, gd8Var.k) && oaf.a(this.l, gd8Var.l) && oaf.a(this.m, gd8Var.m) && oaf.a(this.n, gd8Var.n) && oaf.a(this.o, gd8Var.o) && oaf.a(this.p, gd8Var.p) && oaf.a(this.q, gd8Var.q) && oaf.a(this.r, gd8Var.r) && oaf.a(this.t, gd8Var.t) && oaf.a(this.u, gd8Var.u) && oaf.a(this.v, gd8Var.v) && oaf.a(this.w, gd8Var.w) && oaf.a(this.x, gd8Var.x) && oaf.a(this.y, gd8Var.y) && oaf.a(this.z, gd8Var.z) && oaf.a(this.A, gd8Var.A) && oaf.a(this.B, gd8Var.B) && oaf.a(this.C, gd8Var.C) && oaf.a(this.D, gd8Var.D) && oaf.a(this.E, gd8Var.E) && oaf.a(this.F, gd8Var.F) && oaf.a(this.G, gd8Var.G) && oaf.a(this.H, gd8Var.H)) {
            if ((this.I == null) == (gd8Var.I == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(this.I == null)});
    }
}
