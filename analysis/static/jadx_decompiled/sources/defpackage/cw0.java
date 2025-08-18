package defpackage;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class cw0 implements qod {
    public final /* synthetic */ rod a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ rod c;

    public cw0(rod rodVar, u3c u3cVar) {
        this.c = rodVar;
        this.b = u3cVar;
        this.a = rodVar;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) {
        this.c.c.removeCallbacks(this.b);
        this.a.g();
    }
}
