package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.opengl.GLES20;
import android.util.Pair;
import android.util.Range;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class l0f implements mde, ed6, e1d, f1d {
    public Object X;
    public final Object Y;
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object o;

    public /* synthetic */ l0f(Object obj, Object obj2, byte[] bArr, Object[] objArr, int i, int i2) {
        this.a = i2;
        this.o = obj;
        this.X = obj2;
        this.Y = bArr;
        this.c = objArr;
        this.b = i;
    }

    public static void q(String str) {
        if (eae.k0(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = tpa.m(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void u(l0f l0fVar, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = l0fVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        l0fVar.t(i, str, str2);
        throw null;
    }

    public int A(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((sy4) this.o).b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            g03 g03Var = (g03) this.X;
            int iQ = i - (i2 - g03Var.Q(i2));
            if (iQ == 0) {
                while (g03Var.S(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iQ;
        }
        return -1;
    }

    public String B(String str) {
        HashMap map = (HashMap) this.X;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = ((ArrayList) this.Y).iterator();
            while (it.hasNext()) {
                yw1 yw1VarF = ((yw1) it.next()).f();
                c54.j("CameraInfo doesn't contain Camera2 implementation.", yw1VarF instanceof iu1);
                if (str2.equals(((iu1) ((iu1) yw1VarF).c.b).a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public View C(int i) {
        return ((RecyclerView) ((sy4) this.o).b).getChildAt(i);
    }

    public int D() {
        return ((RecyclerView) ((sy4) this.o).b).getChildCount();
    }

    public void E(View view) {
        ((ArrayList) this.Y).add(view);
        sy4 sy4Var = (sy4) this.o;
        sy4Var.getClass();
        dec decVarU = RecyclerView.U(view);
        if (decVarU != null) {
            int i = decVarU.B0;
            View view2 = decVarU.a;
            if (i != -1) {
                decVarU.A0 = i;
            } else {
                WeakHashMap weakHashMap = zmf.a;
                decVarU.A0 = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = (RecyclerView) sy4Var.b;
            if (recyclerView.Z()) {
                decVarU.B0 = 4;
                recyclerView.F1.add(decVarU);
            } else {
                WeakHashMap weakHashMap2 = zmf.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean F(l0f l0fVar, int i) {
        return l0fVar != null && maf.a(((kgc[]) this.o)[i], ((kgc[]) l0fVar.o)[i]) && maf.a(((m85[]) this.X)[i], ((m85[]) l0fVar.X)[i]);
    }

    public boolean G(l0f l0fVar, int i) {
        return l0fVar != null && oaf.a(((lgc[]) this.o)[i], ((lgc[]) l0fVar.o)[i]) && oaf.a(((n85[]) this.X)[i], ((n85[]) l0fVar.X)[i]);
    }

    public boolean H(View view) {
        return ((ArrayList) this.Y).contains(view);
    }

    public boolean I(int i) {
        switch (this.a) {
            case 0:
                if (((kgc[]) this.o)[i] != null) {
                }
                break;
            default:
                if (((lgc[]) this.o)[i] != null) {
                }
                break;
        }
        return false;
    }

    public void J(k36 k36Var) {
        Cursor cursorQ0 = k36Var.q0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorQ0.moveToFirst()) {
                if (cursorQ0.getInt(0) == 0) {
                    z = true;
                }
            }
            v3c.i(cursorQ0, null);
            oy oyVar = (oy) this.X;
            oyVar.b(k36Var);
            if (!z) {
                yx8 yx8VarR = oyVar.r(k36Var);
                if (!yx8VarR.b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + yx8VarR.c);
                }
            }
            Y(k36Var);
            oyVar.n();
        } finally {
        }
    }

    public void K(k36 k36Var, int i, int i2) {
        M(k36Var, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L(defpackage.k36 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r7.q0(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L15:
            r6 = move-exception
            goto L91
        L18:
            r1 = r2
        L19:
            r3 = 0
            defpackage.v3c.i(r0, r3)
            java.lang.Object r0 = r6.X
            oy r0 = (defpackage.oy) r0
            if (r1 == 0) goto L6a
            sy4 r1 = new sy4
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r5 = 28
            r1.<init>(r5, r4)
            android.database.Cursor r1 = r7.o0(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L3d
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L3b
            goto L3e
        L3b:
            r6 = move-exception
            goto L64
        L3d:
            r2 = r3
        L3e:
            defpackage.v3c.i(r1, r3)
            java.lang.Object r1 = r6.Y
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = defpackage.tpa.f(r1, r2)
            if (r4 != 0) goto L75
            java.lang.Object r4 = r6.c
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = defpackage.tpa.f(r4, r2)
            if (r4 == 0) goto L56
            goto L75
        L56:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r0 = ", found: "
            java.lang.String r7 = defpackage.rh4.k(r7, r1, r0, r2)
            r6.<init>(r7)
            throw r6
        L64:
            throw r6     // Catch: java.lang.Throwable -> L65
        L65:
            r7 = move-exception
            defpackage.v3c.i(r1, r6)
            throw r7
        L6a:
            yx8 r1 = r0.r(r7)
            boolean r2 = r1.b
            if (r2 == 0) goto L7b
            r6.Y(r7)
        L75:
            r0.o(r7)
            r6.o = r3
            return
        L7b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r7.<init>(r0)
            java.lang.String r0 = r1.c
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L91:
            throw r6     // Catch: java.lang.Throwable -> L92
        L92:
            r7 = move-exception
            defpackage.v3c.i(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0f.L(k36):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0041 A[EDGE_INSN: B:61:0x0041->B:18:0x0041 BREAK  A[LOOP:1: B:12:0x0029->B:64:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M(defpackage.k36 r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.Object r4 = r0.o
            d34 r4 = (defpackage.d34) r4
            java.lang.Object r5 = r0.X
            oy r5 = (defpackage.oy) r5
            if (r4 == 0) goto Lc0
            sy4 r4 = r4.d
            r4.getClass()
            if (r2 != r3) goto L1d
            nz4 r4 = defpackage.nz4.a
            goto L85
        L1d:
            r7 = 0
            if (r3 <= r2) goto L22
            r8 = 1
            goto L23
        L22:
            r8 = r7
        L23:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = r2
        L29:
            if (r8 == 0) goto L2e
            if (r10 >= r3) goto L84
            goto L30
        L2e:
            if (r10 <= r3) goto L84
        L30:
            java.lang.Object r11 = r4.b
            java.util.LinkedHashMap r11 = (java.util.LinkedHashMap) r11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.lang.Object r11 = r11.get(r12)
            java.util.TreeMap r11 = (java.util.TreeMap) r11
            r12 = 0
            if (r11 != 0) goto L43
        L41:
            r4 = r12
            goto L85
        L43:
            if (r8 == 0) goto L4a
            java.util.NavigableSet r13 = r11.descendingKeySet()
            goto L4e
        L4a:
            java.util.Set r13 = r11.keySet()
        L4e:
            java.util.Iterator r13 = r13.iterator()
        L52:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L80
            java.lang.Object r14 = r13.next()
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r8 == 0) goto L6b
            int r15 = r10 + 1
            int r6 = r14.intValue()
            if (r15 > r6) goto L52
            if (r6 > r3) goto L52
            goto L73
        L6b:
            int r6 = r14.intValue()
            if (r3 > r6) goto L52
            if (r6 >= r10) goto L52
        L73:
            java.lang.Object r6 = r11.get(r14)
            r9.add(r6)
            int r10 = r14.intValue()
            r6 = 1
            goto L81
        L80:
            r6 = r7
        L81:
            if (r6 != 0) goto L29
            goto L41
        L84:
            r4 = r9
        L85:
            if (r4 == 0) goto Lc0
            r5.q(r1)
            java.util.Iterator r2 = r4.iterator()
        L8e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r2.next()
            da9 r3 = (defpackage.da9) r3
            r3.a(r1)
            goto L8e
        L9e:
            yx8 r2 = r5.r(r1)
            boolean r3 = r2.b
            if (r3 == 0) goto Laa
            r16.Y(r17)
            goto Ld2
        Laa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Migration didn't properly handle: "
            r1.<init>(r3)
            java.lang.String r2 = r2.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lc0:
            java.lang.Object r0 = r0.o
            d34 r0 = (defpackage.d34) r0
            if (r0 == 0) goto Ld3
            boolean r0 = r0.a(r2, r3)
            if (r0 != 0) goto Ld3
            r5.c(r1)
            r5.b(r1)
        Ld2:
            return
        Ld3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "A migration from "
            java.lang.String r4 = " to "
            java.lang.String r5 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            java.lang.String r1 = defpackage.wg0.h(r1, r2, r4, r3, r5)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0f.M(k36, int, int):void");
    }

    public byte N() {
        int i = this.b;
        while (true) {
            int iP = P(i);
            if (iP == -1) {
                this.b = iP;
                return (byte) 10;
            }
            char cCharAt = ((String) this.c).charAt(iP);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iP;
                return s5c.k(cCharAt);
            }
            i = iP + 1;
        }
    }

    public String O(boolean z) {
        String strN;
        byte bN = N();
        if (z) {
            if (bN != 1 && bN != 0) {
                return null;
            }
            strN = o();
        } else {
            if (bN != 1) {
                return null;
            }
            strN = n();
        }
        this.X = strN;
        return strN;
    }

    public int P(int i) {
        if (i < ((String) this.c).length()) {
            return i;
        }
        return -1;
    }

    public synchronized void Q(final hd6 hd6Var, final long j) {
        try {
            if (this.b > 0) {
                ((nx0) this.Y).v(new xff() { // from class: i26
                    @Override // defpackage.xff
                    public final void run() {
                        l0f l0fVar = this.a;
                        ((gd6) l0fVar.X).e((va8) l0fVar.o, hd6Var, j);
                    }
                });
                this.b--;
            } else {
                ((ArrayDeque) this.c).add(Pair.create(hd6Var, Long.valueOf(j)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void R(int i) {
        sy4 sy4Var = (sy4) this.o;
        int i2 = this.b;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iA = A(i);
            View childAt = ((RecyclerView) sy4Var.b).getChildAt(iA);
            if (childAt == null) {
                this.b = 0;
                this.c = null;
                return;
            }
            this.b = 1;
            this.c = childAt;
            if (((g03) this.X).Z(iA)) {
                X(childAt);
            }
            sy4Var.M(iA);
            this.b = 0;
            this.c = null;
        } catch (Throwable th) {
            this.b = 0;
            this.c = null;
            throw th;
        }
    }

    public synchronized void S() {
        try {
            if (((ArrayDeque) this.c).isEmpty()) {
                nx0 nx0Var = (nx0) this.Y;
                gd6 gd6Var = (gd6) this.X;
                Objects.requireNonNull(gd6Var);
                nx0Var.v(new j12(gd6Var, 1));
            } else {
                ((ArrayDeque) this.c).add(Pair.create(hd6.e, Long.MIN_VALUE));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public int T() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = (String) this.c;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.b = i;
        return i;
    }

    public boolean U() {
        int iT = T();
        String str = (String) this.c;
        if (iT >= str.length() || iT == -1 || str.charAt(iT) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean V(boolean z) {
        int iP = P(T());
        String str = (String) this.c;
        int length = str.length() - iP;
        if (length < 4 || iP == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != str.charAt(iP + i)) {
                return false;
            }
        }
        if (length > 4 && s5c.k(str.charAt(iP + 4)) == 0) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.b = iP + 4;
        return true;
    }

    public void W(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strO = o();
                this.b = i;
                if (tpa.f(strO, "null")) {
                    t(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        w(s5c.k(c), true);
        throw null;
    }

    public void X(View view) {
        if (((ArrayList) this.Y).remove(view)) {
            sy4 sy4Var = (sy4) this.o;
            sy4Var.getClass();
            dec decVarU = RecyclerView.U(view);
            if (decVarU != null) {
                int i = decVarU.A0;
                RecyclerView recyclerView = (RecyclerView) sy4Var.b;
                if (recyclerView.Z()) {
                    decVarU.B0 = i;
                    recyclerView.F1.add(decVarU);
                } else {
                    WeakHashMap weakHashMap = zmf.a;
                    decVarU.a.setImportantForAccessibility(i);
                }
                decVarU.A0 = 0;
            }
        }
    }

    public void Y(k36 k36Var) {
        k36Var.U("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        k36Var.U("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.Y) + "')");
    }

    public void Z(int i) {
        int[] iArr = (int[]) this.Y;
        if (iArr[i] != 0) {
            return;
        }
        iArr[i] = 1;
        for (zf6 zf6Var : ((zf6[][]) this.X)[i]) {
            Z(zf6Var.a.b);
            int i2 = this.b;
            this.b = i2 - 1;
            ((zf6[]) this.o)[i2] = zf6Var;
        }
        iArr[i] = 2;
    }

    public void a(int i, View view, boolean z) {
        sy4 sy4Var = (sy4) this.o;
        int childCount = i < 0 ? ((RecyclerView) sy4Var.b).getChildCount() : A(i);
        ((g03) this.X).W(childCount, z);
        if (z) {
            E(view);
        }
        RecyclerView recyclerView = (RecyclerView) sy4Var.b;
        recyclerView.addView(view, childCount);
        dec decVarU = RecyclerView.U(view);
        hdc hdcVar = recyclerView.A0;
        if (hdcVar != null && decVarU != null) {
            hdcVar.w(decVarU);
        }
        ArrayList arrayList = recyclerView.Q0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((qdc) recyclerView.Q0.get(size)).d(view);
            }
        }
    }

    @Override // defpackage.f1d
    public void b(tue tueVar, pa5 pa5Var, l3f l3fVar) {
    }

    public int c(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.Y).append((char) (x(i + 3, charSequence) + (x(i, charSequence) << 12) + (x(i + 1, charSequence) << 8) + (x(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return c(this.b, charSequence);
        }
        u(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0139  */
    @Override // defpackage.f1d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(defpackage.wpa r36) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0f.d(wpa):void");
    }

    @Override // defpackage.e1d
    public void e(sue sueVar, oa5 oa5Var, l3f l3fVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    @Override // defpackage.e1d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(defpackage.yaf r28) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0f.f(yaf):void");
    }

    public void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        sy4 sy4Var = (sy4) this.o;
        int childCount = i < 0 ? ((RecyclerView) sy4Var.b).getChildCount() : A(i);
        ((g03) this.X).W(childCount, z);
        if (z) {
            E(view);
        }
        sy4Var.getClass();
        dec decVarU = RecyclerView.U(view);
        RecyclerView recyclerView = (RecyclerView) sy4Var.b;
        if (decVarU != null) {
            if (!decVarU.r() && !decVarU.w()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(decVarU);
                throw new IllegalArgumentException(ms2.e(recyclerView, sb));
            }
            if (RecyclerView.M1) {
                decVarU.toString();
            }
            decVarU.u0 &= -257;
        } else if (RecyclerView.L1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(ms2.e(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    @Override // defpackage.mde
    public Object get() {
        Range range = ((o90) this.X).a;
        n90 n90Var = (n90) this.Y;
        int iE = wmd.E(156000, n90Var.c, 2, n90Var.b, 48000, range);
        z23 z23Var = new z23();
        z23Var.b = -1;
        String str = (String) this.o;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        z23Var.a = str;
        z23Var.b = Integer.valueOf(this.b);
        bue bueVar = (bue) this.c;
        if (bueVar == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        z23Var.c = bueVar;
        z23Var.f = Integer.valueOf(n90Var.c);
        z23Var.e = Integer.valueOf(n90Var.b);
        z23Var.d = Integer.valueOf(iE);
        return z23Var.b();
    }

    @Override // defpackage.ed6
    public synchronized void h() {
        Pair pair = (Pair) ((ArrayDeque) this.c).poll();
        if (pair == null) {
            this.b++;
            return;
        }
        ((nx0) this.Y).v(new i12(this, 3, pair));
        Pair pair2 = (Pair) ((ArrayDeque) this.c).peek();
        if (pair2 != null && ((Long) pair2.second).longValue() == Long.MIN_VALUE) {
            nx0 nx0Var = (nx0) this.Y;
            gd6 gd6Var = (gd6) this.X;
            Objects.requireNonNull(gd6Var);
            nx0Var.v(new j12(gd6Var, 1));
            ((ArrayDeque) this.c).remove();
        }
    }

    public boolean i() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.c;
            if (i >= str.length()) {
                this.b = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
    }

    public void j(int i, String str) {
        String str2 = (String) this.c;
        if (str2.length() - i < str.length()) {
            u(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                u(this, "Expected valid boolean literal prefix, but had '" + o() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public String k() {
        String string;
        m('\"');
        int i = this.b;
        String str = (String) this.c;
        int iZ0 = w9e.z0(str, '\"', i, false, 4);
        if (iZ0 == -1) {
            o();
            w((byte) 1, false);
            throw null;
        }
        int i2 = i;
        while (i2 < iZ0) {
            if (str.charAt(i2) == '\\') {
                int iP = this.b;
                char cCharAt = str.charAt(i2);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        ((StringBuilder) this.Y).append((CharSequence) str, iP, i2);
                        int iP2 = P(i2 + 1);
                        if (iP2 == -1) {
                            u(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iC = iP2 + 1;
                        char cCharAt2 = str.charAt(iP2);
                        if (cCharAt2 == 'u') {
                            iC = c(iC, str);
                        } else {
                            char c = cCharAt2 < 'u' ? r42.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                u(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            ((StringBuilder) this.Y).append(c);
                        }
                        iP = P(iC);
                        if (iP == -1) {
                            u(this, "Unexpected EOF", iP, null, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str.length()) {
                            ((StringBuilder) this.Y).append((CharSequence) str, iP, i2);
                            iP = P(i2);
                            if (iP == -1) {
                                u(this, "Unexpected EOF", iP, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i2);
                        }
                    }
                    i2 = iP;
                    z = true;
                    cCharAt = str.charAt(i2);
                }
                if (z) {
                    ((StringBuilder) this.Y).append((CharSequence) str, iP, i2);
                    StringBuilder sb = (StringBuilder) this.Y;
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iP, i2).toString();
                }
                this.b = i2 + 1;
                return string;
            }
            i2++;
        }
        this.b = iZ0 + 1;
        return str.substring(i, iZ0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        r4.b = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        return 10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte l() {
        /*
            r4 = this;
            int r0 = r4.b
        L2:
            r1 = -1
            r2 = 10
            java.lang.Object r3 = r4.c
            java.lang.String r3 = (java.lang.String) r3
            if (r0 == r1) goto L2f
            int r1 = r3.length()
            if (r0 >= r1) goto L2f
            int r1 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2d
            if (r0 == r2) goto L2d
            r2 = 13
            if (r0 == r2) goto L2d
            r2 = 9
            if (r0 != r2) goto L26
            goto L2d
        L26:
            r4.b = r1
            byte r4 = defpackage.s5c.k(r0)
            return r4
        L2d:
            r0 = r1
            goto L2
        L2f:
            int r0 = r3.length()
            r4.b = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0f.l():byte");
    }

    public void m(char c) {
        int i = this.b;
        if (i == -1) {
            W(c);
            throw null;
        }
        while (true) {
            String str = (String) this.c;
            if (i >= str.length()) {
                this.b = -1;
                W(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                W(c);
                throw null;
            }
            i = i2;
        }
    }

    public String n() {
        String str = (String) this.X;
        if (str == null) {
            return k();
        }
        this.X = null;
        return str;
    }

    public String o() {
        String string;
        String str = (String) this.X;
        if (str != null) {
            this.X = null;
            return str;
        }
        int iT = T();
        String str2 = (String) this.c;
        if (iT >= str2.length() || iT == -1) {
            u(this, "EOF", iT, null, 4);
            throw null;
        }
        byte bK = s5c.k(str2.charAt(iT));
        if (bK == 1) {
            return n();
        }
        if (bK != 0) {
            u(this, "Expected beginning of the string, but got " + str2.charAt(iT), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (s5c.k(str2.charAt(iT)) == 0) {
            iT++;
            if (iT >= str2.length()) {
                ((StringBuilder) this.Y).append((CharSequence) str2, this.b, iT);
                int iP = P(iT);
                if (iP == -1) {
                    this.b = iT;
                    ((StringBuilder) this.Y).append((CharSequence) str2, 0, 0);
                    StringBuilder sb = (StringBuilder) this.Y;
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iT = iP;
                z = true;
            }
        }
        if (z) {
            ((StringBuilder) this.Y).append((CharSequence) str2, this.b, iT);
            StringBuilder sb2 = (StringBuilder) this.Y;
            String string3 = sb2.toString();
            sb2.setLength(0);
            string = string3;
        } else {
            string = str2.subSequence(this.b, iT).toString();
        }
        this.b = iT;
        return string;
    }

    public String p() {
        String strO = o();
        if (tpa.f(strO, "null")) {
            if (((String) this.c).charAt(this.b - 1) != '\"') {
                u(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return strO;
    }

    public void r(int i) {
        int iA = A(i);
        ((g03) this.X).Z(iA);
        RecyclerView recyclerView = (RecyclerView) ((sy4) this.o).b;
        View childAt = recyclerView.getChildAt(iA);
        if (childAt != null) {
            dec decVarU = RecyclerView.U(childAt);
            if (decVarU != null) {
                if (decVarU.r() && !decVarU.w()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(decVarU);
                    throw new IllegalArgumentException(ms2.e(recyclerView, sb));
                }
                if (RecyclerView.M1) {
                    decVarU.toString();
                }
                decVarU.f(256);
            }
        } else if (RecyclerView.L1) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iA);
            throw new IllegalArgumentException(ms2.e(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iA);
    }

    public void t(int i, String str, String str2) {
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbO = rh4.o(str, " at path: ");
        sbO.append(((jn) this.o).u());
        sbO.append(strConcat);
        throw xfg.b(sbO.toString(), (String) this.c, i);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return ((g03) this.X).toString() + ", hidden list:" + ((ArrayList) this.Y).size();
            case 10:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.c);
                sb.append("', currentPosition=");
                return au1.h(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ed6
    public synchronized void v() {
        this.b = 0;
        ((ArrayDeque) this.c).clear();
    }

    public void w(byte b, boolean z) {
        String strE0 = s5c.e0(b);
        int i = z ? this.b - 1 : this.b;
        int i2 = this.b;
        String str = (String) this.c;
        u(this, k7d.j("Expected ", strE0, ", but had '", (i2 == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public int x(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        u(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public View y(int i) {
        return ((RecyclerView) ((sy4) this.o).b).getChildAt(A(i));
    }

    public int z() {
        return ((RecyclerView) ((sy4) this.o).b).getChildCount() - ((ArrayList) this.Y).size();
    }

    public l0f(zad zadVar, int i, List list, eqa eqaVar, List list2) {
        this.a = 9;
        this.o = zadVar;
        this.b = i;
        this.X = list;
        this.Y = eqaVar;
        this.c = list2;
    }

    public l0f(d34 d34Var, oy oyVar, String str, String str2) {
        this.a = 8;
        int i = oyVar.b;
        this.a = 8;
        this.b = i;
        this.o = d34Var;
        this.X = oyVar;
        this.Y = str;
        this.c = str2;
    }

    public l0f(va8 va8Var, gd6 gd6Var, nx0 nx0Var) {
        this.a = 5;
        this.o = va8Var;
        this.X = gd6Var;
        this.Y = nx0Var;
        this.c = new ArrayDeque();
    }

    public l0f(dx1 dx1Var) {
        this.a = 3;
        this.b = 0;
        this.X = new HashMap();
        this.c = new HashSet();
        this.o = new ArrayList();
        this.Y = new ArrayList();
        Set hashSet = new HashSet();
        try {
            hashSet = dx1Var.a.G();
        } catch (CameraAccessExceptionCompat unused) {
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (ngg.z(dx1Var, str) && ngg.z(dx1Var, str2)) {
                        ((HashSet) this.c).add(new HashSet(Arrays.asList(str, str2)));
                        HashMap map = (HashMap) this.X;
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        ((List) map.get(str)).add((String) arrayList.get(1));
                        ((List) map.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (InitializationException unused2) {
                }
            }
        }
    }

    public l0f(String str, int i, o90 o90Var, n90 n90Var) {
        this.a = 2;
        bue bueVar = bue.a;
        this.o = str;
        this.b = i;
        this.c = bueVar;
        this.X = o90Var;
        this.Y = n90Var;
    }

    public l0f(sy4 sy4Var) {
        this.a = 4;
        this.b = 0;
        this.o = sy4Var;
        this.X = new g03(0);
        this.Y = new ArrayList();
    }

    public l0f(kgc[] kgcVarArr, m85[] m85VarArr, r0f r0fVar, ez7 ez7Var) {
        this.a = 0;
        this.o = kgcVarArr;
        this.X = (m85[]) m85VarArr.clone();
        this.Y = r0fVar;
        this.c = ez7Var;
        this.b = kgcVarArr.length;
    }

    public l0f(lgc[] lgcVarArr, n85[] n85VarArr, p0f p0fVar, fz7 fz7Var) {
        this.a = 1;
        fm9.f(lgcVarArr.length == n85VarArr.length);
        this.o = lgcVarArr;
        this.X = (n85[]) n85VarArr.clone();
        this.Y = p0fVar;
        this.c = fz7Var;
        this.b = lgcVarArr.length;
    }

    public l0f() {
        byte[] bArr;
        byte[] bArr2;
        this.a = 6;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.b = iGlCreateProgram;
        wmd.h();
        wmd.a(iGlCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        wmd.a(iGlCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(iGlCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int i2 = 1;
        if (iArr[0] != 1) {
            String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            if (strValueOf.length() != 0) {
                "Unable to link shader program: \n".concat(strValueOf);
            }
        }
        GLES20.glUseProgram(iGlCreateProgram);
        this.Y = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.o = new lq9[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.b;
            int[] iArr3 = new int[i2];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i5 = iArr3[0];
            byte[] bArr3 = new byte[i5];
            GLES20.glGetActiveAttrib(i4, i3, i5, new int[i2], 0, new int[i2], 0, new int[i2], 0, bArr3, 0);
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    bArr2 = bArr3;
                    i6 = i5;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i6] == 0) {
                        break;
                    }
                    i6++;
                    bArr3 = bArr2;
                }
            }
            String str = new String(bArr2, 0, i6);
            GLES20.glGetAttribLocation(i4, str);
            lq9 lq9Var = new lq9();
            ((lq9[]) this.o)[i3] = lq9Var;
            ((HashMap) this.Y).put(str, lq9Var);
            i3++;
            i2 = 1;
        }
        this.c = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.b, 35718, iArr4, 0);
        this.X = new mq9[iArr4[0]];
        for (int i7 = 0; i7 < iArr4[i]; i7++) {
            int i8 = this.b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i8, 35719, iArr5, i);
            int i9 = iArr5[i];
            byte[] bArr4 = new byte[i9];
            GLES20.glGetActiveUniform(i8, i7, i9, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    bArr = bArr4;
                    i10 = i9;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i10] == 0) {
                        break;
                    }
                    i10++;
                    bArr4 = bArr;
                }
            }
            i = 0;
            String str2 = new String(bArr, 0, i10);
            GLES20.glGetUniformLocation(i8, str2);
            mq9 mq9Var = new mq9(11);
            ((mq9[]) this.X)[i7] = mq9Var;
            ((HashMap) this.c).put(str2, mq9Var);
        }
        wmd.h();
    }

    public l0f(String str) {
        this.a = 10;
        jn jnVar = new jn((char) 0, 13);
        jnVar.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        jnVar.o = iArr;
        jnVar.b = -1;
        this.o = jnVar;
        this.Y = new StringBuilder();
        this.c = str;
    }

    public l0f(h3f h3fVar, int i) {
        this.a = 11;
        this.c = h3fVar;
        this.o = new s02(new byte[5], 5, 1, (byte) 0);
        this.X = new SparseArray();
        this.Y = new SparseIntArray();
        this.b = i;
    }

    public l0f(i3f i3fVar, int i) {
        this.a = 12;
        this.c = i3fVar;
        this.o = new s02(new byte[5], 5, 2, (byte) 0);
        this.X = new SparseArray();
        this.Y = new SparseIntArray();
        this.b = i;
    }

    public l0f(bg6 bg6Var, zf6[] zf6VarArr) {
        this.a = 7;
        this.c = bg6Var;
        int length = zf6VarArr.length;
        this.o = new zf6[length];
        this.b = length - 1;
        int iF = bg6Var.f() + 1;
        zf6[][] zf6VarArr2 = new zf6[iF][];
        int[] iArr = new int[iF];
        for (zf6 zf6Var : zf6VarArr) {
            int i = zf6Var.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < iF; i2++) {
            zf6VarArr2[i2] = new zf6[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (zf6 zf6Var2 : zf6VarArr) {
            int i3 = zf6Var2.a.a;
            zf6[] zf6VarArr3 = zf6VarArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            zf6VarArr3[i4] = zf6Var2;
        }
        this.X = zf6VarArr2;
        this.Y = new int[((bg6) this.c).f() + 1];
    }
}
