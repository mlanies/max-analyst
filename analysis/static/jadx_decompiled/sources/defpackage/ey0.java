package defpackage;

import java.util.Collections;
import java.util.Hashtable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class ey0 implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;
    public final /* synthetic */ bg1 c;

    public /* synthetic */ ey0(py0 py0Var, bg1 bg1Var, int i) {
        this.a = i;
        this.b = py0Var;
        this.c = bg1Var;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                py0 py0Var = this.b;
                kg1 kg1Var = py0Var.p1;
                kg1Var.getClass();
                fg1 fg1Var = (fg1) x53.i0(kg1Var.m(null, Collections.singletonList(this.c)));
                s04 s04Var = py0Var.j1;
                if (fg1Var == null) {
                    s04Var.getClass();
                    break;
                } else {
                    ((Hashtable) s04Var.d).remove(fg1Var);
                    break;
                }
            default:
                py0 py0Var2 = this.b;
                if (this.c.equals(py0Var2.I1)) {
                    py0Var2.I1 = null;
                    py0Var2.k(w51.I0, null);
                    break;
                }
                break;
        }
    }
}
