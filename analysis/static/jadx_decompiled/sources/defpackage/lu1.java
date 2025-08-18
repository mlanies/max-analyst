package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public class lu1 {
    public static final lu1 a = new lu1();

    public void a(o9f o9fVar, u40 u40Var) {
        kz1 kz1Var = (kz1) o9fVar.f(o9f.h0, null);
        ce3 ce3Var = wma.c;
        aa0 aa0Var = kz1.i;
        HashSet hashSet = new HashSet();
        mi9 mi9VarB = mi9.b();
        ArrayList arrayList = new ArrayList();
        ui9 ui9VarA = ui9.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        wma wmaVarA = wma.a(mi9VarB);
        ArrayList arrayList3 = new ArrayList(arrayList);
        nje njeVar = nje.b;
        ArrayMap arrayMap = new ArrayMap();
        Map map = ui9VarA.a;
        for (String str : map.keySet()) {
            arrayMap.put(str, map.get(str));
        }
        nje njeVar2 = new nje(arrayMap);
        int i = -1;
        new kz1(arrayList2, wmaVarA, -1, false, arrayList3, false, njeVar2, null);
        if (kz1Var != null) {
            u40Var.a(kz1Var.e);
            i = kz1Var.c;
            ce3Var = kz1Var.b;
        }
        u40Var.f = mi9.c(ce3Var);
        u40Var.c = ((Integer) o9fVar.f(cv1.Z, Integer.valueOf(i))).intValue();
        u40Var.b(new jz1((CameraCaptureSession.CaptureCallback) o9fVar.f(cv1.v0, new ku1())));
        u40Var.c(wd6.w(o9fVar).u());
    }
}
