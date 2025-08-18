package defpackage;

/* loaded from: classes.dex */
public final class x68 extends w68 {
    public final /* synthetic */ cj8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x68(cj8 cj8Var) {
        super(cj8Var);
        this.g = cj8Var;
    }

    public final vi8 K() {
        cj8 cj8Var = this.g;
        s68 s68Var = cj8Var.Y;
        if (s68Var == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (s68Var != cj8Var.c) {
            return s68Var.d;
        }
        v68 v68Var = (v68) this.b;
        v68Var.getClass();
        return new vi8(v68Var.getCurrentBrowserInfo());
    }
}
