package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class cp implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ep c;
    public final /* synthetic */ p84 o;

    public /* synthetic */ cp(p84 p84Var, ep epVar, Context context) {
        this.a = 2;
        this.o = p84Var;
        this.c = epVar;
        this.b = context;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new y1b(this.b, this.c.a(), this.o);
            case 1:
                this.c.a();
                return new wr7();
            case 2:
                this.o.getClass();
                return new bf8("ru.oneme.app.new.activeCalls", new khe(new x5(9, this.c)), new dp(this.b));
            default:
                ep epVar = this.c;
                return new en7(this.b, epVar.a(), (tda) epVar.d.getValue(), this.o, (wke) epVar.k.getValue());
        }
    }

    public /* synthetic */ cp(Context context, ep epVar, p84 p84Var, int i) {
        this.a = i;
        this.b = context;
        this.c = epVar;
        this.o = p84Var;
    }
}
