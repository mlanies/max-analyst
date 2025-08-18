package defpackage;

/* loaded from: classes.dex */
public final class hz1 implements s7c {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ hz1(int i) {
        this.a = i;
    }

    @Override // defpackage.q7c
    public Object T0(Object obj, bc7 bc7Var) {
        Object obj2 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + bc7Var.getName() + " should be initialized before get.");
    }

    @Override // defpackage.s7c
    public void o1(Object obj, bc7 bc7Var, Object obj2) {
        this.b = obj2;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("NotNullProperty(");
                if (this.b != null) {
                    str = "value=" + this.b;
                } else {
                    str = "value not initialized yet";
                }
                return rh4.m(sb, str, ')');
            default:
                return super.toString();
        }
    }
}
