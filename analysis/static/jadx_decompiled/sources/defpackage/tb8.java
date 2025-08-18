package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class tb8 {
    public static final tb8 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final ib8 b;
    public final hb8 c;
    public final gd8 d;
    public final db8 e;
    public final lb8 f;

    static {
        za8 za8Var = new za8();
        s74 s74Var = new s74();
        Collections.emptyList();
        ffc ffcVar = ffc.X;
        fb8 fb8Var = new fb8();
        lb8 lb8Var = lb8.d;
        fm9.k(((Uri) s74Var.e) == null || ((UUID) s74Var.d) != null);
        g = new tb8("", za8Var.c(), null, fb8Var.a(), gd8.J, lb8Var);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public tb8(String str, db8 db8Var, ib8 ib8Var, hb8 hb8Var, gd8 gd8Var, lb8 lb8Var) {
        this.a = str;
        this.b = ib8Var;
        this.c = hb8Var;
        this.d = gd8Var;
        this.e = db8Var;
        this.f = lb8Var;
    }

    public static tb8 b(Bundle bundle) {
        db8 db8Var;
        lb8 lb8Var;
        Map mapB;
        eb8 eb8Var;
        xa8 xa8Var;
        ffc ffcVarJ;
        ffc ffcVarI;
        ib8 ib8Var;
        boolean z = false;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        hb8 hb8VarB = bundle2 == null ? hb8.f : hb8.b(bundle2);
        Bundle bundle3 = bundle.getBundle(j);
        gd8 gd8VarB = bundle3 == null ? gd8.J : gd8.b(bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            db8Var = db8.p;
        } else {
            za8 za8Var = new za8();
            bb8 bb8Var = bb8.h;
            za8Var.e(bundle4.getLong(bb8.i, bb8Var.a));
            za8Var.d(oaf.S(bundle4.getLong(bb8.j, bb8Var.c)));
            za8Var.c = bundle4.getBoolean(bb8.k, bb8Var.e);
            za8Var.d = bundle4.getBoolean(bb8.l, bb8Var.f);
            za8Var.e = bundle4.getBoolean(bb8.m, bb8Var.g);
            String str = bb8.n;
            long j2 = bb8Var.b;
            long j3 = bundle4.getLong(str, j2);
            if (j3 != j2) {
                za8Var.f(j3);
            }
            String str2 = bb8.o;
            long j4 = bb8Var.d;
            long j5 = bundle4.getLong(str2, j4);
            if (j5 != j4) {
                za8Var.d(j5);
            }
            db8Var = new db8(za8Var);
        }
        db8 db8Var2 = db8Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            lb8Var = lb8.d;
        } else {
            nw4 nw4Var = new nw4(8);
            nw4Var.b = (Uri) bundle5.getParcelable(lb8.e);
            nw4Var.c = bundle5.getString(lb8.f);
            nw4Var.o = bundle5.getBundle(lb8.g);
            lb8Var = new lb8(nw4Var);
        }
        lb8 lb8Var2 = lb8Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            ib8Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(ib8.l);
            if (bundle7 == null) {
                eb8Var = null;
            } else {
                String string2 = bundle7.getString(eb8.i);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(eb8.j);
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(eb8.k);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    mapB = kfc.s0;
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    mapB = cx6.b(map);
                }
                boolean z2 = bundle7.getBoolean(eb8.l, false);
                boolean z3 = bundle7.getBoolean(eb8.m, false);
                boolean z4 = bundle7.getBoolean(eb8.n, false);
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(eb8.o);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                zw6 zw6VarJ = zw6.j(arrayList);
                byte[] byteArray = bundle7.getByteArray(eb8.p);
                s74 s74Var = new s74();
                s74Var.d = uuidFromString;
                s74Var.e = uri;
                s74Var.f = cx6.b(mapB);
                s74Var.a = z2;
                s74Var.c = z4;
                s74Var.b = z3;
                s74Var.g = zw6.j(zw6VarJ);
                s74Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                eb8Var = new eb8(s74Var);
            }
            Bundle bundle10 = bundle6.getBundle(ib8.m);
            if (bundle10 == null) {
                xa8Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(xa8.b);
                uri2.getClass();
                o9g o9gVar = new o9g(20, z);
                o9gVar.b = uri2;
                xa8Var = new xa8(o9gVar);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(ib8.n);
            if (parcelableArrayList == null) {
                ls5 ls5Var = zw6.b;
                ffcVarJ = ffc.X;
            } else {
                ww6 ww6VarI = zw6.i();
                for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i2);
                    bundle11.getClass();
                    ww6VarI.a(new x8e(bundle11.getInt(x8e.o, 0), bundle11.getInt(x8e.X, 0), bundle11.getInt(x8e.Y, 0)));
                }
                ffcVarJ = ww6VarI.j();
            }
            ffc ffcVar = ffcVarJ;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(ib8.p);
            if (parcelableArrayList2 == null) {
                ls5 ls5Var2 = zw6.b;
                ffcVarI = ffc.X;
            } else {
                ffcVarI = nu0.i(new wa8(5), parcelableArrayList2);
            }
            ffc ffcVar2 = ffcVarI;
            long j6 = bundle6.getLong(ib8.q, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(ib8.j);
            uri3.getClass();
            ib8Var = new ib8(uri3, bundle6.getString(ib8.k), eb8Var, xa8Var, ffcVar, bundle6.getString(ib8.o), ffcVar2, null, j6);
        }
        return new tb8(string, db8Var2, ib8Var, hb8VarB, gd8VarB, lb8Var2);
    }

    public static tb8 c(Uri uri) {
        ib8 ib8Var;
        za8 za8Var = new za8();
        s74 s74Var = new s74();
        List listEmptyList = Collections.emptyList();
        ffc ffcVar = ffc.X;
        fb8 fb8Var = new fb8();
        lb8 lb8Var = lb8.d;
        fm9.k(((Uri) s74Var.e) == null || ((UUID) s74Var.d) != null);
        if (uri != null) {
            ib8Var = new ib8(uri, null, ((UUID) s74Var.d) != null ? new eb8(s74Var) : null, null, listEmptyList, null, ffcVar, null, -9223372036854775807L);
        } else {
            ib8Var = null;
        }
        return new tb8("", new db8(za8Var), ib8Var, new hb8(fb8Var), gd8.J, lb8Var);
    }

    public final ya8 a() {
        s74 s74Var;
        ya8 ya8Var = new ya8();
        ya8Var.d = new za8();
        ya8Var.e = new s74();
        ya8Var.f = Collections.emptyList();
        ya8Var.h = ffc.X;
        ya8Var.m = new fb8();
        ya8Var.n = lb8.d;
        ya8Var.k = -9223372036854775807L;
        ya8Var.d = this.e.a();
        ya8Var.a = this.a;
        ya8Var.l = this.d;
        ya8Var.m = this.c.a();
        ya8Var.n = this.f;
        ib8 ib8Var = this.b;
        if (ib8Var != null) {
            ya8Var.g = ib8Var.f;
            ya8Var.c = ib8Var.b;
            ya8Var.b = ib8Var.a;
            ya8Var.f = ib8Var.e;
            ya8Var.h = ib8Var.g;
            ya8Var.j = ib8Var.h;
            eb8 eb8Var = ib8Var.c;
            if (eb8Var != null) {
                s74Var = new s74();
                s74Var.d = eb8Var.a;
                s74Var.e = eb8Var.b;
                s74Var.f = eb8Var.c;
                s74Var.a = eb8Var.d;
                s74Var.b = eb8Var.e;
                s74Var.c = eb8Var.f;
                s74Var.g = eb8Var.g;
                s74Var.h = eb8Var.h;
            } else {
                s74Var = new s74();
            }
            ya8Var.e = s74Var;
            ya8Var.i = ib8Var.d;
            ya8Var.k = ib8Var.i;
        }
        return ya8Var;
    }

    public final Bundle d(boolean z) {
        ib8 ib8Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        hb8 hb8Var = hb8.f;
        hb8 hb8Var2 = this.c;
        if (!hb8Var2.equals(hb8Var)) {
            bundle.putBundle(i, hb8Var2.c());
        }
        gd8 gd8Var = gd8.J;
        gd8 gd8Var2 = this.d;
        if (!gd8Var2.equals(gd8Var)) {
            bundle.putBundle(j, gd8Var2.c());
        }
        bb8 bb8Var = bb8.h;
        db8 db8Var = this.e;
        if (!db8Var.equals(bb8Var)) {
            Bundle bundle2 = new Bundle();
            long j2 = bb8Var.a;
            long j3 = db8Var.a;
            if (j3 != j2) {
                bundle2.putLong(bb8.i, j3);
            }
            long j4 = bb8Var.c;
            long j5 = db8Var.c;
            if (j5 != j4) {
                bundle2.putLong(bb8.j, j5);
            }
            long j6 = bb8Var.b;
            long j7 = db8Var.b;
            if (j7 != j6) {
                bundle2.putLong(bb8.n, j7);
            }
            long j8 = bb8Var.d;
            long j9 = db8Var.d;
            if (j9 != j8) {
                bundle2.putLong(bb8.o, j9);
            }
            boolean z2 = bb8Var.e;
            boolean z3 = db8Var.e;
            if (z3 != z2) {
                bundle2.putBoolean(bb8.k, z3);
            }
            boolean z4 = bb8Var.f;
            boolean z5 = db8Var.f;
            if (z5 != z4) {
                bundle2.putBoolean(bb8.l, z5);
            }
            boolean z6 = bb8Var.g;
            boolean z7 = db8Var.g;
            if (z7 != z6) {
                bundle2.putBoolean(bb8.m, z7);
            }
            bundle.putBundle(k, bundle2);
        }
        lb8 lb8Var = lb8.d;
        lb8 lb8Var2 = this.f;
        if (!lb8Var2.equals(lb8Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = lb8Var2.a;
            if (uri != null) {
                bundle3.putParcelable(lb8.e, uri);
            }
            String str2 = lb8Var2.b;
            if (str2 != null) {
                bundle3.putString(lb8.f, str2);
            }
            Bundle bundle4 = lb8Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(lb8.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (ib8Var = this.b) != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(ib8.j, ib8Var.a);
            String str3 = ib8Var.b;
            if (str3 != null) {
                bundle5.putString(ib8.k, str3);
            }
            eb8 eb8Var = ib8Var.c;
            if (eb8Var != null) {
                Bundle bundle6 = new Bundle();
                bundle6.putString(eb8.i, eb8Var.a.toString());
                Uri uri2 = eb8Var.b;
                if (uri2 != null) {
                    bundle6.putParcelable(eb8.j, uri2);
                }
                cx6 cx6Var = eb8Var.c;
                if (!cx6Var.isEmpty()) {
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : cx6Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(eb8.k, bundle7);
                }
                boolean z8 = eb8Var.d;
                if (z8) {
                    bundle6.putBoolean(eb8.l, z8);
                }
                boolean z9 = eb8Var.e;
                if (z9) {
                    bundle6.putBoolean(eb8.m, z9);
                }
                boolean z10 = eb8Var.f;
                if (z10) {
                    bundle6.putBoolean(eb8.n, z10);
                }
                zw6 zw6Var = eb8Var.g;
                if (!zw6Var.isEmpty()) {
                    bundle6.putIntegerArrayList(eb8.o, new ArrayList<>(zw6Var));
                }
                byte[] bArr = eb8Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(eb8.p, bArr);
                }
                bundle5.putBundle(ib8.l, bundle6);
            }
            xa8 xa8Var = ib8Var.d;
            if (xa8Var != null) {
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(xa8.b, xa8Var.a);
                bundle5.putBundle(ib8.m, bundle8);
            }
            List list = ib8Var.e;
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(ib8.n, nu0.R(list, new wa8(3)));
            }
            String str4 = ib8Var.f;
            if (str4 != null) {
                bundle5.putString(ib8.o, str4);
            }
            zw6 zw6Var2 = ib8Var.g;
            if (!zw6Var2.isEmpty()) {
                bundle5.putParcelableArrayList(ib8.p, nu0.R(zw6Var2, new wa8(4)));
            }
            long j10 = ib8Var.i;
            if (j10 != -9223372036854775807L) {
                bundle5.putLong(ib8.q, j10);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb8)) {
            return false;
        }
        tb8 tb8Var = (tb8) obj;
        return oaf.a(this.a, tb8Var.a) && this.e.equals(tb8Var.e) && oaf.a(this.b, tb8Var.b) && oaf.a(this.c, tb8Var.c) && oaf.a(this.d, tb8Var.d) && oaf.a(this.f, tb8Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ib8 ib8Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (ib8Var != null ? ib8Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
