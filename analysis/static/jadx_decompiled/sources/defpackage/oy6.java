package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oy6 extends ffe implements a66 {
    public ArrayList X;
    public ArrayList Y;
    public ArrayList Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ a86 u0;
    public final /* synthetic */ zme v0;
    public final /* synthetic */ fz6 w0;
    public final /* synthetic */ int x0;
    public final /* synthetic */ int y0;
    public final /* synthetic */ boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy6(a86 a86Var, zme zmeVar, fz6 fz6Var, int i, int i2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u0 = a86Var;
        this.v0 = zmeVar;
        this.w0 = fz6Var;
        this.x0 = i;
        this.y0 = i2;
        this.z0 = z;
    }

    public static final void r(sx3 sx3Var, fz6 fz6Var, zme zmeVar, boolean z) {
        vxd vxdVar;
        pag.j(sx3Var.getCoroutineContext());
        if (z && (vxdVar = fz6Var.C0) != null && vxdVar.isActive()) {
            throw new ic3("content change", 3);
        }
    }

    public static final boolean s(sx3 sx3Var, fz6 fz6Var, zme zmeVar, boolean z) {
        vxd vxdVar;
        r(sx3Var, fz6Var, zmeVar, z);
        return z ? j1e.z(sx3Var) && ((vxdVar = fz6Var.C0) == null || !vxdVar.isActive()) : j1e.z(sx3Var);
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((oy6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        oy6 oy6Var = new oy6(this.u0, this.v0, this.w0, this.x0, this.y0, this.z0, continuation);
        oy6Var.t0 = obj;
        return oy6Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.s0;
        boolean z2 = this.z0;
        final fz6 fz6Var = this.w0;
        zme zmeVar = this.v0;
        if (i == 0) {
            od2.a0(obj);
            final sx3 sx3Var2 = (sx3) this.t0;
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            a86 a86Var = this.u0;
            for (final u76 u76Var : a86Var.d()) {
                ContentResolver contentResolver = fz6Var.o;
                final boolean z3 = this.z0;
                final zme zmeVar2 = this.v0;
                tx3 tx3Var2 = tx3Var;
                final ArrayList arrayList6 = arrayList4;
                final ArrayList arrayList7 = arrayList5;
                boolean z4 = z2;
                a86 a86Var2 = a86Var;
                ArrayList arrayList8 = arrayList5;
                ArrayList arrayList9 = arrayList4;
                m56 m56Var = new m56() { // from class: jy6
                    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
                    @Override // defpackage.m56
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r25) {
                        /*
                            Method dump skipped, instructions count: 308
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy6.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                Uri uriI = u76Var.i();
                String strE = a86Var2.e(u76Var);
                String[] strArrA = a86Var2.a(u76Var);
                String strG = au1.g(u76Var.d(), " DESC");
                Bundle bundle = new Bundle();
                int i2 = this.x0;
                if (i2 != -1) {
                    bundle.putInt("android:query-arg-limit", i2);
                }
                int i3 = this.y0;
                if (i3 != -1) {
                    bundle.putInt("android:query-arg-offset", i3);
                }
                if (strG != null) {
                    bundle.putStringArray("android:query-arg-sort-columns", new String[]{strG});
                }
                if (strE != null) {
                    bundle.putString("android:query-arg-sql-selection", strE);
                }
                if (strArrA != null) {
                    bundle.putStringArray("android:query-arg-sql-selection-args", strArrA);
                }
                Cursor cursorQuery = contentResolver.query(uriI, u76Var.d, bundle, null);
                if (cursorQuery != null) {
                    try {
                        m56Var.invoke(cursorQuery);
                        v3c.i(cursorQuery, null);
                    } finally {
                    }
                }
                a86Var = a86Var2;
                tx3Var = tx3Var2;
                z2 = z4;
                arrayList5 = arrayList8;
                arrayList4 = arrayList9;
            }
            tx3 tx3Var3 = tx3Var;
            boolean z5 = z2;
            ArrayList arrayList10 = arrayList5;
            ArrayList arrayList11 = arrayList4;
            if (!arrayList10.isEmpty() || !arrayList11.isEmpty()) {
                z = z5;
                if (s(sx3Var2, fz6Var, zmeVar, z)) {
                    arrayList10.size();
                    arrayList11.size();
                    arrayList = new ArrayList(arrayList11.size() + arrayList10.size());
                    arrayList2 = arrayList10;
                    arrayList.addAll(arrayList2);
                    arrayList3 = arrayList11;
                    arrayList.addAll(arrayList3);
                    vxd vxdVarT = j47.T(sx3Var2, ((w9a) fz6Var.c).b(), null, new ly6(arrayList, null), 2);
                    kke kkeVar = fz6Var.c;
                    x77[] x77VarArr = {vxdVarT, j47.T(sx3Var2, ((w9a) kkeVar).b(), null, new my6(arrayList2, null), 2), j47.T(sx3Var2, ((w9a) kkeVar).b(), null, new ny6(arrayList3, null), 2)};
                    this.t0 = sx3Var2;
                    this.X = arrayList3;
                    this.Y = arrayList2;
                    this.Z = arrayList;
                    this.s0 = 1;
                    if (pag.t(x77VarArr, this) == tx3Var3) {
                        return tx3Var3;
                    }
                    sx3Var = sx3Var2;
                }
            }
            zmeVar.getClass();
            nz4 nz4Var = nz4.a;
            return new gy6(nz4Var, nz4Var, nz4Var);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList12 = this.Z;
        ArrayList arrayList13 = this.Y;
        ArrayList arrayList14 = this.X;
        sx3Var = (sx3) this.t0;
        od2.a0(obj);
        arrayList = arrayList12;
        z = z2;
        arrayList3 = arrayList14;
        arrayList2 = arrayList13;
        zmeVar.getClass();
        r(sx3Var, fz6Var, zmeVar, z);
        return new gy6(arrayList, arrayList3, arrayList2);
    }
}
