package defpackage;

/* loaded from: classes2.dex */
public final class vye extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wye b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vye(wye wyeVar, int i) {
        super(0);
        this.a = i;
        this.b = wyeVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        String strVersionName;
        switch (this.a) {
            case 0:
                wye wyeVar = this.b;
                String str = wyeVar.a;
                yye yyeVarA = wyeVar.a();
                if (yyeVarA == null || (strVersionName = yyeVarA.versionName()) == null) {
                    strVersionName = "NA";
                }
                yye yyeVarA2 = wyeVar.a();
                String strBuildUuid = yyeVarA2 != null ? yyeVarA2.buildUuid() : null;
                yye yyeVarA3 = wyeVar.a();
                return new sye(str, strVersionName, strBuildUuid, yyeVarA3 != null ? yyeVarA3.environment() : null);
            default:
                wye wyeVar2 = this.b;
                try {
                    return nd7.P(wyeVar2.a);
                } catch (Exception unused) {
                    String str2 = wyeVar2.a;
                    return null;
                }
        }
    }
}
