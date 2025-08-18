package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* loaded from: classes.dex */
public final class aeg implements neg {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ LayoutInflater b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ moa e;

    public aeg(moa moaVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = moaVar;
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
    }

    @Override // defpackage.neg
    public final int a() {
        return 2;
    }

    @Override // defpackage.neg
    public final void b() {
        FrameLayout frameLayout = this.a;
        frameLayout.removeAllViews();
        b9b b9bVar = (b9b) this.e.a;
        LayoutInflater layoutInflater = this.b;
        ViewGroup viewGroup = this.c;
        Bundle bundle = this.d;
        b9bVar.getClass();
        try {
            Bundle bundle2 = new Bundle();
            ngg.N(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                yig yigVar = (yig) b9bVar.c;
                oy9 oy9Var = new oy9(layoutInflater);
                oy9 oy9Var2 = new oy9(viewGroup);
                Parcel parcelG0 = yigVar.G0();
                agg.c(parcelG0, oy9Var);
                agg.c(parcelG0, oy9Var2);
                agg.b(parcelG0, bundle2);
                Parcel parcelR = yigVar.R(parcelG0, 4);
                xr6 xr6VarK0 = oy9.K0(parcelR.readStrongBinder());
                parcelR.recycle();
                StrictMode.setThreadPolicy(threadPolicy);
                ngg.N(bundle2, bundle);
                frameLayout.addView((View) oy9.L0(xr6VarK0));
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
