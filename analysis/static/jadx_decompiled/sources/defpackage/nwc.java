package defpackage;

import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class nwc implements k56 {
    public final /* synthetic */ rwc a;
    public final /* synthetic */ lwc b;
    public final /* synthetic */ boolean c = true;

    public nwc(rwc rwcVar, lwc lwcVar) {
        this.a = rwcVar;
        this.b = lwcVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        rwc rwcVar = this.a;
        iwc iwcVarD = rwcVar.d(this.b);
        if (this.c) {
            EnumMap enumMap = rwcVar.v0;
            EnumMap enumMap2 = rwcVar.u0;
            lwc lwcVar = this.b;
            rwc.a(lwcVar, enumMap, enumMap2, new qwc(iwcVarD, rwcVar, lwcVar, rwcVar, iwcVarD));
        } else {
            iwcVarD.setVisibility(8);
            rwcVar.removeView(iwcVarD);
        }
        return Boolean.TRUE;
    }
}
