package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ece implements a76, ofc, ifg {
    public Object a;

    public /* synthetic */ ece(Object obj) {
        this.a = obj;
    }

    public static List b(List list, b7b b7bVar) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            iq0 iq0Var = (iq0) list.get(i);
            try {
                if (b7bVar.test(iq0Var)) {
                    long j = (iq0Var.a * 31) + i;
                    String str = iq0Var.c;
                    arrayList.add(new ybe(j, 3, str, iq0Var.d, str, null, null, null));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static jce c(String str, int i, j92 j92Var) {
        int i2;
        boolean z = true;
        boolean z2 = !str.isEmpty() && str.charAt(0) == '/';
        j92 j92Var2 = j92.a;
        jce jceVar = jce.c;
        jce jceVar2 = jce.o;
        if (j92Var == j92Var2) {
            if (bre.d.matcher(str).matches()) {
                return jceVar2;
            }
            if (z2) {
                return jceVar;
            }
        }
        if (bre.b.matcher(str).matches() || bre.e.matcher(str).matches() || z2) {
            return jceVar;
        }
        if (bre.f.matcher(str).matches()) {
            return jceVar2;
        }
        if (!str.isEmpty() && str.charAt(0) == '@') {
            if (oag.t(str)) {
                i2 = 0;
            } else {
                i2 = 0;
                for (int i3 = 0; i3 < str.length(); i3++) {
                    if (str.charAt(i3) == '@') {
                        i2++;
                    }
                }
            }
            if (i2 == 1 && !str.contains(" ") && !str.endsWith("\n")) {
                return jce.a;
            }
        }
        String strH = h(i, str);
        int iE = e(i, str);
        boolean zT = oag.t(strH);
        jce jceVar3 = jce.X;
        if (zT) {
            return jceVar3;
        }
        if (iE != 0) {
            char cCharAt = str.charAt(iE - 1);
            if (!(cCharAt == ' ' || cCharAt == '\n')) {
                z = false;
            }
        }
        return (strH.charAt(0) != '@' || !z || strH.endsWith(" ") || strH.endsWith("\n")) ? jceVar3 : jce.b;
    }

    public static int e(int i, CharSequence charSequence) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == ' ' || cCharAt == '\n') {
                return -1;
            }
            if (charSequence.charAt(i2) == '@') {
                return i2;
            }
        }
        return 0;
    }

    public static String h(int i, String str) {
        if (oag.t(str)) {
            return str;
        }
        int iE = e(i, str);
        while (true) {
            if (i >= str.length()) {
                i = str.length();
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == ' ' || cCharAt == '\n') {
                break;
            }
            i++;
        }
        return (iE == i || iE < 0 || i < 0) ? "" : str.substring(iE, i);
    }

    @Override // defpackage.a76
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.ofc
    public void accept(Object obj, Object obj2) {
        qne qneVar = (qne) obj2;
        oeg oegVar = (oeg) ((seg) obj).o();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(oegVar.e);
        int i = rdg.a;
        moe moeVar = (moe) this.a;
        if (moeVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            moeVar.writeToParcel(parcelObtain, 0);
        }
        try {
            oegVar.d.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            qneVar.b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        ((zm4) this.a).u();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List f(java.lang.String r11, int r12, java.util.List r13, defpackage.dce r14) {
        /*
            r10 = this;
            java.lang.Object r10 = r10.a
            j92 r10 = (defpackage.j92) r10
            jce r0 = c(r11, r12, r10)
            int r0 = r0.ordinal()
            r1 = 64
            r2 = 0
            r3 = 1
            if (r0 == 0) goto Lc9
            if (r0 == r3) goto Laf
            r12 = 2
            if (r0 == r12) goto L96
            r14 = 3
            if (r0 == r14) goto L20
            java.util.List r10 = java.util.Collections.emptyList()
            goto Le3
        L20:
            java.lang.String r14 = "\\s"
            java.lang.String[] r14 = r11.split(r14)
            j92 r0 = defpackage.j92.a
            if (r10 != r0) goto L32
            int r12 = r14.length
            if (r12 < r3) goto L30
            r12 = r14[r2]
            goto L3f
        L30:
            r12 = r11
            goto L3f
        L32:
            int r1 = r14.length
            if (r1 < r12) goto L30
            r12 = r14[r2]
            r14 = r14[r3]
            java.lang.String r1 = " "
            java.lang.String r12 = defpackage.rh4.j(r12, r1, r14)
        L3f:
            m82 r14 = new m82
            r1 = 8
            r14.<init>(r12, r1)
            java.util.List r12 = b(r13, r14)
            if (r10 != r0) goto L4f
            java.util.regex.Pattern r10 = defpackage.bre.d
            goto L51
        L4f:
            java.util.regex.Pattern r10 = defpackage.bre.f
        L51:
            java.util.regex.Matcher r10 = r10.matcher(r11)
            boolean r10 = r10.matches()
            if (r10 == 0) goto L91
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r11 = r12.size()
            r10.<init>(r11)
            java.util.Iterator r11 = r12.iterator()
        L6a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Le3
            java.lang.Object r12 = r11.next()
            ybe r12 = (defpackage.ybe) r12     // Catch: java.lang.Throwable -> L8a
            ybe r13 = new ybe     // Catch: java.lang.Throwable -> L8a
            long r1 = r12.a     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = r12.d     // Catch: java.lang.Throwable -> L8a
            r7 = 0
            r8 = 0
            r3 = 4
            r9 = 0
            r4 = 0
            r0 = r13
            r5 = r6
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L8a
            r10.add(r13)     // Catch: java.lang.Throwable -> L8a
            goto L6a
        L8a:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>(r10)
            throw r11
        L91:
            java.util.List r10 = java.util.Collections.emptyList()
            goto Le3
        L96:
            m82 r10 = new m82
            r12 = 7
            r10.<init>(r11, r12)
            java.util.List r10 = b(r13, r10)
            r11 = r10
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto Laa
            goto Le3
        Laa:
            java.util.List r10 = java.util.Collections.emptyList()
            goto Le3
        Laf:
            java.lang.String r10 = h(r12, r11)
            int r11 = r10.length()
            if (r11 != r3) goto Lc4
            char r11 = r10.charAt(r2)
            if (r11 != r1) goto Lc4
            java.util.List r10 = r14.c()
            goto Le3
        Lc4:
            java.util.List r10 = r14.g(r10)
            goto Le3
        Lc9:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r12 = r11.length()
            if (r12 != r3) goto Ldc
            char r12 = r11.charAt(r2)
            if (r12 != r1) goto Ldc
            java.util.List r11 = r14.c()
            goto Le0
        Ldc:
            java.util.List r11 = r14.g(r11)
        Le0:
            r10.<init>(r11)
        Le3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ece.f(java.lang.String, int, java.util.List, dce):java.util.List");
    }

    public Long g() {
        Long l = (Long) this.a;
        Long lValueOf = l == null ? null : Long.valueOf(SystemClock.elapsedRealtime() - l.longValue());
        this.a = Long.valueOf(SystemClock.elapsedRealtime());
        return lValueOf;
    }

    public void i(long j, long j2) {
        h1f h1fVar = (h1f) this.a;
        t85 t85Var = h1fVar.q;
        t85Var.getClass();
        boolean z = true;
        fm9.f(j >= 0 || j == -9223372036854775807L);
        t85Var.b = j;
        if (j2 <= 0 && j2 != -1) {
            z = false;
        }
        fm9.e("Invalid file size = " + j2, z);
        t85Var.c = j2;
        l1f l1fVar = h1fVar.r;
        l1fVar.getClass();
        l1fVar.g();
        l1fVar.j.b(null, 4, 0, 0).b();
    }

    @Override // defpackage.ifg
    public Object r() {
        Context context = (Context) ((zig) ((ifg) this.a)).a.b;
        if (context != null) {
            return new kkg(context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
