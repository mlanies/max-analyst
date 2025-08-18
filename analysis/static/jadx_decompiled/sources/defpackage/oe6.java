package defpackage;

import android.content.Context;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oe6 {
    public static void a(Context context, pr7 pr7Var) {
        int i = or7.a;
        reg regVar = new reg(context, reg.w0, nk.d, ce6.c);
        ArrayList arrayList = new ArrayList();
        LocationRequest locationRequest = new LocationRequest();
        ay7.U(100);
        locationRequest.a = 100;
        arrayList.add(locationRequest);
        qr7 qr7Var = new qr7(arrayList, false, false);
        er0 er0Var = new er0();
        er0Var.c = true;
        er0Var.d = new frf(qr7Var);
        er0Var.b = 2426;
        ukg ukgVarC = regVar.c(0, er0Var.a());
        ukgVarC.i(new ne6(pr7Var));
        Objects.requireNonNull(pr7Var);
        ukgVarC.c(xne.a, new ne6(pr7Var));
    }
}
