package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class tig extends qjg {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tig(mdg mdgVar, int i) {
        super(mdgVar);
        this.o = i;
        fp3.o(mdgVar, "GoogleApiClient must not be null");
        fp3.o(w70.a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ rjc P(Status status) {
        int i = this.o;
        return status;
    }

    @Override // defpackage.qjg
    public final void T(ok okVar) {
        switch (this.o) {
            case 0:
                big bigVar = (big) okVar;
                wkg wkgVar = (wkg) bigVar.o();
                kjg kjgVar = new kjg(this, 0);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(wkgVar.e);
                int i = zhg.a;
                parcelObtain.writeStrongBinder(kjgVar);
                GoogleSignInOptions googleSignInOptions = bigVar.K0;
                if (googleSignInOptions == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    googleSignInOptions.writeToParcel(parcelObtain, 0);
                }
                wkgVar.H0(parcelObtain, HttpStatus.SC_PROCESSING);
                break;
            default:
                big bigVar2 = (big) okVar;
                wkg wkgVar2 = (wkg) bigVar2.o();
                kjg kjgVar2 = new kjg(this, 1);
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(wkgVar2.e);
                int i2 = zhg.a;
                parcelObtain2.writeStrongBinder(kjgVar2);
                GoogleSignInOptions googleSignInOptions2 = bigVar2.K0;
                if (googleSignInOptions2 == null) {
                    parcelObtain2.writeInt(0);
                } else {
                    parcelObtain2.writeInt(1);
                    googleSignInOptions2.writeToParcel(parcelObtain2, 0);
                }
                wkgVar2.H0(parcelObtain2, 103);
                break;
        }
    }
}
