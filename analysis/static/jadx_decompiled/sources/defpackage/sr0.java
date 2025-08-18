package defpackage;

/* loaded from: classes2.dex */
public abstract class sr0 {
    public boolean canRepeat() {
        return true;
    }

    public dl intoParam(String str) {
        return intoParam(new m9e(str));
    }

    public boolean isSupplied() {
        return false;
    }

    public boolean shouldPost() {
        return false;
    }

    public boolean shouldSkipParam() {
        return false;
    }

    public abstract void write(kb7 kb7Var);

    public final dl intoParam(qr0 qr0Var) {
        return new rr0(qr0Var, this);
    }
}
