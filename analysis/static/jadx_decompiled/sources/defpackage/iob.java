package defpackage;

/* loaded from: classes.dex */
public abstract class iob extends fq1 implements bc7 {
    private final boolean syntheticJavaProperty;

    public iob(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // defpackage.fq1
    public mb7 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iob) {
            iob iobVar = (iob) obj;
            return getOwner().equals(iobVar.getOwner()) && getName().equals(iobVar.getName()) && getSignature().equals(iobVar.getSignature()) && tpa.f(getBoundReceiver(), iobVar.getBoundReceiver());
        }
        if (obj instanceof bc7) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.bc7
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.bc7
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        mb7 mb7VarCompute = compute();
        if (mb7VarCompute != this) {
            return mb7VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.fq1
    public bc7 getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        mb7 mb7VarCompute = compute();
        if (mb7VarCompute != this) {
            return (bc7) mb7VarCompute;
        }
        throw new yx3("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
