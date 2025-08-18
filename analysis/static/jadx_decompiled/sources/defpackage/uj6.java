package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class uj6 extends hj3 {
    public hj3[] q0 = new hj3[4];
    public int r0 = 0;

    public final void R(int i, o5g o5gVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            hj3 hj3Var = this.q0[i2];
            ArrayList arrayList2 = o5gVar.a;
            if (!arrayList2.contains(hj3Var)) {
                arrayList2.add(hj3Var);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            f8.e(this.q0[i3], i, arrayList, o5gVar);
        }
    }

    public void S() {
    }
}
