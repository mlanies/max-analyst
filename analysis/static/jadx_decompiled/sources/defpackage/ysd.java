package defpackage;

/* loaded from: classes2.dex */
public final class ysd {
    public static final /* synthetic */ bc7[] g = {new oi9(ysd.class, "from", "getFrom$common_release()F"), rh4.g(nec.a, ysd.class, "to", "getTo$common_release()F"), new oi9(ysd.class, "stepSize", "getStepSize$common_release()F")};
    public final xsd a = new xsd(this, 0);
    public final xsd b;
    public final xsd c;
    public float d;
    public int e;
    public float f;

    public ysd() {
        xsd xsdVar = new xsd(this, 1);
        this.b = xsdVar;
        this.c = new xsd(this, 2);
        this.e = a();
        float fB = this.d - b();
        bc7 bc7Var = g[1];
        this.f = ote.d(fB / (((Number) xsdVar.b).floatValue() - b()), 0.0f, 1.0f);
    }

    public final int a() {
        bc7[] bc7VarArr = g;
        bc7 bc7Var = bc7VarArr[1];
        float fFloatValue = ((Number) this.b.b).floatValue() - b();
        bc7 bc7Var2 = bc7VarArr[2];
        return tu0.G(fFloatValue / ((Number) this.c.b).floatValue()) + 1;
    }

    public final float b() {
        bc7 bc7Var = g[0];
        return ((Number) this.a.b).floatValue();
    }

    public final void c(float f) {
        float fB = b();
        bc7[] bc7VarArr = g;
        bc7 bc7Var = bc7VarArr[1];
        xsd xsdVar = this.b;
        float fD = ote.d(f, fB, ((Number) xsdVar.b).floatValue());
        this.d = fD;
        float fB2 = fD - b();
        bc7 bc7Var2 = bc7VarArr[1];
        this.f = ote.d(fB2 / (((Number) xsdVar.b).floatValue() - b()), 0.0f, 1.0f);
    }
}
