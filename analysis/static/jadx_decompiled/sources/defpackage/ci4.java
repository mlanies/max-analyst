package defpackage;

/* loaded from: classes.dex */
public final class ci4 extends ju0 {
    @Override // defpackage.ju0
    public final void G(Object obj, float f) {
        di4 di4Var = (di4) obj;
        di4Var.z0.b = f / 10000.0f;
        di4Var.invalidateSelf();
    }

    @Override // defpackage.ju0
    public final float u(Object obj) {
        return ((di4) obj).z0.b * 10000.0f;
    }
}
