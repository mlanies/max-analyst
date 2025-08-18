package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class m9f {
    public final fad a;
    public final o9f b;
    public final vb0 c;
    public final List d;
    public boolean e = false;
    public boolean f = false;

    public m9f(fad fadVar, o9f o9fVar, vb0 vb0Var, List list) {
        this.a = fadVar;
        this.b = o9fVar;
        this.c = vb0Var;
        this.d = list;
    }

    public final String toString() {
        return "UseCaseAttachInfo{mSessionConfig=" + this.a + ", mUseCaseConfig=" + this.b + ", mStreamSpec=" + this.c + ", mCaptureTypes=" + this.d + ", mAttached=" + this.e + ", mActive=" + this.f + '}';
    }
}
