package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class ydg extends pw6 {
    public final /* synthetic */ int d = 1;
    public Object e;

    public ydg() {
        this.c = null;
        this.a = false;
        this.b = 0;
    }

    @Override // defpackage.pw6
    public final void g(ok okVar, qne qneVar) {
        switch (this.d) {
            case 0:
                ((ofc) ((er0) this.e).d).accept(okVar, qneVar);
                return;
            default:
                this.e = qneVar;
                aig aigVar = (aig) ((jig) okVar).o();
                djg djgVar = new djg(this);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                int i = jgg.a;
                parcelObtain.writeStrongBinder(djgVar);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    aigVar.c.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
        }
    }

    public ydg(er0 er0Var, pe5[] pe5VarArr, boolean z, int i) {
        this.e = er0Var;
        this.c = pe5VarArr;
        boolean z2 = false;
        if (pe5VarArr != null && z) {
            z2 = true;
        }
        this.a = z2;
        this.b = i;
    }
}
