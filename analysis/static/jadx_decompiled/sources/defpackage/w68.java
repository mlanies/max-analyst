package defpackage;

/* loaded from: classes.dex */
public abstract class w68 extends u68 {
    public final /* synthetic */ cj8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w68(cj8 cj8Var) {
        super(cj8Var);
        this.f = cj8Var;
    }

    public final void J() {
        v68 v68Var = new v68(this, this.f);
        this.b = v68Var;
        v68Var.onCreate();
    }
}
