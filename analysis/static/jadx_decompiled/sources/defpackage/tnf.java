package defpackage;

import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class tnf implements je7 {
    public final Object X;
    public Object Y;
    public final /* synthetic */ int a = 0;
    public final k56 b;
    public Object c;
    public final Object o;

    public tnf(h23 h23Var, rtc rtcVar, k56 k56Var, rtc rtcVar2) {
        this.c = h23Var;
        this.b = rtcVar;
        this.o = k56Var;
        this.X = rtcVar2;
    }

    @Override // defpackage.je7
    public final boolean a() {
        switch (this.a) {
            case 0:
                if (((qnf) this.Y) != null) {
                }
                break;
            default:
                if (((pnf) this.c) != null) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.je7
    public final Object getValue() {
        switch (this.a) {
            case 0:
                qnf qnfVar = (qnf) this.Y;
                if (qnfVar != null) {
                    return qnfVar;
                }
                qnf qnfVarB = new xje((xnf) this.b.invoke(), (vnf) ((k56) this.o).invoke(), (lz3) ((k56) this.X).invoke()).b((h23) ((nb7) this.c));
                this.Y = qnfVarB;
                return qnfVarB;
            default:
                pnf pnfVarA = (pnf) this.c;
                if (pnfVarA == null) {
                    Widget widgetM38findWidgetByScopeIdiP7A0G4 = ((Widget) this.o).m38findWidgetByScopeIdiP7A0G4((String) this.X);
                    if (widgetM38findWidgetByScopeIdiP7A0G4 != null) {
                        String str = ((Widget) this.o).tag;
                        Class cls = (Class) this.Y;
                        ir6 ir6Var = hm9.m;
                        if (ir6Var != null && ir6Var.c()) {
                            ir6Var.d(us7.X, str, zr6.i("Found vm=", cls.getCanonicalName(), " in parent scope, trying to access it"), null);
                        }
                        pnfVarA = widgetM38findWidgetByScopeIdiP7A0G4.getViewModelStore().a((Class) this.Y);
                    } else {
                        String str2 = ((Widget) this.o).tag;
                        Class cls2 = (Class) this.Y;
                        k56 k56Var = this.b;
                        ir6 ir6Var2 = hm9.m;
                        if (ir6Var2 != null && ir6Var2.c()) {
                            ir6Var2.d(us7.X, str2, "Not found vm=" + cls2.getCanonicalName() + " in parent scope, trying to create it via fabric=" + k56Var, null);
                        }
                        k56 k56Var2 = this.b;
                        pnfVarA = k56Var2 != null ? (pnf) k56Var2.invoke() : null;
                    }
                    String str3 = (String) this.X;
                    if (pnfVarA == null) {
                        throw new IllegalArgumentException(x9e.b0("\n                    Cant find widget by given scopeId=" + zr6.i("ScopeId(value=", str3, ")") + "!\n                    \n                    Please, either register such widget in hierarchy before lookup, or provide default factory for such VM\n                    ").toString());
                    }
                    this.c = pnfVarA;
                }
                return pnfVarA;
        }
    }

    public tnf(Widget widget, String str, Class cls, k56 k56Var) {
        this.o = widget;
        this.X = str;
        this.Y = cls;
        this.b = k56Var;
    }
}
