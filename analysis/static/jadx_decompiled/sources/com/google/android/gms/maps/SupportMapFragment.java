package com.google.android.gms.maps;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.a;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import defpackage.aeg;
import defpackage.agg;
import defpackage.b9b;
import defpackage.ee6;
import defpackage.fe6;
import defpackage.geg;
import defpackage.hdg;
import defpackage.hq;
import defpackage.moa;
import defpackage.ngg;
import defpackage.pdg;
import defpackage.qdg;
import defpackage.yig;

/* loaded from: classes.dex */
public class SupportMapFragment extends a {
    public final moa l1 = new moa(this);

    @Override // androidx.fragment.app.a
    public final void E0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.S0 = true;
            moa moaVar = this.l1;
            moaVar.Z = activity;
            moaVar.e();
            GoogleMapOptions googleMapOptionsB = GoogleMapOptions.b(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsB);
            moaVar.d(bundle, new hdg(moaVar, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.a
    public final void H0() {
        moa moaVar = this.l1;
        b9b b9bVar = (b9b) moaVar.a;
        if (b9bVar != null) {
            try {
                yig yigVar = (yig) b9bVar.c;
                yigVar.H0(yigVar.G0(), 6);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            moaVar.b(5);
        }
        this.S0 = true;
    }

    @Override // androidx.fragment.app.a
    public final void K0() {
        this.S0 = true;
        moa moaVar = this.l1;
        moaVar.getClass();
        moaVar.d(null, new geg(moaVar, 1));
    }

    @Override // androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        moa moaVar = this.l1;
        b9b b9bVar = (b9b) moaVar.a;
        if (b9bVar == null) {
            Bundle bundle2 = (Bundle) moaVar.b;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
                return;
            }
            return;
        }
        try {
            Bundle bundle3 = new Bundle();
            ngg.N(bundle, bundle3);
            yig yigVar = (yig) b9bVar.c;
            Parcel parcelG0 = yigVar.G0();
            agg.b(parcelG0, bundle3);
            Parcel parcelR = yigVar.R(parcelG0, 10);
            if (parcelR.readInt() != 0) {
                bundle3.readFromParcel(parcelR);
            }
            parcelR.recycle();
            ngg.N(bundle3, bundle);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // androidx.fragment.app.a
    public final void M0() {
        this.S0 = true;
        moa moaVar = this.l1;
        moaVar.getClass();
        moaVar.d(null, new geg(moaVar, 0));
    }

    @Override // androidx.fragment.app.a
    public final void N0() {
        moa moaVar = this.l1;
        b9b b9bVar = (b9b) moaVar.a;
        if (b9bVar != null) {
            try {
                yig yigVar = (yig) b9bVar.c;
                yigVar.H0(yigVar.G0(), 16);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            moaVar.b(4);
        }
        this.S0 = true;
    }

    @Override // androidx.fragment.app.a, android.content.ComponentCallbacks
    public final void onLowMemory() {
        b9b b9bVar = (b9b) this.l1.a;
        if (b9bVar != null) {
            try {
                yig yigVar = (yig) b9bVar.c;
                yigVar.H0(yigVar.G0(), 9);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.S0 = true;
    }

    @Override // androidx.fragment.app.a
    public final void r0(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        this.S0 = true;
    }

    @Override // androidx.fragment.app.a
    public final void t0(Activity activity) {
        this.S0 = true;
        moa moaVar = this.l1;
        moaVar.Z = activity;
        moaVar.e();
    }

    @Override // androidx.fragment.app.a
    public void v0(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.v0(bundle);
            moa moaVar = this.l1;
            moaVar.getClass();
            moaVar.d(bundle, new qdg(moaVar, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.a
    public View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        moa moaVar = this.l1;
        moaVar.getClass();
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        moaVar.d(bundle, new aeg(moaVar, frameLayout, layoutInflater, viewGroup, bundle));
        if (((b9b) moaVar.a) == null) {
            ee6 ee6Var = ee6.d;
            Context context = frameLayout.getContext();
            int iB = ee6Var.b(context, fe6.a);
            String strC = pdg.c(context, iB);
            String strB = pdg.b(context, iB);
            LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            frameLayout.addView(linearLayout);
            TextView textView = new TextView(frameLayout.getContext());
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            textView.setText(strC);
            linearLayout.addView(textView);
            Intent intentA = ee6Var.a(iB, context, null);
            if (intentA != null) {
                Button button = new Button(context);
                button.setId(R.id.button1);
                button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                button.setText(strB);
                linearLayout.addView(button);
                button.setOnClickListener(new hq(context, 7, intentA));
            }
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    @Override // androidx.fragment.app.a
    public final void y0() {
        moa moaVar = this.l1;
        b9b b9bVar = (b9b) moaVar.a;
        if (b9bVar != null) {
            try {
                yig yigVar = (yig) b9bVar.c;
                yigVar.H0(yigVar.G0(), 8);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            moaVar.b(1);
        }
        this.S0 = true;
    }

    @Override // androidx.fragment.app.a
    public final void z0() {
        moa moaVar = this.l1;
        b9b b9bVar = (b9b) moaVar.a;
        if (b9bVar != null) {
            try {
                yig yigVar = (yig) b9bVar.c;
                yigVar.H0(yigVar.G0(), 7);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            moaVar.b(2);
        }
        this.S0 = true;
    }
}
