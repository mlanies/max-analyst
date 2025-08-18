package defpackage;

import android.content.Context;
import android.view.Surface;

/* loaded from: classes2.dex */
public final /* synthetic */ class khf implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ khf(Context context, dif difVar) {
        this.a = 1;
        this.b = context;
        this.c = difVar;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ohf.a((ohf) this.c, (Context) this.b);
            case 1:
                ohf ohfVar = new ohf((Context) this.b);
                ohfVar.setListener((dif) this.c);
                ohfVar.setOnLongClickListener(new zl0(13, ohfVar));
                return ohfVar;
            case 2:
                fjf fjfVar = ((sif) this.c).u0;
                if (fjfVar != null) {
                    fjfVar.w = (m56) this.b;
                }
                return e5f.a;
            case 3:
                sif sifVar = (sif) this.b;
                zh6 zh6Var = sifVar.X;
                kee keeVar = (kee) this.c;
                Surface surfaceD = keeVar.d(zh6Var, new qif(sifVar, keeVar));
                fjf fjfVar2 = sifVar.u0;
                if (fjfVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                fjfVar2.p(surfaceD);
                sifVar.Z.put(keeVar, surfaceD);
                return e5f.a;
            default:
                zzf zzfVar = (zzf) this.c;
                long jT = ((hyc) zzfVar.Z).t();
                jwf jwfVar = jwf.a;
                Context context = (Context) jwfVar.getAccessor().c(Context.class);
                w7c w7cVar = new w7c(zzfVar.H0);
                khe kheVarD = jwfVar.getAccessor().d(mtf.class);
                return new ouf(jT, zzfVar.b, zzfVar.a, context, w7cVar, kheVarD, (je7) this.b);
        }
    }

    public /* synthetic */ khf(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
