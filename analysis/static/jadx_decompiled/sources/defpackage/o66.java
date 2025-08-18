package defpackage;

/* loaded from: classes.dex */
public abstract class o66 extends fq1 implements n66, pb7 {
    private final int arity;
    private final int flags;

    public o66(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // defpackage.fq1
    public mb7 computeReflected() {
        nec.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o66) {
            o66 o66Var = (o66) obj;
            return getName().equals(o66Var.getName()) && getSignature().equals(o66Var.getSignature()) && this.flags == o66Var.flags && this.arity == o66Var.arity && tpa.f(getBoundReceiver(), o66Var.getBoundReceiver()) && tpa.f(getOwner(), o66Var.getOwner());
        }
        if (obj instanceof pb7) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.n66
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.pb7
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.pb7
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.pb7
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.pb7
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.fq1, defpackage.mb7
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        mb7 mb7VarCompute = compute();
        if (mb7VarCompute != this) {
            return mb7VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.fq1
    public pb7 getReflected() {
        mb7 mb7VarCompute = compute();
        if (mb7VarCompute != this) {
            return (pb7) mb7VarCompute;
        }
        throw new yx3("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
